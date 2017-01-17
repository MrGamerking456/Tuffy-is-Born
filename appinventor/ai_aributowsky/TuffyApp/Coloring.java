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

/* compiled from: Coloring.yail */
public class Coloring extends Form implements Runnable {
    public static Coloring Coloring;
    static final SimpleSymbol Lit0;
    static final SimpleSymbol Lit1;
    static final SimpleSymbol Lit10;
    static final SimpleSymbol Lit100;
    static final FString Lit101;
    static final SimpleSymbol Lit102;
    static final FString Lit103;
    static final IntNum Lit104;
    static final SimpleSymbol Lit105;
    static final FString Lit106;
    static final SimpleSymbol Lit107;
    static final FString Lit108;
    static final IntNum Lit109;
    static final SimpleSymbol Lit11;
    static final SimpleSymbol Lit110;
    static final FString Lit111;
    static final SimpleSymbol Lit112;
    static final FString Lit113;
    static final IntNum Lit114;
    static final SimpleSymbol Lit115;
    static final FString Lit116;
    static final SimpleSymbol Lit117;
    static final FString Lit118;
    static final IntNum Lit119;
    static final SimpleSymbol Lit12;
    static final SimpleSymbol Lit120;
    static final FString Lit121;
    static final SimpleSymbol Lit122;
    static final FString Lit123;
    static final IntNum Lit124;
    static final SimpleSymbol Lit125;
    static final FString Lit126;
    static final SimpleSymbol Lit127;
    static final IntNum Lit128;
    static final IntNum Lit129;
    static final IntNum Lit13;
    static final FString Lit130;
    static final IntNum Lit131;
    static final SimpleSymbol Lit132;
    static final FString Lit133;
    static final FString Lit134;
    static final FString Lit135;
    static final SimpleSymbol Lit136;
    static final FString Lit137;
    static final FString Lit138;
    static final SimpleSymbol Lit139;
    static final SimpleSymbol Lit14;
    static final FString Lit140;
    static final FString Lit141;
    static final SimpleSymbol Lit142;
    static final FString Lit143;
    static final SimpleSymbol Lit144;
    static final SimpleSymbol Lit145;
    static final SimpleSymbol Lit146;
    static final SimpleSymbol Lit147;
    static final SimpleSymbol Lit148;
    static final SimpleSymbol Lit149;
    static final SimpleSymbol Lit15;
    static final SimpleSymbol Lit150;
    static final SimpleSymbol Lit151;
    static final SimpleSymbol Lit152;
    static final SimpleSymbol Lit153;
    static final SimpleSymbol Lit154;
    static final SimpleSymbol Lit155;
    static final SimpleSymbol Lit156;
    static final FString Lit16;
    static final SimpleSymbol Lit17;
    static final IntNum Lit18;
    static final SimpleSymbol Lit19;
    static final SimpleSymbol Lit2;
    static final IntNum Lit20;
    static final SimpleSymbol Lit21;
    static final IntNum Lit22;
    static final FString Lit23;
    static final FString Lit24;
    static final SimpleSymbol Lit25;
    static final IntNum Lit26;
    static final SimpleSymbol Lit27;
    static final FString Lit28;
    static final PairWithPosition Lit29;
    static final SimpleSymbol Lit3;
    static final SimpleSymbol Lit30;
    static final SimpleSymbol Lit31;
    static final FString Lit32;
    static final SimpleSymbol Lit33;
    static final SimpleSymbol Lit34;
    static final SimpleSymbol Lit35;
    static final SimpleSymbol Lit36;
    static final FString Lit37;
    static final SimpleSymbol Lit38;
    static final SimpleSymbol Lit39;
    static final IntNum Lit4;
    static final SimpleSymbol Lit40;
    static final SimpleSymbol Lit41;
    static final PairWithPosition Lit42;
    static final PairWithPosition Lit43;
    static final SimpleSymbol Lit44;
    static final FString Lit45;
    static final SimpleSymbol Lit46;
    static final FString Lit47;
    static final SimpleSymbol Lit48;
    static final PairWithPosition Lit49;
    static final SimpleSymbol Lit5;
    static final SimpleSymbol Lit50;
    static final FString Lit51;
    static final SimpleSymbol Lit52;
    static final IntNum Lit53;
    static final FString Lit54;
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
    static final FString Lit65;
    static final SimpleSymbol Lit66;
    static final SimpleSymbol Lit67;
    static final FString Lit68;
    static final IntNum Lit69;
    static final SimpleSymbol Lit7;
    static final FString Lit70;
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
    static final SimpleSymbol Lit80;
    static final SimpleSymbol Lit81;
    static final PairWithPosition Lit82;
    static final SimpleSymbol Lit83;
    static final SimpleSymbol Lit84;
    static final FString Lit85;
    static final SimpleSymbol Lit86;
    static final IntNum Lit87;
    static final IntNum Lit88;
    static final FString Lit89;
    static final SimpleSymbol Lit9;
    static final FString Lit90;
    static final SimpleSymbol Lit91;
    static final FString Lit92;
    static final SimpleSymbol Lit93;
    static final IntNum Lit94;
    static final SimpleSymbol Lit95;
    static final FString Lit96;
    static final SimpleSymbol Lit97;
    static final FString Lit98;
    static final IntNum Lit99;
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

    /* compiled from: Coloring.yail */
    public class frame extends ModuleBody {
        Coloring $main;

        public Object apply3(ModuleMethod moduleMethod, Object obj, Object obj2, Object obj3) {
            return moduleMethod.selector == 45 ? this.$main.DrawingCanvas$Touched(obj, obj2, obj3) : super.apply3(moduleMethod, obj, obj2, obj3);
        }

        public Object applyN(ModuleMethod moduleMethod, Object[] objArr) {
            return moduleMethod.selector == 46 ? this.$main.DrawingCanvas$Dragged(objArr[0], objArr[1], objArr[2], objArr[3], objArr[4], objArr[5], objArr[6]) : super.applyN(moduleMethod, objArr);
        }

        public int match3(ModuleMethod moduleMethod, Object obj, Object obj2, Object obj3, CallContext callContext) {
            if (moduleMethod.selector != 45) {
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
            if (moduleMethod.selector != 46) {
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
                    if (!(obj instanceof Coloring)) {
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
                    if (!(obj instanceof Coloring)) {
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
                    return Coloring.lambda2();
                case SetExp.PROCEDURE /*16*/:
                    this.$main.$define();
                    return Values.empty;
                case Sequence.INT_U8_VALUE /*17*/:
                    return Coloring.lambda3();
                case Sequence.INT_S8_VALUE /*18*/:
                    return Coloring.lambda4();
                case Sequence.INT_U16_VALUE /*19*/:
                    return Coloring.lambda5();
                case Sequence.INT_S16_VALUE /*20*/:
                    return Coloring.lambda6();
                case Sequence.INT_U32_VALUE /*21*/:
                    return Coloring.lambda7();
                case Sequence.INT_S32_VALUE /*22*/:
                    return Coloring.lambda8();
                case Sequence.INT_U64_VALUE /*23*/:
                    return Coloring.lambda9();
                case Sequence.INT_S64_VALUE /*24*/:
                    return Coloring.lambda10();
                case Sequence.FLOAT_VALUE /*25*/:
                    return this.$main.BackButton$Click();
                case Sequence.DOUBLE_VALUE /*26*/:
                    return Coloring.lambda11();
                case Sequence.BOOLEAN_VALUE /*27*/:
                    return Coloring.lambda12();
                case Sequence.TEXT_BYTE_VALUE /*28*/:
                    return this.$main.SaveButton$Click();
                case Sequence.CHAR_VALUE /*29*/:
                    return Coloring.lambda13();
                case XDataType.DAY_TIME_DURATION_TYPE_CODE /*30*/:
                    return Coloring.lambda14();
                case Sequence.CDATA_VALUE /*31*/:
                    return this.$main.LoadButton$Click();
                case SetExp.SET_IF_UNBOUND /*32*/:
                    return Coloring.lambda15();
                case Sequence.ELEMENT_VALUE /*33*/:
                    return Coloring.lambda16();
                case Sequence.DOCUMENT_VALUE /*34*/:
                    return Coloring.lambda17();
                case Sequence.ATTRIBUTE_VALUE /*35*/:
                    return Coloring.lambda18();
                case Sequence.COMMENT_VALUE /*36*/:
                    return this.$main.ButtonSmall$Click();
                case Sequence.PROCESSING_INSTRUCTION_VALUE /*37*/:
                    return Coloring.lambda19();
                case XDataType.STRING_TYPE_CODE /*38*/:
                    return Coloring.lambda20();
                case XDataType.NORMALIZED_STRING_TYPE_CODE /*39*/:
                    return this.$main.ButtonBig$Click();
                case JSONzip.substringLimit /*40*/:
                    return Coloring.lambda21();
                case XDataType.LANGUAGE_TYPE_CODE /*41*/:
                    return Coloring.lambda22();
                case XDataType.NMTOKEN_TYPE_CODE /*42*/:
                    return this.$main.Wipe$Click();
                case XDataType.NAME_TYPE_CODE /*43*/:
                    return Coloring.lambda23();
                case XDataType.NCNAME_TYPE_CODE /*44*/:
                    return Coloring.lambda24();
                case XDataType.ENTITY_TYPE_CODE /*47*/:
                    return Coloring.lambda25();
                case XDataType.UNTYPED_TYPE_CODE /*48*/:
                    return Coloring.lambda26();
                case 49:
                    return Coloring.lambda27();
                case 50:
                    return Coloring.lambda28();
                case 51:
                    return this.$main.Red$Click();
                case 52:
                    return Coloring.lambda29();
                case 53:
                    return Coloring.lambda30();
                case 54:
                    return this.$main.Orange$Click();
                case 55:
                    return Coloring.lambda31();
                case 56:
                    return Coloring.lambda32();
                case 57:
                    return this.$main.Yellow$Click();
                case 58:
                    return Coloring.lambda33();
                case 59:
                    return Coloring.lambda34();
                case 60:
                    return this.$main.Green$Click();
                case 61:
                    return Coloring.lambda35();
                case 62:
                    return Coloring.lambda36();
                case 63:
                    return this.$main.Blue$Click();
                case SetExp.HAS_VALUE /*64*/:
                    return Coloring.lambda37();
                case 65:
                    return Coloring.lambda38();
                case 66:
                    return this.$main.Purple$Click();
                case 67:
                    return Coloring.lambda39();
                case 68:
                    return Coloring.lambda40();
                case 69:
                    return this.$main.Brown$Click();
                case PrettyWriter.NEWLINE_FILL /*70*/:
                    return Coloring.lambda41();
                case 71:
                    return Coloring.lambda42();
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
        Lit156 = (SimpleSymbol) new SimpleSymbol("any").readResolve();
        Lit155 = (SimpleSymbol) new SimpleSymbol("lookup-handler").readResolve();
        Lit154 = (SimpleSymbol) new SimpleSymbol("dispatchEvent").readResolve();
        Lit153 = (SimpleSymbol) new SimpleSymbol("send-error").readResolve();
        Lit152 = (SimpleSymbol) new SimpleSymbol("add-to-form-do-after-creation").readResolve();
        Lit151 = (SimpleSymbol) new SimpleSymbol("add-to-global-vars").readResolve();
        Lit150 = (SimpleSymbol) new SimpleSymbol("add-to-components").readResolve();
        Lit149 = (SimpleSymbol) new SimpleSymbol("add-to-events").readResolve();
        Lit148 = (SimpleSymbol) new SimpleSymbol("add-to-global-var-environment").readResolve();
        Lit147 = (SimpleSymbol) new SimpleSymbol("is-bound-in-form-environment").readResolve();
        Lit146 = (SimpleSymbol) new SimpleSymbol("lookup-in-form-environment").readResolve();
        Lit145 = (SimpleSymbol) new SimpleSymbol("add-to-form-environment").readResolve();
        Lit144 = (SimpleSymbol) new SimpleSymbol("android-log-form").readResolve();
        Lit143 = new FString("com.google.appinventor.components.runtime.FusiontablesControl");
        Lit142 = (SimpleSymbol) new SimpleSymbol("FusiontablesControl1").readResolve();
        Lit141 = new FString("com.google.appinventor.components.runtime.FusiontablesControl");
        Lit140 = new FString("com.google.appinventor.components.runtime.TinyWebDB");
        Lit139 = (SimpleSymbol) new SimpleSymbol("TinyWebDB1").readResolve();
        Lit138 = new FString("com.google.appinventor.components.runtime.TinyWebDB");
        Lit137 = new FString("com.google.appinventor.components.runtime.File");
        Lit136 = (SimpleSymbol) new SimpleSymbol("File1").readResolve();
        Lit135 = new FString("com.google.appinventor.components.runtime.File");
        Lit134 = new FString("com.google.appinventor.components.runtime.TinyDB");
        Lit133 = new FString("com.google.appinventor.components.runtime.TinyDB");
        Lit132 = (SimpleSymbol) new SimpleSymbol("Eraser$Click").readResolve();
        Lit131 = IntNum.make(-1);
        Lit130 = new FString("com.google.appinventor.components.runtime.Button");
        Lit129 = IntNum.make(40);
        Lit128 = IntNum.make(80);
        Lit127 = (SimpleSymbol) new SimpleSymbol("Eraser").readResolve();
        Lit126 = new FString("com.google.appinventor.components.runtime.Button");
        Lit125 = (SimpleSymbol) new SimpleSymbol("Brown$Click").readResolve();
        Lit124 = IntNum.make(-6737152);
        Lit123 = new FString("com.google.appinventor.components.runtime.Button");
        Lit122 = (SimpleSymbol) new SimpleSymbol("Brown").readResolve();
        Lit121 = new FString("com.google.appinventor.components.runtime.Button");
        Lit120 = (SimpleSymbol) new SimpleSymbol("Purple$Click").readResolve();
        Lit119 = IntNum.make(-10092340);
        Lit118 = new FString("com.google.appinventor.components.runtime.Button");
        Lit117 = (SimpleSymbol) new SimpleSymbol("Purple").readResolve();
        Lit116 = new FString("com.google.appinventor.components.runtime.Button");
        Lit115 = (SimpleSymbol) new SimpleSymbol("Blue$Click").readResolve();
        Lit114 = IntNum.make((int) Component.COLOR_BLUE);
        Lit113 = new FString("com.google.appinventor.components.runtime.Button");
        Lit112 = (SimpleSymbol) new SimpleSymbol("Blue").readResolve();
        Lit111 = new FString("com.google.appinventor.components.runtime.Button");
        Lit110 = (SimpleSymbol) new SimpleSymbol("Green$Click").readResolve();
        Lit109 = IntNum.make((int) Component.COLOR_GREEN);
        Lit108 = new FString("com.google.appinventor.components.runtime.Button");
        Lit107 = (SimpleSymbol) new SimpleSymbol("Green").readResolve();
        Lit106 = new FString("com.google.appinventor.components.runtime.Button");
        Lit105 = (SimpleSymbol) new SimpleSymbol("Yellow$Click").readResolve();
        Lit104 = IntNum.make((int) Component.COLOR_YELLOW);
        Lit103 = new FString("com.google.appinventor.components.runtime.Button");
        Lit102 = (SimpleSymbol) new SimpleSymbol("Yellow").readResolve();
        Lit101 = new FString("com.google.appinventor.components.runtime.Button");
        Lit100 = (SimpleSymbol) new SimpleSymbol("Orange$Click").readResolve();
        Lit99 = IntNum.make(-39424);
        Lit98 = new FString("com.google.appinventor.components.runtime.Button");
        Lit97 = (SimpleSymbol) new SimpleSymbol("Orange").readResolve();
        Lit96 = new FString("com.google.appinventor.components.runtime.Button");
        Lit95 = (SimpleSymbol) new SimpleSymbol("Red$Click").readResolve();
        Lit94 = IntNum.make((int) Component.COLOR_RED);
        Lit93 = (SimpleSymbol) new SimpleSymbol("PaintColor").readResolve();
        Lit92 = new FString("com.google.appinventor.components.runtime.Button");
        Lit91 = (SimpleSymbol) new SimpleSymbol("Red").readResolve();
        Lit90 = new FString("com.google.appinventor.components.runtime.Button");
        Lit89 = new FString("com.google.appinventor.components.runtime.HorizontalArrangement");
        Lit88 = IntNum.make(65);
        int[] iArr = new int[2];
        iArr[0] = Component.COLOR_CYAN;
        Lit87 = IntNum.make(iArr);
        Lit86 = (SimpleSymbol) new SimpleSymbol("HorizontalArrangement1").readResolve();
        Lit85 = new FString("com.google.appinventor.components.runtime.HorizontalArrangement");
        Lit84 = (SimpleSymbol) new SimpleSymbol("Dragged").readResolve();
        Lit83 = (SimpleSymbol) new SimpleSymbol("DrawingCanvas$Dragged").readResolve();
        SimpleSymbol simpleSymbol = (SimpleSymbol) new SimpleSymbol("number").readResolve();
        Lit9 = simpleSymbol;
        Lit82 = PairWithPosition.make(simpleSymbol, PairWithPosition.make(Lit9, PairWithPosition.make(Lit9, PairWithPosition.make(Lit9, LList.Empty, "/tmp/1480960185199_0.5906416962059402-0/youngandroidproject/../src/appinventor/ai_aributowsky/TuffyApp/Coloring.yail", 540870), "/tmp/1480960185199_0.5906416962059402-0/youngandroidproject/../src/appinventor/ai_aributowsky/TuffyApp/Coloring.yail", 540863), "/tmp/1480960185199_0.5906416962059402-0/youngandroidproject/../src/appinventor/ai_aributowsky/TuffyApp/Coloring.yail", 540856), "/tmp/1480960185199_0.5906416962059402-0/youngandroidproject/../src/appinventor/ai_aributowsky/TuffyApp/Coloring.yail", 540848);
        Lit81 = (SimpleSymbol) new SimpleSymbol("$currentY").readResolve();
        Lit80 = (SimpleSymbol) new SimpleSymbol("$currentX").readResolve();
        Lit79 = (SimpleSymbol) new SimpleSymbol("$prevY").readResolve();
        Lit78 = (SimpleSymbol) new SimpleSymbol("$prevX").readResolve();
        Lit77 = (SimpleSymbol) new SimpleSymbol("DrawLine").readResolve();
        Lit76 = (SimpleSymbol) new SimpleSymbol("Touched").readResolve();
        Lit75 = (SimpleSymbol) new SimpleSymbol("DrawingCanvas$Touched").readResolve();
        SimpleSymbol simpleSymbol2 = Lit9;
        SimpleSymbol simpleSymbol3 = Lit9;
        SimpleSymbol simpleSymbol4 = Lit9;
        simpleSymbol = (SimpleSymbol) new SimpleSymbol(PropertyTypeConstants.PROPERTY_TYPE_BOOLEAN).readResolve();
        Lit35 = simpleSymbol;
        Lit74 = PairWithPosition.make(simpleSymbol2, PairWithPosition.make(simpleSymbol3, PairWithPosition.make(simpleSymbol4, PairWithPosition.make(simpleSymbol, LList.Empty, "/tmp/1480960185199_0.5906416962059402-0/youngandroidproject/../src/appinventor/ai_aributowsky/TuffyApp/Coloring.yail", 532643), "/tmp/1480960185199_0.5906416962059402-0/youngandroidproject/../src/appinventor/ai_aributowsky/TuffyApp/Coloring.yail", 532636), "/tmp/1480960185199_0.5906416962059402-0/youngandroidproject/../src/appinventor/ai_aributowsky/TuffyApp/Coloring.yail", 532629), "/tmp/1480960185199_0.5906416962059402-0/youngandroidproject/../src/appinventor/ai_aributowsky/TuffyApp/Coloring.yail", 532621);
        Lit73 = (SimpleSymbol) new SimpleSymbol("$y").readResolve();
        Lit72 = (SimpleSymbol) new SimpleSymbol("$x").readResolve();
        Lit71 = (SimpleSymbol) new SimpleSymbol("DrawCircle").readResolve();
        Lit70 = new FString("com.google.appinventor.components.runtime.Canvas");
        Lit69 = IntNum.make(275);
        Lit68 = new FString("com.google.appinventor.components.runtime.Canvas");
        Lit67 = (SimpleSymbol) new SimpleSymbol("Wipe$Click").readResolve();
        Lit66 = (SimpleSymbol) new SimpleSymbol("Clear").readResolve();
        Lit65 = new FString("com.google.appinventor.components.runtime.Button");
        Lit64 = (SimpleSymbol) new SimpleSymbol("Wipe").readResolve();
        Lit63 = new FString("com.google.appinventor.components.runtime.Button");
        Lit62 = (SimpleSymbol) new SimpleSymbol("ButtonBig$Click").readResolve();
        Lit61 = new FString("com.google.appinventor.components.runtime.Button");
        Lit60 = (SimpleSymbol) new SimpleSymbol("ButtonBig").readResolve();
        Lit59 = new FString("com.google.appinventor.components.runtime.Button");
        Lit58 = (SimpleSymbol) new SimpleSymbol("ButtonSmall$Click").readResolve();
        Lit57 = new FString("com.google.appinventor.components.runtime.Button");
        Lit56 = (SimpleSymbol) new SimpleSymbol("ButtonSmall").readResolve();
        Lit55 = new FString("com.google.appinventor.components.runtime.Button");
        Lit54 = new FString("com.google.appinventor.components.runtime.HorizontalArrangement");
        iArr = new int[2];
        iArr[0] = Component.COLOR_CYAN;
        Lit53 = IntNum.make(iArr);
        Lit52 = (SimpleSymbol) new SimpleSymbol("HorizontalArrangement3").readResolve();
        Lit51 = new FString("com.google.appinventor.components.runtime.HorizontalArrangement");
        Lit50 = (SimpleSymbol) new SimpleSymbol("LoadButton$Click").readResolve();
        simpleSymbol = (SimpleSymbol) new SimpleSymbol(PropertyTypeConstants.PROPERTY_TYPE_TEXT).readResolve();
        Lit11 = simpleSymbol;
        Lit49 = PairWithPosition.make(simpleSymbol, PairWithPosition.make(Lit156, LList.Empty, "/tmp/1480960185199_0.5906416962059402-0/youngandroidproject/../src/appinventor/ai_aributowsky/TuffyApp/Coloring.yail", 282779), "/tmp/1480960185199_0.5906416962059402-0/youngandroidproject/../src/appinventor/ai_aributowsky/TuffyApp/Coloring.yail", 282773);
        Lit48 = (SimpleSymbol) new SimpleSymbol("GetValue").readResolve();
        Lit47 = new FString("com.google.appinventor.components.runtime.Button");
        Lit46 = (SimpleSymbol) new SimpleSymbol("LoadButton").readResolve();
        Lit45 = new FString("com.google.appinventor.components.runtime.Button");
        Lit44 = (SimpleSymbol) new SimpleSymbol("SaveButton$Click").readResolve();
        Lit43 = PairWithPosition.make(Lit11, PairWithPosition.make(Lit156, LList.Empty, "/tmp/1480960185199_0.5906416962059402-0/youngandroidproject/../src/appinventor/ai_aributowsky/TuffyApp/Coloring.yail", 229570), "/tmp/1480960185199_0.5906416962059402-0/youngandroidproject/../src/appinventor/ai_aributowsky/TuffyApp/Coloring.yail", 229564);
        Lit42 = PairWithPosition.make(Lit11, LList.Empty, "/tmp/1480960185199_0.5906416962059402-0/youngandroidproject/../src/appinventor/ai_aributowsky/TuffyApp/Coloring.yail", 229554);
        Lit41 = (SimpleSymbol) new SimpleSymbol("SaveAs").readResolve();
        Lit40 = (SimpleSymbol) new SimpleSymbol("DrawingCanvas").readResolve();
        Lit39 = (SimpleSymbol) new SimpleSymbol("StoreValue").readResolve();
        Lit38 = (SimpleSymbol) new SimpleSymbol("TinyDB1").readResolve();
        Lit37 = new FString("com.google.appinventor.components.runtime.Button");
        Lit36 = (SimpleSymbol) new SimpleSymbol("Text").readResolve();
        Lit34 = (SimpleSymbol) new SimpleSymbol("FontBold").readResolve();
        Lit33 = (SimpleSymbol) new SimpleSymbol("SaveButton").readResolve();
        Lit32 = new FString("com.google.appinventor.components.runtime.Button");
        Lit31 = (SimpleSymbol) new SimpleSymbol("Click").readResolve();
        Lit30 = (SimpleSymbol) new SimpleSymbol("BackButton$Click").readResolve();
        Lit29 = PairWithPosition.make(Lit11, LList.Empty, "/tmp/1480960185199_0.5906416962059402-0/youngandroidproject/../src/appinventor/ai_aributowsky/TuffyApp/Coloring.yail", 176209);
        Lit28 = new FString("com.google.appinventor.components.runtime.Button");
        Lit27 = (SimpleSymbol) new SimpleSymbol("Image").readResolve();
        Lit26 = IntNum.make(25);
        Lit25 = (SimpleSymbol) new SimpleSymbol("BackButton").readResolve();
        Lit24 = new FString("com.google.appinventor.components.runtime.Button");
        Lit23 = new FString("com.google.appinventor.components.runtime.HorizontalArrangement");
        Lit22 = IntNum.make(-2);
        Lit21 = (SimpleSymbol) new SimpleSymbol("Width").readResolve();
        Lit20 = IntNum.make(30);
        Lit19 = (SimpleSymbol) new SimpleSymbol("Height").readResolve();
        iArr = new int[2];
        iArr[0] = Component.COLOR_CYAN;
        Lit18 = IntNum.make(iArr);
        Lit17 = (SimpleSymbol) new SimpleSymbol("HorizontalArrangement2").readResolve();
        Lit16 = new FString("com.google.appinventor.components.runtime.HorizontalArrangement");
        Lit15 = (SimpleSymbol) new SimpleSymbol("Title").readResolve();
        Lit14 = (SimpleSymbol) new SimpleSymbol("BackgroundImage").readResolve();
        iArr = new int[2];
        iArr[0] = Component.COLOR_ORANGE;
        Lit13 = IntNum.make(iArr);
        Lit12 = (SimpleSymbol) new SimpleSymbol("BackgroundColor").readResolve();
        Lit10 = (SimpleSymbol) new SimpleSymbol("AppName").readResolve();
        Lit8 = (SimpleSymbol) new SimpleSymbol("AlignHorizontal").readResolve();
        Lit7 = (SimpleSymbol) new SimpleSymbol("g$small").readResolve();
        Lit6 = IntNum.make(8);
        Lit5 = (SimpleSymbol) new SimpleSymbol("g$big").readResolve();
        Lit4 = IntNum.make(2);
        Lit3 = (SimpleSymbol) new SimpleSymbol("g$dotsize").readResolve();
        Lit2 = (SimpleSymbol) new SimpleSymbol("*the-null-value*").readResolve();
        Lit1 = (SimpleSymbol) new SimpleSymbol("getMessage").readResolve();
        Lit0 = (SimpleSymbol) new SimpleSymbol("Coloring").readResolve();
    }

    public Coloring() {
        ModuleInfo.register(this);
        ModuleBody appinventor_ai_aributowsky_TuffyApp_Coloring_frame = new frame();
        appinventor_ai_aributowsky_TuffyApp_Coloring_frame.$main = this;
        this.android$Mnlog$Mnform = new ModuleMethod(appinventor_ai_aributowsky_TuffyApp_Coloring_frame, 1, Lit144, 4097);
        this.add$Mnto$Mnform$Mnenvironment = new ModuleMethod(appinventor_ai_aributowsky_TuffyApp_Coloring_frame, 2, Lit145, 8194);
        this.lookup$Mnin$Mnform$Mnenvironment = new ModuleMethod(appinventor_ai_aributowsky_TuffyApp_Coloring_frame, 3, Lit146, 8193);
        this.is$Mnbound$Mnin$Mnform$Mnenvironment = new ModuleMethod(appinventor_ai_aributowsky_TuffyApp_Coloring_frame, 5, Lit147, 4097);
        this.add$Mnto$Mnglobal$Mnvar$Mnenvironment = new ModuleMethod(appinventor_ai_aributowsky_TuffyApp_Coloring_frame, 6, Lit148, 8194);
        this.add$Mnto$Mnevents = new ModuleMethod(appinventor_ai_aributowsky_TuffyApp_Coloring_frame, 7, Lit149, 8194);
        this.add$Mnto$Mncomponents = new ModuleMethod(appinventor_ai_aributowsky_TuffyApp_Coloring_frame, 8, Lit150, 16388);
        this.add$Mnto$Mnglobal$Mnvars = new ModuleMethod(appinventor_ai_aributowsky_TuffyApp_Coloring_frame, 9, Lit151, 8194);
        this.add$Mnto$Mnform$Mndo$Mnafter$Mncreation = new ModuleMethod(appinventor_ai_aributowsky_TuffyApp_Coloring_frame, 10, Lit152, 4097);
        this.send$Mnerror = new ModuleMethod(appinventor_ai_aributowsky_TuffyApp_Coloring_frame, 11, Lit153, 4097);
        this.process$Mnexception = new ModuleMethod(appinventor_ai_aributowsky_TuffyApp_Coloring_frame, 12, "process-exception", 4097);
        this.dispatchEvent = new ModuleMethod(appinventor_ai_aributowsky_TuffyApp_Coloring_frame, 13, Lit154, 16388);
        this.lookup$Mnhandler = new ModuleMethod(appinventor_ai_aributowsky_TuffyApp_Coloring_frame, 14, Lit155, 8194);
        PropertySet moduleMethod = new ModuleMethod(appinventor_ai_aributowsky_TuffyApp_Coloring_frame, 15, null, 0);
        moduleMethod.setProperty("source-location", "/tmp/runtime1791431272433290597.scm:547");
        lambda$Fn1 = moduleMethod;
        this.$define = new ModuleMethod(appinventor_ai_aributowsky_TuffyApp_Coloring_frame, 16, "$define", 0);
        lambda$Fn2 = new ModuleMethod(appinventor_ai_aributowsky_TuffyApp_Coloring_frame, 17, null, 0);
        lambda$Fn3 = new ModuleMethod(appinventor_ai_aributowsky_TuffyApp_Coloring_frame, 18, null, 0);
        lambda$Fn4 = new ModuleMethod(appinventor_ai_aributowsky_TuffyApp_Coloring_frame, 19, null, 0);
        lambda$Fn5 = new ModuleMethod(appinventor_ai_aributowsky_TuffyApp_Coloring_frame, 20, null, 0);
        lambda$Fn6 = new ModuleMethod(appinventor_ai_aributowsky_TuffyApp_Coloring_frame, 21, null, 0);
        lambda$Fn7 = new ModuleMethod(appinventor_ai_aributowsky_TuffyApp_Coloring_frame, 22, null, 0);
        lambda$Fn8 = new ModuleMethod(appinventor_ai_aributowsky_TuffyApp_Coloring_frame, 23, null, 0);
        lambda$Fn9 = new ModuleMethod(appinventor_ai_aributowsky_TuffyApp_Coloring_frame, 24, null, 0);
        this.BackButton$Click = new ModuleMethod(appinventor_ai_aributowsky_TuffyApp_Coloring_frame, 25, Lit30, 0);
        lambda$Fn10 = new ModuleMethod(appinventor_ai_aributowsky_TuffyApp_Coloring_frame, 26, null, 0);
        lambda$Fn11 = new ModuleMethod(appinventor_ai_aributowsky_TuffyApp_Coloring_frame, 27, null, 0);
        this.SaveButton$Click = new ModuleMethod(appinventor_ai_aributowsky_TuffyApp_Coloring_frame, 28, Lit44, 0);
        lambda$Fn12 = new ModuleMethod(appinventor_ai_aributowsky_TuffyApp_Coloring_frame, 29, null, 0);
        lambda$Fn13 = new ModuleMethod(appinventor_ai_aributowsky_TuffyApp_Coloring_frame, 30, null, 0);
        this.LoadButton$Click = new ModuleMethod(appinventor_ai_aributowsky_TuffyApp_Coloring_frame, 31, Lit50, 0);
        lambda$Fn14 = new ModuleMethod(appinventor_ai_aributowsky_TuffyApp_Coloring_frame, 32, null, 0);
        lambda$Fn15 = new ModuleMethod(appinventor_ai_aributowsky_TuffyApp_Coloring_frame, 33, null, 0);
        lambda$Fn16 = new ModuleMethod(appinventor_ai_aributowsky_TuffyApp_Coloring_frame, 34, null, 0);
        lambda$Fn17 = new ModuleMethod(appinventor_ai_aributowsky_TuffyApp_Coloring_frame, 35, null, 0);
        this.ButtonSmall$Click = new ModuleMethod(appinventor_ai_aributowsky_TuffyApp_Coloring_frame, 36, Lit58, 0);
        lambda$Fn18 = new ModuleMethod(appinventor_ai_aributowsky_TuffyApp_Coloring_frame, 37, null, 0);
        lambda$Fn19 = new ModuleMethod(appinventor_ai_aributowsky_TuffyApp_Coloring_frame, 38, null, 0);
        this.ButtonBig$Click = new ModuleMethod(appinventor_ai_aributowsky_TuffyApp_Coloring_frame, 39, Lit62, 0);
        lambda$Fn20 = new ModuleMethod(appinventor_ai_aributowsky_TuffyApp_Coloring_frame, 40, null, 0);
        lambda$Fn21 = new ModuleMethod(appinventor_ai_aributowsky_TuffyApp_Coloring_frame, 41, null, 0);
        this.Wipe$Click = new ModuleMethod(appinventor_ai_aributowsky_TuffyApp_Coloring_frame, 42, Lit67, 0);
        lambda$Fn22 = new ModuleMethod(appinventor_ai_aributowsky_TuffyApp_Coloring_frame, 43, null, 0);
        lambda$Fn23 = new ModuleMethod(appinventor_ai_aributowsky_TuffyApp_Coloring_frame, 44, null, 0);
        this.DrawingCanvas$Touched = new ModuleMethod(appinventor_ai_aributowsky_TuffyApp_Coloring_frame, 45, Lit75, 12291);
        this.DrawingCanvas$Dragged = new ModuleMethod(appinventor_ai_aributowsky_TuffyApp_Coloring_frame, 46, Lit83, 28679);
        lambda$Fn24 = new ModuleMethod(appinventor_ai_aributowsky_TuffyApp_Coloring_frame, 47, null, 0);
        lambda$Fn25 = new ModuleMethod(appinventor_ai_aributowsky_TuffyApp_Coloring_frame, 48, null, 0);
        lambda$Fn26 = new ModuleMethod(appinventor_ai_aributowsky_TuffyApp_Coloring_frame, 49, null, 0);
        lambda$Fn27 = new ModuleMethod(appinventor_ai_aributowsky_TuffyApp_Coloring_frame, 50, null, 0);
        this.Red$Click = new ModuleMethod(appinventor_ai_aributowsky_TuffyApp_Coloring_frame, 51, Lit95, 0);
        lambda$Fn28 = new ModuleMethod(appinventor_ai_aributowsky_TuffyApp_Coloring_frame, 52, null, 0);
        lambda$Fn29 = new ModuleMethod(appinventor_ai_aributowsky_TuffyApp_Coloring_frame, 53, null, 0);
        this.Orange$Click = new ModuleMethod(appinventor_ai_aributowsky_TuffyApp_Coloring_frame, 54, Lit100, 0);
        lambda$Fn30 = new ModuleMethod(appinventor_ai_aributowsky_TuffyApp_Coloring_frame, 55, null, 0);
        lambda$Fn31 = new ModuleMethod(appinventor_ai_aributowsky_TuffyApp_Coloring_frame, 56, null, 0);
        this.Yellow$Click = new ModuleMethod(appinventor_ai_aributowsky_TuffyApp_Coloring_frame, 57, Lit105, 0);
        lambda$Fn32 = new ModuleMethod(appinventor_ai_aributowsky_TuffyApp_Coloring_frame, 58, null, 0);
        lambda$Fn33 = new ModuleMethod(appinventor_ai_aributowsky_TuffyApp_Coloring_frame, 59, null, 0);
        this.Green$Click = new ModuleMethod(appinventor_ai_aributowsky_TuffyApp_Coloring_frame, 60, Lit110, 0);
        lambda$Fn34 = new ModuleMethod(appinventor_ai_aributowsky_TuffyApp_Coloring_frame, 61, null, 0);
        lambda$Fn35 = new ModuleMethod(appinventor_ai_aributowsky_TuffyApp_Coloring_frame, 62, null, 0);
        this.Blue$Click = new ModuleMethod(appinventor_ai_aributowsky_TuffyApp_Coloring_frame, 63, Lit115, 0);
        lambda$Fn36 = new ModuleMethod(appinventor_ai_aributowsky_TuffyApp_Coloring_frame, 64, null, 0);
        lambda$Fn37 = new ModuleMethod(appinventor_ai_aributowsky_TuffyApp_Coloring_frame, 65, null, 0);
        this.Purple$Click = new ModuleMethod(appinventor_ai_aributowsky_TuffyApp_Coloring_frame, 66, Lit120, 0);
        lambda$Fn38 = new ModuleMethod(appinventor_ai_aributowsky_TuffyApp_Coloring_frame, 67, null, 0);
        lambda$Fn39 = new ModuleMethod(appinventor_ai_aributowsky_TuffyApp_Coloring_frame, 68, null, 0);
        this.Brown$Click = new ModuleMethod(appinventor_ai_aributowsky_TuffyApp_Coloring_frame, 69, Lit125, 0);
        lambda$Fn40 = new ModuleMethod(appinventor_ai_aributowsky_TuffyApp_Coloring_frame, 70, null, 0);
        lambda$Fn41 = new ModuleMethod(appinventor_ai_aributowsky_TuffyApp_Coloring_frame, 71, null, 0);
        this.Eraser$Click = new ModuleMethod(appinventor_ai_aributowsky_TuffyApp_Coloring_frame, 72, Lit132, 0);
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
            Coloring = null;
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
                    runtime.setAndCoerceProperty$Ex(Lit0, Lit8, Lit4, Lit9);
                    runtime.setAndCoerceProperty$Ex(Lit0, Lit10, "TuffyApp", Lit11);
                    runtime.setAndCoerceProperty$Ex(Lit0, Lit12, Lit13, Lit9);
                    runtime.setAndCoerceProperty$Ex(Lit0, Lit14, "background_color.png", Lit11);
                    Values.writeValues(runtime.setAndCoerceProperty$Ex(Lit0, Lit15, "Picture1", Lit11), $result);
                } else {
                    addToFormDoAfterCreation(new Promise(lambda$Fn5));
                }
                this.HorizontalArrangement2 = null;
                if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
                    Values.writeValues(runtime.addComponentWithinRepl(Lit0, Lit16, Lit17, lambda$Fn6), $result);
                } else {
                    addToComponents(Lit0, Lit23, Lit17, lambda$Fn7);
                }
                this.BackButton = null;
                if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
                    Values.writeValues(runtime.addComponentWithinRepl(Lit17, Lit24, Lit25, lambda$Fn8), $result);
                } else {
                    addToComponents(Lit17, Lit28, Lit25, lambda$Fn9);
                }
                if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
                    runtime.addToCurrentFormEnvironment(Lit30, this.BackButton$Click);
                } else {
                    addToFormEnvironment(Lit30, this.BackButton$Click);
                }
                if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
                    EventDispatcher.registerEventForDelegation((HandlesEventDispatching) runtime.$Stthis$Mnform$St, "BackButton", "Click");
                } else {
                    addToEvents(Lit25, Lit31);
                }
                this.SaveButton = null;
                if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
                    Values.writeValues(runtime.addComponentWithinRepl(Lit17, Lit32, Lit33, lambda$Fn10), $result);
                } else {
                    addToComponents(Lit17, Lit37, Lit33, lambda$Fn11);
                }
                if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
                    runtime.addToCurrentFormEnvironment(Lit44, this.SaveButton$Click);
                } else {
                    addToFormEnvironment(Lit44, this.SaveButton$Click);
                }
                if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
                    EventDispatcher.registerEventForDelegation((HandlesEventDispatching) runtime.$Stthis$Mnform$St, "SaveButton", "Click");
                } else {
                    addToEvents(Lit33, Lit31);
                }
                this.LoadButton = null;
                if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
                    Values.writeValues(runtime.addComponentWithinRepl(Lit17, Lit45, Lit46, lambda$Fn12), $result);
                } else {
                    addToComponents(Lit17, Lit47, Lit46, lambda$Fn13);
                }
                if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
                    runtime.addToCurrentFormEnvironment(Lit50, this.LoadButton$Click);
                } else {
                    addToFormEnvironment(Lit50, this.LoadButton$Click);
                }
                if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
                    EventDispatcher.registerEventForDelegation((HandlesEventDispatching) runtime.$Stthis$Mnform$St, "LoadButton", "Click");
                } else {
                    addToEvents(Lit46, Lit31);
                }
                this.HorizontalArrangement3 = null;
                if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
                    Values.writeValues(runtime.addComponentWithinRepl(Lit0, Lit51, Lit52, lambda$Fn14), $result);
                } else {
                    addToComponents(Lit0, Lit54, Lit52, lambda$Fn15);
                }
                this.ButtonSmall = null;
                if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
                    Values.writeValues(runtime.addComponentWithinRepl(Lit52, Lit55, Lit56, lambda$Fn16), $result);
                } else {
                    addToComponents(Lit52, Lit57, Lit56, lambda$Fn17);
                }
                if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
                    runtime.addToCurrentFormEnvironment(Lit58, this.ButtonSmall$Click);
                } else {
                    addToFormEnvironment(Lit58, this.ButtonSmall$Click);
                }
                if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
                    EventDispatcher.registerEventForDelegation((HandlesEventDispatching) runtime.$Stthis$Mnform$St, "ButtonSmall", "Click");
                } else {
                    addToEvents(Lit56, Lit31);
                }
                this.ButtonBig = null;
                if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
                    Values.writeValues(runtime.addComponentWithinRepl(Lit52, Lit59, Lit60, lambda$Fn18), $result);
                } else {
                    addToComponents(Lit52, Lit61, Lit60, lambda$Fn19);
                }
                if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
                    runtime.addToCurrentFormEnvironment(Lit62, this.ButtonBig$Click);
                } else {
                    addToFormEnvironment(Lit62, this.ButtonBig$Click);
                }
                if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
                    EventDispatcher.registerEventForDelegation((HandlesEventDispatching) runtime.$Stthis$Mnform$St, "ButtonBig", "Click");
                } else {
                    addToEvents(Lit60, Lit31);
                }
                this.Wipe = null;
                if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
                    Values.writeValues(runtime.addComponentWithinRepl(Lit52, Lit63, Lit64, lambda$Fn20), $result);
                } else {
                    addToComponents(Lit52, Lit65, Lit64, lambda$Fn21);
                }
                if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
                    runtime.addToCurrentFormEnvironment(Lit67, this.Wipe$Click);
                } else {
                    addToFormEnvironment(Lit67, this.Wipe$Click);
                }
                if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
                    EventDispatcher.registerEventForDelegation((HandlesEventDispatching) runtime.$Stthis$Mnform$St, "Wipe", "Click");
                } else {
                    addToEvents(Lit64, Lit31);
                }
                this.DrawingCanvas = null;
                if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
                    Values.writeValues(runtime.addComponentWithinRepl(Lit0, Lit68, Lit40, lambda$Fn22), $result);
                } else {
                    addToComponents(Lit0, Lit70, Lit40, lambda$Fn23);
                }
                if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
                    runtime.addToCurrentFormEnvironment(Lit75, this.DrawingCanvas$Touched);
                } else {
                    addToFormEnvironment(Lit75, this.DrawingCanvas$Touched);
                }
                if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
                    EventDispatcher.registerEventForDelegation((HandlesEventDispatching) runtime.$Stthis$Mnform$St, "DrawingCanvas", "Touched");
                } else {
                    addToEvents(Lit40, Lit76);
                }
                if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
                    runtime.addToCurrentFormEnvironment(Lit83, this.DrawingCanvas$Dragged);
                } else {
                    addToFormEnvironment(Lit83, this.DrawingCanvas$Dragged);
                }
                if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
                    EventDispatcher.registerEventForDelegation((HandlesEventDispatching) runtime.$Stthis$Mnform$St, "DrawingCanvas", "Dragged");
                } else {
                    addToEvents(Lit40, Lit84);
                }
                this.HorizontalArrangement1 = null;
                if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
                    Values.writeValues(runtime.addComponentWithinRepl(Lit0, Lit85, Lit86, lambda$Fn24), $result);
                } else {
                    addToComponents(Lit0, Lit89, Lit86, lambda$Fn25);
                }
                this.Red = null;
                if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
                    Values.writeValues(runtime.addComponentWithinRepl(Lit86, Lit90, Lit91, lambda$Fn26), $result);
                } else {
                    addToComponents(Lit86, Lit92, Lit91, lambda$Fn27);
                }
                if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
                    runtime.addToCurrentFormEnvironment(Lit95, this.Red$Click);
                } else {
                    addToFormEnvironment(Lit95, this.Red$Click);
                }
                if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
                    EventDispatcher.registerEventForDelegation((HandlesEventDispatching) runtime.$Stthis$Mnform$St, "Red", "Click");
                } else {
                    addToEvents(Lit91, Lit31);
                }
                this.Orange = null;
                if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
                    Values.writeValues(runtime.addComponentWithinRepl(Lit86, Lit96, Lit97, lambda$Fn28), $result);
                } else {
                    addToComponents(Lit86, Lit98, Lit97, lambda$Fn29);
                }
                if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
                    runtime.addToCurrentFormEnvironment(Lit100, this.Orange$Click);
                } else {
                    addToFormEnvironment(Lit100, this.Orange$Click);
                }
                if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
                    EventDispatcher.registerEventForDelegation((HandlesEventDispatching) runtime.$Stthis$Mnform$St, "Orange", "Click");
                } else {
                    addToEvents(Lit97, Lit31);
                }
                this.Yellow = null;
                if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
                    Values.writeValues(runtime.addComponentWithinRepl(Lit86, Lit101, Lit102, lambda$Fn30), $result);
                } else {
                    addToComponents(Lit86, Lit103, Lit102, lambda$Fn31);
                }
                if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
                    runtime.addToCurrentFormEnvironment(Lit105, this.Yellow$Click);
                } else {
                    addToFormEnvironment(Lit105, this.Yellow$Click);
                }
                if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
                    EventDispatcher.registerEventForDelegation((HandlesEventDispatching) runtime.$Stthis$Mnform$St, "Yellow", "Click");
                } else {
                    addToEvents(Lit102, Lit31);
                }
                this.Green = null;
                if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
                    Values.writeValues(runtime.addComponentWithinRepl(Lit86, Lit106, Lit107, lambda$Fn32), $result);
                } else {
                    addToComponents(Lit86, Lit108, Lit107, lambda$Fn33);
                }
                if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
                    runtime.addToCurrentFormEnvironment(Lit110, this.Green$Click);
                } else {
                    addToFormEnvironment(Lit110, this.Green$Click);
                }
                if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
                    EventDispatcher.registerEventForDelegation((HandlesEventDispatching) runtime.$Stthis$Mnform$St, "Green", "Click");
                } else {
                    addToEvents(Lit107, Lit31);
                }
                this.Blue = null;
                if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
                    Values.writeValues(runtime.addComponentWithinRepl(Lit86, Lit111, Lit112, lambda$Fn34), $result);
                } else {
                    addToComponents(Lit86, Lit113, Lit112, lambda$Fn35);
                }
                if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
                    runtime.addToCurrentFormEnvironment(Lit115, this.Blue$Click);
                } else {
                    addToFormEnvironment(Lit115, this.Blue$Click);
                }
                if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
                    EventDispatcher.registerEventForDelegation((HandlesEventDispatching) runtime.$Stthis$Mnform$St, "Blue", "Click");
                } else {
                    addToEvents(Lit112, Lit31);
                }
                this.Purple = null;
                if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
                    Values.writeValues(runtime.addComponentWithinRepl(Lit86, Lit116, Lit117, lambda$Fn36), $result);
                } else {
                    addToComponents(Lit86, Lit118, Lit117, lambda$Fn37);
                }
                if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
                    runtime.addToCurrentFormEnvironment(Lit120, this.Purple$Click);
                } else {
                    addToFormEnvironment(Lit120, this.Purple$Click);
                }
                if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
                    EventDispatcher.registerEventForDelegation((HandlesEventDispatching) runtime.$Stthis$Mnform$St, "Purple", "Click");
                } else {
                    addToEvents(Lit117, Lit31);
                }
                this.Brown = null;
                if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
                    Values.writeValues(runtime.addComponentWithinRepl(Lit86, Lit121, Lit122, lambda$Fn38), $result);
                } else {
                    addToComponents(Lit86, Lit123, Lit122, lambda$Fn39);
                }
                if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
                    runtime.addToCurrentFormEnvironment(Lit125, this.Brown$Click);
                } else {
                    addToFormEnvironment(Lit125, this.Brown$Click);
                }
                if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
                    EventDispatcher.registerEventForDelegation((HandlesEventDispatching) runtime.$Stthis$Mnform$St, "Brown", "Click");
                } else {
                    addToEvents(Lit122, Lit31);
                }
                this.Eraser = null;
                if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
                    Values.writeValues(runtime.addComponentWithinRepl(Lit86, Lit126, Lit127, lambda$Fn40), $result);
                } else {
                    addToComponents(Lit86, Lit130, Lit127, lambda$Fn41);
                }
                if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
                    runtime.addToCurrentFormEnvironment(Lit132, this.Eraser$Click);
                } else {
                    addToFormEnvironment(Lit132, this.Eraser$Click);
                }
                if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
                    EventDispatcher.registerEventForDelegation((HandlesEventDispatching) runtime.$Stthis$Mnform$St, "Eraser", "Click");
                } else {
                    addToEvents(Lit127, Lit31);
                }
                this.TinyDB1 = null;
                if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
                    Values.writeValues(runtime.addComponentWithinRepl(Lit0, Lit133, Lit38, Boolean.FALSE), $result);
                } else {
                    addToComponents(Lit0, Lit134, Lit38, Boolean.FALSE);
                }
                this.File1 = null;
                if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
                    Values.writeValues(runtime.addComponentWithinRepl(Lit0, Lit135, Lit136, Boolean.FALSE), $result);
                } else {
                    addToComponents(Lit0, Lit137, Lit136, Boolean.FALSE);
                }
                this.TinyWebDB1 = null;
                if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
                    Values.writeValues(runtime.addComponentWithinRepl(Lit0, Lit138, Lit139, Boolean.FALSE), $result);
                } else {
                    addToComponents(Lit0, Lit140, Lit139, Boolean.FALSE);
                }
                this.FusiontablesControl1 = null;
                if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
                    Values.writeValues(runtime.addComponentWithinRepl(Lit0, Lit141, Lit142, Boolean.FALSE), $result);
                } else {
                    addToComponents(Lit0, Lit143, Lit142, Boolean.FALSE);
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
        runtime.setAndCoerceProperty$Ex(Lit0, Lit8, Lit4, Lit9);
        runtime.setAndCoerceProperty$Ex(Lit0, Lit10, "TuffyApp", Lit11);
        runtime.setAndCoerceProperty$Ex(Lit0, Lit12, Lit13, Lit9);
        runtime.setAndCoerceProperty$Ex(Lit0, Lit14, "background_color.png", Lit11);
        return runtime.setAndCoerceProperty$Ex(Lit0, Lit15, "Picture1", Lit11);
    }

    static Object lambda7() {
        runtime.setAndCoerceProperty$Ex(Lit17, Lit12, Lit18, Lit9);
        runtime.setAndCoerceProperty$Ex(Lit17, Lit19, Lit20, Lit9);
        return runtime.setAndCoerceProperty$Ex(Lit17, Lit21, Lit22, Lit9);
    }

    static Object lambda8() {
        runtime.setAndCoerceProperty$Ex(Lit17, Lit12, Lit18, Lit9);
        runtime.setAndCoerceProperty$Ex(Lit17, Lit19, Lit20, Lit9);
        return runtime.setAndCoerceProperty$Ex(Lit17, Lit21, Lit22, Lit9);
    }

    static Object lambda10() {
        runtime.setAndCoerceProperty$Ex(Lit25, Lit19, Lit26, Lit9);
        runtime.setAndCoerceProperty$Ex(Lit25, Lit21, Lit22, Lit9);
        return runtime.setAndCoerceProperty$Ex(Lit25, Lit27, "back_button.png", Lit11);
    }

    static Object lambda9() {
        runtime.setAndCoerceProperty$Ex(Lit25, Lit19, Lit26, Lit9);
        runtime.setAndCoerceProperty$Ex(Lit25, Lit21, Lit22, Lit9);
        return runtime.setAndCoerceProperty$Ex(Lit25, Lit27, "back_button.png", Lit11);
    }

    public Object BackButton$Click() {
        runtime.setThisForm();
        return runtime.callYailPrimitive(runtime.open$Mnanother$Mnscreen, LList.list1("GameScreen"), Lit29, "open another screen");
    }

    static Object lambda11() {
        runtime.setAndCoerceProperty$Ex(Lit33, Lit34, Boolean.TRUE, Lit35);
        runtime.setAndCoerceProperty$Ex(Lit33, Lit21, Lit22, Lit9);
        return runtime.setAndCoerceProperty$Ex(Lit33, Lit36, "Save Picture", Lit11);
    }

    static Object lambda12() {
        runtime.setAndCoerceProperty$Ex(Lit33, Lit34, Boolean.TRUE, Lit35);
        runtime.setAndCoerceProperty$Ex(Lit33, Lit21, Lit22, Lit9);
        return runtime.setAndCoerceProperty$Ex(Lit33, Lit36, "Save Picture", Lit11);
    }

    public Object SaveButton$Click() {
        runtime.setThisForm();
        return runtime.callComponentMethod(Lit38, Lit39, LList.list2("MyPicture - One", runtime.callComponentMethod(Lit40, Lit41, LList.list1("MyPicture - One.png"), Lit42)), Lit43);
    }

    static Object lambda13() {
        runtime.setAndCoerceProperty$Ex(Lit46, Lit34, Boolean.TRUE, Lit35);
        runtime.setAndCoerceProperty$Ex(Lit46, Lit21, Lit22, Lit9);
        return runtime.setAndCoerceProperty$Ex(Lit46, Lit36, "Load Picture", Lit11);
    }

    static Object lambda14() {
        runtime.setAndCoerceProperty$Ex(Lit46, Lit34, Boolean.TRUE, Lit35);
        runtime.setAndCoerceProperty$Ex(Lit46, Lit21, Lit22, Lit9);
        return runtime.setAndCoerceProperty$Ex(Lit46, Lit36, "Load Picture", Lit11);
    }

    public Object LoadButton$Click() {
        runtime.setThisForm();
        return runtime.setAndCoerceProperty$Ex(Lit40, Lit14, runtime.callComponentMethod(Lit38, Lit48, LList.list2("MyPicture - One", ElementType.MATCH_ANY_LOCALNAME), Lit49), Lit11);
    }

    static Object lambda15() {
        runtime.setAndCoerceProperty$Ex(Lit52, Lit12, Lit53, Lit9);
        return runtime.setAndCoerceProperty$Ex(Lit52, Lit21, Lit22, Lit9);
    }

    static Object lambda16() {
        runtime.setAndCoerceProperty$Ex(Lit52, Lit12, Lit53, Lit9);
        return runtime.setAndCoerceProperty$Ex(Lit52, Lit21, Lit22, Lit9);
    }

    static Object lambda17() {
        runtime.setAndCoerceProperty$Ex(Lit56, Lit34, Boolean.TRUE, Lit35);
        runtime.setAndCoerceProperty$Ex(Lit56, Lit21, Lit22, Lit9);
        return runtime.setAndCoerceProperty$Ex(Lit56, Lit36, "Small Dots", Lit11);
    }

    static Object lambda18() {
        runtime.setAndCoerceProperty$Ex(Lit56, Lit34, Boolean.TRUE, Lit35);
        runtime.setAndCoerceProperty$Ex(Lit56, Lit21, Lit22, Lit9);
        return runtime.setAndCoerceProperty$Ex(Lit56, Lit36, "Small Dots", Lit11);
    }

    public Object ButtonSmall$Click() {
        runtime.setThisForm();
        return runtime.addGlobalVarToCurrentFormEnvironment(Lit3, runtime.lookupGlobalVarInCurrentFormEnvironment(Lit7, runtime.$Stthe$Mnnull$Mnvalue$St));
    }

    static Object lambda19() {
        runtime.setAndCoerceProperty$Ex(Lit60, Lit34, Boolean.TRUE, Lit35);
        runtime.setAndCoerceProperty$Ex(Lit60, Lit21, Lit22, Lit9);
        return runtime.setAndCoerceProperty$Ex(Lit60, Lit36, "Big Dots", Lit11);
    }

    static Object lambda20() {
        runtime.setAndCoerceProperty$Ex(Lit60, Lit34, Boolean.TRUE, Lit35);
        runtime.setAndCoerceProperty$Ex(Lit60, Lit21, Lit22, Lit9);
        return runtime.setAndCoerceProperty$Ex(Lit60, Lit36, "Big Dots", Lit11);
    }

    public Object ButtonBig$Click() {
        runtime.setThisForm();
        return runtime.addGlobalVarToCurrentFormEnvironment(Lit3, runtime.lookupGlobalVarInCurrentFormEnvironment(Lit5, runtime.$Stthe$Mnnull$Mnvalue$St));
    }

    static Object lambda21() {
        runtime.setAndCoerceProperty$Ex(Lit64, Lit34, Boolean.TRUE, Lit35);
        runtime.setAndCoerceProperty$Ex(Lit64, Lit21, Lit22, Lit9);
        return runtime.setAndCoerceProperty$Ex(Lit64, Lit36, "Wipe", Lit11);
    }

    static Object lambda22() {
        runtime.setAndCoerceProperty$Ex(Lit64, Lit34, Boolean.TRUE, Lit35);
        runtime.setAndCoerceProperty$Ex(Lit64, Lit21, Lit22, Lit9);
        return runtime.setAndCoerceProperty$Ex(Lit64, Lit36, "Wipe", Lit11);
    }

    public Object Wipe$Click() {
        runtime.setThisForm();
        runtime.callComponentMethod(Lit40, Lit66, LList.Empty, LList.Empty);
        return runtime.setAndCoerceProperty$Ex(Lit40, Lit14, ElementType.MATCH_ANY_LOCALNAME, Lit11);
    }

    static Object lambda23() {
        runtime.setAndCoerceProperty$Ex(Lit40, Lit14, "coloring1.png", Lit11);
        runtime.setAndCoerceProperty$Ex(Lit40, Lit19, Lit69, Lit9);
        return runtime.setAndCoerceProperty$Ex(Lit40, Lit21, Lit22, Lit9);
    }

    static Object lambda24() {
        runtime.setAndCoerceProperty$Ex(Lit40, Lit14, "coloring1.png", Lit11);
        runtime.setAndCoerceProperty$Ex(Lit40, Lit19, Lit69, Lit9);
        return runtime.setAndCoerceProperty$Ex(Lit40, Lit21, Lit22, Lit9);
    }

    public Object DrawingCanvas$Touched(Object $x, Object $y, Object $touchedAnySprite) {
        $x = runtime.sanitizeComponentData($x);
        $y = runtime.sanitizeComponentData($y);
        runtime.sanitizeComponentData($touchedAnySprite);
        runtime.setThisForm();
        SimpleSymbol simpleSymbol = Lit40;
        SimpleSymbol simpleSymbol2 = Lit71;
        if ($x instanceof Package) {
            $x = runtime.signalRuntimeError(strings.stringAppend("The variable ", ((Procedure) runtime.get$Mndisplay$Mnrepresentation).apply1(Lit72), " is not bound in the current context"), "Unbound Variable");
        }
        if ($y instanceof Package) {
            $y = runtime.signalRuntimeError(strings.stringAppend("The variable ", ((Procedure) runtime.get$Mndisplay$Mnrepresentation).apply1(Lit73), " is not bound in the current context"), "Unbound Variable");
        }
        return runtime.callComponentMethod(simpleSymbol, simpleSymbol2, LList.list4($x, $y, runtime.lookupGlobalVarInCurrentFormEnvironment(Lit3, runtime.$Stthe$Mnnull$Mnvalue$St), Boolean.TRUE), Lit74);
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
        SimpleSymbol simpleSymbol = Lit40;
        SimpleSymbol simpleSymbol2 = Lit77;
        if ($prevX instanceof Package) {
            $prevX = runtime.signalRuntimeError(strings.stringAppend("The variable ", ((Procedure) runtime.get$Mndisplay$Mnrepresentation).apply1(Lit78), " is not bound in the current context"), "Unbound Variable");
        }
        if ($prevY instanceof Package) {
            $prevY = runtime.signalRuntimeError(strings.stringAppend("The variable ", ((Procedure) runtime.get$Mndisplay$Mnrepresentation).apply1(Lit79), " is not bound in the current context"), "Unbound Variable");
        }
        if ($currentX instanceof Package) {
            $currentX = runtime.signalRuntimeError(strings.stringAppend("The variable ", ((Procedure) runtime.get$Mndisplay$Mnrepresentation).apply1(Lit80), " is not bound in the current context"), "Unbound Variable");
        }
        if ($currentY instanceof Package) {
            $currentY = runtime.signalRuntimeError(strings.stringAppend("The variable ", ((Procedure) runtime.get$Mndisplay$Mnrepresentation).apply1(Lit81), " is not bound in the current context"), "Unbound Variable");
        }
        return runtime.callComponentMethod(simpleSymbol, simpleSymbol2, LList.list4($prevX, $prevY, $currentX, $currentY), Lit82);
    }

    static Object lambda25() {
        runtime.setAndCoerceProperty$Ex(Lit86, Lit12, Lit87, Lit9);
        runtime.setAndCoerceProperty$Ex(Lit86, Lit19, Lit88, Lit9);
        return runtime.setAndCoerceProperty$Ex(Lit86, Lit21, Lit22, Lit9);
    }

    static Object lambda26() {
        runtime.setAndCoerceProperty$Ex(Lit86, Lit12, Lit87, Lit9);
        runtime.setAndCoerceProperty$Ex(Lit86, Lit19, Lit88, Lit9);
        return runtime.setAndCoerceProperty$Ex(Lit86, Lit21, Lit22, Lit9);
    }

    static Object lambda27() {
        runtime.setAndCoerceProperty$Ex(Lit91, Lit21, Lit20, Lit9);
        return runtime.setAndCoerceProperty$Ex(Lit91, Lit27, "color_red-vertical.png", Lit11);
    }

    static Object lambda28() {
        runtime.setAndCoerceProperty$Ex(Lit91, Lit21, Lit20, Lit9);
        return runtime.setAndCoerceProperty$Ex(Lit91, Lit27, "color_red-vertical.png", Lit11);
    }

    public Object Red$Click() {
        runtime.setThisForm();
        return runtime.setAndCoerceProperty$Ex(Lit40, Lit93, Lit94, Lit9);
    }

    static Object lambda29() {
        runtime.setAndCoerceProperty$Ex(Lit97, Lit21, Lit20, Lit9);
        return runtime.setAndCoerceProperty$Ex(Lit97, Lit27, "color_orange-vertical.png", Lit11);
    }

    static Object lambda30() {
        runtime.setAndCoerceProperty$Ex(Lit97, Lit21, Lit20, Lit9);
        return runtime.setAndCoerceProperty$Ex(Lit97, Lit27, "color_orange-vertical.png", Lit11);
    }

    public Object Orange$Click() {
        runtime.setThisForm();
        return runtime.setAndCoerceProperty$Ex(Lit40, Lit93, Lit99, Lit9);
    }

    static Object lambda31() {
        runtime.setAndCoerceProperty$Ex(Lit102, Lit21, Lit20, Lit9);
        return runtime.setAndCoerceProperty$Ex(Lit102, Lit27, "color_yellow-vertical.png", Lit11);
    }

    static Object lambda32() {
        runtime.setAndCoerceProperty$Ex(Lit102, Lit21, Lit20, Lit9);
        return runtime.setAndCoerceProperty$Ex(Lit102, Lit27, "color_yellow-vertical.png", Lit11);
    }

    public Object Yellow$Click() {
        runtime.setThisForm();
        return runtime.setAndCoerceProperty$Ex(Lit40, Lit93, Lit104, Lit9);
    }

    static Object lambda33() {
        runtime.setAndCoerceProperty$Ex(Lit107, Lit21, Lit20, Lit9);
        return runtime.setAndCoerceProperty$Ex(Lit107, Lit27, "color_green-vertical.png", Lit11);
    }

    static Object lambda34() {
        runtime.setAndCoerceProperty$Ex(Lit107, Lit21, Lit20, Lit9);
        return runtime.setAndCoerceProperty$Ex(Lit107, Lit27, "color_green-vertical.png", Lit11);
    }

    public Object Green$Click() {
        runtime.setThisForm();
        return runtime.setAndCoerceProperty$Ex(Lit40, Lit93, Lit109, Lit9);
    }

    static Object lambda35() {
        runtime.setAndCoerceProperty$Ex(Lit112, Lit21, Lit20, Lit9);
        return runtime.setAndCoerceProperty$Ex(Lit112, Lit27, "color_blue-vertical.png", Lit11);
    }

    static Object lambda36() {
        runtime.setAndCoerceProperty$Ex(Lit112, Lit21, Lit20, Lit9);
        return runtime.setAndCoerceProperty$Ex(Lit112, Lit27, "color_blue-vertical.png", Lit11);
    }

    public Object Blue$Click() {
        runtime.setThisForm();
        return runtime.setAndCoerceProperty$Ex(Lit40, Lit93, Lit114, Lit9);
    }

    static Object lambda37() {
        runtime.setAndCoerceProperty$Ex(Lit117, Lit21, Lit20, Lit9);
        return runtime.setAndCoerceProperty$Ex(Lit117, Lit27, "color_purple-vertical.png", Lit11);
    }

    static Object lambda38() {
        runtime.setAndCoerceProperty$Ex(Lit117, Lit21, Lit20, Lit9);
        return runtime.setAndCoerceProperty$Ex(Lit117, Lit27, "color_purple-vertical.png", Lit11);
    }

    public Object Purple$Click() {
        runtime.setThisForm();
        return runtime.setAndCoerceProperty$Ex(Lit40, Lit93, Lit119, Lit9);
    }

    static Object lambda39() {
        runtime.setAndCoerceProperty$Ex(Lit122, Lit21, Lit20, Lit9);
        return runtime.setAndCoerceProperty$Ex(Lit122, Lit27, "color_brown-vertical.png", Lit11);
    }

    static Object lambda40() {
        runtime.setAndCoerceProperty$Ex(Lit122, Lit21, Lit20, Lit9);
        return runtime.setAndCoerceProperty$Ex(Lit122, Lit27, "color_brown-vertical.png", Lit11);
    }

    public Object Brown$Click() {
        runtime.setThisForm();
        return runtime.setAndCoerceProperty$Ex(Lit40, Lit93, Lit124, Lit9);
    }

    static Object lambda41() {
        runtime.setAndCoerceProperty$Ex(Lit127, Lit19, Lit128, Lit9);
        runtime.setAndCoerceProperty$Ex(Lit127, Lit21, Lit129, Lit9);
        return runtime.setAndCoerceProperty$Ex(Lit127, Lit27, "eraser.png", Lit11);
    }

    static Object lambda42() {
        runtime.setAndCoerceProperty$Ex(Lit127, Lit19, Lit128, Lit9);
        runtime.setAndCoerceProperty$Ex(Lit127, Lit21, Lit129, Lit9);
        return runtime.setAndCoerceProperty$Ex(Lit127, Lit27, "eraser.png", Lit11);
    }

    public Object Eraser$Click() {
        runtime.setThisForm();
        return runtime.setAndCoerceProperty$Ex(Lit40, Lit93, Lit131, Lit9);
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
        Coloring = this;
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
        Coloring closureEnv = this;
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
