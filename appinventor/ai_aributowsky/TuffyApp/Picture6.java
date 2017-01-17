package appinventor.ai_aributowsky.TuffyApp;

import com.google.appinventor.components.common.PropertyTypeConstants;
import com.google.appinventor.components.runtime.Button;
import com.google.appinventor.components.runtime.Canvas;
import com.google.appinventor.components.runtime.Component;
import com.google.appinventor.components.runtime.EventDispatcher;
import com.google.appinventor.components.runtime.File;
import com.google.appinventor.components.runtime.Form;
import com.google.appinventor.components.runtime.FusiontablesControl;
import com.google.appinventor.components.runtime.HandlesEventDispatching;
import com.google.appinventor.components.runtime.HorizontalArrangement;
import com.google.appinventor.components.runtime.TinyDB;
import com.google.appinventor.components.runtime.TinyWebDB;
import com.google.appinventor.components.runtime.errors.YailRuntimeError;
import com.google.appinventor.components.runtime.util.RetValManager;
import com.google.appinventor.components.runtime.util.RuntimeErrorAlert;
import com.google.youngandroid.runtime;
import gnu.expr.Language;
import gnu.expr.ModuleBody;
import gnu.expr.ModuleInfo;
import gnu.expr.ModuleMethod;
import gnu.expr.SetExp;
import gnu.kawa.functions.ArithOp;
import gnu.kawa.functions.Format;
import gnu.kawa.functions.GetNamedPart;
import gnu.kawa.functions.ParseFormat;
import gnu.kawa.reflect.Invoke;
import gnu.kawa.reflect.SlotGet;
import gnu.kawa.reflect.SlotSet;
import gnu.kawa.xml.ElementType;
import gnu.kawa.xml.XDataType;
import gnu.lists.Consumer;
import gnu.lists.FString;
import gnu.lists.LList;
import gnu.lists.Pair;
import gnu.lists.PairWithPosition;
import gnu.lists.Sequence;
import gnu.lists.VoidConsumer;
import gnu.mapping.CallContext;
import gnu.mapping.Environment;
import gnu.mapping.Procedure;
import gnu.mapping.PropertySet;
import gnu.mapping.SimpleSymbol;
import gnu.mapping.Symbol;
import gnu.mapping.Values;
import gnu.mapping.WrongType;
import gnu.math.IntNum;
import gnu.text.PrettyWriter;
import kawa.lang.Promise;
import kawa.lib.lists;
import kawa.lib.misc;
import kawa.lib.strings;
import kawa.standard.Scheme;
import kawa.standard.require;
import org.json.zip.JSONzip;

/* compiled from: Picture6.yail */
public class Picture6 extends Form implements Runnable {
    static final SimpleSymbol Lit0;
    static final SimpleSymbol Lit1;
    static final SimpleSymbol Lit10;
    static final FString Lit100;
    static final SimpleSymbol Lit101;
    static final FString Lit102;
    static final IntNum Lit103;
    static final SimpleSymbol Lit104;
    static final FString Lit105;
    static final SimpleSymbol Lit106;
    static final FString Lit107;
    static final IntNum Lit108;
    static final SimpleSymbol Lit109;
    static final IntNum Lit11;
    static final FString Lit110;
    static final SimpleSymbol Lit111;
    static final FString Lit112;
    static final IntNum Lit113;
    static final SimpleSymbol Lit114;
    static final FString Lit115;
    static final SimpleSymbol Lit116;
    static final FString Lit117;
    static final IntNum Lit118;
    static final SimpleSymbol Lit119;
    static final SimpleSymbol Lit12;
    static final FString Lit120;
    static final SimpleSymbol Lit121;
    static final FString Lit122;
    static final IntNum Lit123;
    static final SimpleSymbol Lit124;
    static final FString Lit125;
    static final SimpleSymbol Lit126;
    static final IntNum Lit127;
    static final FString Lit128;
    static final IntNum Lit129;
    static final SimpleSymbol Lit13;
    static final SimpleSymbol Lit130;
    static final FString Lit131;
    static final SimpleSymbol Lit132;
    static final FString Lit133;
    static final FString Lit134;
    static final FString Lit135;
    static final FString Lit136;
    static final SimpleSymbol Lit137;
    static final FString Lit138;
    static final FString Lit139;
    static final SimpleSymbol Lit14;
    static final SimpleSymbol Lit140;
    static final FString Lit141;
    static final SimpleSymbol Lit142;
    static final SimpleSymbol Lit143;
    static final SimpleSymbol Lit144;
    static final SimpleSymbol Lit145;
    static final SimpleSymbol Lit146;
    static final SimpleSymbol Lit147;
    static final SimpleSymbol Lit148;
    static final SimpleSymbol Lit149;
    static final FString Lit15;
    static final SimpleSymbol Lit150;
    static final SimpleSymbol Lit151;
    static final SimpleSymbol Lit152;
    static final SimpleSymbol Lit153;
    static final SimpleSymbol Lit154;
    static final SimpleSymbol Lit16;
    static final IntNum Lit17;
    static final SimpleSymbol Lit18;
    static final IntNum Lit19;
    static final SimpleSymbol Lit2;
    static final FString Lit20;
    static final FString Lit21;
    static final SimpleSymbol Lit22;
    static final SimpleSymbol Lit23;
    static final IntNum Lit24;
    static final SimpleSymbol Lit25;
    static final FString Lit26;
    static final PairWithPosition Lit27;
    static final SimpleSymbol Lit28;
    static final SimpleSymbol Lit29;
    static final SimpleSymbol Lit3;
    static final FString Lit30;
    static final SimpleSymbol Lit31;
    static final SimpleSymbol Lit32;
    static final SimpleSymbol Lit33;
    static final SimpleSymbol Lit34;
    static final FString Lit35;
    static final SimpleSymbol Lit36;
    static final SimpleSymbol Lit37;
    static final SimpleSymbol Lit38;
    static final SimpleSymbol Lit39;
    static final IntNum Lit4;
    static final PairWithPosition Lit40;
    static final PairWithPosition Lit41;
    static final SimpleSymbol Lit42;
    static final FString Lit43;
    static final SimpleSymbol Lit44;
    static final FString Lit45;
    static final SimpleSymbol Lit46;
    static final PairWithPosition Lit47;
    static final SimpleSymbol Lit48;
    static final FString Lit49;
    static final SimpleSymbol Lit5;
    static final SimpleSymbol Lit50;
    static final IntNum Lit51;
    static final FString Lit52;
    static final FString Lit53;
    static final SimpleSymbol Lit54;
    static final FString Lit55;
    static final SimpleSymbol Lit56;
    static final FString Lit57;
    static final SimpleSymbol Lit58;
    static final FString Lit59;
    static final IntNum Lit6;
    static final SimpleSymbol Lit60;
    static final FString Lit61;
    static final SimpleSymbol Lit62;
    static final FString Lit63;
    static final SimpleSymbol Lit64;
    static final SimpleSymbol Lit65;
    static final FString Lit66;
    static final IntNum Lit67;
    static final FString Lit68;
    static final SimpleSymbol Lit69;
    static final SimpleSymbol Lit7;
    static final SimpleSymbol Lit70;
    static final SimpleSymbol Lit71;
    static final SimpleSymbol Lit72;
    static final SimpleSymbol Lit73;
    static final PairWithPosition Lit74;
    static final SimpleSymbol Lit75;
    static final SimpleSymbol Lit76;
    static final SimpleSymbol Lit77;
    static final SimpleSymbol Lit78;
    static final SimpleSymbol Lit79;
    static final SimpleSymbol Lit8;
    static final PairWithPosition Lit80;
    static final SimpleSymbol Lit81;
    static final SimpleSymbol Lit82;
    static final FString Lit83;
    static final SimpleSymbol Lit84;
    static final IntNum Lit85;
    static final IntNum Lit86;
    static final FString Lit87;
    static final FString Lit88;
    static final SimpleSymbol Lit89;
    static final SimpleSymbol Lit9;
    static final IntNum Lit90;
    static final FString Lit91;
    static final SimpleSymbol Lit92;
    static final IntNum Lit93;
    static final SimpleSymbol Lit94;
    static final FString Lit95;
    static final SimpleSymbol Lit96;
    static final FString Lit97;
    static final IntNum Lit98;
    static final SimpleSymbol Lit99;
    public static Picture6 Picture6;
    static final ModuleMethod lambda$Fn1 = null;
    static final ModuleMethod lambda$Fn10 = null;
    static final ModuleMethod lambda$Fn11 = null;
    static final ModuleMethod lambda$Fn12 = null;
    static final ModuleMethod lambda$Fn13 = null;
    static final ModuleMethod lambda$Fn14 = null;
    static final ModuleMethod lambda$Fn15 = null;
    static final ModuleMethod lambda$Fn16 = null;
    static final ModuleMethod lambda$Fn17 = null;
    static final ModuleMethod lambda$Fn18 = null;
    static final ModuleMethod lambda$Fn19 = null;
    static final ModuleMethod lambda$Fn2 = null;
    static final ModuleMethod lambda$Fn20 = null;
    static final ModuleMethod lambda$Fn21 = null;
    static final ModuleMethod lambda$Fn22 = null;
    static final ModuleMethod lambda$Fn23 = null;
    static final ModuleMethod lambda$Fn24 = null;
    static final ModuleMethod lambda$Fn25 = null;
    static final ModuleMethod lambda$Fn26 = null;
    static final ModuleMethod lambda$Fn27 = null;
    static final ModuleMethod lambda$Fn28 = null;
    static final ModuleMethod lambda$Fn29 = null;
    static final ModuleMethod lambda$Fn3 = null;
    static final ModuleMethod lambda$Fn30 = null;
    static final ModuleMethod lambda$Fn31 = null;
    static final ModuleMethod lambda$Fn32 = null;
    static final ModuleMethod lambda$Fn33 = null;
    static final ModuleMethod lambda$Fn34 = null;
    static final ModuleMethod lambda$Fn35 = null;
    static final ModuleMethod lambda$Fn36 = null;
    static final ModuleMethod lambda$Fn37 = null;
    static final ModuleMethod lambda$Fn38 = null;
    static final ModuleMethod lambda$Fn39 = null;
    static final ModuleMethod lambda$Fn4 = null;
    static final ModuleMethod lambda$Fn40 = null;
    static final ModuleMethod lambda$Fn41 = null;
    static final ModuleMethod lambda$Fn5 = null;
    static final ModuleMethod lambda$Fn6 = null;
    static final ModuleMethod lambda$Fn7 = null;
    static final ModuleMethod lambda$Fn8 = null;
    static final ModuleMethod lambda$Fn9 = null;
    public Boolean $Stdebug$Mnform$St;
    public final ModuleMethod $define;
    public Button BackButton;
    public final ModuleMethod BackButton$Click;
    public Button Blue;
    public final ModuleMethod Blue$Click;
    public Button Brown;
    public final ModuleMethod Brown$Click;
    public Button ButtonBig;
    public final ModuleMethod ButtonBig$Click;
    public Button ButtonSmall;
    public final ModuleMethod ButtonSmall$Click;
    public Canvas DrawingCanvas;
    public final ModuleMethod DrawingCanvas$Dragged;
    public final ModuleMethod DrawingCanvas$Touched;
    public Button Eraser;
    public final ModuleMethod Eraser$Click;
    public File File1;
    public FusiontablesControl FusiontablesControl1;
    public Button Green;
    public final ModuleMethod Green$Click;
    public HorizontalArrangement HorizontalArrangement1;
    public HorizontalArrangement HorizontalArrangement2;
    public HorizontalArrangement HorizontalArrangement3;
    public Button LoadButton;
    public final ModuleMethod LoadButton$Click;
    public Button Orange;
    public final ModuleMethod Orange$Click;
    public Button Purple;
    public final ModuleMethod Purple$Click;
    public Button Red;
    public final ModuleMethod Red$Click;
    public Button SaveButton;
    public final ModuleMethod SaveButton$Click;
    public TinyDB TinyDB1;
    public TinyWebDB TinyWebDB1;
    public Button Wipe;
    public final ModuleMethod Wipe$Click;
    public Button Yellow;
    public final ModuleMethod Yellow$Click;
    public final ModuleMethod add$Mnto$Mncomponents;
    public final ModuleMethod add$Mnto$Mnevents;
    public final ModuleMethod add$Mnto$Mnform$Mndo$Mnafter$Mncreation;
    public final ModuleMethod add$Mnto$Mnform$Mnenvironment;
    public final ModuleMethod add$Mnto$Mnglobal$Mnvar$Mnenvironment;
    public final ModuleMethod add$Mnto$Mnglobal$Mnvars;
    public final ModuleMethod android$Mnlog$Mnform;
    public LList components$Mnto$Mncreate;
    public final ModuleMethod dispatchEvent;
    public LList events$Mnto$Mnregister;
    public LList form$Mndo$Mnafter$Mncreation;
    public Environment form$Mnenvironment;
    public Symbol form$Mnname$Mnsymbol;
    public Environment global$Mnvar$Mnenvironment;
    public LList global$Mnvars$Mnto$Mncreate;
    public final ModuleMethod is$Mnbound$Mnin$Mnform$Mnenvironment;
    public final ModuleMethod lookup$Mnhandler;
    public final ModuleMethod lookup$Mnin$Mnform$Mnenvironment;
    public final ModuleMethod process$Mnexception;
    public final ModuleMethod send$Mnerror;

    /* compiled from: Picture6.yail */
    public class frame extends ModuleBody {
        Picture6 $main;

        public Object apply3(ModuleMethod moduleMethod, Object obj, Object obj2, Object obj3) {
            return moduleMethod.selector == 46 ? this.$main.DrawingCanvas$Touched(obj, obj2, obj3) : super.apply3(moduleMethod, obj, obj2, obj3);
        }

        public Object applyN(ModuleMethod moduleMethod, Object[] objArr) {
            return moduleMethod.selector == 45 ? this.$main.DrawingCanvas$Dragged(objArr[0], objArr[1], objArr[2], objArr[3], objArr[4], objArr[5], objArr[6]) : super.applyN(moduleMethod, objArr);
        }

        public int match3(ModuleMethod moduleMethod, Object obj, Object obj2, Object obj3, CallContext callContext) {
            if (moduleMethod.selector != 46) {
                return super.match3(moduleMethod, obj, obj2, obj3, callContext);
            }
            callContext.value1 = obj;
            callContext.value2 = obj2;
            callContext.value3 = obj3;
            callContext.proc = moduleMethod;
            callContext.pc = 3;
            return 0;
        }

        public int matchN(ModuleMethod moduleMethod, Object[] objArr, CallContext callContext) {
            if (moduleMethod.selector != 45) {
                return super.matchN(moduleMethod, objArr, callContext);
            }
            callContext.values = objArr;
            callContext.proc = moduleMethod;
            callContext.pc = 5;
            return 0;
        }

        public int match1(ModuleMethod moduleMethod, Object obj, CallContext callContext) {
            switch (moduleMethod.selector) {
                case ParseFormat.SEEN_MINUS /*1*/:
                    callContext.value1 = obj;
                    callContext.proc = moduleMethod;
                    callContext.pc = 1;
                    return 0;
                case JSONzip.zipFalse /*3*/:
                    if (!(obj instanceof Symbol)) {
                        return -786431;
                    }
                    callContext.value1 = obj;
                    callContext.proc = moduleMethod;
                    callContext.pc = 1;
                    return 0;
                case ArithOp.DIVIDE_INEXACT /*5*/:
                    if (!(obj instanceof Symbol)) {
                        return -786431;
                    }
                    callContext.value1 = obj;
                    callContext.proc = moduleMethod;
                    callContext.pc = 1;
                    return 0;
                case ArithOp.ASHIFT_LEFT /*10*/:
                    callContext.value1 = obj;
                    callContext.proc = moduleMethod;
                    callContext.pc = 1;
                    return 0;
                case ArithOp.ASHIFT_RIGHT /*11*/:
                    callContext.value1 = obj;
                    callContext.proc = moduleMethod;
                    callContext.pc = 1;
                    return 0;
                case ArithOp.LSHIFT_RIGHT /*12*/:
                    if (!(obj instanceof Picture6)) {
                        return -786431;
                    }
                    callContext.value1 = obj;
                    callContext.proc = moduleMethod;
                    callContext.pc = 1;
                    return 0;
                default:
                    return super.match1(moduleMethod, obj, callContext);
            }
        }

        public int match2(ModuleMethod moduleMethod, Object obj, Object obj2, CallContext callContext) {
            switch (moduleMethod.selector) {
                case SetExp.DEFINING_FLAG /*2*/:
                    if (!(obj instanceof Symbol)) {
                        return -786431;
                    }
                    callContext.value1 = obj;
                    callContext.value2 = obj2;
                    callContext.proc = moduleMethod;
                    callContext.pc = 2;
                    return 0;
                case JSONzip.zipFalse /*3*/:
                    if (!(obj instanceof Symbol)) {
                        return -786431;
                    }
                    callContext.value1 = obj;
                    callContext.value2 = obj2;
                    callContext.proc = moduleMethod;
                    callContext.pc = 2;
                    return 0;
                case ArithOp.QUOTIENT /*6*/:
                    if (!(obj instanceof Symbol)) {
                        return -786431;
                    }
                    callContext.value1 = obj;
                    callContext.value2 = obj2;
                    callContext.proc = moduleMethod;
                    callContext.pc = 2;
                    return 0;
                case ArithOp.QUOTIENT_EXACT /*7*/:
                    callContext.value1 = obj;
                    callContext.value2 = obj2;
                    callContext.proc = moduleMethod;
                    callContext.pc = 2;
                    return 0;
                case ArithOp.ASHIFT_GENERAL /*9*/:
                    callContext.value1 = obj;
                    callContext.value2 = obj2;
                    callContext.proc = moduleMethod;
                    callContext.pc = 2;
                    return 0;
                case ArithOp.IOR /*14*/:
                    callContext.value1 = obj;
                    callContext.value2 = obj2;
                    callContext.proc = moduleMethod;
                    callContext.pc = 2;
                    return 0;
                default:
                    return super.match2(moduleMethod, obj, obj2, callContext);
            }
        }

        public int match4(ModuleMethod moduleMethod, Object obj, Object obj2, Object obj3, Object obj4, CallContext callContext) {
            switch (moduleMethod.selector) {
                case SetExp.PREFER_BINDING2 /*8*/:
                    callContext.value1 = obj;
                    callContext.value2 = obj2;
                    callContext.value3 = obj3;
                    callContext.value4 = obj4;
                    callContext.proc = moduleMethod;
                    callContext.pc = 4;
                    return 0;
                case ArithOp.AND /*13*/:
                    if (!(obj instanceof Picture6)) {
                        return -786431;
                    }
                    callContext.value1 = obj;
                    if (!(obj2 instanceof Component)) {
                        return -786430;
                    }
                    callContext.value2 = obj2;
                    if (!(obj3 instanceof String)) {
                        return -786429;
                    }
                    callContext.value3 = obj3;
                    if (!(obj4 instanceof String)) {
                        return -786428;
                    }
                    callContext.value4 = obj4;
                    callContext.proc = moduleMethod;
                    callContext.pc = 4;
                    return 0;
                default:
                    return super.match4(moduleMethod, obj, obj2, obj3, obj4, callContext);
            }
        }

        public Object apply1(ModuleMethod moduleMethod, Object obj) {
            switch (moduleMethod.selector) {
                case ParseFormat.SEEN_MINUS /*1*/:
                    this.$main.androidLogForm(obj);
                    return Values.empty;
                case JSONzip.zipFalse /*3*/:
                    try {
                        return this.$main.lookupInFormEnvironment((Symbol) obj);
                    } catch (ClassCastException e) {
                        throw new WrongType(e, "lookup-in-form-environment", 1, obj);
                    }
                case ArithOp.DIVIDE_INEXACT /*5*/:
                    try {
                        return this.$main.isBoundInFormEnvironment((Symbol) obj) ? Boolean.TRUE : Boolean.FALSE;
                    } catch (ClassCastException e2) {
                        throw new WrongType(e2, "is-bound-in-form-environment", 1, obj);
                    }
                case ArithOp.ASHIFT_LEFT /*10*/:
                    this.$main.addToFormDoAfterCreation(obj);
                    return Values.empty;
                case ArithOp.ASHIFT_RIGHT /*11*/:
                    this.$main.sendError(obj);
                    return Values.empty;
                case ArithOp.LSHIFT_RIGHT /*12*/:
                    this.$main.processException(obj);
                    return Values.empty;
                default:
                    return super.apply1(moduleMethod, obj);
            }
        }

        public Object apply4(ModuleMethod moduleMethod, Object obj, Object obj2, Object obj3, Object obj4) {
            switch (moduleMethod.selector) {
                case SetExp.PREFER_BINDING2 /*8*/:
                    this.$main.addToComponents(obj, obj2, obj3, obj4);
                    return Values.empty;
                case ArithOp.AND /*13*/:
                    try {
                        try {
                            try {
                                try {
                                    return this.$main.dispatchEvent((Component) obj, (String) obj2, (String) obj3, (Object[]) obj4) ? Boolean.TRUE : Boolean.FALSE;
                                } catch (ClassCastException e) {
                                    throw new WrongType(e, "dispatchEvent", 4, obj4);
                                }
                            } catch (ClassCastException e2) {
                                throw new WrongType(e2, "dispatchEvent", 3, obj3);
                            }
                        } catch (ClassCastException e22) {
                            throw new WrongType(e22, "dispatchEvent", 2, obj2);
                        }
                    } catch (ClassCastException e222) {
                        throw new WrongType(e222, "dispatchEvent", 1, obj);
                    }
                default:
                    return super.apply4(moduleMethod, obj, obj2, obj3, obj4);
            }
        }

        public Object apply2(ModuleMethod moduleMethod, Object obj, Object obj2) {
            switch (moduleMethod.selector) {
                case SetExp.DEFINING_FLAG /*2*/:
                    try {
                        this.$main.addToFormEnvironment((Symbol) obj, obj2);
                        return Values.empty;
                    } catch (ClassCastException e) {
                        throw new WrongType(e, "add-to-form-environment", 1, obj);
                    }
                case JSONzip.zipFalse /*3*/:
                    try {
                        return this.$main.lookupInFormEnvironment((Symbol) obj, obj2);
                    } catch (ClassCastException e2) {
                        throw new WrongType(e2, "lookup-in-form-environment", 1, obj);
                    }
                case ArithOp.QUOTIENT /*6*/:
                    try {
                        this.$main.addToGlobalVarEnvironment((Symbol) obj, obj2);
                        return Values.empty;
                    } catch (ClassCastException e22) {
                        throw new WrongType(e22, "add-to-global-var-environment", 1, obj);
                    }
                case ArithOp.QUOTIENT_EXACT /*7*/:
                    this.$main.addToEvents(obj, obj2);
                    return Values.empty;
                case ArithOp.ASHIFT_GENERAL /*9*/:
                    this.$main.addToGlobalVars(obj, obj2);
                    return Values.empty;
                case ArithOp.IOR /*14*/:
                    return this.$main.lookupHandler(obj, obj2);
                default:
                    return super.apply2(moduleMethod, obj, obj2);
            }
        }

        public Object apply0(ModuleMethod moduleMethod) {
            switch (moduleMethod.selector) {
                case ArithOp.XOR /*15*/:
                    return Picture6.lambda2();
                case SetExp.PROCEDURE /*16*/:
                    this.$main.$define();
                    return Values.empty;
                case Sequence.INT_U8_VALUE /*17*/:
                    return Picture6.lambda3();
                case Sequence.INT_S8_VALUE /*18*/:
                    return Picture6.lambda4();
                case Sequence.INT_U16_VALUE /*19*/:
                    return Picture6.lambda5();
                case Sequence.INT_S16_VALUE /*20*/:
                    return Picture6.lambda6();
                case Sequence.INT_U32_VALUE /*21*/:
                    return Picture6.lambda7();
                case Sequence.INT_S32_VALUE /*22*/:
                    return Picture6.lambda8();
                case Sequence.INT_U64_VALUE /*23*/:
                    return Picture6.lambda9();
                case Sequence.INT_S64_VALUE /*24*/:
                    return Picture6.lambda10();
                case Sequence.FLOAT_VALUE /*25*/:
                    return this.$main.BackButton$Click();
                case Sequence.DOUBLE_VALUE /*26*/:
                    return Picture6.lambda11();
                case Sequence.BOOLEAN_VALUE /*27*/:
                    return Picture6.lambda12();
                case Sequence.TEXT_BYTE_VALUE /*28*/:
                    return this.$main.SaveButton$Click();
                case Sequence.CHAR_VALUE /*29*/:
                    return Picture6.lambda13();
                case XDataType.DAY_TIME_DURATION_TYPE_CODE /*30*/:
                    return Picture6.lambda14();
                case Sequence.CDATA_VALUE /*31*/:
                    return this.$main.LoadButton$Click();
                case SetExp.SET_IF_UNBOUND /*32*/:
                    return Picture6.lambda15();
                case Sequence.ELEMENT_VALUE /*33*/:
                    return Picture6.lambda16();
                case Sequence.DOCUMENT_VALUE /*34*/:
                    return Picture6.lambda17();
                case Sequence.ATTRIBUTE_VALUE /*35*/:
                    return Picture6.lambda18();
                case Sequence.COMMENT_VALUE /*36*/:
                    return this.$main.ButtonSmall$Click();
                case Sequence.PROCESSING_INSTRUCTION_VALUE /*37*/:
                    return Picture6.lambda19();
                case XDataType.STRING_TYPE_CODE /*38*/:
                    return Picture6.lambda20();
                case XDataType.NORMALIZED_STRING_TYPE_CODE /*39*/:
                    return this.$main.ButtonBig$Click();
                case JSONzip.substringLimit /*40*/:
                    return Picture6.lambda21();
                case XDataType.LANGUAGE_TYPE_CODE /*41*/:
                    return Picture6.lambda22();
                case XDataType.NMTOKEN_TYPE_CODE /*42*/:
                    return this.$main.Wipe$Click();
                case XDataType.NAME_TYPE_CODE /*43*/:
                    return Picture6.lambda23();
                case XDataType.NCNAME_TYPE_CODE /*44*/:
                    return Picture6.lambda24();
                case XDataType.ENTITY_TYPE_CODE /*47*/:
                    return Picture6.lambda25();
                case XDataType.UNTYPED_TYPE_CODE /*48*/:
                    return Picture6.lambda26();
                case 49:
                    return Picture6.lambda27();
                case 50:
                    return Picture6.lambda28();
                case 51:
                    return this.$main.Red$Click();
                case 52:
                    return Picture6.lambda29();
                case 53:
                    return Picture6.lambda30();
                case 54:
                    return this.$main.Orange$Click();
                case 55:
                    return Picture6.lambda31();
                case 56:
                    return Picture6.lambda32();
                case 57:
                    return this.$main.Yellow$Click();
                case 58:
                    return Picture6.lambda33();
                case 59:
                    return Picture6.lambda34();
                case 60:
                    return this.$main.Green$Click();
                case 61:
                    return Picture6.lambda35();
                case 62:
                    return Picture6.lambda36();
                case 63:
                    return this.$main.Blue$Click();
                case SetExp.HAS_VALUE /*64*/:
                    return Picture6.lambda37();
                case 65:
                    return Picture6.lambda38();
                case 66:
                    return this.$main.Purple$Click();
                case 67:
                    return Picture6.lambda39();
                case 68:
                    return Picture6.lambda40();
                case 69:
                    return this.$main.Brown$Click();
                case PrettyWriter.NEWLINE_FILL /*70*/:
                    return Picture6.lambda41();
                case 71:
                    return Picture6.lambda42();
                case 72:
                    return this.$main.Eraser$Click();
                default:
                    return super.apply0(moduleMethod);
            }
        }

        public int match0(ModuleMethod moduleMethod, CallContext callContext) {
            switch (moduleMethod.selector) {
                case ArithOp.XOR /*15*/:
                    callContext.proc = moduleMethod;
                    callContext.pc = 0;
                    return 0;
                case SetExp.PROCEDURE /*16*/:
                    callContext.proc = moduleMethod;
                    callContext.pc = 0;
                    return 0;
                case Sequence.INT_U8_VALUE /*17*/:
                    callContext.proc = moduleMethod;
                    callContext.pc = 0;
                    return 0;
                case Sequence.INT_S8_VALUE /*18*/:
                    callContext.proc = moduleMethod;
                    callContext.pc = 0;
                    return 0;
                case Sequence.INT_U16_VALUE /*19*/:
                    callContext.proc = moduleMethod;
                    callContext.pc = 0;
                    return 0;
                case Sequence.INT_S16_VALUE /*20*/:
                    callContext.proc = moduleMethod;
                    callContext.pc = 0;
                    return 0;
                case Sequence.INT_U32_VALUE /*21*/:
                    callContext.proc = moduleMethod;
                    callContext.pc = 0;
                    return 0;
                case Sequence.INT_S32_VALUE /*22*/:
                    callContext.proc = moduleMethod;
                    callContext.pc = 0;
                    return 0;
                case Sequence.INT_U64_VALUE /*23*/:
                    callContext.proc = moduleMethod;
                    callContext.pc = 0;
                    return 0;
                case Sequence.INT_S64_VALUE /*24*/:
                    callContext.proc = moduleMethod;
                    callContext.pc = 0;
                    return 0;
                case Sequence.FLOAT_VALUE /*25*/:
                    callContext.proc = moduleMethod;
                    callContext.pc = 0;
                    return 0;
                case Sequence.DOUBLE_VALUE /*26*/:
                    callContext.proc = moduleMethod;
                    callContext.pc = 0;
                    return 0;
                case Sequence.BOOLEAN_VALUE /*27*/:
                    callContext.proc = moduleMethod;
                    callContext.pc = 0;
                    return 0;
                case Sequence.TEXT_BYTE_VALUE /*28*/:
                    callContext.proc = moduleMethod;
                    callContext.pc = 0;
                    return 0;
                case Sequence.CHAR_VALUE /*29*/:
                    callContext.proc = moduleMethod;
                    callContext.pc = 0;
                    return 0;
                case XDataType.DAY_TIME_DURATION_TYPE_CODE /*30*/:
                    callContext.proc = moduleMethod;
                    callContext.pc = 0;
                    return 0;
                case Sequence.CDATA_VALUE /*31*/:
                    callContext.proc = moduleMethod;
                    callContext.pc = 0;
                    return 0;
                case SetExp.SET_IF_UNBOUND /*32*/:
                    callContext.proc = moduleMethod;
                    callContext.pc = 0;
                    return 0;
                case Sequence.ELEMENT_VALUE /*33*/:
                    callContext.proc = moduleMethod;
                    callContext.pc = 0;
                    return 0;
                case Sequence.DOCUMENT_VALUE /*34*/:
                    callContext.proc = moduleMethod;
                    callContext.pc = 0;
                    return 0;
                case Sequence.ATTRIBUTE_VALUE /*35*/:
                    callContext.proc = moduleMethod;
                    callContext.pc = 0;
                    return 0;
                case Sequence.COMMENT_VALUE /*36*/:
                    callContext.proc = moduleMethod;
                    callContext.pc = 0;
                    return 0;
                case Sequence.PROCESSING_INSTRUCTION_VALUE /*37*/:
                    callContext.proc = moduleMethod;
                    callContext.pc = 0;
                    return 0;
                case XDataType.STRING_TYPE_CODE /*38*/:
                    callContext.proc = moduleMethod;
                    callContext.pc = 0;
                    return 0;
                case XDataType.NORMALIZED_STRING_TYPE_CODE /*39*/:
                    callContext.proc = moduleMethod;
                    callContext.pc = 0;
                    return 0;
                case JSONzip.substringLimit /*40*/:
                    callContext.proc = moduleMethod;
                    callContext.pc = 0;
                    return 0;
                case XDataType.LANGUAGE_TYPE_CODE /*41*/:
                    callContext.proc = moduleMethod;
                    callContext.pc = 0;
                    return 0;
                case XDataType.NMTOKEN_TYPE_CODE /*42*/:
                    callContext.proc = moduleMethod;
                    callContext.pc = 0;
                    return 0;
                case XDataType.NAME_TYPE_CODE /*43*/:
                    callContext.proc = moduleMethod;
                    callContext.pc = 0;
                    return 0;
                case XDataType.NCNAME_TYPE_CODE /*44*/:
                    callContext.proc = moduleMethod;
                    callContext.pc = 0;
                    return 0;
                case XDataType.ENTITY_TYPE_CODE /*47*/:
                    callContext.proc = moduleMethod;
                    callContext.pc = 0;
                    return 0;
                case XDataType.UNTYPED_TYPE_CODE /*48*/:
                    callContext.proc = moduleMethod;
                    callContext.pc = 0;
                    return 0;
                case 49:
                    callContext.proc = moduleMethod;
                    callContext.pc = 0;
                    return 0;
                case 50:
                    callContext.proc = moduleMethod;
                    callContext.pc = 0;
                    return 0;
                case 51:
                    callContext.proc = moduleMethod;
                    callContext.pc = 0;
                    return 0;
                case 52:
                    callContext.proc = moduleMethod;
                    callContext.pc = 0;
                    return 0;
                case 53:
                    callContext.proc = moduleMethod;
                    callContext.pc = 0;
                    return 0;
                case 54:
                    callContext.proc = moduleMethod;
                    callContext.pc = 0;
                    return 0;
                case 55:
                    callContext.proc = moduleMethod;
                    callContext.pc = 0;
                    return 0;
                case 56:
                    callContext.proc = moduleMethod;
                    callContext.pc = 0;
                    return 0;
                case 57:
                    callContext.proc = moduleMethod;
                    callContext.pc = 0;
                    return 0;
                case 58:
                    callContext.proc = moduleMethod;
                    callContext.pc = 0;
                    return 0;
                case 59:
                    callContext.proc = moduleMethod;
                    callContext.pc = 0;
                    return 0;
                case 60:
                    callContext.proc = moduleMethod;
                    callContext.pc = 0;
                    return 0;
                case 61:
                    callContext.proc = moduleMethod;
                    callContext.pc = 0;
                    return 0;
                case 62:
                    callContext.proc = moduleMethod;
                    callContext.pc = 0;
                    return 0;
                case 63:
                    callContext.proc = moduleMethod;
                    callContext.pc = 0;
                    return 0;
                case SetExp.HAS_VALUE /*64*/:
                    callContext.proc = moduleMethod;
                    callContext.pc = 0;
                    return 0;
                case 65:
                    callContext.proc = moduleMethod;
                    callContext.pc = 0;
                    return 0;
                case 66:
                    callContext.proc = moduleMethod;
                    callContext.pc = 0;
                    return 0;
                case 67:
                    callContext.proc = moduleMethod;
                    callContext.pc = 0;
                    return 0;
                case 68:
                    callContext.proc = moduleMethod;
                    callContext.pc = 0;
                    return 0;
                case 69:
                    callContext.proc = moduleMethod;
                    callContext.pc = 0;
                    return 0;
                case PrettyWriter.NEWLINE_FILL /*70*/:
                    callContext.proc = moduleMethod;
                    callContext.pc = 0;
                    return 0;
                case 71:
                    callContext.proc = moduleMethod;
                    callContext.pc = 0;
                    return 0;
                case 72:
                    callContext.proc = moduleMethod;
                    callContext.pc = 0;
                    return 0;
                default:
                    return super.match0(moduleMethod, callContext);
            }
        }
    }

    static {
        Lit154 = (SimpleSymbol) new SimpleSymbol("any").readResolve();
        Lit153 = (SimpleSymbol) new SimpleSymbol("lookup-handler").readResolve();
        Lit152 = (SimpleSymbol) new SimpleSymbol("dispatchEvent").readResolve();
        Lit151 = (SimpleSymbol) new SimpleSymbol("send-error").readResolve();
        Lit150 = (SimpleSymbol) new SimpleSymbol("add-to-form-do-after-creation").readResolve();
        Lit149 = (SimpleSymbol) new SimpleSymbol("add-to-global-vars").readResolve();
        Lit148 = (SimpleSymbol) new SimpleSymbol("add-to-components").readResolve();
        Lit147 = (SimpleSymbol) new SimpleSymbol("add-to-events").readResolve();
        Lit146 = (SimpleSymbol) new SimpleSymbol("add-to-global-var-environment").readResolve();
        Lit145 = (SimpleSymbol) new SimpleSymbol("is-bound-in-form-environment").readResolve();
        Lit144 = (SimpleSymbol) new SimpleSymbol("lookup-in-form-environment").readResolve();
        Lit143 = (SimpleSymbol) new SimpleSymbol("add-to-form-environment").readResolve();
        Lit142 = (SimpleSymbol) new SimpleSymbol("android-log-form").readResolve();
        Lit141 = new FString("com.google.appinventor.components.runtime.File");
        Lit140 = (SimpleSymbol) new SimpleSymbol("File1").readResolve();
        Lit139 = new FString("com.google.appinventor.components.runtime.File");
        Lit138 = new FString("com.google.appinventor.components.runtime.FusiontablesControl");
        Lit137 = (SimpleSymbol) new SimpleSymbol("FusiontablesControl1").readResolve();
        Lit136 = new FString("com.google.appinventor.components.runtime.FusiontablesControl");
        Lit135 = new FString("com.google.appinventor.components.runtime.TinyDB");
        Lit134 = new FString("com.google.appinventor.components.runtime.TinyDB");
        Lit133 = new FString("com.google.appinventor.components.runtime.TinyWebDB");
        Lit132 = (SimpleSymbol) new SimpleSymbol("TinyWebDB1").readResolve();
        Lit131 = new FString("com.google.appinventor.components.runtime.TinyWebDB");
        Lit130 = (SimpleSymbol) new SimpleSymbol("Eraser$Click").readResolve();
        Lit129 = IntNum.make(-1);
        Lit128 = new FString("com.google.appinventor.components.runtime.Button");
        Lit127 = IntNum.make(40);
        Lit126 = (SimpleSymbol) new SimpleSymbol("Eraser").readResolve();
        Lit125 = new FString("com.google.appinventor.components.runtime.Button");
        Lit124 = (SimpleSymbol) new SimpleSymbol("Brown$Click").readResolve();
        Lit123 = IntNum.make(-6737152);
        Lit122 = new FString("com.google.appinventor.components.runtime.Button");
        Lit121 = (SimpleSymbol) new SimpleSymbol("Brown").readResolve();
        Lit120 = new FString("com.google.appinventor.components.runtime.Button");
        Lit119 = (SimpleSymbol) new SimpleSymbol("Purple$Click").readResolve();
        Lit118 = IntNum.make(-10092340);
        Lit117 = new FString("com.google.appinventor.components.runtime.Button");
        Lit116 = (SimpleSymbol) new SimpleSymbol("Purple").readResolve();
        Lit115 = new FString("com.google.appinventor.components.runtime.Button");
        Lit114 = (SimpleSymbol) new SimpleSymbol("Blue$Click").readResolve();
        Lit113 = IntNum.make((int) Component.COLOR_BLUE);
        Lit112 = new FString("com.google.appinventor.components.runtime.Button");
        Lit111 = (SimpleSymbol) new SimpleSymbol("Blue").readResolve();
        Lit110 = new FString("com.google.appinventor.components.runtime.Button");
        Lit109 = (SimpleSymbol) new SimpleSymbol("Green$Click").readResolve();
        Lit108 = IntNum.make((int) Component.COLOR_GREEN);
        Lit107 = new FString("com.google.appinventor.components.runtime.Button");
        Lit106 = (SimpleSymbol) new SimpleSymbol("Green").readResolve();
        Lit105 = new FString("com.google.appinventor.components.runtime.Button");
        Lit104 = (SimpleSymbol) new SimpleSymbol("Yellow$Click").readResolve();
        Lit103 = IntNum.make((int) Component.COLOR_YELLOW);
        Lit102 = new FString("com.google.appinventor.components.runtime.Button");
        Lit101 = (SimpleSymbol) new SimpleSymbol("Yellow").readResolve();
        Lit100 = new FString("com.google.appinventor.components.runtime.Button");
        Lit99 = (SimpleSymbol) new SimpleSymbol("Orange$Click").readResolve();
        Lit98 = IntNum.make(-39424);
        Lit97 = new FString("com.google.appinventor.components.runtime.Button");
        Lit96 = (SimpleSymbol) new SimpleSymbol("Orange").readResolve();
        Lit95 = new FString("com.google.appinventor.components.runtime.Button");
        Lit94 = (SimpleSymbol) new SimpleSymbol("Red$Click").readResolve();
        Lit93 = IntNum.make((int) Component.COLOR_RED);
        Lit92 = (SimpleSymbol) new SimpleSymbol("PaintColor").readResolve();
        Lit91 = new FString("com.google.appinventor.components.runtime.Button");
        Lit90 = IntNum.make(30);
        Lit89 = (SimpleSymbol) new SimpleSymbol("Red").readResolve();
        Lit88 = new FString("com.google.appinventor.components.runtime.Button");
        Lit87 = new FString("com.google.appinventor.components.runtime.HorizontalArrangement");
        Lit86 = IntNum.make(60);
        int[] iArr = new int[2];
        iArr[0] = Component.COLOR_CYAN;
        Lit85 = IntNum.make(iArr);
        Lit84 = (SimpleSymbol) new SimpleSymbol("HorizontalArrangement2").readResolve();
        Lit83 = new FString("com.google.appinventor.components.runtime.HorizontalArrangement");
        Lit82 = (SimpleSymbol) new SimpleSymbol("Touched").readResolve();
        Lit81 = (SimpleSymbol) new SimpleSymbol("DrawingCanvas$Touched").readResolve();
        SimpleSymbol simpleSymbol = (SimpleSymbol) new SimpleSymbol("number").readResolve();
        Lit12 = simpleSymbol;
        SimpleSymbol simpleSymbol2 = Lit12;
        SimpleSymbol simpleSymbol3 = Lit12;
        SimpleSymbol simpleSymbol4 = (SimpleSymbol) new SimpleSymbol(PropertyTypeConstants.PROPERTY_TYPE_BOOLEAN).readResolve();
        Lit33 = simpleSymbol4;
        Lit80 = PairWithPosition.make(simpleSymbol, PairWithPosition.make(simpleSymbol2, PairWithPosition.make(simpleSymbol3, PairWithPosition.make(simpleSymbol4, LList.Empty, "/tmp/1480960185199_0.5906416962059402-0/youngandroidproject/../src/appinventor/ai_aributowsky/TuffyApp/Picture6.yail", 528547), "/tmp/1480960185199_0.5906416962059402-0/youngandroidproject/../src/appinventor/ai_aributowsky/TuffyApp/Picture6.yail", 528540), "/tmp/1480960185199_0.5906416962059402-0/youngandroidproject/../src/appinventor/ai_aributowsky/TuffyApp/Picture6.yail", 528533), "/tmp/1480960185199_0.5906416962059402-0/youngandroidproject/../src/appinventor/ai_aributowsky/TuffyApp/Picture6.yail", 528525);
        Lit79 = (SimpleSymbol) new SimpleSymbol("$y").readResolve();
        Lit78 = (SimpleSymbol) new SimpleSymbol("$x").readResolve();
        Lit77 = (SimpleSymbol) new SimpleSymbol("DrawCircle").readResolve();
        Lit76 = (SimpleSymbol) new SimpleSymbol("Dragged").readResolve();
        Lit75 = (SimpleSymbol) new SimpleSymbol("DrawingCanvas$Dragged").readResolve();
        Lit74 = PairWithPosition.make(Lit12, PairWithPosition.make(Lit12, PairWithPosition.make(Lit12, PairWithPosition.make(Lit12, LList.Empty, "/tmp/1480960185199_0.5906416962059402-0/youngandroidproject/../src/appinventor/ai_aributowsky/TuffyApp/Picture6.yail", 520390), "/tmp/1480960185199_0.5906416962059402-0/youngandroidproject/../src/appinventor/ai_aributowsky/TuffyApp/Picture6.yail", 520383), "/tmp/1480960185199_0.5906416962059402-0/youngandroidproject/../src/appinventor/ai_aributowsky/TuffyApp/Picture6.yail", 520376), "/tmp/1480960185199_0.5906416962059402-0/youngandroidproject/../src/appinventor/ai_aributowsky/TuffyApp/Picture6.yail", 520368);
        Lit73 = (SimpleSymbol) new SimpleSymbol("$currentY").readResolve();
        Lit72 = (SimpleSymbol) new SimpleSymbol("$currentX").readResolve();
        Lit71 = (SimpleSymbol) new SimpleSymbol("$prevY").readResolve();
        Lit70 = (SimpleSymbol) new SimpleSymbol("$prevX").readResolve();
        Lit69 = (SimpleSymbol) new SimpleSymbol("DrawLine").readResolve();
        Lit68 = new FString("com.google.appinventor.components.runtime.Canvas");
        Lit67 = IntNum.make(275);
        Lit66 = new FString("com.google.appinventor.components.runtime.Canvas");
        Lit65 = (SimpleSymbol) new SimpleSymbol("Wipe$Click").readResolve();
        Lit64 = (SimpleSymbol) new SimpleSymbol("Clear").readResolve();
        Lit63 = new FString("com.google.appinventor.components.runtime.Button");
        Lit62 = (SimpleSymbol) new SimpleSymbol("Wipe").readResolve();
        Lit61 = new FString("com.google.appinventor.components.runtime.Button");
        Lit60 = (SimpleSymbol) new SimpleSymbol("ButtonBig$Click").readResolve();
        Lit59 = new FString("com.google.appinventor.components.runtime.Button");
        Lit58 = (SimpleSymbol) new SimpleSymbol("ButtonBig").readResolve();
        Lit57 = new FString("com.google.appinventor.components.runtime.Button");
        Lit56 = (SimpleSymbol) new SimpleSymbol("ButtonSmall$Click").readResolve();
        Lit55 = new FString("com.google.appinventor.components.runtime.Button");
        Lit54 = (SimpleSymbol) new SimpleSymbol("ButtonSmall").readResolve();
        Lit53 = new FString("com.google.appinventor.components.runtime.Button");
        Lit52 = new FString("com.google.appinventor.components.runtime.HorizontalArrangement");
        iArr = new int[2];
        iArr[0] = Component.COLOR_CYAN;
        Lit51 = IntNum.make(iArr);
        Lit50 = (SimpleSymbol) new SimpleSymbol("HorizontalArrangement1").readResolve();
        Lit49 = new FString("com.google.appinventor.components.runtime.HorizontalArrangement");
        Lit48 = (SimpleSymbol) new SimpleSymbol("LoadButton$Click").readResolve();
        simpleSymbol = (SimpleSymbol) new SimpleSymbol(PropertyTypeConstants.PROPERTY_TYPE_TEXT).readResolve();
        Lit9 = simpleSymbol;
        Lit47 = PairWithPosition.make(simpleSymbol, PairWithPosition.make(Lit154, LList.Empty, "/tmp/1480960185199_0.5906416962059402-0/youngandroidproject/../src/appinventor/ai_aributowsky/TuffyApp/Picture6.yail", 270491), "/tmp/1480960185199_0.5906416962059402-0/youngandroidproject/../src/appinventor/ai_aributowsky/TuffyApp/Picture6.yail", 270485);
        Lit46 = (SimpleSymbol) new SimpleSymbol("GetValue").readResolve();
        Lit45 = new FString("com.google.appinventor.components.runtime.Button");
        Lit44 = (SimpleSymbol) new SimpleSymbol("LoadButton").readResolve();
        Lit43 = new FString("com.google.appinventor.components.runtime.Button");
        Lit42 = (SimpleSymbol) new SimpleSymbol("SaveButton$Click").readResolve();
        Lit41 = PairWithPosition.make(Lit9, PairWithPosition.make(Lit154, LList.Empty, "/tmp/1480960185199_0.5906416962059402-0/youngandroidproject/../src/appinventor/ai_aributowsky/TuffyApp/Picture6.yail", 217282), "/tmp/1480960185199_0.5906416962059402-0/youngandroidproject/../src/appinventor/ai_aributowsky/TuffyApp/Picture6.yail", 217276);
        Lit40 = PairWithPosition.make(Lit9, LList.Empty, "/tmp/1480960185199_0.5906416962059402-0/youngandroidproject/../src/appinventor/ai_aributowsky/TuffyApp/Picture6.yail", 217266);
        Lit39 = (SimpleSymbol) new SimpleSymbol("SaveAs").readResolve();
        Lit38 = (SimpleSymbol) new SimpleSymbol("DrawingCanvas").readResolve();
        Lit37 = (SimpleSymbol) new SimpleSymbol("StoreValue").readResolve();
        Lit36 = (SimpleSymbol) new SimpleSymbol("TinyDB1").readResolve();
        Lit35 = new FString("com.google.appinventor.components.runtime.Button");
        Lit34 = (SimpleSymbol) new SimpleSymbol("Text").readResolve();
        Lit32 = (SimpleSymbol) new SimpleSymbol("FontBold").readResolve();
        Lit31 = (SimpleSymbol) new SimpleSymbol("SaveButton").readResolve();
        Lit30 = new FString("com.google.appinventor.components.runtime.Button");
        Lit29 = (SimpleSymbol) new SimpleSymbol("Click").readResolve();
        Lit28 = (SimpleSymbol) new SimpleSymbol("BackButton$Click").readResolve();
        Lit27 = PairWithPosition.make(Lit9, LList.Empty, "/tmp/1480960185199_0.5906416962059402-0/youngandroidproject/../src/appinventor/ai_aributowsky/TuffyApp/Picture6.yail", 163921);
        Lit26 = new FString("com.google.appinventor.components.runtime.Button");
        Lit25 = (SimpleSymbol) new SimpleSymbol("Image").readResolve();
        Lit24 = IntNum.make(27);
        Lit23 = (SimpleSymbol) new SimpleSymbol("Height").readResolve();
        Lit22 = (SimpleSymbol) new SimpleSymbol("BackButton").readResolve();
        Lit21 = new FString("com.google.appinventor.components.runtime.Button");
        Lit20 = new FString("com.google.appinventor.components.runtime.HorizontalArrangement");
        Lit19 = IntNum.make(-2);
        Lit18 = (SimpleSymbol) new SimpleSymbol("Width").readResolve();
        iArr = new int[2];
        iArr[0] = Component.COLOR_CYAN;
        Lit17 = IntNum.make(iArr);
        Lit16 = (SimpleSymbol) new SimpleSymbol("HorizontalArrangement3").readResolve();
        Lit15 = new FString("com.google.appinventor.components.runtime.HorizontalArrangement");
        Lit14 = (SimpleSymbol) new SimpleSymbol("Title").readResolve();
        Lit13 = (SimpleSymbol) new SimpleSymbol("BackgroundImage").readResolve();
        iArr = new int[2];
        iArr[0] = Component.COLOR_ORANGE;
        Lit11 = IntNum.make(iArr);
        Lit10 = (SimpleSymbol) new SimpleSymbol("BackgroundColor").readResolve();
        Lit8 = (SimpleSymbol) new SimpleSymbol("AppName").readResolve();
        Lit7 = (SimpleSymbol) new SimpleSymbol("g$small").readResolve();
        Lit6 = IntNum.make(8);
        Lit5 = (SimpleSymbol) new SimpleSymbol("g$big").readResolve();
        Lit4 = IntNum.make(2);
        Lit3 = (SimpleSymbol) new SimpleSymbol("g$dotsize").readResolve();
        Lit2 = (SimpleSymbol) new SimpleSymbol("*the-null-value*").readResolve();
        Lit1 = (SimpleSymbol) new SimpleSymbol("getMessage").readResolve();
        Lit0 = (SimpleSymbol) new SimpleSymbol("Picture6").readResolve();
    }

    public Picture6() {
        ModuleInfo.register(this);
        ModuleBody appinventor_ai_aributowsky_TuffyApp_Picture6_frame = new frame();
        appinventor_ai_aributowsky_TuffyApp_Picture6_frame.$main = this;
        this.android$Mnlog$Mnform = new ModuleMethod(appinventor_ai_aributowsky_TuffyApp_Picture6_frame, 1, Lit142, 4097);
        this.add$Mnto$Mnform$Mnenvironment = new ModuleMethod(appinventor_ai_aributowsky_TuffyApp_Picture6_frame, 2, Lit143, 8194);
        this.lookup$Mnin$Mnform$Mnenvironment = new ModuleMethod(appinventor_ai_aributowsky_TuffyApp_Picture6_frame, 3, Lit144, 8193);
        this.is$Mnbound$Mnin$Mnform$Mnenvironment = new ModuleMethod(appinventor_ai_aributowsky_TuffyApp_Picture6_frame, 5, Lit145, 4097);
        this.add$Mnto$Mnglobal$Mnvar$Mnenvironment = new ModuleMethod(appinventor_ai_aributowsky_TuffyApp_Picture6_frame, 6, Lit146, 8194);
        this.add$Mnto$Mnevents = new ModuleMethod(appinventor_ai_aributowsky_TuffyApp_Picture6_frame, 7, Lit147, 8194);
        this.add$Mnto$Mncomponents = new ModuleMethod(appinventor_ai_aributowsky_TuffyApp_Picture6_frame, 8, Lit148, 16388);
        this.add$Mnto$Mnglobal$Mnvars = new ModuleMethod(appinventor_ai_aributowsky_TuffyApp_Picture6_frame, 9, Lit149, 8194);
        this.add$Mnto$Mnform$Mndo$Mnafter$Mncreation = new ModuleMethod(appinventor_ai_aributowsky_TuffyApp_Picture6_frame, 10, Lit150, 4097);
        this.send$Mnerror = new ModuleMethod(appinventor_ai_aributowsky_TuffyApp_Picture6_frame, 11, Lit151, 4097);
        this.process$Mnexception = new ModuleMethod(appinventor_ai_aributowsky_TuffyApp_Picture6_frame, 12, "process-exception", 4097);
        this.dispatchEvent = new ModuleMethod(appinventor_ai_aributowsky_TuffyApp_Picture6_frame, 13, Lit152, 16388);
        this.lookup$Mnhandler = new ModuleMethod(appinventor_ai_aributowsky_TuffyApp_Picture6_frame, 14, Lit153, 8194);
        PropertySet moduleMethod = new ModuleMethod(appinventor_ai_aributowsky_TuffyApp_Picture6_frame, 15, null, 0);
        moduleMethod.setProperty("source-location", "/tmp/runtime1791431272433290597.scm:547");
        lambda$Fn1 = moduleMethod;
        this.$define = new ModuleMethod(appinventor_ai_aributowsky_TuffyApp_Picture6_frame, 16, "$define", 0);
        lambda$Fn2 = new ModuleMethod(appinventor_ai_aributowsky_TuffyApp_Picture6_frame, 17, null, 0);
        lambda$Fn3 = new ModuleMethod(appinventor_ai_aributowsky_TuffyApp_Picture6_frame, 18, null, 0);
        lambda$Fn4 = new ModuleMethod(appinventor_ai_aributowsky_TuffyApp_Picture6_frame, 19, null, 0);
        lambda$Fn5 = new ModuleMethod(appinventor_ai_aributowsky_TuffyApp_Picture6_frame, 20, null, 0);
        lambda$Fn6 = new ModuleMethod(appinventor_ai_aributowsky_TuffyApp_Picture6_frame, 21, null, 0);
        lambda$Fn7 = new ModuleMethod(appinventor_ai_aributowsky_TuffyApp_Picture6_frame, 22, null, 0);
        lambda$Fn8 = new ModuleMethod(appinventor_ai_aributowsky_TuffyApp_Picture6_frame, 23, null, 0);
        lambda$Fn9 = new ModuleMethod(appinventor_ai_aributowsky_TuffyApp_Picture6_frame, 24, null, 0);
        this.BackButton$Click = new ModuleMethod(appinventor_ai_aributowsky_TuffyApp_Picture6_frame, 25, Lit28, 0);
        lambda$Fn10 = new ModuleMethod(appinventor_ai_aributowsky_TuffyApp_Picture6_frame, 26, null, 0);
        lambda$Fn11 = new ModuleMethod(appinventor_ai_aributowsky_TuffyApp_Picture6_frame, 27, null, 0);
        this.SaveButton$Click = new ModuleMethod(appinventor_ai_aributowsky_TuffyApp_Picture6_frame, 28, Lit42, 0);
        lambda$Fn12 = new ModuleMethod(appinventor_ai_aributowsky_TuffyApp_Picture6_frame, 29, null, 0);
        lambda$Fn13 = new ModuleMethod(appinventor_ai_aributowsky_TuffyApp_Picture6_frame, 30, null, 0);
        this.LoadButton$Click = new ModuleMethod(appinventor_ai_aributowsky_TuffyApp_Picture6_frame, 31, Lit48, 0);
        lambda$Fn14 = new ModuleMethod(appinventor_ai_aributowsky_TuffyApp_Picture6_frame, 32, null, 0);
        lambda$Fn15 = new ModuleMethod(appinventor_ai_aributowsky_TuffyApp_Picture6_frame, 33, null, 0);
        lambda$Fn16 = new ModuleMethod(appinventor_ai_aributowsky_TuffyApp_Picture6_frame, 34, null, 0);
        lambda$Fn17 = new ModuleMethod(appinventor_ai_aributowsky_TuffyApp_Picture6_frame, 35, null, 0);
        this.ButtonSmall$Click = new ModuleMethod(appinventor_ai_aributowsky_TuffyApp_Picture6_frame, 36, Lit56, 0);
        lambda$Fn18 = new ModuleMethod(appinventor_ai_aributowsky_TuffyApp_Picture6_frame, 37, null, 0);
        lambda$Fn19 = new ModuleMethod(appinventor_ai_aributowsky_TuffyApp_Picture6_frame, 38, null, 0);
        this.ButtonBig$Click = new ModuleMethod(appinventor_ai_aributowsky_TuffyApp_Picture6_frame, 39, Lit60, 0);
        lambda$Fn20 = new ModuleMethod(appinventor_ai_aributowsky_TuffyApp_Picture6_frame, 40, null, 0);
        lambda$Fn21 = new ModuleMethod(appinventor_ai_aributowsky_TuffyApp_Picture6_frame, 41, null, 0);
        this.Wipe$Click = new ModuleMethod(appinventor_ai_aributowsky_TuffyApp_Picture6_frame, 42, Lit65, 0);
        lambda$Fn22 = new ModuleMethod(appinventor_ai_aributowsky_TuffyApp_Picture6_frame, 43, null, 0);
        lambda$Fn23 = new ModuleMethod(appinventor_ai_aributowsky_TuffyApp_Picture6_frame, 44, null, 0);
        this.DrawingCanvas$Dragged = new ModuleMethod(appinventor_ai_aributowsky_TuffyApp_Picture6_frame, 45, Lit75, 28679);
        this.DrawingCanvas$Touched = new ModuleMethod(appinventor_ai_aributowsky_TuffyApp_Picture6_frame, 46, Lit81, 12291);
        lambda$Fn24 = new ModuleMethod(appinventor_ai_aributowsky_TuffyApp_Picture6_frame, 47, null, 0);
        lambda$Fn25 = new ModuleMethod(appinventor_ai_aributowsky_TuffyApp_Picture6_frame, 48, null, 0);
        lambda$Fn26 = new ModuleMethod(appinventor_ai_aributowsky_TuffyApp_Picture6_frame, 49, null, 0);
        lambda$Fn27 = new ModuleMethod(appinventor_ai_aributowsky_TuffyApp_Picture6_frame, 50, null, 0);
        this.Red$Click = new ModuleMethod(appinventor_ai_aributowsky_TuffyApp_Picture6_frame, 51, Lit94, 0);
        lambda$Fn28 = new ModuleMethod(appinventor_ai_aributowsky_TuffyApp_Picture6_frame, 52, null, 0);
        lambda$Fn29 = new ModuleMethod(appinventor_ai_aributowsky_TuffyApp_Picture6_frame, 53, null, 0);
        this.Orange$Click = new ModuleMethod(appinventor_ai_aributowsky_TuffyApp_Picture6_frame, 54, Lit99, 0);
        lambda$Fn30 = new ModuleMethod(appinventor_ai_aributowsky_TuffyApp_Picture6_frame, 55, null, 0);
        lambda$Fn31 = new ModuleMethod(appinventor_ai_aributowsky_TuffyApp_Picture6_frame, 56, null, 0);
        this.Yellow$Click = new ModuleMethod(appinventor_ai_aributowsky_TuffyApp_Picture6_frame, 57, Lit104, 0);
        lambda$Fn32 = new ModuleMethod(appinventor_ai_aributowsky_TuffyApp_Picture6_frame, 58, null, 0);
        lambda$Fn33 = new ModuleMethod(appinventor_ai_aributowsky_TuffyApp_Picture6_frame, 59, null, 0);
        this.Green$Click = new ModuleMethod(appinventor_ai_aributowsky_TuffyApp_Picture6_frame, 60, Lit109, 0);
        lambda$Fn34 = new ModuleMethod(appinventor_ai_aributowsky_TuffyApp_Picture6_frame, 61, null, 0);
        lambda$Fn35 = new ModuleMethod(appinventor_ai_aributowsky_TuffyApp_Picture6_frame, 62, null, 0);
        this.Blue$Click = new ModuleMethod(appinventor_ai_aributowsky_TuffyApp_Picture6_frame, 63, Lit114, 0);
        lambda$Fn36 = new ModuleMethod(appinventor_ai_aributowsky_TuffyApp_Picture6_frame, 64, null, 0);
        lambda$Fn37 = new ModuleMethod(appinventor_ai_aributowsky_TuffyApp_Picture6_frame, 65, null, 0);
        this.Purple$Click = new ModuleMethod(appinventor_ai_aributowsky_TuffyApp_Picture6_frame, 66, Lit119, 0);
        lambda$Fn38 = new ModuleMethod(appinventor_ai_aributowsky_TuffyApp_Picture6_frame, 67, null, 0);
        lambda$Fn39 = new ModuleMethod(appinventor_ai_aributowsky_TuffyApp_Picture6_frame, 68, null, 0);
        this.Brown$Click = new ModuleMethod(appinventor_ai_aributowsky_TuffyApp_Picture6_frame, 69, Lit124, 0);
        lambda$Fn40 = new ModuleMethod(appinventor_ai_aributowsky_TuffyApp_Picture6_frame, 70, null, 0);
        lambda$Fn41 = new ModuleMethod(appinventor_ai_aributowsky_TuffyApp_Picture6_frame, 71, null, 0);
        this.Eraser$Click = new ModuleMethod(appinventor_ai_aributowsky_TuffyApp_Picture6_frame, 72, Lit130, 0);
    }

    public Object lookupInFormEnvironment(Symbol symbol) {
        return lookupInFormEnvironment(symbol, Boolean.FALSE);
    }

    public void run() {
        Throwable th;
        CallContext instance = CallContext.getInstance();
        Consumer consumer = instance.consumer;
        instance.consumer = VoidConsumer.instance;
        try {
            run(instance);
            th = null;
        } catch (Throwable th2) {
            th = th2;
        }
        ModuleBody.runCleanup(instance, th, consumer);
    }

    public final void run(CallContext $ctx) {
        Consumer $result = $ctx.consumer;
        Object find = require.find("com.google.youngandroid.runtime");
        try {
            String str;
            ((Runnable) find).run();
            this.$Stdebug$Mnform$St = Boolean.FALSE;
            this.form$Mnenvironment = Environment.make(misc.symbol$To$String(Lit0));
            FString stringAppend = strings.stringAppend(misc.symbol$To$String(Lit0), "-global-vars");
            if (stringAppend == null) {
                str = null;
            } else {
                str = stringAppend.toString();
            }
            this.global$Mnvar$Mnenvironment = Environment.make(str);
            Picture6 = null;
            this.form$Mnname$Mnsymbol = Lit0;
            this.events$Mnto$Mnregister = LList.Empty;
            this.components$Mnto$Mncreate = LList.Empty;
            this.global$Mnvars$Mnto$Mncreate = LList.Empty;
            this.form$Mndo$Mnafter$Mncreation = LList.Empty;
            find = require.find("com.google.youngandroid.runtime");
            try {
                ((Runnable) find).run();
                if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
                    Values.writeValues(runtime.addGlobalVarToCurrentFormEnvironment(Lit3, Lit4), $result);
                } else {
                    addToGlobalVars(Lit3, lambda$Fn2);
                }
                if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
                    Values.writeValues(runtime.addGlobalVarToCurrentFormEnvironment(Lit5, Lit6), $result);
                } else {
                    addToGlobalVars(Lit5, lambda$Fn3);
                }
                if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
                    Values.writeValues(runtime.addGlobalVarToCurrentFormEnvironment(Lit7, Lit4), $result);
                } else {
                    addToGlobalVars(Lit7, lambda$Fn4);
                }
                if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
                    runtime.setAndCoerceProperty$Ex(Lit0, Lit8, "TuffyApp", Lit9);
                    runtime.setAndCoerceProperty$Ex(Lit0, Lit10, Lit11, Lit12);
                    runtime.setAndCoerceProperty$Ex(Lit0, Lit13, "background_color.png", Lit9);
                    Values.writeValues(runtime.setAndCoerceProperty$Ex(Lit0, Lit14, "Picture6", Lit9), $result);
                } else {
                    addToFormDoAfterCreation(new Promise(lambda$Fn5));
                }
                this.HorizontalArrangement3 = null;
                if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
                    Values.writeValues(runtime.addComponentWithinRepl(Lit0, Lit15, Lit16, lambda$Fn6), $result);
                } else {
                    addToComponents(Lit0, Lit20, Lit16, lambda$Fn7);
                }
                this.BackButton = null;
                if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
                    Values.writeValues(runtime.addComponentWithinRepl(Lit16, Lit21, Lit22, lambda$Fn8), $result);
                } else {
                    addToComponents(Lit16, Lit26, Lit22, lambda$Fn9);
                }
                if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
                    runtime.addToCurrentFormEnvironment(Lit28, this.BackButton$Click);
                } else {
                    addToFormEnvironment(Lit28, this.BackButton$Click);
                }
                if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
                    EventDispatcher.registerEventForDelegation((HandlesEventDispatching) runtime.$Stthis$Mnform$St, "BackButton", "Click");
                } else {
                    addToEvents(Lit22, Lit29);
                }
                this.SaveButton = null;
                if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
                    Values.writeValues(runtime.addComponentWithinRepl(Lit16, Lit30, Lit31, lambda$Fn10), $result);
                } else {
                    addToComponents(Lit16, Lit35, Lit31, lambda$Fn11);
                }
                if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
                    runtime.addToCurrentFormEnvironment(Lit42, this.SaveButton$Click);
                } else {
                    addToFormEnvironment(Lit42, this.SaveButton$Click);
                }
                if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
                    EventDispatcher.registerEventForDelegation((HandlesEventDispatching) runtime.$Stthis$Mnform$St, "SaveButton", "Click");
                } else {
                    addToEvents(Lit31, Lit29);
                }
                this.LoadButton = null;
                if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
                    Values.writeValues(runtime.addComponentWithinRepl(Lit16, Lit43, Lit44, lambda$Fn12), $result);
                } else {
                    addToComponents(Lit16, Lit45, Lit44, lambda$Fn13);
                }
                if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
                    runtime.addToCurrentFormEnvironment(Lit48, this.LoadButton$Click);
                } else {
                    addToFormEnvironment(Lit48, this.LoadButton$Click);
                }
                if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
                    EventDispatcher.registerEventForDelegation((HandlesEventDispatching) runtime.$Stthis$Mnform$St, "LoadButton", "Click");
                } else {
                    addToEvents(Lit44, Lit29);
                }
                this.HorizontalArrangement1 = null;
                if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
                    Values.writeValues(runtime.addComponentWithinRepl(Lit0, Lit49, Lit50, lambda$Fn14), $result);
                } else {
                    addToComponents(Lit0, Lit52, Lit50, lambda$Fn15);
                }
                this.ButtonSmall = null;
                if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
                    Values.writeValues(runtime.addComponentWithinRepl(Lit50, Lit53, Lit54, lambda$Fn16), $result);
                } else {
                    addToComponents(Lit50, Lit55, Lit54, lambda$Fn17);
                }
                if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
                    runtime.addToCurrentFormEnvironment(Lit56, this.ButtonSmall$Click);
                } else {
                    addToFormEnvironment(Lit56, this.ButtonSmall$Click);
                }
                if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
                    EventDispatcher.registerEventForDelegation((HandlesEventDispatching) runtime.$Stthis$Mnform$St, "ButtonSmall", "Click");
                } else {
                    addToEvents(Lit54, Lit29);
                }
                this.ButtonBig = null;
                if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
                    Values.writeValues(runtime.addComponentWithinRepl(Lit50, Lit57, Lit58, lambda$Fn18), $result);
                } else {
                    addToComponents(Lit50, Lit59, Lit58, lambda$Fn19);
                }
                if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
                    runtime.addToCurrentFormEnvironment(Lit60, this.ButtonBig$Click);
                } else {
                    addToFormEnvironment(Lit60, this.ButtonBig$Click);
                }
                if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
                    EventDispatcher.registerEventForDelegation((HandlesEventDispatching) runtime.$Stthis$Mnform$St, "ButtonBig", "Click");
                } else {
                    addToEvents(Lit58, Lit29);
                }
                this.Wipe = null;
                if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
                    Values.writeValues(runtime.addComponentWithinRepl(Lit50, Lit61, Lit62, lambda$Fn20), $result);
                } else {
                    addToComponents(Lit50, Lit63, Lit62, lambda$Fn21);
                }
                if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
                    runtime.addToCurrentFormEnvironment(Lit65, this.Wipe$Click);
                } else {
                    addToFormEnvironment(Lit65, this.Wipe$Click);
                }
                if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
                    EventDispatcher.registerEventForDelegation((HandlesEventDispatching) runtime.$Stthis$Mnform$St, "Wipe", "Click");
                } else {
                    addToEvents(Lit62, Lit29);
                }
                this.DrawingCanvas = null;
                if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
                    Values.writeValues(runtime.addComponentWithinRepl(Lit0, Lit66, Lit38, lambda$Fn22), $result);
                } else {
                    addToComponents(Lit0, Lit68, Lit38, lambda$Fn23);
                }
                if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
                    runtime.addToCurrentFormEnvironment(Lit75, this.DrawingCanvas$Dragged);
                } else {
                    addToFormEnvironment(Lit75, this.DrawingCanvas$Dragged);
                }
                if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
                    EventDispatcher.registerEventForDelegation((HandlesEventDispatching) runtime.$Stthis$Mnform$St, "DrawingCanvas", "Dragged");
                } else {
                    addToEvents(Lit38, Lit76);
                }
                if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
                    runtime.addToCurrentFormEnvironment(Lit81, this.DrawingCanvas$Touched);
                } else {
                    addToFormEnvironment(Lit81, this.DrawingCanvas$Touched);
                }
                if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
                    EventDispatcher.registerEventForDelegation((HandlesEventDispatching) runtime.$Stthis$Mnform$St, "DrawingCanvas", "Touched");
                } else {
                    addToEvents(Lit38, Lit82);
                }
                this.HorizontalArrangement2 = null;
                if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
                    Values.writeValues(runtime.addComponentWithinRepl(Lit0, Lit83, Lit84, lambda$Fn24), $result);
                } else {
                    addToComponents(Lit0, Lit87, Lit84, lambda$Fn25);
                }
                this.Red = null;
                if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
                    Values.writeValues(runtime.addComponentWithinRepl(Lit84, Lit88, Lit89, lambda$Fn26), $result);
                } else {
                    addToComponents(Lit84, Lit91, Lit89, lambda$Fn27);
                }
                if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
                    runtime.addToCurrentFormEnvironment(Lit94, this.Red$Click);
                } else {
                    addToFormEnvironment(Lit94, this.Red$Click);
                }
                if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
                    EventDispatcher.registerEventForDelegation((HandlesEventDispatching) runtime.$Stthis$Mnform$St, "Red", "Click");
                } else {
                    addToEvents(Lit89, Lit29);
                }
                this.Orange = null;
                if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
                    Values.writeValues(runtime.addComponentWithinRepl(Lit84, Lit95, Lit96, lambda$Fn28), $result);
                } else {
                    addToComponents(Lit84, Lit97, Lit96, lambda$Fn29);
                }
                if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
                    runtime.addToCurrentFormEnvironment(Lit99, this.Orange$Click);
                } else {
                    addToFormEnvironment(Lit99, this.Orange$Click);
                }
                if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
                    EventDispatcher.registerEventForDelegation((HandlesEventDispatching) runtime.$Stthis$Mnform$St, "Orange", "Click");
                } else {
                    addToEvents(Lit96, Lit29);
                }
                this.Yellow = null;
                if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
                    Values.writeValues(runtime.addComponentWithinRepl(Lit84, Lit100, Lit101, lambda$Fn30), $result);
                } else {
                    addToComponents(Lit84, Lit102, Lit101, lambda$Fn31);
                }
                if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
                    runtime.addToCurrentFormEnvironment(Lit104, this.Yellow$Click);
                } else {
                    addToFormEnvironment(Lit104, this.Yellow$Click);
                }
                if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
                    EventDispatcher.registerEventForDelegation((HandlesEventDispatching) runtime.$Stthis$Mnform$St, "Yellow", "Click");
                } else {
                    addToEvents(Lit101, Lit29);
                }
                this.Green = null;
                if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
                    Values.writeValues(runtime.addComponentWithinRepl(Lit84, Lit105, Lit106, lambda$Fn32), $result);
                } else {
                    addToComponents(Lit84, Lit107, Lit106, lambda$Fn33);
                }
                if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
                    runtime.addToCurrentFormEnvironment(Lit109, this.Green$Click);
                } else {
                    addToFormEnvironment(Lit109, this.Green$Click);
                }
                if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
                    EventDispatcher.registerEventForDelegation((HandlesEventDispatching) runtime.$Stthis$Mnform$St, "Green", "Click");
                } else {
                    addToEvents(Lit106, Lit29);
                }
                this.Blue = null;
                if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
                    Values.writeValues(runtime.addComponentWithinRepl(Lit84, Lit110, Lit111, lambda$Fn34), $result);
                } else {
                    addToComponents(Lit84, Lit112, Lit111, lambda$Fn35);
                }
                if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
                    runtime.addToCurrentFormEnvironment(Lit114, this.Blue$Click);
                } else {
                    addToFormEnvironment(Lit114, this.Blue$Click);
                }
                if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
                    EventDispatcher.registerEventForDelegation((HandlesEventDispatching) runtime.$Stthis$Mnform$St, "Blue", "Click");
                } else {
                    addToEvents(Lit111, Lit29);
                }
                this.Purple = null;
                if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
                    Values.writeValues(runtime.addComponentWithinRepl(Lit84, Lit115, Lit116, lambda$Fn36), $result);
                } else {
                    addToComponents(Lit84, Lit117, Lit116, lambda$Fn37);
                }
                if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
                    runtime.addToCurrentFormEnvironment(Lit119, this.Purple$Click);
                } else {
                    addToFormEnvironment(Lit119, this.Purple$Click);
                }
                if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
                    EventDispatcher.registerEventForDelegation((HandlesEventDispatching) runtime.$Stthis$Mnform$St, "Purple", "Click");
                } else {
                    addToEvents(Lit116, Lit29);
                }
                this.Brown = null;
                if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
                    Values.writeValues(runtime.addComponentWithinRepl(Lit84, Lit120, Lit121, lambda$Fn38), $result);
                } else {
                    addToComponents(Lit84, Lit122, Lit121, lambda$Fn39);
                }
                if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
                    runtime.addToCurrentFormEnvironment(Lit124, this.Brown$Click);
                } else {
                    addToFormEnvironment(Lit124, this.Brown$Click);
                }
                if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
                    EventDispatcher.registerEventForDelegation((HandlesEventDispatching) runtime.$Stthis$Mnform$St, "Brown", "Click");
                } else {
                    addToEvents(Lit121, Lit29);
                }
                this.Eraser = null;
                if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
                    Values.writeValues(runtime.addComponentWithinRepl(Lit84, Lit125, Lit126, lambda$Fn40), $result);
                } else {
                    addToComponents(Lit84, Lit128, Lit126, lambda$Fn41);
                }
                if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
                    runtime.addToCurrentFormEnvironment(Lit130, this.Eraser$Click);
                } else {
                    addToFormEnvironment(Lit130, this.Eraser$Click);
                }
                if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
                    EventDispatcher.registerEventForDelegation((HandlesEventDispatching) runtime.$Stthis$Mnform$St, "Eraser", "Click");
                } else {
                    addToEvents(Lit126, Lit29);
                }
                this.TinyWebDB1 = null;
                if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
                    Values.writeValues(runtime.addComponentWithinRepl(Lit0, Lit131, Lit132, Boolean.FALSE), $result);
                } else {
                    addToComponents(Lit0, Lit133, Lit132, Boolean.FALSE);
                }
                this.TinyDB1 = null;
                if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
                    Values.writeValues(runtime.addComponentWithinRepl(Lit0, Lit134, Lit36, Boolean.FALSE), $result);
                } else {
                    addToComponents(Lit0, Lit135, Lit36, Boolean.FALSE);
                }
                this.FusiontablesControl1 = null;
                if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
                    Values.writeValues(runtime.addComponentWithinRepl(Lit0, Lit136, Lit137, Boolean.FALSE), $result);
                } else {
                    addToComponents(Lit0, Lit138, Lit137, Boolean.FALSE);
                }
                this.File1 = null;
                if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
                    Values.writeValues(runtime.addComponentWithinRepl(Lit0, Lit139, Lit140, Boolean.FALSE), $result);
                } else {
                    addToComponents(Lit0, Lit141, Lit140, Boolean.FALSE);
                }
                runtime.initRuntime();
            } catch (ClassCastException e) {
                throw new WrongType(e, "java.lang.Runnable.run()", 1, find);
            }
        } catch (ClassCastException e2) {
            throw new WrongType(e2, "java.lang.Runnable.run()", 1, find);
        }
    }

    static IntNum lambda3() {
        return Lit4;
    }

    static IntNum lambda4() {
        return Lit6;
    }

    static IntNum lambda5() {
        return Lit4;
    }

    static Object lambda6() {
        runtime.setAndCoerceProperty$Ex(Lit0, Lit8, "TuffyApp", Lit9);
        runtime.setAndCoerceProperty$Ex(Lit0, Lit10, Lit11, Lit12);
        runtime.setAndCoerceProperty$Ex(Lit0, Lit13, "background_color.png", Lit9);
        return runtime.setAndCoerceProperty$Ex(Lit0, Lit14, "Picture6", Lit9);
    }

    static Object lambda7() {
        runtime.setAndCoerceProperty$Ex(Lit16, Lit10, Lit17, Lit12);
        return runtime.setAndCoerceProperty$Ex(Lit16, Lit18, Lit19, Lit12);
    }

    static Object lambda8() {
        runtime.setAndCoerceProperty$Ex(Lit16, Lit10, Lit17, Lit12);
        return runtime.setAndCoerceProperty$Ex(Lit16, Lit18, Lit19, Lit12);
    }

    static Object lambda10() {
        runtime.setAndCoerceProperty$Ex(Lit22, Lit23, Lit24, Lit12);
        runtime.setAndCoerceProperty$Ex(Lit22, Lit18, Lit19, Lit12);
        return runtime.setAndCoerceProperty$Ex(Lit22, Lit25, "back_button.png", Lit9);
    }

    static Object lambda9() {
        runtime.setAndCoerceProperty$Ex(Lit22, Lit23, Lit24, Lit12);
        runtime.setAndCoerceProperty$Ex(Lit22, Lit18, Lit19, Lit12);
        return runtime.setAndCoerceProperty$Ex(Lit22, Lit25, "back_button.png", Lit9);
    }

    public Object BackButton$Click() {
        runtime.setThisForm();
        return runtime.callYailPrimitive(runtime.open$Mnanother$Mnscreen, LList.list1("GameScreen"), Lit27, "open another screen");
    }

    static Object lambda11() {
        runtime.setAndCoerceProperty$Ex(Lit31, Lit32, Boolean.TRUE, Lit33);
        runtime.setAndCoerceProperty$Ex(Lit31, Lit18, Lit19, Lit12);
        return runtime.setAndCoerceProperty$Ex(Lit31, Lit34, "Save Picture", Lit9);
    }

    static Object lambda12() {
        runtime.setAndCoerceProperty$Ex(Lit31, Lit32, Boolean.TRUE, Lit33);
        runtime.setAndCoerceProperty$Ex(Lit31, Lit18, Lit19, Lit12);
        return runtime.setAndCoerceProperty$Ex(Lit31, Lit34, "Save Picture", Lit9);
    }

    public Object SaveButton$Click() {
        runtime.setThisForm();
        return runtime.callComponentMethod(Lit36, Lit37, LList.list2("MyPicture - Six", runtime.callComponentMethod(Lit38, Lit39, LList.list1("MyPicture - Six.png"), Lit40)), Lit41);
    }

    static Object lambda13() {
        runtime.setAndCoerceProperty$Ex(Lit44, Lit32, Boolean.TRUE, Lit33);
        runtime.setAndCoerceProperty$Ex(Lit44, Lit18, Lit19, Lit12);
        return runtime.setAndCoerceProperty$Ex(Lit44, Lit34, "Load Picture", Lit9);
    }

    static Object lambda14() {
        runtime.setAndCoerceProperty$Ex(Lit44, Lit32, Boolean.TRUE, Lit33);
        runtime.setAndCoerceProperty$Ex(Lit44, Lit18, Lit19, Lit12);
        return runtime.setAndCoerceProperty$Ex(Lit44, Lit34, "Load Picture", Lit9);
    }

    public Object LoadButton$Click() {
        runtime.setThisForm();
        return runtime.setAndCoerceProperty$Ex(Lit38, Lit13, runtime.callComponentMethod(Lit36, Lit46, LList.list2("MyPicture - Six", ElementType.MATCH_ANY_LOCALNAME), Lit47), Lit9);
    }

    static Object lambda15() {
        runtime.setAndCoerceProperty$Ex(Lit50, Lit10, Lit51, Lit12);
        return runtime.setAndCoerceProperty$Ex(Lit50, Lit18, Lit19, Lit12);
    }

    static Object lambda16() {
        runtime.setAndCoerceProperty$Ex(Lit50, Lit10, Lit51, Lit12);
        return runtime.setAndCoerceProperty$Ex(Lit50, Lit18, Lit19, Lit12);
    }

    static Object lambda17() {
        runtime.setAndCoerceProperty$Ex(Lit54, Lit32, Boolean.TRUE, Lit33);
        runtime.setAndCoerceProperty$Ex(Lit54, Lit18, Lit19, Lit12);
        return runtime.setAndCoerceProperty$Ex(Lit54, Lit34, "Small Dots", Lit9);
    }

    static Object lambda18() {
        runtime.setAndCoerceProperty$Ex(Lit54, Lit32, Boolean.TRUE, Lit33);
        runtime.setAndCoerceProperty$Ex(Lit54, Lit18, Lit19, Lit12);
        return runtime.setAndCoerceProperty$Ex(Lit54, Lit34, "Small Dots", Lit9);
    }

    public Object ButtonSmall$Click() {
        runtime.setThisForm();
        return runtime.addGlobalVarToCurrentFormEnvironment(Lit3, runtime.lookupGlobalVarInCurrentFormEnvironment(Lit7, runtime.$Stthe$Mnnull$Mnvalue$St));
    }

    static Object lambda19() {
        runtime.setAndCoerceProperty$Ex(Lit58, Lit32, Boolean.TRUE, Lit33);
        runtime.setAndCoerceProperty$Ex(Lit58, Lit18, Lit19, Lit12);
        return runtime.setAndCoerceProperty$Ex(Lit58, Lit34, "Big Dots", Lit9);
    }

    static Object lambda20() {
        runtime.setAndCoerceProperty$Ex(Lit58, Lit32, Boolean.TRUE, Lit33);
        runtime.setAndCoerceProperty$Ex(Lit58, Lit18, Lit19, Lit12);
        return runtime.setAndCoerceProperty$Ex(Lit58, Lit34, "Big Dots", Lit9);
    }

    public Object ButtonBig$Click() {
        runtime.setThisForm();
        return runtime.addGlobalVarToCurrentFormEnvironment(Lit3, runtime.lookupGlobalVarInCurrentFormEnvironment(Lit5, runtime.$Stthe$Mnnull$Mnvalue$St));
    }

    static Object lambda21() {
        runtime.setAndCoerceProperty$Ex(Lit62, Lit32, Boolean.TRUE, Lit33);
        runtime.setAndCoerceProperty$Ex(Lit62, Lit18, Lit19, Lit12);
        return runtime.setAndCoerceProperty$Ex(Lit62, Lit34, "Wipe", Lit9);
    }

    static Object lambda22() {
        runtime.setAndCoerceProperty$Ex(Lit62, Lit32, Boolean.TRUE, Lit33);
        runtime.setAndCoerceProperty$Ex(Lit62, Lit18, Lit19, Lit12);
        return runtime.setAndCoerceProperty$Ex(Lit62, Lit34, "Wipe", Lit9);
    }

    public Object Wipe$Click() {
        runtime.setThisForm();
        return runtime.callComponentMethod(Lit38, Lit64, LList.Empty, LList.Empty);
    }

    static Object lambda23() {
        runtime.setAndCoerceProperty$Ex(Lit38, Lit13, "coloring6.png", Lit9);
        runtime.setAndCoerceProperty$Ex(Lit38, Lit23, Lit67, Lit12);
        return runtime.setAndCoerceProperty$Ex(Lit38, Lit18, Lit19, Lit12);
    }

    static Object lambda24() {
        runtime.setAndCoerceProperty$Ex(Lit38, Lit13, "coloring6.png", Lit9);
        runtime.setAndCoerceProperty$Ex(Lit38, Lit23, Lit67, Lit12);
        return runtime.setAndCoerceProperty$Ex(Lit38, Lit18, Lit19, Lit12);
    }

    public Object DrawingCanvas$Dragged(Object $startX, Object $startY, Object $prevX, Object $prevY, Object $currentX, Object $currentY, Object $draggedAnySprite) {
        runtime.sanitizeComponentData($startX);
        runtime.sanitizeComponentData($startY);
        $prevX = runtime.sanitizeComponentData($prevX);
        $prevY = runtime.sanitizeComponentData($prevY);
        $currentX = runtime.sanitizeComponentData($currentX);
        $currentY = runtime.sanitizeComponentData($currentY);
        runtime.sanitizeComponentData($draggedAnySprite);
        runtime.setThisForm();
        SimpleSymbol simpleSymbol = Lit38;
        SimpleSymbol simpleSymbol2 = Lit69;
        if ($prevX instanceof Package) {
            $prevX = runtime.signalRuntimeError(strings.stringAppend("The variable ", ((Procedure) runtime.get$Mndisplay$Mnrepresentation).apply1(Lit70), " is not bound in the current context"), "Unbound Variable");
        }
        if ($prevY instanceof Package) {
            $prevY = runtime.signalRuntimeError(strings.stringAppend("The variable ", ((Procedure) runtime.get$Mndisplay$Mnrepresentation).apply1(Lit71), " is not bound in the current context"), "Unbound Variable");
        }
        if ($currentX instanceof Package) {
            $currentX = runtime.signalRuntimeError(strings.stringAppend("The variable ", ((Procedure) runtime.get$Mndisplay$Mnrepresentation).apply1(Lit72), " is not bound in the current context"), "Unbound Variable");
        }
        if ($currentY instanceof Package) {
            $currentY = runtime.signalRuntimeError(strings.stringAppend("The variable ", ((Procedure) runtime.get$Mndisplay$Mnrepresentation).apply1(Lit73), " is not bound in the current context"), "Unbound Variable");
        }
        return runtime.callComponentMethod(simpleSymbol, simpleSymbol2, LList.list4($prevX, $prevY, $currentX, $currentY), Lit74);
    }

    public Object DrawingCanvas$Touched(Object $x, Object $y, Object $touchedAnySprite) {
        $x = runtime.sanitizeComponentData($x);
        $y = runtime.sanitizeComponentData($y);
        runtime.sanitizeComponentData($touchedAnySprite);
        runtime.setThisForm();
        SimpleSymbol simpleSymbol = Lit38;
        SimpleSymbol simpleSymbol2 = Lit77;
        if ($x instanceof Package) {
            $x = runtime.signalRuntimeError(strings.stringAppend("The variable ", ((Procedure) runtime.get$Mndisplay$Mnrepresentation).apply1(Lit78), " is not bound in the current context"), "Unbound Variable");
        }
        if ($y instanceof Package) {
            $y = runtime.signalRuntimeError(strings.stringAppend("The variable ", ((Procedure) runtime.get$Mndisplay$Mnrepresentation).apply1(Lit79), " is not bound in the current context"), "Unbound Variable");
        }
        return runtime.callComponentMethod(simpleSymbol, simpleSymbol2, LList.list4($x, $y, runtime.lookupGlobalVarInCurrentFormEnvironment(Lit3, runtime.$Stthe$Mnnull$Mnvalue$St), Boolean.TRUE), Lit80);
    }

    static Object lambda25() {
        runtime.setAndCoerceProperty$Ex(Lit84, Lit10, Lit85, Lit12);
        return runtime.setAndCoerceProperty$Ex(Lit84, Lit23, Lit86, Lit12);
    }

    static Object lambda26() {
        runtime.setAndCoerceProperty$Ex(Lit84, Lit10, Lit85, Lit12);
        return runtime.setAndCoerceProperty$Ex(Lit84, Lit23, Lit86, Lit12);
    }

    static Object lambda27() {
        runtime.setAndCoerceProperty$Ex(Lit89, Lit18, Lit90, Lit12);
        return runtime.setAndCoerceProperty$Ex(Lit89, Lit25, "color_red-vertical.png", Lit9);
    }

    static Object lambda28() {
        runtime.setAndCoerceProperty$Ex(Lit89, Lit18, Lit90, Lit12);
        return runtime.setAndCoerceProperty$Ex(Lit89, Lit25, "color_red-vertical.png", Lit9);
    }

    public Object Red$Click() {
        runtime.setThisForm();
        return runtime.setAndCoerceProperty$Ex(Lit38, Lit92, Lit93, Lit12);
    }

    static Object lambda29() {
        runtime.setAndCoerceProperty$Ex(Lit96, Lit18, Lit90, Lit12);
        return runtime.setAndCoerceProperty$Ex(Lit96, Lit25, "color_orange-vertical.png", Lit9);
    }

    static Object lambda30() {
        runtime.setAndCoerceProperty$Ex(Lit96, Lit18, Lit90, Lit12);
        return runtime.setAndCoerceProperty$Ex(Lit96, Lit25, "color_orange-vertical.png", Lit9);
    }

    public Object Orange$Click() {
        runtime.setThisForm();
        return runtime.setAndCoerceProperty$Ex(Lit38, Lit92, Lit98, Lit12);
    }

    static Object lambda31() {
        runtime.setAndCoerceProperty$Ex(Lit101, Lit18, Lit90, Lit12);
        return runtime.setAndCoerceProperty$Ex(Lit101, Lit25, "color_yellow-vertical.png", Lit9);
    }

    static Object lambda32() {
        runtime.setAndCoerceProperty$Ex(Lit101, Lit18, Lit90, Lit12);
        return runtime.setAndCoerceProperty$Ex(Lit101, Lit25, "color_yellow-vertical.png", Lit9);
    }

    public Object Yellow$Click() {
        runtime.setThisForm();
        return runtime.setAndCoerceProperty$Ex(Lit38, Lit92, Lit103, Lit12);
    }

    static Object lambda33() {
        runtime.setAndCoerceProperty$Ex(Lit106, Lit18, Lit90, Lit12);
        return runtime.setAndCoerceProperty$Ex(Lit106, Lit25, "color_green-vertical.png", Lit9);
    }

    static Object lambda34() {
        runtime.setAndCoerceProperty$Ex(Lit106, Lit18, Lit90, Lit12);
        return runtime.setAndCoerceProperty$Ex(Lit106, Lit25, "color_green-vertical.png", Lit9);
    }

    public Object Green$Click() {
        runtime.setThisForm();
        return runtime.setAndCoerceProperty$Ex(Lit38, Lit92, Lit108, Lit12);
    }

    static Object lambda35() {
        runtime.setAndCoerceProperty$Ex(Lit111, Lit18, Lit90, Lit12);
        return runtime.setAndCoerceProperty$Ex(Lit111, Lit25, "color_blue-vertical.png", Lit9);
    }

    static Object lambda36() {
        runtime.setAndCoerceProperty$Ex(Lit111, Lit18, Lit90, Lit12);
        return runtime.setAndCoerceProperty$Ex(Lit111, Lit25, "color_blue-vertical.png", Lit9);
    }

    public Object Blue$Click() {
        runtime.setThisForm();
        return runtime.setAndCoerceProperty$Ex(Lit38, Lit92, Lit113, Lit12);
    }

    static Object lambda37() {
        runtime.setAndCoerceProperty$Ex(Lit116, Lit18, Lit90, Lit12);
        return runtime.setAndCoerceProperty$Ex(Lit116, Lit25, "color_purple-vertical.png", Lit9);
    }

    static Object lambda38() {
        runtime.setAndCoerceProperty$Ex(Lit116, Lit18, Lit90, Lit12);
        return runtime.setAndCoerceProperty$Ex(Lit116, Lit25, "color_purple-vertical.png", Lit9);
    }

    public Object Purple$Click() {
        runtime.setThisForm();
        return runtime.setAndCoerceProperty$Ex(Lit38, Lit92, Lit118, Lit12);
    }

    static Object lambda39() {
        runtime.setAndCoerceProperty$Ex(Lit121, Lit18, Lit90, Lit12);
        return runtime.setAndCoerceProperty$Ex(Lit121, Lit25, "color_brown-vertical.png", Lit9);
    }

    static Object lambda40() {
        runtime.setAndCoerceProperty$Ex(Lit121, Lit18, Lit90, Lit12);
        return runtime.setAndCoerceProperty$Ex(Lit121, Lit25, "color_brown-vertical.png", Lit9);
    }

    public Object Brown$Click() {
        runtime.setThisForm();
        return runtime.setAndCoerceProperty$Ex(Lit38, Lit92, Lit123, Lit12);
    }

    static Object lambda41() {
        runtime.setAndCoerceProperty$Ex(Lit126, Lit18, Lit127, Lit12);
        return runtime.setAndCoerceProperty$Ex(Lit126, Lit25, "eraser.png", Lit9);
    }

    static Object lambda42() {
        runtime.setAndCoerceProperty$Ex(Lit126, Lit18, Lit127, Lit12);
        return runtime.setAndCoerceProperty$Ex(Lit126, Lit25, "eraser.png", Lit9);
    }

    public Object Eraser$Click() {
        runtime.setThisForm();
        return runtime.setAndCoerceProperty$Ex(Lit38, Lit92, Lit129, Lit12);
    }

    public void androidLogForm(Object message) {
    }

    public void addToFormEnvironment(Symbol name, Object object) {
        androidLogForm(Format.formatToString(0, "Adding ~A to env ~A with value ~A", name, this.form$Mnenvironment, object));
        this.form$Mnenvironment.put(name, object);
    }

    public Object lookupInFormEnvironment(Symbol name, Object default$Mnvalue) {
        boolean x = ((this.form$Mnenvironment == null ? 1 : 0) + 1) & 1;
        if (x) {
            if (!this.form$Mnenvironment.isBound(name)) {
                return default$Mnvalue;
            }
        } else if (!x) {
            return default$Mnvalue;
        }
        return this.form$Mnenvironment.get(name);
    }

    public boolean isBoundInFormEnvironment(Symbol name) {
        return this.form$Mnenvironment.isBound(name);
    }

    public void addToGlobalVarEnvironment(Symbol name, Object object) {
        androidLogForm(Format.formatToString(0, "Adding ~A to env ~A with value ~A", name, this.global$Mnvar$Mnenvironment, object));
        this.global$Mnvar$Mnenvironment.put(name, object);
    }

    public void addToEvents(Object component$Mnname, Object event$Mnname) {
        this.events$Mnto$Mnregister = lists.cons(lists.cons(component$Mnname, event$Mnname), this.events$Mnto$Mnregister);
    }

    public void addToComponents(Object container$Mnname, Object component$Mntype, Object component$Mnname, Object init$Mnthunk) {
        this.components$Mnto$Mncreate = lists.cons(LList.list4(container$Mnname, component$Mntype, component$Mnname, init$Mnthunk), this.components$Mnto$Mncreate);
    }

    public void addToGlobalVars(Object var, Object val$Mnthunk) {
        this.global$Mnvars$Mnto$Mncreate = lists.cons(LList.list2(var, val$Mnthunk), this.global$Mnvars$Mnto$Mncreate);
    }

    public void addToFormDoAfterCreation(Object thunk) {
        this.form$Mndo$Mnafter$Mncreation = lists.cons(thunk, this.form$Mndo$Mnafter$Mncreation);
    }

    public void sendError(Object error) {
        RetValManager.sendError(error == null ? null : error.toString());
    }

    public void processException(Object ex) {
        Object apply1 = Scheme.applyToArgs.apply1(GetNamedPart.getNamedPart.apply2(ex, Lit1));
        RuntimeErrorAlert.alert(this, apply1 == null ? null : apply1.toString(), ex instanceof YailRuntimeError ? ((YailRuntimeError) ex).getErrorType() : "Runtime Error", "End Application");
    }

    public boolean dispatchEvent(Component componentObject, String registeredComponentName, String eventName, Object[] args) {
        SimpleSymbol registeredObject = misc.string$To$Symbol(registeredComponentName);
        if (!isBoundInFormEnvironment(registeredObject)) {
            EventDispatcher.unregisterEventForDelegation(this, registeredComponentName, eventName);
            return false;
        } else if (lookupInFormEnvironment(registeredObject) != componentObject) {
            return false;
        } else {
            try {
                Scheme.apply.apply2(lookupHandler(registeredComponentName, eventName), LList.makeList(args, 0));
                return true;
            } catch (Throwable exception) {
                androidLogForm(exception.getMessage());
                exception.printStackTrace();
                processException(exception);
                return false;
            }
        }
    }

    public Object lookupHandler(Object componentName, Object eventName) {
        String str = null;
        String obj = componentName == null ? null : componentName.toString();
        if (eventName != null) {
            str = eventName.toString();
        }
        return lookupInFormEnvironment(misc.string$To$Symbol(EventDispatcher.makeFullEventName(obj, str)));
    }

    public void $define() {
        Language.setDefaults(Scheme.getInstance());
        try {
            run();
        } catch (Exception exception) {
            androidLogForm(exception.getMessage());
            processException(exception);
        }
        Picture6 = this;
        addToFormEnvironment(Lit0, this);
        Object obj = this.events$Mnto$Mnregister;
        while (obj != LList.Empty) {
            try {
                Pair arg0 = (Pair) obj;
                Object event$Mninfo = arg0.getCar();
                Object apply1 = lists.car.apply1(event$Mninfo);
                String obj2 = apply1 == null ? null : apply1.toString();
                Object apply12 = lists.cdr.apply1(event$Mninfo);
                EventDispatcher.registerEventForDelegation(this, obj2, apply12 == null ? null : apply12.toString());
                obj = arg0.getCdr();
            } catch (ClassCastException e) {
                throw new WrongType(e, "arg0", -2, obj);
            }
        }
        addToGlobalVars(Lit2, lambda$Fn1);
        Picture6 closureEnv = this;
        obj = lists.reverse(this.global$Mnvars$Mnto$Mncreate);
        while (obj != LList.Empty) {
            try {
                arg0 = (Pair) obj;
                Object var$Mnval = arg0.getCar();
                Object var = lists.car.apply1(var$Mnval);
                addToGlobalVarEnvironment((Symbol) var, Scheme.applyToArgs.apply1(lists.cadr.apply1(var$Mnval)));
                obj = arg0.getCdr();
            } catch (ClassCastException e2) {
                throw new WrongType(e2, "arg0", -2, obj);
            } catch (ClassCastException e22) {
                throw new WrongType(e22, "arg0", -2, obj);
            } catch (ClassCastException e222) {
                throw new WrongType(e222, "add-to-form-environment", 0, component$Mnname);
            } catch (ClassCastException e3) {
                throw new WrongType(e3, "lookup-in-form-environment", 0, apply1);
            } catch (ClassCastException e2222) {
                throw new WrongType(e2222, "arg0", -2, obj);
            } catch (ClassCastException e22222) {
                throw new WrongType(e22222, "arg0", -2, obj);
            } catch (ClassCastException e222222) {
                throw new WrongType(e222222, "add-to-global-var-environment", 0, var);
            } catch (ClassCastException e2222222) {
                throw new WrongType(e2222222, "arg0", -2, obj);
            } catch (YailRuntimeError exception2) {
                processException(exception2);
                return;
            }
        }
        obj = lists.reverse(this.form$Mndo$Mnafter$Mncreation);
        while (obj != LList.Empty) {
            arg0 = (Pair) obj;
            misc.force(arg0.getCar());
            obj = arg0.getCdr();
        }
        LList component$Mndescriptors = lists.reverse(this.components$Mnto$Mncreate);
        closureEnv = this;
        obj = component$Mndescriptors;
        while (obj != LList.Empty) {
            arg0 = (Pair) obj;
            Object component$Mninfo = arg0.getCar();
            Object component$Mnname = lists.caddr.apply1(component$Mninfo);
            lists.cadddr.apply1(component$Mninfo);
            Object component$Mnobject = Invoke.make.apply2(lists.cadr.apply1(component$Mninfo), lookupInFormEnvironment((Symbol) lists.car.apply1(component$Mninfo)));
            SlotSet.set$Mnfield$Ex.apply3(this, component$Mnname, component$Mnobject);
            addToFormEnvironment((Symbol) component$Mnname, component$Mnobject);
            obj = arg0.getCdr();
        }
        obj = component$Mndescriptors;
        while (obj != LList.Empty) {
            arg0 = (Pair) obj;
            component$Mninfo = arg0.getCar();
            lists.caddr.apply1(component$Mninfo);
            Boolean init$Mnthunk = lists.cadddr.apply1(component$Mninfo);
            if (init$Mnthunk != Boolean.FALSE) {
                Scheme.applyToArgs.apply1(init$Mnthunk);
            }
            obj = arg0.getCdr();
        }
        obj = component$Mndescriptors;
        while (obj != LList.Empty) {
            arg0 = (Pair) obj;
            component$Mninfo = arg0.getCar();
            component$Mnname = lists.caddr.apply1(component$Mninfo);
            lists.cadddr.apply1(component$Mninfo);
            callInitialize(SlotGet.field.apply2(this, component$Mnname));
            obj = arg0.getCdr();
        }
    }

    public static SimpleSymbol lambda1symbolAppend$V(Object[] argsArray) {
        Object car;
        LList symbols = LList.makeList(argsArray, 0);
        Procedure procedure = Scheme.apply;
        ModuleMethod moduleMethod = strings.string$Mnappend;
        Pair result = LList.Empty;
        Object arg0 = symbols;
        while (arg0 != LList.Empty) {
            try {
                Pair arg02 = (Pair) arg0;
                Object arg03 = arg02.getCdr();
                car = arg02.getCar();
                try {
                    result = Pair.make(misc.symbol$To$String((Symbol) car), result);
                    arg0 = arg03;
                } catch (ClassCastException e) {
                    throw new WrongType(e, "symbol->string", 1, car);
                }
            } catch (ClassCastException e2) {
                throw new WrongType(e2, "arg0", -2, arg0);
            }
        }
        car = procedure.apply2(moduleMethod, LList.reverseInPlace(result));
        try {
            return misc.string$To$Symbol((CharSequence) car);
        } catch (ClassCastException e3) {
            throw new WrongType(e3, "string->symbol", 1, car);
        }
    }

    static Object lambda2() {
        return null;
    }
}
