package appinventor.ai_aributowsky.TuffyApp;

import com.google.appinventor.components.common.PropertyTypeConstants;
import com.google.appinventor.components.runtime.Button;
import com.google.appinventor.components.runtime.Component;
import com.google.appinventor.components.runtime.EventDispatcher;
import com.google.appinventor.components.runtime.Form;
import com.google.appinventor.components.runtime.HandlesEventDispatching;
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

/* compiled from: ColoringGameKey.yail */
public class ColoringGameKey extends Form implements Runnable {
    public static ColoringGameKey ColoringGameKey;
    static final SimpleSymbol Lit0;
    static final SimpleSymbol Lit1;
    static final SimpleSymbol Lit10;
    static final SimpleSymbol Lit11;
    static final IntNum Lit12;
    static final SimpleSymbol Lit13;
    static final IntNum Lit14;
    static final SimpleSymbol Lit15;
    static final FString Lit16;
    static final PairWithPosition Lit17;
    static final SimpleSymbol Lit18;
    static final SimpleSymbol Lit19;
    static final SimpleSymbol Lit2;
    static final FString Lit20;
    static final SimpleSymbol Lit21;
    static final IntNum Lit22;
    static final FString Lit23;
    static final FString Lit24;
    static final SimpleSymbol Lit25;
    static final SimpleSymbol Lit26;
    static final SimpleSymbol Lit27;
    static final SimpleSymbol Lit28;
    static final IntNum Lit29;
    static final SimpleSymbol Lit3;
    static final SimpleSymbol Lit30;
    static final SimpleSymbol Lit31;
    static final IntNum Lit32;
    static final SimpleSymbol Lit33;
    static final IntNum Lit34;
    static final FString Lit35;
    static final FString Lit36;
    static final SimpleSymbol Lit37;
    static final FString Lit38;
    static final FString Lit39;
    static final SimpleSymbol Lit4;
    static final SimpleSymbol Lit40;
    static final FString Lit41;
    static final FString Lit42;
    static final SimpleSymbol Lit43;
    static final FString Lit44;
    static final FString Lit45;
    static final SimpleSymbol Lit46;
    static final FString Lit47;
    static final FString Lit48;
    static final SimpleSymbol Lit49;
    static final SimpleSymbol Lit5;
    static final FString Lit50;
    static final FString Lit51;
    static final SimpleSymbol Lit52;
    static final FString Lit53;
    static final FString Lit54;
    static final SimpleSymbol Lit55;
    static final FString Lit56;
    static final FString Lit57;
    static final SimpleSymbol Lit58;
    static final FString Lit59;
    static final IntNum Lit6;
    static final FString Lit60;
    static final SimpleSymbol Lit61;
    static final FString Lit62;
    static final FString Lit63;
    static final SimpleSymbol Lit64;
    static final FString Lit65;
    static final FString Lit66;
    static final SimpleSymbol Lit67;
    static final FString Lit68;
    static final FString Lit69;
    static final SimpleSymbol Lit7;
    static final SimpleSymbol Lit70;
    static final FString Lit71;
    static final SimpleSymbol Lit72;
    static final SimpleSymbol Lit73;
    static final SimpleSymbol Lit74;
    static final SimpleSymbol Lit75;
    static final SimpleSymbol Lit76;
    static final SimpleSymbol Lit77;
    static final SimpleSymbol Lit78;
    static final SimpleSymbol Lit79;
    static final SimpleSymbol Lit8;
    static final SimpleSymbol Lit80;
    static final SimpleSymbol Lit81;
    static final SimpleSymbol Lit82;
    static final SimpleSymbol Lit83;
    static final FString Lit9;
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
    public Label Label1;
    public Label Label12;
    public Label Label13;
    public Label Label14;
    public Label Label15;
    public Label Label16;
    public Label Label2;
    public Label Label3;
    public Label Label4;
    public Label Label5;
    public Label Label6;
    public Label Label7;
    public Label Label8;
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

    /* compiled from: ColoringGameKey.yail */
    public class frame extends ModuleBody {
        ColoringGameKey $main;

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
                    if (!(obj instanceof ColoringGameKey)) {
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
                    if (!(obj instanceof ColoringGameKey)) {
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
                    return ColoringGameKey.lambda2();
                case SetExp.PROCEDURE /*16*/:
                    this.$main.$define();
                    return Values.empty;
                case Sequence.INT_U8_VALUE /*17*/:
                    return ColoringGameKey.lambda3();
                case Sequence.INT_S8_VALUE /*18*/:
                    return ColoringGameKey.lambda4();
                case Sequence.INT_U16_VALUE /*19*/:
                    return ColoringGameKey.lambda5();
                case Sequence.INT_S16_VALUE /*20*/:
                    return this.$main.BackButton$Click();
                case Sequence.INT_U32_VALUE /*21*/:
                    return ColoringGameKey.lambda6();
                case Sequence.INT_S32_VALUE /*22*/:
                    return ColoringGameKey.lambda7();
                case Sequence.INT_U64_VALUE /*23*/:
                    return ColoringGameKey.lambda8();
                case Sequence.INT_S64_VALUE /*24*/:
                    return ColoringGameKey.lambda9();
                case Sequence.FLOAT_VALUE /*25*/:
                    return ColoringGameKey.lambda10();
                case Sequence.DOUBLE_VALUE /*26*/:
                    return ColoringGameKey.lambda11();
                case Sequence.BOOLEAN_VALUE /*27*/:
                    return ColoringGameKey.lambda12();
                case Sequence.TEXT_BYTE_VALUE /*28*/:
                    return ColoringGameKey.lambda13();
                case Sequence.CHAR_VALUE /*29*/:
                    return ColoringGameKey.lambda14();
                case XDataType.DAY_TIME_DURATION_TYPE_CODE /*30*/:
                    return ColoringGameKey.lambda15();
                case Sequence.CDATA_VALUE /*31*/:
                    return ColoringGameKey.lambda16();
                case SetExp.SET_IF_UNBOUND /*32*/:
                    return ColoringGameKey.lambda17();
                case Sequence.ELEMENT_VALUE /*33*/:
                    return ColoringGameKey.lambda18();
                case Sequence.DOCUMENT_VALUE /*34*/:
                    return ColoringGameKey.lambda19();
                case Sequence.ATTRIBUTE_VALUE /*35*/:
                    return ColoringGameKey.lambda20();
                case Sequence.COMMENT_VALUE /*36*/:
                    return ColoringGameKey.lambda21();
                case Sequence.PROCESSING_INSTRUCTION_VALUE /*37*/:
                    return ColoringGameKey.lambda22();
                case XDataType.STRING_TYPE_CODE /*38*/:
                    return ColoringGameKey.lambda23();
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
                default:
                    return super.match0(moduleMethod, callContext);
            }
        }
    }

    static {
        Lit83 = (SimpleSymbol) new SimpleSymbol("lookup-handler").readResolve();
        Lit82 = (SimpleSymbol) new SimpleSymbol("dispatchEvent").readResolve();
        Lit81 = (SimpleSymbol) new SimpleSymbol("send-error").readResolve();
        Lit80 = (SimpleSymbol) new SimpleSymbol("add-to-form-do-after-creation").readResolve();
        Lit79 = (SimpleSymbol) new SimpleSymbol("add-to-global-vars").readResolve();
        Lit78 = (SimpleSymbol) new SimpleSymbol("add-to-components").readResolve();
        Lit77 = (SimpleSymbol) new SimpleSymbol("add-to-events").readResolve();
        Lit76 = (SimpleSymbol) new SimpleSymbol("add-to-global-var-environment").readResolve();
        Lit75 = (SimpleSymbol) new SimpleSymbol("is-bound-in-form-environment").readResolve();
        Lit74 = (SimpleSymbol) new SimpleSymbol("lookup-in-form-environment").readResolve();
        Lit73 = (SimpleSymbol) new SimpleSymbol("add-to-form-environment").readResolve();
        Lit72 = (SimpleSymbol) new SimpleSymbol("android-log-form").readResolve();
        Lit71 = new FString("com.google.appinventor.components.runtime.Label");
        Lit70 = (SimpleSymbol) new SimpleSymbol("Label16").readResolve();
        Lit69 = new FString("com.google.appinventor.components.runtime.Label");
        Lit68 = new FString("com.google.appinventor.components.runtime.Label");
        Lit67 = (SimpleSymbol) new SimpleSymbol("Label15").readResolve();
        Lit66 = new FString("com.google.appinventor.components.runtime.Label");
        Lit65 = new FString("com.google.appinventor.components.runtime.Label");
        Lit64 = (SimpleSymbol) new SimpleSymbol("Label14").readResolve();
        Lit63 = new FString("com.google.appinventor.components.runtime.Label");
        Lit62 = new FString("com.google.appinventor.components.runtime.Label");
        Lit61 = (SimpleSymbol) new SimpleSymbol("Label13").readResolve();
        Lit60 = new FString("com.google.appinventor.components.runtime.Label");
        Lit59 = new FString("com.google.appinventor.components.runtime.Label");
        Lit58 = (SimpleSymbol) new SimpleSymbol("Label12").readResolve();
        Lit57 = new FString("com.google.appinventor.components.runtime.Label");
        Lit56 = new FString("com.google.appinventor.components.runtime.Label");
        Lit55 = (SimpleSymbol) new SimpleSymbol("Label8").readResolve();
        Lit54 = new FString("com.google.appinventor.components.runtime.Label");
        Lit53 = new FString("com.google.appinventor.components.runtime.Label");
        Lit52 = (SimpleSymbol) new SimpleSymbol("Label7").readResolve();
        Lit51 = new FString("com.google.appinventor.components.runtime.Label");
        Lit50 = new FString("com.google.appinventor.components.runtime.Label");
        Lit49 = (SimpleSymbol) new SimpleSymbol("Label6").readResolve();
        Lit48 = new FString("com.google.appinventor.components.runtime.Label");
        Lit47 = new FString("com.google.appinventor.components.runtime.Label");
        Lit46 = (SimpleSymbol) new SimpleSymbol("Label5").readResolve();
        Lit45 = new FString("com.google.appinventor.components.runtime.Label");
        Lit44 = new FString("com.google.appinventor.components.runtime.Label");
        Lit43 = (SimpleSymbol) new SimpleSymbol("Label4").readResolve();
        Lit42 = new FString("com.google.appinventor.components.runtime.Label");
        Lit41 = new FString("com.google.appinventor.components.runtime.Label");
        Lit40 = (SimpleSymbol) new SimpleSymbol("Label3").readResolve();
        Lit39 = new FString("com.google.appinventor.components.runtime.Label");
        Lit38 = new FString("com.google.appinventor.components.runtime.Label");
        Lit37 = (SimpleSymbol) new SimpleSymbol("Label2").readResolve();
        Lit36 = new FString("com.google.appinventor.components.runtime.Label");
        Lit35 = new FString("com.google.appinventor.components.runtime.Label");
        int[] iArr = new int[2];
        iArr[0] = Component.COLOR_BLUE;
        Lit34 = IntNum.make(iArr);
        Lit33 = (SimpleSymbol) new SimpleSymbol("TextColor").readResolve();
        Lit32 = IntNum.make(1);
        Lit31 = (SimpleSymbol) new SimpleSymbol("TextAlignment").readResolve();
        Lit30 = (SimpleSymbol) new SimpleSymbol("Text").readResolve();
        Lit29 = IntNum.make(17);
        Lit28 = (SimpleSymbol) new SimpleSymbol("FontSize").readResolve();
        Lit27 = (SimpleSymbol) new SimpleSymbol(PropertyTypeConstants.PROPERTY_TYPE_BOOLEAN).readResolve();
        Lit26 = (SimpleSymbol) new SimpleSymbol("FontBold").readResolve();
        Lit25 = (SimpleSymbol) new SimpleSymbol("Label1").readResolve();
        Lit24 = new FString("com.google.appinventor.components.runtime.Label");
        Lit23 = new FString("com.google.appinventor.components.runtime.VerticalArrangement");
        Lit22 = IntNum.make(-2);
        Lit21 = (SimpleSymbol) new SimpleSymbol("VerticalArrangement1").readResolve();
        Lit20 = new FString("com.google.appinventor.components.runtime.VerticalArrangement");
        Lit19 = (SimpleSymbol) new SimpleSymbol("Click").readResolve();
        Lit18 = (SimpleSymbol) new SimpleSymbol("BackButton$Click").readResolve();
        SimpleSymbol simpleSymbol = (SimpleSymbol) new SimpleSymbol(PropertyTypeConstants.PROPERTY_TYPE_TEXT).readResolve();
        Lit4 = simpleSymbol;
        Lit17 = PairWithPosition.make(simpleSymbol, LList.Empty, "/tmp/1480960185199_0.5906416962059402-0/youngandroidproject/../src/appinventor/ai_aributowsky/TuffyApp/ColoringGameKey.yail", 110670);
        Lit16 = new FString("com.google.appinventor.components.runtime.Button");
        Lit15 = (SimpleSymbol) new SimpleSymbol("Image").readResolve();
        Lit14 = IntNum.make(100);
        Lit13 = (SimpleSymbol) new SimpleSymbol("Width").readResolve();
        Lit12 = IntNum.make(30);
        Lit11 = (SimpleSymbol) new SimpleSymbol("Height").readResolve();
        Lit10 = (SimpleSymbol) new SimpleSymbol("BackButton").readResolve();
        Lit9 = new FString("com.google.appinventor.components.runtime.Button");
        Lit8 = (SimpleSymbol) new SimpleSymbol("Title").readResolve();
        Lit7 = (SimpleSymbol) new SimpleSymbol("number").readResolve();
        iArr = new int[2];
        iArr[0] = Component.COLOR_MAGENTA;
        Lit6 = IntNum.make(iArr);
        Lit5 = (SimpleSymbol) new SimpleSymbol("BackgroundColor").readResolve();
        Lit3 = (SimpleSymbol) new SimpleSymbol("AppName").readResolve();
        Lit2 = (SimpleSymbol) new SimpleSymbol("*the-null-value*").readResolve();
        Lit1 = (SimpleSymbol) new SimpleSymbol("getMessage").readResolve();
        Lit0 = (SimpleSymbol) new SimpleSymbol("ColoringGameKey").readResolve();
    }

    public ColoringGameKey() {
        ModuleInfo.register(this);
        ModuleBody appinventor_ai_aributowsky_TuffyApp_ColoringGameKey_frame = new frame();
        appinventor_ai_aributowsky_TuffyApp_ColoringGameKey_frame.$main = this;
        this.android$Mnlog$Mnform = new ModuleMethod(appinventor_ai_aributowsky_TuffyApp_ColoringGameKey_frame, 1, Lit72, 4097);
        this.add$Mnto$Mnform$Mnenvironment = new ModuleMethod(appinventor_ai_aributowsky_TuffyApp_ColoringGameKey_frame, 2, Lit73, 8194);
        this.lookup$Mnin$Mnform$Mnenvironment = new ModuleMethod(appinventor_ai_aributowsky_TuffyApp_ColoringGameKey_frame, 3, Lit74, 8193);
        this.is$Mnbound$Mnin$Mnform$Mnenvironment = new ModuleMethod(appinventor_ai_aributowsky_TuffyApp_ColoringGameKey_frame, 5, Lit75, 4097);
        this.add$Mnto$Mnglobal$Mnvar$Mnenvironment = new ModuleMethod(appinventor_ai_aributowsky_TuffyApp_ColoringGameKey_frame, 6, Lit76, 8194);
        this.add$Mnto$Mnevents = new ModuleMethod(appinventor_ai_aributowsky_TuffyApp_ColoringGameKey_frame, 7, Lit77, 8194);
        this.add$Mnto$Mncomponents = new ModuleMethod(appinventor_ai_aributowsky_TuffyApp_ColoringGameKey_frame, 8, Lit78, 16388);
        this.add$Mnto$Mnglobal$Mnvars = new ModuleMethod(appinventor_ai_aributowsky_TuffyApp_ColoringGameKey_frame, 9, Lit79, 8194);
        this.add$Mnto$Mnform$Mndo$Mnafter$Mncreation = new ModuleMethod(appinventor_ai_aributowsky_TuffyApp_ColoringGameKey_frame, 10, Lit80, 4097);
        this.send$Mnerror = new ModuleMethod(appinventor_ai_aributowsky_TuffyApp_ColoringGameKey_frame, 11, Lit81, 4097);
        this.process$Mnexception = new ModuleMethod(appinventor_ai_aributowsky_TuffyApp_ColoringGameKey_frame, 12, "process-exception", 4097);
        this.dispatchEvent = new ModuleMethod(appinventor_ai_aributowsky_TuffyApp_ColoringGameKey_frame, 13, Lit82, 16388);
        this.lookup$Mnhandler = new ModuleMethod(appinventor_ai_aributowsky_TuffyApp_ColoringGameKey_frame, 14, Lit83, 8194);
        PropertySet moduleMethod = new ModuleMethod(appinventor_ai_aributowsky_TuffyApp_ColoringGameKey_frame, 15, null, 0);
        moduleMethod.setProperty("source-location", "/tmp/runtime1791431272433290597.scm:547");
        lambda$Fn1 = moduleMethod;
        this.$define = new ModuleMethod(appinventor_ai_aributowsky_TuffyApp_ColoringGameKey_frame, 16, "$define", 0);
        lambda$Fn2 = new ModuleMethod(appinventor_ai_aributowsky_TuffyApp_ColoringGameKey_frame, 17, null, 0);
        lambda$Fn3 = new ModuleMethod(appinventor_ai_aributowsky_TuffyApp_ColoringGameKey_frame, 18, null, 0);
        lambda$Fn4 = new ModuleMethod(appinventor_ai_aributowsky_TuffyApp_ColoringGameKey_frame, 19, null, 0);
        this.BackButton$Click = new ModuleMethod(appinventor_ai_aributowsky_TuffyApp_ColoringGameKey_frame, 20, Lit18, 0);
        lambda$Fn5 = new ModuleMethod(appinventor_ai_aributowsky_TuffyApp_ColoringGameKey_frame, 21, null, 0);
        lambda$Fn6 = new ModuleMethod(appinventor_ai_aributowsky_TuffyApp_ColoringGameKey_frame, 22, null, 0);
        lambda$Fn7 = new ModuleMethod(appinventor_ai_aributowsky_TuffyApp_ColoringGameKey_frame, 23, null, 0);
        lambda$Fn8 = new ModuleMethod(appinventor_ai_aributowsky_TuffyApp_ColoringGameKey_frame, 24, null, 0);
        lambda$Fn9 = new ModuleMethod(appinventor_ai_aributowsky_TuffyApp_ColoringGameKey_frame, 25, null, 0);
        lambda$Fn10 = new ModuleMethod(appinventor_ai_aributowsky_TuffyApp_ColoringGameKey_frame, 26, null, 0);
        lambda$Fn11 = new ModuleMethod(appinventor_ai_aributowsky_TuffyApp_ColoringGameKey_frame, 27, null, 0);
        lambda$Fn12 = new ModuleMethod(appinventor_ai_aributowsky_TuffyApp_ColoringGameKey_frame, 28, null, 0);
        lambda$Fn13 = new ModuleMethod(appinventor_ai_aributowsky_TuffyApp_ColoringGameKey_frame, 29, null, 0);
        lambda$Fn14 = new ModuleMethod(appinventor_ai_aributowsky_TuffyApp_ColoringGameKey_frame, 30, null, 0);
        lambda$Fn15 = new ModuleMethod(appinventor_ai_aributowsky_TuffyApp_ColoringGameKey_frame, 31, null, 0);
        lambda$Fn16 = new ModuleMethod(appinventor_ai_aributowsky_TuffyApp_ColoringGameKey_frame, 32, null, 0);
        lambda$Fn17 = new ModuleMethod(appinventor_ai_aributowsky_TuffyApp_ColoringGameKey_frame, 33, null, 0);
        lambda$Fn18 = new ModuleMethod(appinventor_ai_aributowsky_TuffyApp_ColoringGameKey_frame, 34, null, 0);
        lambda$Fn19 = new ModuleMethod(appinventor_ai_aributowsky_TuffyApp_ColoringGameKey_frame, 35, null, 0);
        lambda$Fn20 = new ModuleMethod(appinventor_ai_aributowsky_TuffyApp_ColoringGameKey_frame, 36, null, 0);
        lambda$Fn21 = new ModuleMethod(appinventor_ai_aributowsky_TuffyApp_ColoringGameKey_frame, 37, null, 0);
        lambda$Fn22 = new ModuleMethod(appinventor_ai_aributowsky_TuffyApp_ColoringGameKey_frame, 38, null, 0);
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
            ColoringGameKey = null;
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
                    Values.writeValues(runtime.setAndCoerceProperty$Ex(Lit0, Lit8, "ColoringGameKey", Lit4), $result);
                } else {
                    addToFormDoAfterCreation(new Promise(lambda$Fn2));
                }
                this.BackButton = null;
                if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
                    Values.writeValues(runtime.addComponentWithinRepl(Lit0, Lit9, Lit10, lambda$Fn3), $result);
                } else {
                    addToComponents(Lit0, Lit16, Lit10, lambda$Fn4);
                }
                if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
                    runtime.addToCurrentFormEnvironment(Lit18, this.BackButton$Click);
                } else {
                    addToFormEnvironment(Lit18, this.BackButton$Click);
                }
                if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
                    EventDispatcher.registerEventForDelegation((HandlesEventDispatching) runtime.$Stthis$Mnform$St, "BackButton", "Click");
                } else {
                    addToEvents(Lit10, Lit19);
                }
                this.VerticalArrangement1 = null;
                if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
                    Values.writeValues(runtime.addComponentWithinRepl(Lit0, Lit20, Lit21, lambda$Fn5), $result);
                } else {
                    addToComponents(Lit0, Lit23, Lit21, lambda$Fn6);
                }
                this.Label1 = null;
                if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
                    Values.writeValues(runtime.addComponentWithinRepl(Lit21, Lit24, Lit25, lambda$Fn7), $result);
                } else {
                    addToComponents(Lit21, Lit35, Lit25, lambda$Fn8);
                }
                this.Label2 = null;
                if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
                    Values.writeValues(runtime.addComponentWithinRepl(Lit21, Lit36, Lit37, lambda$Fn9), $result);
                } else {
                    addToComponents(Lit21, Lit38, Lit37, lambda$Fn10);
                }
                this.Label3 = null;
                if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
                    Values.writeValues(runtime.addComponentWithinRepl(Lit21, Lit39, Lit40, lambda$Fn11), $result);
                } else {
                    addToComponents(Lit21, Lit41, Lit40, lambda$Fn12);
                }
                this.Label4 = null;
                if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
                    Values.writeValues(runtime.addComponentWithinRepl(Lit21, Lit42, Lit43, lambda$Fn13), $result);
                } else {
                    addToComponents(Lit21, Lit44, Lit43, lambda$Fn14);
                }
                this.Label5 = null;
                if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
                    Values.writeValues(runtime.addComponentWithinRepl(Lit21, Lit45, Lit46, lambda$Fn15), $result);
                } else {
                    addToComponents(Lit21, Lit47, Lit46, lambda$Fn16);
                }
                this.Label6 = null;
                if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
                    Values.writeValues(runtime.addComponentWithinRepl(Lit21, Lit48, Lit49, lambda$Fn17), $result);
                } else {
                    addToComponents(Lit21, Lit50, Lit49, lambda$Fn18);
                }
                this.Label7 = null;
                if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
                    Values.writeValues(runtime.addComponentWithinRepl(Lit21, Lit51, Lit52, lambda$Fn19), $result);
                } else {
                    addToComponents(Lit21, Lit53, Lit52, lambda$Fn20);
                }
                this.Label8 = null;
                if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
                    Values.writeValues(runtime.addComponentWithinRepl(Lit21, Lit54, Lit55, lambda$Fn21), $result);
                } else {
                    addToComponents(Lit21, Lit56, Lit55, lambda$Fn22);
                }
                this.Label12 = null;
                if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
                    Values.writeValues(runtime.addComponentWithinRepl(Lit21, Lit57, Lit58, Boolean.FALSE), $result);
                } else {
                    addToComponents(Lit21, Lit59, Lit58, Boolean.FALSE);
                }
                this.Label13 = null;
                if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
                    Values.writeValues(runtime.addComponentWithinRepl(Lit21, Lit60, Lit61, Boolean.FALSE), $result);
                } else {
                    addToComponents(Lit21, Lit62, Lit61, Boolean.FALSE);
                }
                this.Label14 = null;
                if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
                    Values.writeValues(runtime.addComponentWithinRepl(Lit21, Lit63, Lit64, Boolean.FALSE), $result);
                } else {
                    addToComponents(Lit21, Lit65, Lit64, Boolean.FALSE);
                }
                this.Label15 = null;
                if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
                    Values.writeValues(runtime.addComponentWithinRepl(Lit21, Lit66, Lit67, Boolean.FALSE), $result);
                } else {
                    addToComponents(Lit21, Lit68, Lit67, Boolean.FALSE);
                }
                this.Label16 = null;
                if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
                    Values.writeValues(runtime.addComponentWithinRepl(Lit21, Lit69, Lit70, Boolean.FALSE), $result);
                } else {
                    addToComponents(Lit21, Lit71, Lit70, Boolean.FALSE);
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
        return runtime.setAndCoerceProperty$Ex(Lit0, Lit8, "ColoringGameKey", Lit4);
    }

    static Object lambda4() {
        runtime.setAndCoerceProperty$Ex(Lit10, Lit11, Lit12, Lit7);
        runtime.setAndCoerceProperty$Ex(Lit10, Lit13, Lit14, Lit7);
        return runtime.setAndCoerceProperty$Ex(Lit10, Lit15, "back_button.png", Lit4);
    }

    static Object lambda5() {
        runtime.setAndCoerceProperty$Ex(Lit10, Lit11, Lit12, Lit7);
        runtime.setAndCoerceProperty$Ex(Lit10, Lit13, Lit14, Lit7);
        return runtime.setAndCoerceProperty$Ex(Lit10, Lit15, "back_button.png", Lit4);
    }

    public Object BackButton$Click() {
        runtime.setThisForm();
        return runtime.callYailPrimitive(runtime.open$Mnanother$Mnscreen, LList.list1("Screen1"), Lit17, "open another screen");
    }

    static Object lambda6() {
        runtime.setAndCoerceProperty$Ex(Lit21, Lit11, Lit22, Lit7);
        return runtime.setAndCoerceProperty$Ex(Lit21, Lit13, Lit22, Lit7);
    }

    static Object lambda7() {
        runtime.setAndCoerceProperty$Ex(Lit21, Lit11, Lit22, Lit7);
        return runtime.setAndCoerceProperty$Ex(Lit21, Lit13, Lit22, Lit7);
    }

    static Object lambda8() {
        runtime.setAndCoerceProperty$Ex(Lit25, Lit26, Boolean.TRUE, Lit27);
        runtime.setAndCoerceProperty$Ex(Lit25, Lit28, Lit29, Lit7);
        runtime.setAndCoerceProperty$Ex(Lit25, Lit13, Lit22, Lit7);
        runtime.setAndCoerceProperty$Ex(Lit25, Lit30, "Key", Lit4);
        runtime.setAndCoerceProperty$Ex(Lit25, Lit31, Lit32, Lit7);
        return runtime.setAndCoerceProperty$Ex(Lit25, Lit33, Lit34, Lit7);
    }

    static Object lambda9() {
        runtime.setAndCoerceProperty$Ex(Lit25, Lit26, Boolean.TRUE, Lit27);
        runtime.setAndCoerceProperty$Ex(Lit25, Lit28, Lit29, Lit7);
        runtime.setAndCoerceProperty$Ex(Lit25, Lit13, Lit22, Lit7);
        runtime.setAndCoerceProperty$Ex(Lit25, Lit30, "Key", Lit4);
        runtime.setAndCoerceProperty$Ex(Lit25, Lit31, Lit32, Lit7);
        return runtime.setAndCoerceProperty$Ex(Lit25, Lit33, Lit34, Lit7);
    }

    static Object lambda10() {
        runtime.setAndCoerceProperty$Ex(Lit37, Lit26, Boolean.TRUE, Lit27);
        return runtime.setAndCoerceProperty$Ex(Lit37, Lit30, "BACK = Return to the previous screen.", Lit4);
    }

    static Object lambda11() {
        runtime.setAndCoerceProperty$Ex(Lit37, Lit26, Boolean.TRUE, Lit27);
        return runtime.setAndCoerceProperty$Ex(Lit37, Lit30, "BACK = Return to the previous screen.", Lit4);
    }

    static Object lambda12() {
        runtime.setAndCoerceProperty$Ex(Lit40, Lit26, Boolean.TRUE, Lit27);
        return runtime.setAndCoerceProperty$Ex(Lit40, Lit30, "Save Picture = Save your progress on an external file.", Lit4);
    }

    static Object lambda13() {
        runtime.setAndCoerceProperty$Ex(Lit40, Lit26, Boolean.TRUE, Lit27);
        return runtime.setAndCoerceProperty$Ex(Lit40, Lit30, "Save Picture = Save your progress on an external file.", Lit4);
    }

    static Object lambda14() {
        runtime.setAndCoerceProperty$Ex(Lit43, Lit26, Boolean.TRUE, Lit27);
        return runtime.setAndCoerceProperty$Ex(Lit43, Lit30, "Load Picture = Bring up your progress from a certain", Lit4);
    }

    static Object lambda15() {
        runtime.setAndCoerceProperty$Ex(Lit43, Lit26, Boolean.TRUE, Lit27);
        return runtime.setAndCoerceProperty$Ex(Lit43, Lit30, "Load Picture = Bring up your progress from a certain", Lit4);
    }

    static Object lambda16() {
        runtime.setAndCoerceProperty$Ex(Lit46, Lit26, Boolean.TRUE, Lit27);
        return runtime.setAndCoerceProperty$Ex(Lit46, Lit30, "point in time.", Lit4);
    }

    static Object lambda17() {
        runtime.setAndCoerceProperty$Ex(Lit46, Lit26, Boolean.TRUE, Lit27);
        return runtime.setAndCoerceProperty$Ex(Lit46, Lit30, "point in time.", Lit4);
    }

    static Object lambda18() {
        runtime.setAndCoerceProperty$Ex(Lit49, Lit26, Boolean.TRUE, Lit27);
        return runtime.setAndCoerceProperty$Ex(Lit49, Lit30, "Small Dots = Color a picture using small markings.", Lit4);
    }

    static Object lambda19() {
        runtime.setAndCoerceProperty$Ex(Lit49, Lit26, Boolean.TRUE, Lit27);
        return runtime.setAndCoerceProperty$Ex(Lit49, Lit30, "Small Dots = Color a picture using small markings.", Lit4);
    }

    static Object lambda20() {
        runtime.setAndCoerceProperty$Ex(Lit52, Lit26, Boolean.TRUE, Lit27);
        return runtime.setAndCoerceProperty$Ex(Lit52, Lit30, "Big Dots = Color a picture using big markings.", Lit4);
    }

    static Object lambda21() {
        runtime.setAndCoerceProperty$Ex(Lit52, Lit26, Boolean.TRUE, Lit27);
        return runtime.setAndCoerceProperty$Ex(Lit52, Lit30, "Big Dots = Color a picture using big markings.", Lit4);
    }

    static Object lambda22() {
        runtime.setAndCoerceProperty$Ex(Lit55, Lit26, Boolean.TRUE, Lit27);
        return runtime.setAndCoerceProperty$Ex(Lit55, Lit30, "Wipe = Erase your current progress on a picture.", Lit4);
    }

    static Object lambda23() {
        runtime.setAndCoerceProperty$Ex(Lit55, Lit26, Boolean.TRUE, Lit27);
        return runtime.setAndCoerceProperty$Ex(Lit55, Lit30, "Wipe = Erase your current progress on a picture.", Lit4);
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
        ColoringGameKey = this;
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
        ColoringGameKey closureEnv = this;
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
