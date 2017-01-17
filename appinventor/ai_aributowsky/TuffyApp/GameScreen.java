package appinventor.ai_aributowsky.TuffyApp;

import com.google.appinventor.components.common.PropertyTypeConstants;
import com.google.appinventor.components.runtime.Button;
import com.google.appinventor.components.runtime.Component;
import com.google.appinventor.components.runtime.EventDispatcher;
import com.google.appinventor.components.runtime.Form;
import com.google.appinventor.components.runtime.HandlesEventDispatching;
import com.google.appinventor.components.runtime.HorizontalArrangement;
import com.google.appinventor.components.runtime.Label;
import com.google.appinventor.components.runtime.VerticalArrangement;
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

/* compiled from: GameScreen.yail */
public class GameScreen extends Form implements Runnable {
    public static GameScreen GameScreen;
    static final SimpleSymbol Lit0;
    static final SimpleSymbol Lit1;
    static final SimpleSymbol Lit10;
    static final FString Lit11;
    static final FString Lit12;
    static final SimpleSymbol Lit13;
    static final SimpleSymbol Lit14;
    static final IntNum Lit15;
    static final SimpleSymbol Lit16;
    static final IntNum Lit17;
    static final SimpleSymbol Lit18;
    static final FString Lit19;
    static final SimpleSymbol Lit2;
    static final PairWithPosition Lit20;
    static final SimpleSymbol Lit21;
    static final SimpleSymbol Lit22;
    static final FString Lit23;
    static final SimpleSymbol Lit24;
    static final IntNum Lit25;
    static final IntNum Lit26;
    static final FString Lit27;
    static final FString Lit28;
    static final SimpleSymbol Lit29;
    static final SimpleSymbol Lit3;
    static final SimpleSymbol Lit30;
    static final SimpleSymbol Lit31;
    static final SimpleSymbol Lit32;
    static final IntNum Lit33;
    static final SimpleSymbol Lit34;
    static final SimpleSymbol Lit35;
    static final IntNum Lit36;
    static final SimpleSymbol Lit37;
    static final IntNum Lit38;
    static final FString Lit39;
    static final SimpleSymbol Lit4;
    static final FString Lit40;
    static final SimpleSymbol Lit41;
    static final IntNum Lit42;
    static final FString Lit43;
    static final FString Lit44;
    static final SimpleSymbol Lit45;
    static final IntNum Lit46;
    static final FString Lit47;
    static final PairWithPosition Lit48;
    static final SimpleSymbol Lit49;
    static final SimpleSymbol Lit5;
    static final FString Lit50;
    static final SimpleSymbol Lit51;
    static final FString Lit52;
    static final PairWithPosition Lit53;
    static final SimpleSymbol Lit54;
    static final FString Lit55;
    static final SimpleSymbol Lit56;
    static final FString Lit57;
    static final PairWithPosition Lit58;
    static final SimpleSymbol Lit59;
    static final IntNum Lit6;
    static final FString Lit60;
    static final SimpleSymbol Lit61;
    static final IntNum Lit62;
    static final FString Lit63;
    static final FString Lit64;
    static final SimpleSymbol Lit65;
    static final FString Lit66;
    static final PairWithPosition Lit67;
    static final SimpleSymbol Lit68;
    static final FString Lit69;
    static final SimpleSymbol Lit7;
    static final SimpleSymbol Lit70;
    static final FString Lit71;
    static final PairWithPosition Lit72;
    static final SimpleSymbol Lit73;
    static final FString Lit74;
    static final SimpleSymbol Lit75;
    static final FString Lit76;
    static final PairWithPosition Lit77;
    static final SimpleSymbol Lit78;
    static final SimpleSymbol Lit79;
    static final SimpleSymbol Lit8;
    static final SimpleSymbol Lit80;
    static final SimpleSymbol Lit81;
    static final SimpleSymbol Lit82;
    static final SimpleSymbol Lit83;
    static final SimpleSymbol Lit84;
    static final SimpleSymbol Lit85;
    static final SimpleSymbol Lit86;
    static final SimpleSymbol Lit87;
    static final SimpleSymbol Lit88;
    static final SimpleSymbol Lit89;
    static final FString Lit9;
    static final SimpleSymbol Lit90;
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
    static final ModuleMethod lambda$Fn3 = null;
    static final ModuleMethod lambda$Fn4 = null;
    static final ModuleMethod lambda$Fn5 = null;
    static final ModuleMethod lambda$Fn6 = null;
    static final ModuleMethod lambda$Fn7 = null;
    static final ModuleMethod lambda$Fn8 = null;
    static final ModuleMethod lambda$Fn9 = null;
    public Boolean $Stdebug$Mnform$St;
    public final ModuleMethod $define;
    public Button BackButton;
    public final ModuleMethod BackButton$Click;
    public HorizontalArrangement HorizontalArrangement1;
    public HorizontalArrangement HorizontalArrangement2;
    public HorizontalArrangement HorizontalArrangement3;
    public Button Image1;
    public final ModuleMethod Image1$Click;
    public Button Image2;
    public final ModuleMethod Image2$Click;
    public Button Image3;
    public final ModuleMethod Image3$Click;
    public Button Image4;
    public final ModuleMethod Image4$Click;
    public Button Image5;
    public final ModuleMethod Image5$Click;
    public Button Image6;
    public final ModuleMethod Image6$Click;
    public Label Label1;
    public VerticalArrangement VerticalArrangement1;
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

    /* compiled from: GameScreen.yail */
    public class frame extends ModuleBody {
        GameScreen $main;

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
                    if (!(obj instanceof GameScreen)) {
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
                    if (!(obj instanceof GameScreen)) {
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
                    return GameScreen.lambda2();
                case SetExp.PROCEDURE /*16*/:
                    this.$main.$define();
                    return Values.empty;
                case Sequence.INT_U8_VALUE /*17*/:
                    return GameScreen.lambda3();
                case Sequence.INT_S8_VALUE /*18*/:
                    return GameScreen.lambda4();
                case Sequence.INT_U16_VALUE /*19*/:
                    return GameScreen.lambda5();
                case Sequence.INT_S16_VALUE /*20*/:
                    return this.$main.BackButton$Click();
                case Sequence.INT_U32_VALUE /*21*/:
                    return GameScreen.lambda6();
                case Sequence.INT_S32_VALUE /*22*/:
                    return GameScreen.lambda7();
                case Sequence.INT_U64_VALUE /*23*/:
                    return GameScreen.lambda8();
                case Sequence.INT_S64_VALUE /*24*/:
                    return GameScreen.lambda9();
                case Sequence.FLOAT_VALUE /*25*/:
                    return GameScreen.lambda10();
                case Sequence.DOUBLE_VALUE /*26*/:
                    return GameScreen.lambda11();
                case Sequence.BOOLEAN_VALUE /*27*/:
                    return GameScreen.lambda12();
                case Sequence.TEXT_BYTE_VALUE /*28*/:
                    return GameScreen.lambda13();
                case Sequence.CHAR_VALUE /*29*/:
                    return this.$main.Image1$Click();
                case XDataType.DAY_TIME_DURATION_TYPE_CODE /*30*/:
                    return GameScreen.lambda14();
                case Sequence.CDATA_VALUE /*31*/:
                    return GameScreen.lambda15();
                case SetExp.SET_IF_UNBOUND /*32*/:
                    return this.$main.Image2$Click();
                case Sequence.ELEMENT_VALUE /*33*/:
                    return GameScreen.lambda16();
                case Sequence.DOCUMENT_VALUE /*34*/:
                    return GameScreen.lambda17();
                case Sequence.ATTRIBUTE_VALUE /*35*/:
                    return this.$main.Image3$Click();
                case Sequence.COMMENT_VALUE /*36*/:
                    return GameScreen.lambda18();
                case Sequence.PROCESSING_INSTRUCTION_VALUE /*37*/:
                    return GameScreen.lambda19();
                case XDataType.STRING_TYPE_CODE /*38*/:
                    return GameScreen.lambda20();
                case XDataType.NORMALIZED_STRING_TYPE_CODE /*39*/:
                    return GameScreen.lambda21();
                case JSONzip.substringLimit /*40*/:
                    return this.$main.Image4$Click();
                case XDataType.LANGUAGE_TYPE_CODE /*41*/:
                    return GameScreen.lambda22();
                case XDataType.NMTOKEN_TYPE_CODE /*42*/:
                    return GameScreen.lambda23();
                case XDataType.NAME_TYPE_CODE /*43*/:
                    return this.$main.Image5$Click();
                case XDataType.NCNAME_TYPE_CODE /*44*/:
                    return GameScreen.lambda24();
                case XDataType.ID_TYPE_CODE /*45*/:
                    return GameScreen.lambda25();
                case XDataType.IDREF_TYPE_CODE /*46*/:
                    return this.$main.Image6$Click();
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
                default:
                    return super.match0(moduleMethod, callContext);
            }
        }
    }

    static {
        Lit90 = (SimpleSymbol) new SimpleSymbol("lookup-handler").readResolve();
        Lit89 = (SimpleSymbol) new SimpleSymbol("dispatchEvent").readResolve();
        Lit88 = (SimpleSymbol) new SimpleSymbol("send-error").readResolve();
        Lit87 = (SimpleSymbol) new SimpleSymbol("add-to-form-do-after-creation").readResolve();
        Lit86 = (SimpleSymbol) new SimpleSymbol("add-to-global-vars").readResolve();
        Lit85 = (SimpleSymbol) new SimpleSymbol("add-to-components").readResolve();
        Lit84 = (SimpleSymbol) new SimpleSymbol("add-to-events").readResolve();
        Lit83 = (SimpleSymbol) new SimpleSymbol("add-to-global-var-environment").readResolve();
        Lit82 = (SimpleSymbol) new SimpleSymbol("is-bound-in-form-environment").readResolve();
        Lit81 = (SimpleSymbol) new SimpleSymbol("lookup-in-form-environment").readResolve();
        Lit80 = (SimpleSymbol) new SimpleSymbol("add-to-form-environment").readResolve();
        Lit79 = (SimpleSymbol) new SimpleSymbol("android-log-form").readResolve();
        Lit78 = (SimpleSymbol) new SimpleSymbol("Image6$Click").readResolve();
        SimpleSymbol simpleSymbol = (SimpleSymbol) new SimpleSymbol(PropertyTypeConstants.PROPERTY_TYPE_TEXT).readResolve();
        Lit4 = simpleSymbol;
        Lit77 = PairWithPosition.make(simpleSymbol, LList.Empty, "/tmp/1480960185199_0.5906416962059402-0/youngandroidproject/../src/appinventor/ai_aributowsky/TuffyApp/GameScreen.yail", 622671);
        Lit76 = new FString("com.google.appinventor.components.runtime.Button");
        Lit75 = (SimpleSymbol) new SimpleSymbol("Image6").readResolve();
        Lit74 = new FString("com.google.appinventor.components.runtime.Button");
        Lit73 = (SimpleSymbol) new SimpleSymbol("Image5$Click").readResolve();
        Lit72 = PairWithPosition.make(Lit4, LList.Empty, "/tmp/1480960185199_0.5906416962059402-0/youngandroidproject/../src/appinventor/ai_aributowsky/TuffyApp/GameScreen.yail", 569423);
        Lit71 = new FString("com.google.appinventor.components.runtime.Button");
        Lit70 = (SimpleSymbol) new SimpleSymbol("Image5").readResolve();
        Lit69 = new FString("com.google.appinventor.components.runtime.Button");
        Lit68 = (SimpleSymbol) new SimpleSymbol("Image4$Click").readResolve();
        Lit67 = PairWithPosition.make(Lit4, LList.Empty, "/tmp/1480960185199_0.5906416962059402-0/youngandroidproject/../src/appinventor/ai_aributowsky/TuffyApp/GameScreen.yail", 516175);
        Lit66 = new FString("com.google.appinventor.components.runtime.Button");
        Lit65 = (SimpleSymbol) new SimpleSymbol("Image4").readResolve();
        Lit64 = new FString("com.google.appinventor.components.runtime.Button");
        Lit63 = new FString("com.google.appinventor.components.runtime.HorizontalArrangement");
        int[] iArr = new int[2];
        iArr[0] = -1;
        Lit62 = IntNum.make(iArr);
        Lit61 = (SimpleSymbol) new SimpleSymbol("HorizontalArrangement3").readResolve();
        Lit60 = new FString("com.google.appinventor.components.runtime.HorizontalArrangement");
        Lit59 = (SimpleSymbol) new SimpleSymbol("Image3$Click").readResolve();
        Lit58 = PairWithPosition.make(Lit4, LList.Empty, "/tmp/1480960185199_0.5906416962059402-0/youngandroidproject/../src/appinventor/ai_aributowsky/TuffyApp/GameScreen.yail", 434255);
        Lit57 = new FString("com.google.appinventor.components.runtime.Button");
        Lit56 = (SimpleSymbol) new SimpleSymbol("Image3").readResolve();
        Lit55 = new FString("com.google.appinventor.components.runtime.Button");
        Lit54 = (SimpleSymbol) new SimpleSymbol("Image2$Click").readResolve();
        Lit53 = PairWithPosition.make(Lit4, LList.Empty, "/tmp/1480960185199_0.5906416962059402-0/youngandroidproject/../src/appinventor/ai_aributowsky/TuffyApp/GameScreen.yail", 381007);
        Lit52 = new FString("com.google.appinventor.components.runtime.Button");
        Lit51 = (SimpleSymbol) new SimpleSymbol("Image2").readResolve();
        Lit50 = new FString("com.google.appinventor.components.runtime.Button");
        Lit49 = (SimpleSymbol) new SimpleSymbol("Image1$Click").readResolve();
        Lit48 = PairWithPosition.make(Lit4, LList.Empty, "/tmp/1480960185199_0.5906416962059402-0/youngandroidproject/../src/appinventor/ai_aributowsky/TuffyApp/GameScreen.yail", 327759);
        Lit47 = new FString("com.google.appinventor.components.runtime.Button");
        Lit46 = IntNum.make(97);
        Lit45 = (SimpleSymbol) new SimpleSymbol("Image1").readResolve();
        Lit44 = new FString("com.google.appinventor.components.runtime.Button");
        Lit43 = new FString("com.google.appinventor.components.runtime.HorizontalArrangement");
        iArr = new int[2];
        iArr[0] = -1;
        Lit42 = IntNum.make(iArr);
        Lit41 = (SimpleSymbol) new SimpleSymbol("HorizontalArrangement2").readResolve();
        Lit40 = new FString("com.google.appinventor.components.runtime.HorizontalArrangement");
        Lit39 = new FString("com.google.appinventor.components.runtime.Label");
        iArr = new int[2];
        iArr[0] = Component.COLOR_BLUE;
        Lit38 = IntNum.make(iArr);
        Lit37 = (SimpleSymbol) new SimpleSymbol("TextColor").readResolve();
        Lit36 = IntNum.make(1);
        Lit35 = (SimpleSymbol) new SimpleSymbol("TextAlignment").readResolve();
        Lit34 = (SimpleSymbol) new SimpleSymbol("Text").readResolve();
        Lit33 = IntNum.make(18);
        Lit32 = (SimpleSymbol) new SimpleSymbol("FontSize").readResolve();
        Lit31 = (SimpleSymbol) new SimpleSymbol(PropertyTypeConstants.PROPERTY_TYPE_BOOLEAN).readResolve();
        Lit30 = (SimpleSymbol) new SimpleSymbol("FontBold").readResolve();
        Lit29 = (SimpleSymbol) new SimpleSymbol("Label1").readResolve();
        Lit28 = new FString("com.google.appinventor.components.runtime.Label");
        Lit27 = new FString("com.google.appinventor.components.runtime.VerticalArrangement");
        Lit26 = IntNum.make(-2);
        iArr = new int[2];
        iArr[0] = -1;
        Lit25 = IntNum.make(iArr);
        Lit24 = (SimpleSymbol) new SimpleSymbol("VerticalArrangement1").readResolve();
        Lit23 = new FString("com.google.appinventor.components.runtime.VerticalArrangement");
        Lit22 = (SimpleSymbol) new SimpleSymbol("Click").readResolve();
        Lit21 = (SimpleSymbol) new SimpleSymbol("BackButton$Click").readResolve();
        Lit20 = PairWithPosition.make(Lit4, LList.Empty, "/tmp/1480960185199_0.5906416962059402-0/youngandroidproject/../src/appinventor/ai_aributowsky/TuffyApp/GameScreen.yail", 131150);
        Lit19 = new FString("com.google.appinventor.components.runtime.Button");
        Lit18 = (SimpleSymbol) new SimpleSymbol("Image").readResolve();
        Lit17 = IntNum.make(100);
        Lit16 = (SimpleSymbol) new SimpleSymbol("Width").readResolve();
        Lit15 = IntNum.make(40);
        Lit14 = (SimpleSymbol) new SimpleSymbol("Height").readResolve();
        Lit13 = (SimpleSymbol) new SimpleSymbol("BackButton").readResolve();
        Lit12 = new FString("com.google.appinventor.components.runtime.Button");
        Lit11 = new FString("com.google.appinventor.components.runtime.HorizontalArrangement");
        Lit10 = (SimpleSymbol) new SimpleSymbol("HorizontalArrangement1").readResolve();
        Lit9 = new FString("com.google.appinventor.components.runtime.HorizontalArrangement");
        Lit8 = (SimpleSymbol) new SimpleSymbol("Title").readResolve();
        Lit7 = (SimpleSymbol) new SimpleSymbol("number").readResolve();
        iArr = new int[2];
        iArr[0] = Component.COLOR_GREEN;
        Lit6 = IntNum.make(iArr);
        Lit5 = (SimpleSymbol) new SimpleSymbol("BackgroundColor").readResolve();
        Lit3 = (SimpleSymbol) new SimpleSymbol("AppName").readResolve();
        Lit2 = (SimpleSymbol) new SimpleSymbol("*the-null-value*").readResolve();
        Lit1 = (SimpleSymbol) new SimpleSymbol("getMessage").readResolve();
        Lit0 = (SimpleSymbol) new SimpleSymbol("GameScreen").readResolve();
    }

    public GameScreen() {
        ModuleInfo.register(this);
        ModuleBody appinventor_ai_aributowsky_TuffyApp_GameScreen_frame = new frame();
        appinventor_ai_aributowsky_TuffyApp_GameScreen_frame.$main = this;
        this.android$Mnlog$Mnform = new ModuleMethod(appinventor_ai_aributowsky_TuffyApp_GameScreen_frame, 1, Lit79, 4097);
        this.add$Mnto$Mnform$Mnenvironment = new ModuleMethod(appinventor_ai_aributowsky_TuffyApp_GameScreen_frame, 2, Lit80, 8194);
        this.lookup$Mnin$Mnform$Mnenvironment = new ModuleMethod(appinventor_ai_aributowsky_TuffyApp_GameScreen_frame, 3, Lit81, 8193);
        this.is$Mnbound$Mnin$Mnform$Mnenvironment = new ModuleMethod(appinventor_ai_aributowsky_TuffyApp_GameScreen_frame, 5, Lit82, 4097);
        this.add$Mnto$Mnglobal$Mnvar$Mnenvironment = new ModuleMethod(appinventor_ai_aributowsky_TuffyApp_GameScreen_frame, 6, Lit83, 8194);
        this.add$Mnto$Mnevents = new ModuleMethod(appinventor_ai_aributowsky_TuffyApp_GameScreen_frame, 7, Lit84, 8194);
        this.add$Mnto$Mncomponents = new ModuleMethod(appinventor_ai_aributowsky_TuffyApp_GameScreen_frame, 8, Lit85, 16388);
        this.add$Mnto$Mnglobal$Mnvars = new ModuleMethod(appinventor_ai_aributowsky_TuffyApp_GameScreen_frame, 9, Lit86, 8194);
        this.add$Mnto$Mnform$Mndo$Mnafter$Mncreation = new ModuleMethod(appinventor_ai_aributowsky_TuffyApp_GameScreen_frame, 10, Lit87, 4097);
        this.send$Mnerror = new ModuleMethod(appinventor_ai_aributowsky_TuffyApp_GameScreen_frame, 11, Lit88, 4097);
        this.process$Mnexception = new ModuleMethod(appinventor_ai_aributowsky_TuffyApp_GameScreen_frame, 12, "process-exception", 4097);
        this.dispatchEvent = new ModuleMethod(appinventor_ai_aributowsky_TuffyApp_GameScreen_frame, 13, Lit89, 16388);
        this.lookup$Mnhandler = new ModuleMethod(appinventor_ai_aributowsky_TuffyApp_GameScreen_frame, 14, Lit90, 8194);
        PropertySet moduleMethod = new ModuleMethod(appinventor_ai_aributowsky_TuffyApp_GameScreen_frame, 15, null, 0);
        moduleMethod.setProperty("source-location", "/tmp/runtime1791431272433290597.scm:547");
        lambda$Fn1 = moduleMethod;
        this.$define = new ModuleMethod(appinventor_ai_aributowsky_TuffyApp_GameScreen_frame, 16, "$define", 0);
        lambda$Fn2 = new ModuleMethod(appinventor_ai_aributowsky_TuffyApp_GameScreen_frame, 17, null, 0);
        lambda$Fn3 = new ModuleMethod(appinventor_ai_aributowsky_TuffyApp_GameScreen_frame, 18, null, 0);
        lambda$Fn4 = new ModuleMethod(appinventor_ai_aributowsky_TuffyApp_GameScreen_frame, 19, null, 0);
        this.BackButton$Click = new ModuleMethod(appinventor_ai_aributowsky_TuffyApp_GameScreen_frame, 20, Lit21, 0);
        lambda$Fn5 = new ModuleMethod(appinventor_ai_aributowsky_TuffyApp_GameScreen_frame, 21, null, 0);
        lambda$Fn6 = new ModuleMethod(appinventor_ai_aributowsky_TuffyApp_GameScreen_frame, 22, null, 0);
        lambda$Fn7 = new ModuleMethod(appinventor_ai_aributowsky_TuffyApp_GameScreen_frame, 23, null, 0);
        lambda$Fn8 = new ModuleMethod(appinventor_ai_aributowsky_TuffyApp_GameScreen_frame, 24, null, 0);
        lambda$Fn9 = new ModuleMethod(appinventor_ai_aributowsky_TuffyApp_GameScreen_frame, 25, null, 0);
        lambda$Fn10 = new ModuleMethod(appinventor_ai_aributowsky_TuffyApp_GameScreen_frame, 26, null, 0);
        lambda$Fn11 = new ModuleMethod(appinventor_ai_aributowsky_TuffyApp_GameScreen_frame, 27, null, 0);
        lambda$Fn12 = new ModuleMethod(appinventor_ai_aributowsky_TuffyApp_GameScreen_frame, 28, null, 0);
        this.Image1$Click = new ModuleMethod(appinventor_ai_aributowsky_TuffyApp_GameScreen_frame, 29, Lit49, 0);
        lambda$Fn13 = new ModuleMethod(appinventor_ai_aributowsky_TuffyApp_GameScreen_frame, 30, null, 0);
        lambda$Fn14 = new ModuleMethod(appinventor_ai_aributowsky_TuffyApp_GameScreen_frame, 31, null, 0);
        this.Image2$Click = new ModuleMethod(appinventor_ai_aributowsky_TuffyApp_GameScreen_frame, 32, Lit54, 0);
        lambda$Fn15 = new ModuleMethod(appinventor_ai_aributowsky_TuffyApp_GameScreen_frame, 33, null, 0);
        lambda$Fn16 = new ModuleMethod(appinventor_ai_aributowsky_TuffyApp_GameScreen_frame, 34, null, 0);
        this.Image3$Click = new ModuleMethod(appinventor_ai_aributowsky_TuffyApp_GameScreen_frame, 35, Lit59, 0);
        lambda$Fn17 = new ModuleMethod(appinventor_ai_aributowsky_TuffyApp_GameScreen_frame, 36, null, 0);
        lambda$Fn18 = new ModuleMethod(appinventor_ai_aributowsky_TuffyApp_GameScreen_frame, 37, null, 0);
        lambda$Fn19 = new ModuleMethod(appinventor_ai_aributowsky_TuffyApp_GameScreen_frame, 38, null, 0);
        lambda$Fn20 = new ModuleMethod(appinventor_ai_aributowsky_TuffyApp_GameScreen_frame, 39, null, 0);
        this.Image4$Click = new ModuleMethod(appinventor_ai_aributowsky_TuffyApp_GameScreen_frame, 40, Lit68, 0);
        lambda$Fn21 = new ModuleMethod(appinventor_ai_aributowsky_TuffyApp_GameScreen_frame, 41, null, 0);
        lambda$Fn22 = new ModuleMethod(appinventor_ai_aributowsky_TuffyApp_GameScreen_frame, 42, null, 0);
        this.Image5$Click = new ModuleMethod(appinventor_ai_aributowsky_TuffyApp_GameScreen_frame, 43, Lit73, 0);
        lambda$Fn23 = new ModuleMethod(appinventor_ai_aributowsky_TuffyApp_GameScreen_frame, 44, null, 0);
        lambda$Fn24 = new ModuleMethod(appinventor_ai_aributowsky_TuffyApp_GameScreen_frame, 45, null, 0);
        this.Image6$Click = new ModuleMethod(appinventor_ai_aributowsky_TuffyApp_GameScreen_frame, 46, Lit78, 0);
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
            GameScreen = null;
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
                    Values.writeValues(runtime.setAndCoerceProperty$Ex(Lit0, Lit8, "GameScreen", Lit4), $result);
                } else {
                    addToFormDoAfterCreation(new Promise(lambda$Fn2));
                }
                this.HorizontalArrangement1 = null;
                if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
                    Values.writeValues(runtime.addComponentWithinRepl(Lit0, Lit9, Lit10, Boolean.FALSE), $result);
                } else {
                    addToComponents(Lit0, Lit11, Lit10, Boolean.FALSE);
                }
                this.BackButton = null;
                if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
                    Values.writeValues(runtime.addComponentWithinRepl(Lit10, Lit12, Lit13, lambda$Fn3), $result);
                } else {
                    addToComponents(Lit10, Lit19, Lit13, lambda$Fn4);
                }
                if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
                    runtime.addToCurrentFormEnvironment(Lit21, this.BackButton$Click);
                } else {
                    addToFormEnvironment(Lit21, this.BackButton$Click);
                }
                if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
                    EventDispatcher.registerEventForDelegation((HandlesEventDispatching) runtime.$Stthis$Mnform$St, "BackButton", "Click");
                } else {
                    addToEvents(Lit13, Lit22);
                }
                this.VerticalArrangement1 = null;
                if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
                    Values.writeValues(runtime.addComponentWithinRepl(Lit0, Lit23, Lit24, lambda$Fn5), $result);
                } else {
                    addToComponents(Lit0, Lit27, Lit24, lambda$Fn6);
                }
                this.Label1 = null;
                if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
                    Values.writeValues(runtime.addComponentWithinRepl(Lit24, Lit28, Lit29, lambda$Fn7), $result);
                } else {
                    addToComponents(Lit24, Lit39, Lit29, lambda$Fn8);
                }
                this.HorizontalArrangement2 = null;
                if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
                    Values.writeValues(runtime.addComponentWithinRepl(Lit0, Lit40, Lit41, lambda$Fn9), $result);
                } else {
                    addToComponents(Lit0, Lit43, Lit41, lambda$Fn10);
                }
                this.Image1 = null;
                if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
                    Values.writeValues(runtime.addComponentWithinRepl(Lit41, Lit44, Lit45, lambda$Fn11), $result);
                } else {
                    addToComponents(Lit41, Lit47, Lit45, lambda$Fn12);
                }
                if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
                    runtime.addToCurrentFormEnvironment(Lit49, this.Image1$Click);
                } else {
                    addToFormEnvironment(Lit49, this.Image1$Click);
                }
                if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
                    EventDispatcher.registerEventForDelegation((HandlesEventDispatching) runtime.$Stthis$Mnform$St, "Image1", "Click");
                } else {
                    addToEvents(Lit45, Lit22);
                }
                this.Image2 = null;
                if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
                    Values.writeValues(runtime.addComponentWithinRepl(Lit41, Lit50, Lit51, lambda$Fn13), $result);
                } else {
                    addToComponents(Lit41, Lit52, Lit51, lambda$Fn14);
                }
                if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
                    runtime.addToCurrentFormEnvironment(Lit54, this.Image2$Click);
                } else {
                    addToFormEnvironment(Lit54, this.Image2$Click);
                }
                if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
                    EventDispatcher.registerEventForDelegation((HandlesEventDispatching) runtime.$Stthis$Mnform$St, "Image2", "Click");
                } else {
                    addToEvents(Lit51, Lit22);
                }
                this.Image3 = null;
                if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
                    Values.writeValues(runtime.addComponentWithinRepl(Lit41, Lit55, Lit56, lambda$Fn15), $result);
                } else {
                    addToComponents(Lit41, Lit57, Lit56, lambda$Fn16);
                }
                if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
                    runtime.addToCurrentFormEnvironment(Lit59, this.Image3$Click);
                } else {
                    addToFormEnvironment(Lit59, this.Image3$Click);
                }
                if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
                    EventDispatcher.registerEventForDelegation((HandlesEventDispatching) runtime.$Stthis$Mnform$St, "Image3", "Click");
                } else {
                    addToEvents(Lit56, Lit22);
                }
                this.HorizontalArrangement3 = null;
                if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
                    Values.writeValues(runtime.addComponentWithinRepl(Lit0, Lit60, Lit61, lambda$Fn17), $result);
                } else {
                    addToComponents(Lit0, Lit63, Lit61, lambda$Fn18);
                }
                this.Image4 = null;
                if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
                    Values.writeValues(runtime.addComponentWithinRepl(Lit61, Lit64, Lit65, lambda$Fn19), $result);
                } else {
                    addToComponents(Lit61, Lit66, Lit65, lambda$Fn20);
                }
                if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
                    runtime.addToCurrentFormEnvironment(Lit68, this.Image4$Click);
                } else {
                    addToFormEnvironment(Lit68, this.Image4$Click);
                }
                if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
                    EventDispatcher.registerEventForDelegation((HandlesEventDispatching) runtime.$Stthis$Mnform$St, "Image4", "Click");
                } else {
                    addToEvents(Lit65, Lit22);
                }
                this.Image5 = null;
                if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
                    Values.writeValues(runtime.addComponentWithinRepl(Lit61, Lit69, Lit70, lambda$Fn21), $result);
                } else {
                    addToComponents(Lit61, Lit71, Lit70, lambda$Fn22);
                }
                if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
                    runtime.addToCurrentFormEnvironment(Lit73, this.Image5$Click);
                } else {
                    addToFormEnvironment(Lit73, this.Image5$Click);
                }
                if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
                    EventDispatcher.registerEventForDelegation((HandlesEventDispatching) runtime.$Stthis$Mnform$St, "Image5", "Click");
                } else {
                    addToEvents(Lit70, Lit22);
                }
                this.Image6 = null;
                if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
                    Values.writeValues(runtime.addComponentWithinRepl(Lit61, Lit74, Lit75, lambda$Fn23), $result);
                } else {
                    addToComponents(Lit61, Lit76, Lit75, lambda$Fn24);
                }
                if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
                    runtime.addToCurrentFormEnvironment(Lit78, this.Image6$Click);
                } else {
                    addToFormEnvironment(Lit78, this.Image6$Click);
                }
                if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
                    EventDispatcher.registerEventForDelegation((HandlesEventDispatching) runtime.$Stthis$Mnform$St, "Image6", "Click");
                } else {
                    addToEvents(Lit75, Lit22);
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
        return runtime.setAndCoerceProperty$Ex(Lit0, Lit8, "GameScreen", Lit4);
    }

    static Object lambda4() {
        runtime.setAndCoerceProperty$Ex(Lit13, Lit14, Lit15, Lit7);
        runtime.setAndCoerceProperty$Ex(Lit13, Lit16, Lit17, Lit7);
        return runtime.setAndCoerceProperty$Ex(Lit13, Lit18, "back_button.png", Lit4);
    }

    static Object lambda5() {
        runtime.setAndCoerceProperty$Ex(Lit13, Lit14, Lit15, Lit7);
        runtime.setAndCoerceProperty$Ex(Lit13, Lit16, Lit17, Lit7);
        return runtime.setAndCoerceProperty$Ex(Lit13, Lit18, "back_button.png", Lit4);
    }

    public Object BackButton$Click() {
        runtime.setThisForm();
        return runtime.callYailPrimitive(runtime.open$Mnanother$Mnscreen, LList.list1("Screen1"), Lit20, "open another screen");
    }

    static Object lambda6() {
        runtime.setAndCoerceProperty$Ex(Lit24, Lit5, Lit25, Lit7);
        return runtime.setAndCoerceProperty$Ex(Lit24, Lit16, Lit26, Lit7);
    }

    static Object lambda7() {
        runtime.setAndCoerceProperty$Ex(Lit24, Lit5, Lit25, Lit7);
        return runtime.setAndCoerceProperty$Ex(Lit24, Lit16, Lit26, Lit7);
    }

    static Object lambda8() {
        runtime.setAndCoerceProperty$Ex(Lit29, Lit30, Boolean.TRUE, Lit31);
        runtime.setAndCoerceProperty$Ex(Lit29, Lit32, Lit33, Lit7);
        runtime.setAndCoerceProperty$Ex(Lit29, Lit16, Lit26, Lit7);
        runtime.setAndCoerceProperty$Ex(Lit29, Lit34, "SELECT A PICTURE TO COLOR:", Lit4);
        runtime.setAndCoerceProperty$Ex(Lit29, Lit35, Lit36, Lit7);
        return runtime.setAndCoerceProperty$Ex(Lit29, Lit37, Lit38, Lit7);
    }

    static Object lambda9() {
        runtime.setAndCoerceProperty$Ex(Lit29, Lit30, Boolean.TRUE, Lit31);
        runtime.setAndCoerceProperty$Ex(Lit29, Lit32, Lit33, Lit7);
        runtime.setAndCoerceProperty$Ex(Lit29, Lit16, Lit26, Lit7);
        runtime.setAndCoerceProperty$Ex(Lit29, Lit34, "SELECT A PICTURE TO COLOR:", Lit4);
        runtime.setAndCoerceProperty$Ex(Lit29, Lit35, Lit36, Lit7);
        return runtime.setAndCoerceProperty$Ex(Lit29, Lit37, Lit38, Lit7);
    }

    static Object lambda10() {
        runtime.setAndCoerceProperty$Ex(Lit41, Lit5, Lit42, Lit7);
        return runtime.setAndCoerceProperty$Ex(Lit41, Lit16, Lit26, Lit7);
    }

    static Object lambda11() {
        runtime.setAndCoerceProperty$Ex(Lit41, Lit5, Lit42, Lit7);
        return runtime.setAndCoerceProperty$Ex(Lit41, Lit16, Lit26, Lit7);
    }

    static Object lambda12() {
        runtime.setAndCoerceProperty$Ex(Lit45, Lit14, Lit17, Lit7);
        runtime.setAndCoerceProperty$Ex(Lit45, Lit16, Lit46, Lit7);
        return runtime.setAndCoerceProperty$Ex(Lit45, Lit18, "coloring1.png", Lit4);
    }

    static Object lambda13() {
        runtime.setAndCoerceProperty$Ex(Lit45, Lit14, Lit17, Lit7);
        runtime.setAndCoerceProperty$Ex(Lit45, Lit16, Lit46, Lit7);
        return runtime.setAndCoerceProperty$Ex(Lit45, Lit18, "coloring1.png", Lit4);
    }

    public Object Image1$Click() {
        runtime.setThisForm();
        return runtime.callYailPrimitive(runtime.open$Mnanother$Mnscreen, LList.list1("Coloring"), Lit48, "open another screen");
    }

    static Object lambda14() {
        runtime.setAndCoerceProperty$Ex(Lit51, Lit14, Lit17, Lit7);
        runtime.setAndCoerceProperty$Ex(Lit51, Lit16, Lit46, Lit7);
        return runtime.setAndCoerceProperty$Ex(Lit51, Lit18, "coloring2.png", Lit4);
    }

    static Object lambda15() {
        runtime.setAndCoerceProperty$Ex(Lit51, Lit14, Lit17, Lit7);
        runtime.setAndCoerceProperty$Ex(Lit51, Lit16, Lit46, Lit7);
        return runtime.setAndCoerceProperty$Ex(Lit51, Lit18, "coloring2.png", Lit4);
    }

    public Object Image2$Click() {
        runtime.setThisForm();
        return runtime.callYailPrimitive(runtime.open$Mnanother$Mnscreen, LList.list1("Picture2"), Lit53, "open another screen");
    }

    static Object lambda16() {
        runtime.setAndCoerceProperty$Ex(Lit56, Lit14, Lit17, Lit7);
        runtime.setAndCoerceProperty$Ex(Lit56, Lit16, Lit17, Lit7);
        return runtime.setAndCoerceProperty$Ex(Lit56, Lit18, "coloring3-picture.png", Lit4);
    }

    static Object lambda17() {
        runtime.setAndCoerceProperty$Ex(Lit56, Lit14, Lit17, Lit7);
        runtime.setAndCoerceProperty$Ex(Lit56, Lit16, Lit17, Lit7);
        return runtime.setAndCoerceProperty$Ex(Lit56, Lit18, "coloring3-picture.png", Lit4);
    }

    public Object Image3$Click() {
        runtime.setThisForm();
        return runtime.callYailPrimitive(runtime.open$Mnanother$Mnscreen, LList.list1("Picture3"), Lit58, "open another screen");
    }

    static Object lambda18() {
        return runtime.setAndCoerceProperty$Ex(Lit61, Lit5, Lit62, Lit7);
    }

    static Object lambda19() {
        return runtime.setAndCoerceProperty$Ex(Lit61, Lit5, Lit62, Lit7);
    }

    static Object lambda20() {
        runtime.setAndCoerceProperty$Ex(Lit65, Lit14, Lit17, Lit7);
        runtime.setAndCoerceProperty$Ex(Lit65, Lit16, Lit46, Lit7);
        return runtime.setAndCoerceProperty$Ex(Lit65, Lit18, "coloring4.png", Lit4);
    }

    static Object lambda21() {
        runtime.setAndCoerceProperty$Ex(Lit65, Lit14, Lit17, Lit7);
        runtime.setAndCoerceProperty$Ex(Lit65, Lit16, Lit46, Lit7);
        return runtime.setAndCoerceProperty$Ex(Lit65, Lit18, "coloring4.png", Lit4);
    }

    public Object Image4$Click() {
        runtime.setThisForm();
        return runtime.callYailPrimitive(runtime.open$Mnanother$Mnscreen, LList.list1("Picture4"), Lit67, "open another screen");
    }

    static Object lambda22() {
        runtime.setAndCoerceProperty$Ex(Lit70, Lit14, Lit17, Lit7);
        runtime.setAndCoerceProperty$Ex(Lit70, Lit16, Lit46, Lit7);
        return runtime.setAndCoerceProperty$Ex(Lit70, Lit18, "coloring5.png", Lit4);
    }

    static Object lambda23() {
        runtime.setAndCoerceProperty$Ex(Lit70, Lit14, Lit17, Lit7);
        runtime.setAndCoerceProperty$Ex(Lit70, Lit16, Lit46, Lit7);
        return runtime.setAndCoerceProperty$Ex(Lit70, Lit18, "coloring5.png", Lit4);
    }

    public Object Image5$Click() {
        runtime.setThisForm();
        return runtime.callYailPrimitive(runtime.open$Mnanother$Mnscreen, LList.list1("Picture5"), Lit72, "open another screen");
    }

    static Object lambda24() {
        runtime.setAndCoerceProperty$Ex(Lit75, Lit14, Lit17, Lit7);
        runtime.setAndCoerceProperty$Ex(Lit75, Lit16, Lit17, Lit7);
        return runtime.setAndCoerceProperty$Ex(Lit75, Lit18, "coloring6.png", Lit4);
    }

    static Object lambda25() {
        runtime.setAndCoerceProperty$Ex(Lit75, Lit14, Lit17, Lit7);
        runtime.setAndCoerceProperty$Ex(Lit75, Lit16, Lit17, Lit7);
        return runtime.setAndCoerceProperty$Ex(Lit75, Lit18, "coloring6.png", Lit4);
    }

    public Object Image6$Click() {
        runtime.setThisForm();
        return runtime.callYailPrimitive(runtime.open$Mnanother$Mnscreen, LList.list1("Picture6"), Lit77, "open another screen");
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
        GameScreen = this;
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
        GameScreen closureEnv = this;
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
