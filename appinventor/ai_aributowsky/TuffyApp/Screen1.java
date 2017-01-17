package appinventor.ai_aributowsky.TuffyApp;

import com.google.appinventor.components.common.PropertyTypeConstants;
import com.google.appinventor.components.runtime.ActivityStarter;
import com.google.appinventor.components.runtime.Button;
import com.google.appinventor.components.runtime.Component;
import com.google.appinventor.components.runtime.EventDispatcher;
import com.google.appinventor.components.runtime.Form;
import com.google.appinventor.components.runtime.HandlesEventDispatching;
import com.google.appinventor.components.runtime.HorizontalArrangement;
import com.google.appinventor.components.runtime.Image;
import com.google.appinventor.components.runtime.ListPicker;
import com.google.appinventor.components.runtime.VerticalArrangement;
import com.google.appinventor.components.runtime.Web;
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
import kawa.lang.Promise;
import kawa.lib.lists;
import kawa.lib.misc;
import kawa.lib.strings;
import kawa.standard.Scheme;
import kawa.standard.require;
import org.json.zip.JSONzip;

/* compiled from: Screen1.yail */
public class Screen1 extends Form implements Runnable {
    static final SimpleSymbol Lit0;
    static final SimpleSymbol Lit1;
    static final SimpleSymbol Lit10;
    static final SimpleSymbol Lit100;
    static final SimpleSymbol Lit101;
    static final SimpleSymbol Lit102;
    static final SimpleSymbol Lit103;
    static final SimpleSymbol Lit104;
    static final SimpleSymbol Lit105;
    static final SimpleSymbol Lit106;
    static final SimpleSymbol Lit107;
    static final SimpleSymbol Lit108;
    static final SimpleSymbol Lit11;
    static final IntNum Lit12;
    static final IntNum Lit13;
    static final SimpleSymbol Lit14;
    static final IntNum Lit15;
    static final SimpleSymbol Lit16;
    static final IntNum Lit17;
    static final FString Lit18;
    static final FString Lit19;
    static final SimpleSymbol Lit2;
    static final SimpleSymbol Lit20;
    static final SimpleSymbol Lit21;
    static final SimpleSymbol Lit22;
    static final SimpleSymbol Lit23;
    static final FString Lit24;
    static final FString Lit25;
    static final SimpleSymbol Lit26;
    static final IntNum Lit27;
    static final FString Lit28;
    static final FString Lit29;
    static final SimpleSymbol Lit3;
    static final SimpleSymbol Lit30;
    static final SimpleSymbol Lit31;
    static final SimpleSymbol Lit32;
    static final IntNum Lit33;
    static final SimpleSymbol Lit34;
    static final FString Lit35;
    static final PairWithPosition Lit36;
    static final SimpleSymbol Lit37;
    static final SimpleSymbol Lit38;
    static final FString Lit39;
    static final SimpleSymbol Lit4;
    static final SimpleSymbol Lit40;
    static final SimpleSymbol Lit41;
    static final IntNum Lit42;
    static final FString Lit43;
    static final PairWithPosition Lit44;
    static final SimpleSymbol Lit45;
    static final FString Lit46;
    static final SimpleSymbol Lit47;
    static final FString Lit48;
    static final PairWithPosition Lit49;
    static final SimpleSymbol Lit5;
    static final SimpleSymbol Lit50;
    static final FString Lit51;
    static final SimpleSymbol Lit52;
    static final FString Lit53;
    static final PairWithPosition Lit54;
    static final SimpleSymbol Lit55;
    static final FString Lit56;
    static final SimpleSymbol Lit57;
    static final IntNum Lit58;
    static final FString Lit59;
    static final IntNum Lit6;
    static final FString Lit60;
    static final SimpleSymbol Lit61;
    static final IntNum Lit62;
    static final IntNum Lit63;
    static final SimpleSymbol Lit64;
    static final FString Lit65;
    static final SimpleSymbol Lit66;
    static final SimpleSymbol Lit67;
    static final SimpleSymbol Lit68;
    static final SimpleSymbol Lit69;
    static final SimpleSymbol Lit7;
    static final SimpleSymbol Lit70;
    static final FString Lit71;
    static final SimpleSymbol Lit72;
    static final FString Lit73;
    static final SimpleSymbol Lit74;
    static final SimpleSymbol Lit75;
    static final FString Lit76;
    static final SimpleSymbol Lit77;
    static final IntNum Lit78;
    static final FString Lit79;
    static final SimpleSymbol Lit8;
    static final SimpleSymbol Lit80;
    static final SimpleSymbol Lit81;
    static final FString Lit82;
    static final FString Lit83;
    static final FString Lit84;
    static final FString Lit85;
    static final FString Lit86;
    static final FString Lit87;
    static final FString Lit88;
    static final SimpleSymbol Lit89;
    static final FString Lit9;
    static final FString Lit90;
    static final FString Lit91;
    static final SimpleSymbol Lit92;
    static final FString Lit93;
    static final FString Lit94;
    static final SimpleSymbol Lit95;
    static final FString Lit96;
    static final SimpleSymbol Lit97;
    static final SimpleSymbol Lit98;
    static final SimpleSymbol Lit99;
    public static Screen1 Screen1;
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
    static final ModuleMethod lambda$Fn4 = null;
    static final ModuleMethod lambda$Fn5 = null;
    static final ModuleMethod lambda$Fn6 = null;
    static final ModuleMethod lambda$Fn7 = null;
    static final ModuleMethod lambda$Fn8 = null;
    static final ModuleMethod lambda$Fn9 = null;
    public Boolean $Stdebug$Mnform$St;
    public final ModuleMethod $define;
    public Button AboutButton;
    public final ModuleMethod AboutButton$Click;
    public ActivityStarter ActivityStarter1;
    public ActivityStarter ActivityStarter2;
    public ActivityStarter ActivityStarter3;
    public Button AmazonButton;
    public final ModuleMethod AmazonButton$Click;
    public Image GameTitle;
    public Button GooglePlayButton;
    public final ModuleMethod GooglePlayButton$Click;
    public HorizontalArrangement HorizontalArrangement1;
    public HorizontalArrangement HorizontalArrangement2;
    public Button KeyButton;
    public final ModuleMethod KeyButton$Click;
    public Button RulesButton;
    public final ModuleMethod RulesButton$Click;
    public Button StartButton;
    public final ModuleMethod StartButton$Click;
    public VerticalArrangement VerticalArrangement1;
    public Web Web1;
    public Web Web2;
    public Web Web3;
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
    public Button iTunesButton;
    public final ModuleMethod iTunesButton$Click;
    public final ModuleMethod is$Mnbound$Mnin$Mnform$Mnenvironment;
    public final ModuleMethod lookup$Mnhandler;
    public final ModuleMethod lookup$Mnin$Mnform$Mnenvironment;
    public final ModuleMethod process$Mnexception;
    public final ModuleMethod send$Mnerror;

    /* compiled from: Screen1.yail */
    public class frame extends ModuleBody {
        Screen1 $main;

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
                    if (!(obj instanceof Screen1)) {
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
                    if (!(obj instanceof Screen1)) {
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
                    return Screen1.lambda2();
                case SetExp.PROCEDURE /*16*/:
                    this.$main.$define();
                    return Values.empty;
                case Sequence.INT_U8_VALUE /*17*/:
                    return Screen1.lambda3();
                case Sequence.INT_S8_VALUE /*18*/:
                    return Screen1.lambda4();
                case Sequence.INT_U16_VALUE /*19*/:
                    return Screen1.lambda5();
                case Sequence.INT_S16_VALUE /*20*/:
                    return Screen1.lambda6();
                case Sequence.INT_U32_VALUE /*21*/:
                    return Screen1.lambda7();
                case Sequence.INT_S32_VALUE /*22*/:
                    return Screen1.lambda8();
                case Sequence.INT_U64_VALUE /*23*/:
                    return Screen1.lambda9();
                case Sequence.INT_S64_VALUE /*24*/:
                    return Screen1.lambda10();
                case Sequence.FLOAT_VALUE /*25*/:
                    return Screen1.lambda11();
                case Sequence.DOUBLE_VALUE /*26*/:
                    return this.$main.StartButton$Click();
                case Sequence.BOOLEAN_VALUE /*27*/:
                    return Screen1.lambda12();
                case Sequence.TEXT_BYTE_VALUE /*28*/:
                    return Screen1.lambda13();
                case Sequence.CHAR_VALUE /*29*/:
                    return this.$main.AboutButton$Click();
                case XDataType.DAY_TIME_DURATION_TYPE_CODE /*30*/:
                    return Screen1.lambda14();
                case Sequence.CDATA_VALUE /*31*/:
                    return Screen1.lambda15();
                case SetExp.SET_IF_UNBOUND /*32*/:
                    return this.$main.RulesButton$Click();
                case Sequence.ELEMENT_VALUE /*33*/:
                    return Screen1.lambda16();
                case Sequence.DOCUMENT_VALUE /*34*/:
                    return Screen1.lambda17();
                case Sequence.ATTRIBUTE_VALUE /*35*/:
                    return this.$main.KeyButton$Click();
                case Sequence.COMMENT_VALUE /*36*/:
                    return Screen1.lambda18();
                case Sequence.PROCESSING_INSTRUCTION_VALUE /*37*/:
                    return Screen1.lambda19();
                case XDataType.STRING_TYPE_CODE /*38*/:
                    return Screen1.lambda20();
                case XDataType.NORMALIZED_STRING_TYPE_CODE /*39*/:
                    return Screen1.lambda21();
                case JSONzip.substringLimit /*40*/:
                    return this.$main.AmazonButton$Click();
                case XDataType.LANGUAGE_TYPE_CODE /*41*/:
                    return Screen1.lambda22();
                case XDataType.NMTOKEN_TYPE_CODE /*42*/:
                    return Screen1.lambda23();
                case XDataType.NAME_TYPE_CODE /*43*/:
                    return this.$main.GooglePlayButton$Click();
                case XDataType.NCNAME_TYPE_CODE /*44*/:
                    return Screen1.lambda24();
                case XDataType.ID_TYPE_CODE /*45*/:
                    return Screen1.lambda25();
                case XDataType.IDREF_TYPE_CODE /*46*/:
                    return this.$main.iTunesButton$Click();
                case XDataType.ENTITY_TYPE_CODE /*47*/:
                    return Screen1.lambda26();
                case XDataType.UNTYPED_TYPE_CODE /*48*/:
                    return Screen1.lambda27();
                case 49:
                    return Screen1.lambda28();
                case 50:
                    return Screen1.lambda29();
                case 51:
                    return Screen1.lambda30();
                case 52:
                    return Screen1.lambda31();
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
                case XDataType.ID_TYPE_CODE /*45*/:
                    callContext.proc = moduleMethod;
                    callContext.pc = 0;
                    return 0;
                case XDataType.IDREF_TYPE_CODE /*46*/:
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
                default:
                    return super.match0(moduleMethod, callContext);
            }
        }
    }

    static {
        Lit108 = (SimpleSymbol) new SimpleSymbol("lookup-handler").readResolve();
        Lit107 = (SimpleSymbol) new SimpleSymbol("dispatchEvent").readResolve();
        Lit106 = (SimpleSymbol) new SimpleSymbol("send-error").readResolve();
        Lit105 = (SimpleSymbol) new SimpleSymbol("add-to-form-do-after-creation").readResolve();
        Lit104 = (SimpleSymbol) new SimpleSymbol("add-to-global-vars").readResolve();
        Lit103 = (SimpleSymbol) new SimpleSymbol("add-to-components").readResolve();
        Lit102 = (SimpleSymbol) new SimpleSymbol("add-to-events").readResolve();
        Lit101 = (SimpleSymbol) new SimpleSymbol("add-to-global-var-environment").readResolve();
        Lit100 = (SimpleSymbol) new SimpleSymbol("is-bound-in-form-environment").readResolve();
        Lit99 = (SimpleSymbol) new SimpleSymbol("lookup-in-form-environment").readResolve();
        Lit98 = (SimpleSymbol) new SimpleSymbol("add-to-form-environment").readResolve();
        Lit97 = (SimpleSymbol) new SimpleSymbol("android-log-form").readResolve();
        Lit96 = new FString("com.google.appinventor.components.runtime.Web");
        Lit95 = (SimpleSymbol) new SimpleSymbol("Web3").readResolve();
        Lit94 = new FString("com.google.appinventor.components.runtime.Web");
        Lit93 = new FString("com.google.appinventor.components.runtime.Web");
        Lit92 = (SimpleSymbol) new SimpleSymbol("Web2").readResolve();
        Lit91 = new FString("com.google.appinventor.components.runtime.Web");
        Lit90 = new FString("com.google.appinventor.components.runtime.Web");
        Lit89 = (SimpleSymbol) new SimpleSymbol("Web1").readResolve();
        Lit88 = new FString("com.google.appinventor.components.runtime.Web");
        Lit87 = new FString("com.google.appinventor.components.runtime.ActivityStarter");
        Lit86 = new FString("com.google.appinventor.components.runtime.ActivityStarter");
        Lit85 = new FString("com.google.appinventor.components.runtime.ActivityStarter");
        Lit84 = new FString("com.google.appinventor.components.runtime.ActivityStarter");
        Lit83 = new FString("com.google.appinventor.components.runtime.ActivityStarter");
        Lit82 = new FString("com.google.appinventor.components.runtime.ActivityStarter");
        Lit81 = (SimpleSymbol) new SimpleSymbol("iTunesButton$Click").readResolve();
        Lit80 = (SimpleSymbol) new SimpleSymbol("ActivityStarter3").readResolve();
        Lit79 = new FString("com.google.appinventor.components.runtime.Button");
        Lit78 = IntNum.make(100);
        Lit77 = (SimpleSymbol) new SimpleSymbol("iTunesButton").readResolve();
        Lit76 = new FString("com.google.appinventor.components.runtime.Button");
        Lit75 = (SimpleSymbol) new SimpleSymbol("GooglePlayButton$Click").readResolve();
        Lit74 = (SimpleSymbol) new SimpleSymbol("ActivityStarter2").readResolve();
        Lit73 = new FString("com.google.appinventor.components.runtime.Button");
        Lit72 = (SimpleSymbol) new SimpleSymbol("GooglePlayButton").readResolve();
        Lit71 = new FString("com.google.appinventor.components.runtime.Button");
        Lit70 = (SimpleSymbol) new SimpleSymbol("AmazonButton$Click").readResolve();
        Lit69 = (SimpleSymbol) new SimpleSymbol("DataUri").readResolve();
        Lit68 = (SimpleSymbol) new SimpleSymbol("Action").readResolve();
        Lit67 = (SimpleSymbol) new SimpleSymbol("StartActivity").readResolve();
        Lit66 = (SimpleSymbol) new SimpleSymbol("ActivityStarter1").readResolve();
        Lit65 = new FString("com.google.appinventor.components.runtime.Button");
        Lit64 = (SimpleSymbol) new SimpleSymbol("Image").readResolve();
        Lit63 = IntNum.make(97);
        Lit62 = IntNum.make(40);
        Lit61 = (SimpleSymbol) new SimpleSymbol("AmazonButton").readResolve();
        Lit60 = new FString("com.google.appinventor.components.runtime.Button");
        Lit59 = new FString("com.google.appinventor.components.runtime.HorizontalArrangement");
        int[] iArr = new int[2];
        iArr[0] = Component.COLOR_YELLOW;
        Lit58 = IntNum.make(iArr);
        Lit57 = (SimpleSymbol) new SimpleSymbol("HorizontalArrangement2").readResolve();
        Lit56 = new FString("com.google.appinventor.components.runtime.HorizontalArrangement");
        Lit55 = (SimpleSymbol) new SimpleSymbol("KeyButton$Click").readResolve();
        SimpleSymbol simpleSymbol = (SimpleSymbol) new SimpleSymbol(PropertyTypeConstants.PROPERTY_TYPE_TEXT).readResolve();
        Lit4 = simpleSymbol;
        Lit54 = PairWithPosition.make(simpleSymbol, LList.Empty, "/tmp/1480960185199_0.5906416962059402-0/youngandroidproject/../src/appinventor/ai_aributowsky/TuffyApp/Screen1.yail", 454742);
        Lit53 = new FString("com.google.appinventor.components.runtime.Button");
        Lit52 = (SimpleSymbol) new SimpleSymbol("KeyButton").readResolve();
        Lit51 = new FString("com.google.appinventor.components.runtime.Button");
        Lit50 = (SimpleSymbol) new SimpleSymbol("RulesButton$Click").readResolve();
        Lit49 = PairWithPosition.make(Lit4, LList.Empty, "/tmp/1480960185199_0.5906416962059402-0/youngandroidproject/../src/appinventor/ai_aributowsky/TuffyApp/Screen1.yail", 393304);
        Lit48 = new FString("com.google.appinventor.components.runtime.Button");
        Lit47 = (SimpleSymbol) new SimpleSymbol("RulesButton").readResolve();
        Lit46 = new FString("com.google.appinventor.components.runtime.Button");
        Lit45 = (SimpleSymbol) new SimpleSymbol("AboutButton$Click").readResolve();
        Lit44 = PairWithPosition.make(Lit4, LList.Empty, "/tmp/1480960185199_0.5906416962059402-0/youngandroidproject/../src/appinventor/ai_aributowsky/TuffyApp/Screen1.yail", 331856);
        Lit43 = new FString("com.google.appinventor.components.runtime.Button");
        iArr = new int[2];
        iArr[0] = ListPicker.DEFAULT_ITEM_BACKGROUND_COLOR;
        Lit42 = IntNum.make(iArr);
        Lit41 = (SimpleSymbol) new SimpleSymbol("TextColor").readResolve();
        Lit40 = (SimpleSymbol) new SimpleSymbol("AboutButton").readResolve();
        Lit39 = new FString("com.google.appinventor.components.runtime.Button");
        Lit38 = (SimpleSymbol) new SimpleSymbol("Click").readResolve();
        Lit37 = (SimpleSymbol) new SimpleSymbol("StartButton$Click").readResolve();
        Lit36 = PairWithPosition.make(Lit4, LList.Empty, "/tmp/1480960185199_0.5906416962059402-0/youngandroidproject/../src/appinventor/ai_aributowsky/TuffyApp/Screen1.yail", 262225);
        Lit35 = new FString("com.google.appinventor.components.runtime.Button");
        Lit34 = (SimpleSymbol) new SimpleSymbol("Text").readResolve();
        Lit33 = IntNum.make(16);
        Lit32 = (SimpleSymbol) new SimpleSymbol("FontSize").readResolve();
        Lit31 = (SimpleSymbol) new SimpleSymbol("FontBold").readResolve();
        Lit30 = (SimpleSymbol) new SimpleSymbol("StartButton").readResolve();
        Lit29 = new FString("com.google.appinventor.components.runtime.Button");
        Lit28 = new FString("com.google.appinventor.components.runtime.VerticalArrangement");
        iArr = new int[2];
        iArr[0] = Component.COLOR_YELLOW;
        Lit27 = IntNum.make(iArr);
        Lit26 = (SimpleSymbol) new SimpleSymbol("VerticalArrangement1").readResolve();
        Lit25 = new FString("com.google.appinventor.components.runtime.VerticalArrangement");
        Lit24 = new FString("com.google.appinventor.components.runtime.Image");
        Lit23 = (SimpleSymbol) new SimpleSymbol(PropertyTypeConstants.PROPERTY_TYPE_BOOLEAN).readResolve();
        Lit22 = (SimpleSymbol) new SimpleSymbol("ScalePictureToFit").readResolve();
        Lit21 = (SimpleSymbol) new SimpleSymbol("Picture").readResolve();
        Lit20 = (SimpleSymbol) new SimpleSymbol("GameTitle").readResolve();
        Lit19 = new FString("com.google.appinventor.components.runtime.Image");
        Lit18 = new FString("com.google.appinventor.components.runtime.HorizontalArrangement");
        Lit17 = IntNum.make(-2);
        Lit16 = (SimpleSymbol) new SimpleSymbol("Width").readResolve();
        Lit15 = IntNum.make(180);
        Lit14 = (SimpleSymbol) new SimpleSymbol("Height").readResolve();
        iArr = new int[2];
        iArr[0] = Component.COLOR_BLUE;
        Lit13 = IntNum.make(iArr);
        Lit12 = IntNum.make(3);
        Lit11 = (SimpleSymbol) new SimpleSymbol("AlignHorizontal").readResolve();
        Lit10 = (SimpleSymbol) new SimpleSymbol("HorizontalArrangement1").readResolve();
        Lit9 = new FString("com.google.appinventor.components.runtime.HorizontalArrangement");
        Lit8 = (SimpleSymbol) new SimpleSymbol("Title").readResolve();
        Lit7 = (SimpleSymbol) new SimpleSymbol("number").readResolve();
        iArr = new int[2];
        iArr[0] = Component.COLOR_BLUE;
        Lit6 = IntNum.make(iArr);
        Lit5 = (SimpleSymbol) new SimpleSymbol("BackgroundColor").readResolve();
        Lit3 = (SimpleSymbol) new SimpleSymbol("AppName").readResolve();
        Lit2 = (SimpleSymbol) new SimpleSymbol("*the-null-value*").readResolve();
        Lit1 = (SimpleSymbol) new SimpleSymbol("getMessage").readResolve();
        Lit0 = (SimpleSymbol) new SimpleSymbol("Screen1").readResolve();
    }

    public Screen1() {
        ModuleInfo.register(this);
        ModuleBody appinventor_ai_aributowsky_TuffyApp_Screen1_frame = new frame();
        appinventor_ai_aributowsky_TuffyApp_Screen1_frame.$main = this;
        this.android$Mnlog$Mnform = new ModuleMethod(appinventor_ai_aributowsky_TuffyApp_Screen1_frame, 1, Lit97, 4097);
        this.add$Mnto$Mnform$Mnenvironment = new ModuleMethod(appinventor_ai_aributowsky_TuffyApp_Screen1_frame, 2, Lit98, 8194);
        this.lookup$Mnin$Mnform$Mnenvironment = new ModuleMethod(appinventor_ai_aributowsky_TuffyApp_Screen1_frame, 3, Lit99, 8193);
        this.is$Mnbound$Mnin$Mnform$Mnenvironment = new ModuleMethod(appinventor_ai_aributowsky_TuffyApp_Screen1_frame, 5, Lit100, 4097);
        this.add$Mnto$Mnglobal$Mnvar$Mnenvironment = new ModuleMethod(appinventor_ai_aributowsky_TuffyApp_Screen1_frame, 6, Lit101, 8194);
        this.add$Mnto$Mnevents = new ModuleMethod(appinventor_ai_aributowsky_TuffyApp_Screen1_frame, 7, Lit102, 8194);
        this.add$Mnto$Mncomponents = new ModuleMethod(appinventor_ai_aributowsky_TuffyApp_Screen1_frame, 8, Lit103, 16388);
        this.add$Mnto$Mnglobal$Mnvars = new ModuleMethod(appinventor_ai_aributowsky_TuffyApp_Screen1_frame, 9, Lit104, 8194);
        this.add$Mnto$Mnform$Mndo$Mnafter$Mncreation = new ModuleMethod(appinventor_ai_aributowsky_TuffyApp_Screen1_frame, 10, Lit105, 4097);
        this.send$Mnerror = new ModuleMethod(appinventor_ai_aributowsky_TuffyApp_Screen1_frame, 11, Lit106, 4097);
        this.process$Mnexception = new ModuleMethod(appinventor_ai_aributowsky_TuffyApp_Screen1_frame, 12, "process-exception", 4097);
        this.dispatchEvent = new ModuleMethod(appinventor_ai_aributowsky_TuffyApp_Screen1_frame, 13, Lit107, 16388);
        this.lookup$Mnhandler = new ModuleMethod(appinventor_ai_aributowsky_TuffyApp_Screen1_frame, 14, Lit108, 8194);
        PropertySet moduleMethod = new ModuleMethod(appinventor_ai_aributowsky_TuffyApp_Screen1_frame, 15, null, 0);
        moduleMethod.setProperty("source-location", "/tmp/runtime1791431272433290597.scm:547");
        lambda$Fn1 = moduleMethod;
        this.$define = new ModuleMethod(appinventor_ai_aributowsky_TuffyApp_Screen1_frame, 16, "$define", 0);
        lambda$Fn2 = new ModuleMethod(appinventor_ai_aributowsky_TuffyApp_Screen1_frame, 17, null, 0);
        lambda$Fn3 = new ModuleMethod(appinventor_ai_aributowsky_TuffyApp_Screen1_frame, 18, null, 0);
        lambda$Fn4 = new ModuleMethod(appinventor_ai_aributowsky_TuffyApp_Screen1_frame, 19, null, 0);
        lambda$Fn5 = new ModuleMethod(appinventor_ai_aributowsky_TuffyApp_Screen1_frame, 20, null, 0);
        lambda$Fn6 = new ModuleMethod(appinventor_ai_aributowsky_TuffyApp_Screen1_frame, 21, null, 0);
        lambda$Fn7 = new ModuleMethod(appinventor_ai_aributowsky_TuffyApp_Screen1_frame, 22, null, 0);
        lambda$Fn8 = new ModuleMethod(appinventor_ai_aributowsky_TuffyApp_Screen1_frame, 23, null, 0);
        lambda$Fn9 = new ModuleMethod(appinventor_ai_aributowsky_TuffyApp_Screen1_frame, 24, null, 0);
        lambda$Fn10 = new ModuleMethod(appinventor_ai_aributowsky_TuffyApp_Screen1_frame, 25, null, 0);
        this.StartButton$Click = new ModuleMethod(appinventor_ai_aributowsky_TuffyApp_Screen1_frame, 26, Lit37, 0);
        lambda$Fn11 = new ModuleMethod(appinventor_ai_aributowsky_TuffyApp_Screen1_frame, 27, null, 0);
        lambda$Fn12 = new ModuleMethod(appinventor_ai_aributowsky_TuffyApp_Screen1_frame, 28, null, 0);
        this.AboutButton$Click = new ModuleMethod(appinventor_ai_aributowsky_TuffyApp_Screen1_frame, 29, Lit45, 0);
        lambda$Fn13 = new ModuleMethod(appinventor_ai_aributowsky_TuffyApp_Screen1_frame, 30, null, 0);
        lambda$Fn14 = new ModuleMethod(appinventor_ai_aributowsky_TuffyApp_Screen1_frame, 31, null, 0);
        this.RulesButton$Click = new ModuleMethod(appinventor_ai_aributowsky_TuffyApp_Screen1_frame, 32, Lit50, 0);
        lambda$Fn15 = new ModuleMethod(appinventor_ai_aributowsky_TuffyApp_Screen1_frame, 33, null, 0);
        lambda$Fn16 = new ModuleMethod(appinventor_ai_aributowsky_TuffyApp_Screen1_frame, 34, null, 0);
        this.KeyButton$Click = new ModuleMethod(appinventor_ai_aributowsky_TuffyApp_Screen1_frame, 35, Lit55, 0);
        lambda$Fn17 = new ModuleMethod(appinventor_ai_aributowsky_TuffyApp_Screen1_frame, 36, null, 0);
        lambda$Fn18 = new ModuleMethod(appinventor_ai_aributowsky_TuffyApp_Screen1_frame, 37, null, 0);
        lambda$Fn19 = new ModuleMethod(appinventor_ai_aributowsky_TuffyApp_Screen1_frame, 38, null, 0);
        lambda$Fn20 = new ModuleMethod(appinventor_ai_aributowsky_TuffyApp_Screen1_frame, 39, null, 0);
        this.AmazonButton$Click = new ModuleMethod(appinventor_ai_aributowsky_TuffyApp_Screen1_frame, 40, Lit70, 0);
        lambda$Fn21 = new ModuleMethod(appinventor_ai_aributowsky_TuffyApp_Screen1_frame, 41, null, 0);
        lambda$Fn22 = new ModuleMethod(appinventor_ai_aributowsky_TuffyApp_Screen1_frame, 42, null, 0);
        this.GooglePlayButton$Click = new ModuleMethod(appinventor_ai_aributowsky_TuffyApp_Screen1_frame, 43, Lit75, 0);
        lambda$Fn23 = new ModuleMethod(appinventor_ai_aributowsky_TuffyApp_Screen1_frame, 44, null, 0);
        lambda$Fn24 = new ModuleMethod(appinventor_ai_aributowsky_TuffyApp_Screen1_frame, 45, null, 0);
        this.iTunesButton$Click = new ModuleMethod(appinventor_ai_aributowsky_TuffyApp_Screen1_frame, 46, Lit81, 0);
        lambda$Fn25 = new ModuleMethod(appinventor_ai_aributowsky_TuffyApp_Screen1_frame, 47, null, 0);
        lambda$Fn26 = new ModuleMethod(appinventor_ai_aributowsky_TuffyApp_Screen1_frame, 48, null, 0);
        lambda$Fn27 = new ModuleMethod(appinventor_ai_aributowsky_TuffyApp_Screen1_frame, 49, null, 0);
        lambda$Fn28 = new ModuleMethod(appinventor_ai_aributowsky_TuffyApp_Screen1_frame, 50, null, 0);
        lambda$Fn29 = new ModuleMethod(appinventor_ai_aributowsky_TuffyApp_Screen1_frame, 51, null, 0);
        lambda$Fn30 = new ModuleMethod(appinventor_ai_aributowsky_TuffyApp_Screen1_frame, 52, null, 0);
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
            Screen1 = null;
            this.form$Mnname$Mnsymbol = Lit0;
            this.events$Mnto$Mnregister = LList.Empty;
            this.components$Mnto$Mncreate = LList.Empty;
            this.global$Mnvars$Mnto$Mncreate = LList.Empty;
            this.form$Mndo$Mnafter$Mncreation = LList.Empty;
            find = require.find("com.google.youngandroid.runtime");
            try {
                ((Runnable) find).run();
                if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
                    runtime.setAndCoerceProperty$Ex(Lit0, Lit3, "TuffyApp", Lit4);
                    runtime.setAndCoerceProperty$Ex(Lit0, Lit5, Lit6, Lit7);
                    Values.writeValues(runtime.setAndCoerceProperty$Ex(Lit0, Lit8, "Home", Lit4), $result);
                } else {
                    addToFormDoAfterCreation(new Promise(lambda$Fn2));
                }
                this.HorizontalArrangement1 = null;
                if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
                    Values.writeValues(runtime.addComponentWithinRepl(Lit0, Lit9, Lit10, lambda$Fn3), $result);
                } else {
                    addToComponents(Lit0, Lit18, Lit10, lambda$Fn4);
                }
                this.GameTitle = null;
                if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
                    Values.writeValues(runtime.addComponentWithinRepl(Lit10, Lit19, Lit20, lambda$Fn5), $result);
                } else {
                    addToComponents(Lit10, Lit24, Lit20, lambda$Fn6);
                }
                this.VerticalArrangement1 = null;
                if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
                    Values.writeValues(runtime.addComponentWithinRepl(Lit0, Lit25, Lit26, lambda$Fn7), $result);
                } else {
                    addToComponents(Lit0, Lit28, Lit26, lambda$Fn8);
                }
                this.StartButton = null;
                if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
                    Values.writeValues(runtime.addComponentWithinRepl(Lit26, Lit29, Lit30, lambda$Fn9), $result);
                } else {
                    addToComponents(Lit26, Lit35, Lit30, lambda$Fn10);
                }
                if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
                    runtime.addToCurrentFormEnvironment(Lit37, this.StartButton$Click);
                } else {
                    addToFormEnvironment(Lit37, this.StartButton$Click);
                }
                if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
                    EventDispatcher.registerEventForDelegation((HandlesEventDispatching) runtime.$Stthis$Mnform$St, "StartButton", "Click");
                } else {
                    addToEvents(Lit30, Lit38);
                }
                this.AboutButton = null;
                if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
                    Values.writeValues(runtime.addComponentWithinRepl(Lit26, Lit39, Lit40, lambda$Fn11), $result);
                } else {
                    addToComponents(Lit26, Lit43, Lit40, lambda$Fn12);
                }
                if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
                    runtime.addToCurrentFormEnvironment(Lit45, this.AboutButton$Click);
                } else {
                    addToFormEnvironment(Lit45, this.AboutButton$Click);
                }
                if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
                    EventDispatcher.registerEventForDelegation((HandlesEventDispatching) runtime.$Stthis$Mnform$St, "AboutButton", "Click");
                } else {
                    addToEvents(Lit40, Lit38);
                }
                this.RulesButton = null;
                if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
                    Values.writeValues(runtime.addComponentWithinRepl(Lit26, Lit46, Lit47, lambda$Fn13), $result);
                } else {
                    addToComponents(Lit26, Lit48, Lit47, lambda$Fn14);
                }
                if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
                    runtime.addToCurrentFormEnvironment(Lit50, this.RulesButton$Click);
                } else {
                    addToFormEnvironment(Lit50, this.RulesButton$Click);
                }
                if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
                    EventDispatcher.registerEventForDelegation((HandlesEventDispatching) runtime.$Stthis$Mnform$St, "RulesButton", "Click");
                } else {
                    addToEvents(Lit47, Lit38);
                }
                this.KeyButton = null;
                if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
                    Values.writeValues(runtime.addComponentWithinRepl(Lit26, Lit51, Lit52, lambda$Fn15), $result);
                } else {
                    addToComponents(Lit26, Lit53, Lit52, lambda$Fn16);
                }
                if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
                    runtime.addToCurrentFormEnvironment(Lit55, this.KeyButton$Click);
                } else {
                    addToFormEnvironment(Lit55, this.KeyButton$Click);
                }
                if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
                    EventDispatcher.registerEventForDelegation((HandlesEventDispatching) runtime.$Stthis$Mnform$St, "KeyButton", "Click");
                } else {
                    addToEvents(Lit52, Lit38);
                }
                this.HorizontalArrangement2 = null;
                if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
                    Values.writeValues(runtime.addComponentWithinRepl(Lit0, Lit56, Lit57, lambda$Fn17), $result);
                } else {
                    addToComponents(Lit0, Lit59, Lit57, lambda$Fn18);
                }
                this.AmazonButton = null;
                if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
                    Values.writeValues(runtime.addComponentWithinRepl(Lit57, Lit60, Lit61, lambda$Fn19), $result);
                } else {
                    addToComponents(Lit57, Lit65, Lit61, lambda$Fn20);
                }
                if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
                    runtime.addToCurrentFormEnvironment(Lit70, this.AmazonButton$Click);
                } else {
                    addToFormEnvironment(Lit70, this.AmazonButton$Click);
                }
                if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
                    EventDispatcher.registerEventForDelegation((HandlesEventDispatching) runtime.$Stthis$Mnform$St, "AmazonButton", "Click");
                } else {
                    addToEvents(Lit61, Lit38);
                }
                this.GooglePlayButton = null;
                if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
                    Values.writeValues(runtime.addComponentWithinRepl(Lit57, Lit71, Lit72, lambda$Fn21), $result);
                } else {
                    addToComponents(Lit57, Lit73, Lit72, lambda$Fn22);
                }
                if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
                    runtime.addToCurrentFormEnvironment(Lit75, this.GooglePlayButton$Click);
                } else {
                    addToFormEnvironment(Lit75, this.GooglePlayButton$Click);
                }
                if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
                    EventDispatcher.registerEventForDelegation((HandlesEventDispatching) runtime.$Stthis$Mnform$St, "GooglePlayButton", "Click");
                } else {
                    addToEvents(Lit72, Lit38);
                }
                this.iTunesButton = null;
                if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
                    Values.writeValues(runtime.addComponentWithinRepl(Lit57, Lit76, Lit77, lambda$Fn23), $result);
                } else {
                    addToComponents(Lit57, Lit79, Lit77, lambda$Fn24);
                }
                if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
                    runtime.addToCurrentFormEnvironment(Lit81, this.iTunesButton$Click);
                } else {
                    addToFormEnvironment(Lit81, this.iTunesButton$Click);
                }
                if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
                    EventDispatcher.registerEventForDelegation((HandlesEventDispatching) runtime.$Stthis$Mnform$St, "iTunesButton", "Click");
                } else {
                    addToEvents(Lit77, Lit38);
                }
                this.ActivityStarter1 = null;
                if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
                    Values.writeValues(runtime.addComponentWithinRepl(Lit0, Lit82, Lit66, lambda$Fn25), $result);
                } else {
                    addToComponents(Lit0, Lit83, Lit66, lambda$Fn26);
                }
                this.ActivityStarter2 = null;
                if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
                    Values.writeValues(runtime.addComponentWithinRepl(Lit0, Lit84, Lit74, lambda$Fn27), $result);
                } else {
                    addToComponents(Lit0, Lit85, Lit74, lambda$Fn28);
                }
                this.ActivityStarter3 = null;
                if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
                    Values.writeValues(runtime.addComponentWithinRepl(Lit0, Lit86, Lit80, lambda$Fn29), $result);
                } else {
                    addToComponents(Lit0, Lit87, Lit80, lambda$Fn30);
                }
                this.Web1 = null;
                if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
                    Values.writeValues(runtime.addComponentWithinRepl(Lit0, Lit88, Lit89, Boolean.FALSE), $result);
                } else {
                    addToComponents(Lit0, Lit90, Lit89, Boolean.FALSE);
                }
                this.Web2 = null;
                if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
                    Values.writeValues(runtime.addComponentWithinRepl(Lit0, Lit91, Lit92, Boolean.FALSE), $result);
                } else {
                    addToComponents(Lit0, Lit93, Lit92, Boolean.FALSE);
                }
                this.Web3 = null;
                if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
                    Values.writeValues(runtime.addComponentWithinRepl(Lit0, Lit94, Lit95, Boolean.FALSE), $result);
                } else {
                    addToComponents(Lit0, Lit96, Lit95, Boolean.FALSE);
                }
                runtime.initRuntime();
            } catch (ClassCastException e) {
                throw new WrongType(e, "java.lang.Runnable.run()", 1, find);
            }
        } catch (ClassCastException e2) {
            throw new WrongType(e2, "java.lang.Runnable.run()", 1, find);
        }
    }

    static Object lambda3() {
        runtime.setAndCoerceProperty$Ex(Lit0, Lit3, "TuffyApp", Lit4);
        runtime.setAndCoerceProperty$Ex(Lit0, Lit5, Lit6, Lit7);
        return runtime.setAndCoerceProperty$Ex(Lit0, Lit8, "Home", Lit4);
    }

    static Object lambda4() {
        runtime.setAndCoerceProperty$Ex(Lit10, Lit11, Lit12, Lit7);
        runtime.setAndCoerceProperty$Ex(Lit10, Lit5, Lit13, Lit7);
        runtime.setAndCoerceProperty$Ex(Lit10, Lit14, Lit15, Lit7);
        return runtime.setAndCoerceProperty$Ex(Lit10, Lit16, Lit17, Lit7);
    }

    static Object lambda5() {
        runtime.setAndCoerceProperty$Ex(Lit10, Lit11, Lit12, Lit7);
        runtime.setAndCoerceProperty$Ex(Lit10, Lit5, Lit13, Lit7);
        runtime.setAndCoerceProperty$Ex(Lit10, Lit14, Lit15, Lit7);
        return runtime.setAndCoerceProperty$Ex(Lit10, Lit16, Lit17, Lit7);
    }

    static Object lambda6() {
        runtime.setAndCoerceProperty$Ex(Lit20, Lit14, Lit15, Lit7);
        runtime.setAndCoerceProperty$Ex(Lit20, Lit16, Lit17, Lit7);
        runtime.setAndCoerceProperty$Ex(Lit20, Lit21, "title-bg.jpg", Lit4);
        return runtime.setAndCoerceProperty$Ex(Lit20, Lit22, Boolean.TRUE, Lit23);
    }

    static Object lambda7() {
        runtime.setAndCoerceProperty$Ex(Lit20, Lit14, Lit15, Lit7);
        runtime.setAndCoerceProperty$Ex(Lit20, Lit16, Lit17, Lit7);
        runtime.setAndCoerceProperty$Ex(Lit20, Lit21, "title-bg.jpg", Lit4);
        return runtime.setAndCoerceProperty$Ex(Lit20, Lit22, Boolean.TRUE, Lit23);
    }

    static Object lambda8() {
        runtime.setAndCoerceProperty$Ex(Lit26, Lit5, Lit27, Lit7);
        return runtime.setAndCoerceProperty$Ex(Lit26, Lit16, Lit17, Lit7);
    }

    static Object lambda9() {
        runtime.setAndCoerceProperty$Ex(Lit26, Lit5, Lit27, Lit7);
        return runtime.setAndCoerceProperty$Ex(Lit26, Lit16, Lit17, Lit7);
    }

    static Object lambda10() {
        runtime.setAndCoerceProperty$Ex(Lit30, Lit31, Boolean.TRUE, Lit23);
        runtime.setAndCoerceProperty$Ex(Lit30, Lit32, Lit33, Lit7);
        runtime.setAndCoerceProperty$Ex(Lit30, Lit16, Lit17, Lit7);
        return runtime.setAndCoerceProperty$Ex(Lit30, Lit34, "Start", Lit4);
    }

    static Object lambda11() {
        runtime.setAndCoerceProperty$Ex(Lit30, Lit31, Boolean.TRUE, Lit23);
        runtime.setAndCoerceProperty$Ex(Lit30, Lit32, Lit33, Lit7);
        runtime.setAndCoerceProperty$Ex(Lit30, Lit16, Lit17, Lit7);
        return runtime.setAndCoerceProperty$Ex(Lit30, Lit34, "Start", Lit4);
    }

    public Object StartButton$Click() {
        runtime.setThisForm();
        return runtime.callYailPrimitive(runtime.open$Mnanother$Mnscreen, LList.list1("GameScreen"), Lit36, "open another screen");
    }

    static Object lambda12() {
        runtime.setAndCoerceProperty$Ex(Lit40, Lit31, Boolean.TRUE, Lit23);
        runtime.setAndCoerceProperty$Ex(Lit40, Lit32, Lit33, Lit7);
        runtime.setAndCoerceProperty$Ex(Lit40, Lit16, Lit17, Lit7);
        runtime.setAndCoerceProperty$Ex(Lit40, Lit34, "About", Lit4);
        return runtime.setAndCoerceProperty$Ex(Lit40, Lit41, Lit42, Lit7);
    }

    static Object lambda13() {
        runtime.setAndCoerceProperty$Ex(Lit40, Lit31, Boolean.TRUE, Lit23);
        runtime.setAndCoerceProperty$Ex(Lit40, Lit32, Lit33, Lit7);
        runtime.setAndCoerceProperty$Ex(Lit40, Lit16, Lit17, Lit7);
        runtime.setAndCoerceProperty$Ex(Lit40, Lit34, "About", Lit4);
        return runtime.setAndCoerceProperty$Ex(Lit40, Lit41, Lit42, Lit7);
    }

    public Object AboutButton$Click() {
        runtime.setThisForm();
        return runtime.callYailPrimitive(runtime.open$Mnanother$Mnscreen, LList.list1("AboutPage"), Lit44, "open another screen");
    }

    static Object lambda14() {
        runtime.setAndCoerceProperty$Ex(Lit47, Lit31, Boolean.TRUE, Lit23);
        runtime.setAndCoerceProperty$Ex(Lit47, Lit32, Lit33, Lit7);
        runtime.setAndCoerceProperty$Ex(Lit47, Lit16, Lit17, Lit7);
        return runtime.setAndCoerceProperty$Ex(Lit47, Lit34, "Rules", Lit4);
    }

    static Object lambda15() {
        runtime.setAndCoerceProperty$Ex(Lit47, Lit31, Boolean.TRUE, Lit23);
        runtime.setAndCoerceProperty$Ex(Lit47, Lit32, Lit33, Lit7);
        runtime.setAndCoerceProperty$Ex(Lit47, Lit16, Lit17, Lit7);
        return runtime.setAndCoerceProperty$Ex(Lit47, Lit34, "Rules", Lit4);
    }

    public Object RulesButton$Click() {
        runtime.setThisForm();
        return runtime.callYailPrimitive(runtime.open$Mnanother$Mnscreen, LList.list1("ColoringGameRules"), Lit49, "open another screen");
    }

    static Object lambda16() {
        runtime.setAndCoerceProperty$Ex(Lit52, Lit31, Boolean.TRUE, Lit23);
        runtime.setAndCoerceProperty$Ex(Lit52, Lit32, Lit33, Lit7);
        runtime.setAndCoerceProperty$Ex(Lit52, Lit16, Lit17, Lit7);
        return runtime.setAndCoerceProperty$Ex(Lit52, Lit34, "Key", Lit4);
    }

    static Object lambda17() {
        runtime.setAndCoerceProperty$Ex(Lit52, Lit31, Boolean.TRUE, Lit23);
        runtime.setAndCoerceProperty$Ex(Lit52, Lit32, Lit33, Lit7);
        runtime.setAndCoerceProperty$Ex(Lit52, Lit16, Lit17, Lit7);
        return runtime.setAndCoerceProperty$Ex(Lit52, Lit34, "Key", Lit4);
    }

    public Object KeyButton$Click() {
        runtime.setThisForm();
        return runtime.callYailPrimitive(runtime.open$Mnanother$Mnscreen, LList.list1("ColoringGameKey"), Lit54, "open another screen");
    }

    static Object lambda18() {
        return runtime.setAndCoerceProperty$Ex(Lit57, Lit5, Lit58, Lit7);
    }

    static Object lambda19() {
        return runtime.setAndCoerceProperty$Ex(Lit57, Lit5, Lit58, Lit7);
    }

    static Object lambda20() {
        runtime.setAndCoerceProperty$Ex(Lit61, Lit14, Lit62, Lit7);
        runtime.setAndCoerceProperty$Ex(Lit61, Lit16, Lit63, Lit7);
        return runtime.setAndCoerceProperty$Ex(Lit61, Lit64, "badge_amazon.png", Lit4);
    }

    static Object lambda21() {
        runtime.setAndCoerceProperty$Ex(Lit61, Lit14, Lit62, Lit7);
        runtime.setAndCoerceProperty$Ex(Lit61, Lit16, Lit63, Lit7);
        return runtime.setAndCoerceProperty$Ex(Lit61, Lit64, "badge_amazon.png", Lit4);
    }

    public Object AmazonButton$Click() {
        runtime.setThisForm();
        runtime.callComponentMethod(Lit66, Lit67, LList.Empty, LList.Empty);
        runtime.setAndCoerceProperty$Ex(Lit66, Lit68, "android.intent.action.VIEW", Lit4);
        return runtime.setAndCoerceProperty$Ex(Lit66, Lit69, "https://www.amazon.com/mobile-apps/b?ie=UTF8&node=2350149011&tag=askcomdelta-20", Lit4);
    }

    static Object lambda22() {
        runtime.setAndCoerceProperty$Ex(Lit72, Lit14, Lit62, Lit7);
        runtime.setAndCoerceProperty$Ex(Lit72, Lit16, Lit63, Lit7);
        return runtime.setAndCoerceProperty$Ex(Lit72, Lit64, "badge_google-play.png", Lit4);
    }

    static Object lambda23() {
        runtime.setAndCoerceProperty$Ex(Lit72, Lit14, Lit62, Lit7);
        runtime.setAndCoerceProperty$Ex(Lit72, Lit16, Lit63, Lit7);
        return runtime.setAndCoerceProperty$Ex(Lit72, Lit64, "badge_google-play.png", Lit4);
    }

    public Object GooglePlayButton$Click() {
        runtime.setThisForm();
        runtime.callComponentMethod(Lit74, Lit67, LList.Empty, LList.Empty);
        runtime.setAndCoerceProperty$Ex(Lit74, Lit68, "android.intent.action.VIEW", Lit4);
        return runtime.setAndCoerceProperty$Ex(Lit74, Lit69, "https://play.google.com/store/apps?hl=en", Lit4);
    }

    static Object lambda24() {
        runtime.setAndCoerceProperty$Ex(Lit77, Lit14, Lit62, Lit7);
        runtime.setAndCoerceProperty$Ex(Lit77, Lit16, Lit78, Lit7);
        return runtime.setAndCoerceProperty$Ex(Lit77, Lit64, "badge_itunes.png", Lit4);
    }

    static Object lambda25() {
        runtime.setAndCoerceProperty$Ex(Lit77, Lit14, Lit62, Lit7);
        runtime.setAndCoerceProperty$Ex(Lit77, Lit16, Lit78, Lit7);
        return runtime.setAndCoerceProperty$Ex(Lit77, Lit64, "badge_itunes.png", Lit4);
    }

    public Object iTunesButton$Click() {
        runtime.setThisForm();
        runtime.callComponentMethod(Lit80, Lit67, LList.Empty, LList.Empty);
        runtime.setAndCoerceProperty$Ex(Lit80, Lit68, "android.intent.action.VIEW", Lit4);
        return runtime.setAndCoerceProperty$Ex(Lit80, Lit69, "https://itunes.apple.com/us/genre/ios/id36?mt=8", Lit4);
    }

    static Object lambda26() {
        runtime.setAndCoerceProperty$Ex(Lit66, Lit68, "android.intent.action.VIEW", Lit4);
        return runtime.setAndCoerceProperty$Ex(Lit66, Lit69, "https://www.amazon.com/mobile-apps/b?ie=UTF8&node=2350149011&tag=askcomdelta-20", Lit4);
    }

    static Object lambda27() {
        runtime.setAndCoerceProperty$Ex(Lit66, Lit68, "android.intent.action.VIEW", Lit4);
        return runtime.setAndCoerceProperty$Ex(Lit66, Lit69, "https://www.amazon.com/mobile-apps/b?ie=UTF8&node=2350149011&tag=askcomdelta-20", Lit4);
    }

    static Object lambda28() {
        runtime.setAndCoerceProperty$Ex(Lit74, Lit68, "android.intent.action.VIEW", Lit4);
        return runtime.setAndCoerceProperty$Ex(Lit74, Lit69, "https://play.google.com/store/apps?hl=en", Lit4);
    }

    static Object lambda29() {
        runtime.setAndCoerceProperty$Ex(Lit74, Lit68, "android.intent.action.VIEW", Lit4);
        return runtime.setAndCoerceProperty$Ex(Lit74, Lit69, "https://play.google.com/store/apps?hl=en", Lit4);
    }

    static Object lambda30() {
        runtime.setAndCoerceProperty$Ex(Lit80, Lit68, "android.intent.action.VIEW", Lit4);
        return runtime.setAndCoerceProperty$Ex(Lit80, Lit69, "https://itunes.apple.com/us/genre/ios/id36?mt=8", Lit4);
    }

    static Object lambda31() {
        runtime.setAndCoerceProperty$Ex(Lit80, Lit68, "android.intent.action.VIEW", Lit4);
        return runtime.setAndCoerceProperty$Ex(Lit80, Lit69, "https://itunes.apple.com/us/genre/ios/id36?mt=8", Lit4);
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
        Screen1 = this;
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
        Screen1 closureEnv = this;
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
