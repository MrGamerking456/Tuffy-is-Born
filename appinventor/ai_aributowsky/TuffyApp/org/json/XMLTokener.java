package org.json;

import gnu.kawa.xml.XDataType;
import gnu.lists.Sequence;
import java.util.HashMap;
import org.json.zip.JSONzip;

public class XMLTokener extends JSONTokener {
    public static final HashMap entity;

    static {
        entity = new HashMap(8);
        entity.put("amp", XML.AMP);
        entity.put("apos", XML.APOS);
        entity.put("gt", XML.GT);
        entity.put("lt", XML.LT);
        entity.put("quot", XML.QUOT);
    }

    public XMLTokener(String s) {
        super(s);
    }

    public String nextCDATA() throws JSONException {
        StringBuffer sb = new StringBuffer();
        while (true) {
            char c = next();
            if (end()) {
                break;
            }
            sb.append(c);
            int i = sb.length() - 3;
            if (i >= 0 && sb.charAt(i) == ']' && sb.charAt(i + 1) == ']' && sb.charAt(i + 2) == '>') {
                sb.setLength(i);
                return sb.toString();
            }
        }
        throw syntaxError("Unclosed CDATA");
    }

    public Object nextContent() throws JSONException {
        char c;
        do {
            c = next();
        } while (Character.isWhitespace(c));
        if (c == '\u0000') {
            return null;
        }
        if (c == '<') {
            return XML.LT;
        }
        StringBuffer sb = new StringBuffer();
        while (c != '<' && c != '\u0000') {
            if (c == '&') {
                sb.append(nextEntity(c));
            } else {
                sb.append(c);
            }
            c = next();
        }
        back();
        return sb.toString().trim();
    }

    public Object nextEntity(char ampersand) throws JSONException {
        StringBuffer sb = new StringBuffer();
        while (true) {
            char c = next();
            if (!Character.isLetterOrDigit(c) && c != '#') {
                break;
            }
            sb.append(Character.toLowerCase(c));
        }
        if (c == ';') {
            String string = sb.toString();
            Object object = entity.get(string);
            return object != null ? object : new StringBuffer().append(ampersand).append(string).append(";").toString();
        } else {
            throw syntaxError(new StringBuffer().append("Missing ';' in XML entity: &").append(sb).toString());
        }
    }

    public Object nextMeta() throws JSONException {
        char c;
        do {
            c = next();
        } while (Character.isWhitespace(c));
        switch (c) {
            case JSONzip.zipEmptyObject /*0*/:
                throw syntaxError("Misshaped meta tag");
            case Sequence.ELEMENT_VALUE /*33*/:
                return XML.BANG;
            case Sequence.DOCUMENT_VALUE /*34*/:
            case XDataType.NORMALIZED_STRING_TYPE_CODE /*39*/:
                char q = c;
                do {
                    c = next();
                    if (c == '\u0000') {
                        throw syntaxError("Unterminated string");
                    }
                } while (c != q);
                return Boolean.TRUE;
            case XDataType.ENTITY_TYPE_CODE /*47*/:
                return XML.SLASH;
            case '<':
                return XML.LT;
            case '=':
                return XML.EQ;
            case '>':
                return XML.GT;
            case '?':
                return XML.QUEST;
        }
        while (true) {
            c = next();
            if (Character.isWhitespace(c)) {
                return Boolean.TRUE;
            }
            switch (c) {
                case JSONzip.zipEmptyObject /*0*/:
                case Sequence.ELEMENT_VALUE /*33*/:
                case Sequence.DOCUMENT_VALUE /*34*/:
                case XDataType.NORMALIZED_STRING_TYPE_CODE /*39*/:
                case XDataType.ENTITY_TYPE_CODE /*47*/:
                case '<':
                case '=':
                case '>':
                case '?':
                    back();
                    return Boolean.TRUE;
                default:
            }
        }
    }

    public Object nextToken() throws JSONException {
        char c;
        do {
            c = next();
        } while (Character.isWhitespace(c));
        StringBuffer sb;
        switch (c) {
            case JSONzip.zipEmptyObject /*0*/:
                throw syntaxError("Misshaped element");
            case Sequence.ELEMENT_VALUE /*33*/:
                return XML.BANG;
            case Sequence.DOCUMENT_VALUE /*34*/:
            case XDataType.NORMALIZED_STRING_TYPE_CODE /*39*/:
                char q = c;
                sb = new StringBuffer();
                while (true) {
                    c = next();
                    if (c == '\u0000') {
                        throw syntaxError("Unterminated string");
                    } else if (c == q) {
                        return sb.toString();
                    } else {
                        if (c == '&') {
                            sb.append(nextEntity(c));
                        } else {
                            sb.append(c);
                        }
                    }
                }
            case XDataType.ENTITY_TYPE_CODE /*47*/:
                return XML.SLASH;
            case '<':
                throw syntaxError("Misplaced '<'");
            case '=':
                return XML.EQ;
            case '>':
                return XML.GT;
            case '?':
                return XML.QUEST;
            default:
                sb = new StringBuffer();
                while (true) {
                    sb.append(c);
                    c = next();
                    if (Character.isWhitespace(c)) {
                        return sb.toString();
                    }
                    switch (c) {
                        case JSONzip.zipEmptyObject /*0*/:
                            return sb.toString();
                        case Sequence.ELEMENT_VALUE /*33*/:
                        case XDataType.ENTITY_TYPE_CODE /*47*/:
                        case '=':
                        case '>':
                        case '?':
                        case '[':
                        case ']':
                            back();
                            return sb.toString();
                        case Sequence.DOCUMENT_VALUE /*34*/:
                        case XDataType.NORMALIZED_STRING_TYPE_CODE /*39*/:
                        case '<':
                            throw syntaxError("Bad character in a name");
                        default:
                    }
                }
        }
    }

    public boolean skipPast(String to) throws JSONException {
        int i;
        int offset = 0;
        int length = to.length();
        char[] circle = new char[length];
        for (i = 0; i < length; i++) {
            char c = next();
            if (c == '\u0000') {
                return false;
            }
            circle[i] = c;
        }
        while (true) {
            int j = offset;
            boolean b = true;
            for (i = 0; i < length; i++) {
                if (circle[j] != to.charAt(i)) {
                    b = false;
                    break;
                }
                j++;
                if (j >= length) {
                    j -= length;
                }
            }
            if (b) {
                return true;
            }
            c = next();
            if (c == '\u0000') {
                return false;
            }
            circle[offset] = c;
            offset++;
            if (offset >= length) {
                offset -= length;
            }
        }
    }
}
