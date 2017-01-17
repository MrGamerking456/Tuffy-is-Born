package appinventor.ai_aributowsky.TuffyApp;

import com.google.appinventor.components.common.PropertyTypeConstants;
import com.google.appinventor.components.runtime.ActivityStarter;
import com.google.appinventor.components.runtime.Button;
import com.google.appinventor.components.runtime.Component;
import com.google.appinventor.components.runtime.EventDispatcher;
import com.google.appinventor.components.runtime.Form;
import com.google.appinventor.components.runtime.HandlesEventDispatching;
import com.google.appinventor.components.runtime.HorizontalArrangement;
import com.google.appinventor.components.runtime.Label;
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
import gnu.text.PrettyWriter;
import kawa.lang.Promise;
import kawa.lib.lists;
import kawa.lib.misc;
import kawa.lib.strings;
import kawa.standard.Scheme;
import kawa.standard.require;
import org.json.zip.JSONzip;
import android.app.Activity;
/* compiled from: AboutPage.yail */

    public class AboutPage extends Activity, Form implements Runnable {
        public static AboutPage AboutPage;
        static final SimpleSymbol Lit0;
        static final SimpleSymbol Lit1;
        static final SimpleSymbol Lit10;
        static final FString Lit100;
        static final FString Lit101;
        static final FString Lit102;
        static final FString Lit103;
        static final FString Lit104;
        static final FString Lit105;
        static final SimpleSymbol Lit106;
        static final FString Lit107;
        static final FString Lit108;
        static final SimpleSymbol Lit109;
        static final SimpleSymbol Lit11;
        static final FString Lit110;
        static final FString Lit111;
        static final SimpleSymbol Lit112;
        static final FString Lit113;
        static final FString Lit114;
        static final FString Lit115;
        static final FString Lit116;
        static final SimpleSymbol Lit117;
        static final FString Lit118;
        static final SimpleSymbol Lit119;
        static final IntNum Lit12;
        static final SimpleSymbol Lit120;
        static final SimpleSymbol Lit121;
        static final SimpleSymbol Lit122;
        static final SimpleSymbol Lit123;
        static final SimpleSymbol Lit124;
        static final SimpleSymbol Lit125;
        static final SimpleSymbol Lit126;
        static final SimpleSymbol Lit127;
        static final SimpleSymbol Lit128;
        static final SimpleSymbol Lit129;
        static final SimpleSymbol Lit13;
        static final SimpleSymbol Lit130;
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
        static final IntNum Lit23;
        static final FString Lit24;
        static final FString Lit25;
        static final SimpleSymbol Lit26;
        static final SimpleSymbol Lit27;
        static final SimpleSymbol Lit28;
        static final SimpleSymbol Lit29;
        static final SimpleSymbol Lit3;
        static final IntNum Lit30;
        static final SimpleSymbol Lit31;
        static final FString Lit32;
        static final FString Lit33;
        static final SimpleSymbol Lit34;
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
        static final IntNum Lit65;
        static final FString Lit66;
        static final SimpleSymbol Lit67;
        static final SimpleSymbol Lit68;
        static final SimpleSymbol Lit69;
        static final SimpleSymbol Lit7;
        static final SimpleSymbol Lit70;
        static final SimpleSymbol Lit71;
        static final FString Lit72;
        static final SimpleSymbol Lit73;
        static final FString Lit74;
        static final SimpleSymbol Lit75;
        static final SimpleSymbol Lit76;
        static final FString Lit77;
        static final SimpleSymbol Lit78;
        static final FString Lit79;
        static final SimpleSymbol Lit8;
        static final FString Lit80;
        static final SimpleSymbol Lit81;
        static final FString Lit82;
        static final FString Lit83;
        static final SimpleSymbol Lit84;
        static final FString Lit85;
        static final SimpleSymbol Lit86;
        static final SimpleSymbol Lit87;
        static final FString Lit88;
        static final SimpleSymbol Lit89;
        static final FString Lit9;
        static final FString Lit90;
        static final SimpleSymbol Lit91;
        static final SimpleSymbol Lit92;
        static final FString Lit93;
        static final SimpleSymbol Lit94;
        static final FString Lit95;
        static final FString Lit96;
        static final SimpleSymbol Lit97;
        static final FString Lit98;
        static final FString Lit99;
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
        static final ModuleMethod lambda$Fn42 = null;
        static final ModuleMethod lambda$Fn43 = null;
        static final ModuleMethod lambda$Fn44 = null;
        static final ModuleMethod lambda$Fn45 = null;
        static final ModuleMethod lambda$Fn46 = null;
        static final ModuleMethod lambda$Fn47 = null;
        static final ModuleMethod lambda$Fn48 = null;
        static final ModuleMethod lambda$Fn49 = null;
        static final ModuleMethod lambda$Fn5 = null;
        static final ModuleMethod lambda$Fn50 = null;
        static final ModuleMethod lambda$Fn51 = null;
        static final ModuleMethod lambda$Fn52 = null;
        static final ModuleMethod lambda$Fn6 = null;
        static final ModuleMethod lambda$Fn7 = null;
        static final ModuleMethod lambda$Fn8 = null;
        static final ModuleMethod lambda$Fn9 = null;
        public Boolean $Stdebug$Mnform$St;
        public final ModuleMethod $define;
        public ActivityStarter ActivityStarter1;
        public ActivityStarter ActivityStarter2;
        public ActivityStarter ActivityStarter3;
        public ActivityStarter ActivityStarter4;
        public ActivityStarter ActivityStarter5;
        public Button AnthropomorphicTheMusicalButton;
        public final ModuleMethod AnthropomorphicTheMusicalButton$Click;
        public Button BackButton;
        public final ModuleMethod BackButton$Click;
        public Button ForParentsAndTeachersButton;
        public final ModuleMethod ForParentsAndTeachersButton$Click;
        public HorizontalArrangement HorizontalArrangement1;
        public Button InfoButton;
        public final ModuleMethod InfoButton$Click;
        public Label Label10;
        public Label Label11;
        public Label Label12;
        public Label Label13;
        public Label Label14;
        public Label Label15;
        public Label Label16;
        public Label Label18;
        public Label Label20;
        public Label Label21;
        public Label Label6;
        public Label Label7;
        public Label Label8;
        public Label Label9;
        public Button TimYoungButton;
        public final ModuleMethod TimYoungButton$Click;
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
        public final ModuleMethod is$Mnbound$Mnin$Mnform$Mnenvironment;
        public final ModuleMethod lookup$Mnhandler;
        public final ModuleMethod lookup$Mnin$Mnform$Mnenvironment;
        public final ModuleMethod process$Mnexception;
        public final ModuleMethod send$Mnerror;

        /* compiled from: AboutPage.yail */
        public class frame extends ModuleBody {
            AboutPage $main;

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
                        if (!(obj instanceof AboutPage)) {
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
                        if (!(obj instanceof AboutPage)) {
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
                        return AboutPage.lambda2();
                    case SetExp.PROCEDURE /*16*/:
                        this.$main.$define();
                        return Values.empty;
                    case Sequence.INT_U8_VALUE /*17*/:
                        return AboutPage.lambda3();
                    case Sequence.INT_S8_VALUE /*18*/:
                        return AboutPage.lambda4();
                    case Sequence.INT_U16_VALUE /*19*/:
                        return AboutPage.lambda5();
                    case Sequence.INT_S16_VALUE /*20*/:
                        return this.$main.BackButton$Click();
                    case Sequence.INT_U32_VALUE /*21*/:
                        return AboutPage.lambda6();
                    case Sequence.INT_S32_VALUE /*22*/:
                        return AboutPage.lambda7();
                    case Sequence.INT_U64_VALUE /*23*/:
                        return AboutPage.lambda8();
                    case Sequence.INT_S64_VALUE /*24*/:
                        return AboutPage.lambda9();
                    case Sequence.FLOAT_VALUE /*25*/:
                        return AboutPage.lambda10();
                    case Sequence.DOUBLE_VALUE /*26*/:
                        return AboutPage.lambda11();
                    case Sequence.BOOLEAN_VALUE /*27*/:
                        return AboutPage.lambda12();
                    case Sequence.TEXT_BYTE_VALUE /*28*/:
                        return AboutPage.lambda13();
                    case Sequence.CHAR_VALUE /*29*/:
                        return AboutPage.lambda14();
                    case XDataType.DAY_TIME_DURATION_TYPE_CODE /*30*/:
                        return AboutPage.lambda15();
                    case Sequence.CDATA_VALUE /*31*/:
                        return AboutPage.lambda16();
                    case SetExp.SET_IF_UNBOUND /*32*/:
                        return AboutPage.lambda17();
                    case Sequence.ELEMENT_VALUE /*33*/:
                        return AboutPage.lambda18();
                    case Sequence.DOCUMENT_VALUE /*34*/:
                        return AboutPage.lambda19();
                    case Sequence.ATTRIBUTE_VALUE /*35*/:
                        return AboutPage.lambda20();
                    case Sequence.COMMENT_VALUE /*36*/:
                        return AboutPage.lambda21();
                    case Sequence.PROCESSING_INSTRUCTION_VALUE /*37*/:
                        return AboutPage.lambda22();
                    case XDataType.STRING_TYPE_CODE /*38*/:
                        return AboutPage.lambda23();
                    case XDataType.NORMALIZED_STRING_TYPE_CODE /*39*/:
                        return AboutPage.lambda24();
                    case JSONzip.substringLimit /*40*/:
                        return AboutPage.lambda25();
                    case XDataType.LANGUAGE_TYPE_CODE /*41*/:
                        return AboutPage.lambda26();
                    case XDataType.NMTOKEN_TYPE_CODE /*42*/:
                        return AboutPage.lambda27();
                    case XDataType.NAME_TYPE_CODE /*43*/:
                        return AboutPage.lambda28();
                    case XDataType.NCNAME_TYPE_CODE /*44*/:
                        return AboutPage.lambda29();
                    case XDataType.ID_TYPE_CODE /*45*/:
                        return AboutPage.lambda30();
                    case XDataType.IDREF_TYPE_CODE /*46*/:
                        return AboutPage.lambda31();
                    case XDataType.ENTITY_TYPE_CODE /*47*/:
                        return this.$main.ForParentsAndTeachersButton$Click();
                    case XDataType.UNTYPED_TYPE_CODE /*48*/:
                        return AboutPage.lambda32();
                    case 49:
                        return AboutPage.lambda33();
                    case 50:
                        return this.$main.AnthropomorphicTheMusicalButton$Click();
                    case 51:
                        return AboutPage.lambda34();
                    case 52:
                        return AboutPage.lambda35();
                    case 53:
                        return AboutPage.lambda36();
                    case 54:
                        return AboutPage.lambda37();
                    case 55:
                        return this.$main.InfoButton$Click();
                    case 56:
                        return AboutPage.lambda38();
                    case 57:
                        return AboutPage.lambda39();
                    case 58:
                        return this.$main.TimYoungButton$Click();
                    case 59:
                        return AboutPage.lambda40();
                    case 60:
                        return AboutPage.lambda41();
                    case 61:
                        return AboutPage.lambda42();
                    case 62:
                        return AboutPage.lambda43();
                    case 63:
                        return AboutPage.lambda44();
                    case SetExp.HAS_VALUE /*64*/:
                        return AboutPage.lambda45();
                    case 65:
                        return AboutPage.lambda46();
                    case 66:
                        return AboutPage.lambda47();
                    case 67:
                        return AboutPage.lambda48();
                    case 68:
                        return AboutPage.lambda49();
                    case 69:
                        return AboutPage.lambda50();
                    case PrettyWriter.NEWLINE_FILL /*70*/:
                        return AboutPage.lambda51();
                    case 71:
                        return AboutPage.lambda52();
                    case 72:
                        return AboutPage.lambda53();
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
            Lit130 = (SimpleSymbol) new SimpleSymbol("lookup-handler").readResolve();
            Lit129 = (SimpleSymbol) new SimpleSymbol("dispatchEvent").readResolve();
            Lit128 = (SimpleSymbol) new SimpleSymbol("send-error").readResolve();
            Lit127 = (SimpleSymbol) new SimpleSymbol("add-to-form-do-after-creation").readResolve();
            Lit126 = (SimpleSymbol) new SimpleSymbol("add-to-global-vars").readResolve();
            Lit125 = (SimpleSymbol) new SimpleSymbol("add-to-components").readResolve();
            Lit124 = (SimpleSymbol) new SimpleSymbol("add-to-events").readResolve();
            Lit123 = (SimpleSymbol) new SimpleSymbol("add-to-global-var-environment").readResolve();
            Lit122 = (SimpleSymbol) new SimpleSymbol("is-bound-in-form-environment").readResolve();
            Lit121 = (SimpleSymbol) new SimpleSymbol("lookup-in-form-environment").readResolve();
            Lit120 = (SimpleSymbol) new SimpleSymbol("add-to-form-environment").readResolve();
            Lit119 = (SimpleSymbol) new SimpleSymbol("android-log-form").readResolve();
            Lit118 = new FString("com.google.appinventor.components.runtime.ActivityStarter");
            Lit117 = (SimpleSymbol) new SimpleSymbol("ActivityStarter5").readResolve();
            Lit116 = new FString("com.google.appinventor.components.runtime.ActivityStarter");
            Lit115 = new FString("com.google.appinventor.components.runtime.ActivityStarter");
            Lit114 = new FString("com.google.appinventor.components.runtime.ActivityStarter");
            Lit113 = new FString("com.google.appinventor.components.runtime.Web");
            Lit112 = (SimpleSymbol) new SimpleSymbol("Web3").readResolve();
            Lit111 = new FString("com.google.appinventor.components.runtime.Web");
            Lit110 = new FString("com.google.appinventor.components.runtime.Web");
            Lit109 = (SimpleSymbol) new SimpleSymbol("Web2").readResolve();
            Lit108 = new FString("com.google.appinventor.components.runtime.Web");
            Lit107 = new FString("com.google.appinventor.components.runtime.Web");
            Lit106 = (SimpleSymbol) new SimpleSymbol("Web1").readResolve();
            Lit105 = new FString("com.google.appinventor.components.runtime.Web");
            Lit104 = new FString("com.google.appinventor.components.runtime.ActivityStarter");
            Lit103 = new FString("com.google.appinventor.components.runtime.ActivityStarter");
            Lit102 = new FString("com.google.appinventor.components.runtime.ActivityStarter");
            Lit101 = new FString("com.google.appinventor.components.runtime.ActivityStarter");
            Lit100 = new FString("com.google.appinventor.components.runtime.ActivityStarter");
            Lit99 = new FString("com.google.appinventor.components.runtime.ActivityStarter");
            Lit98 = new FString("com.google.appinventor.components.runtime.Label");
            Lit97 = (SimpleSymbol) new SimpleSymbol("Label21").readResolve();
            Lit96 = new FString("com.google.appinventor.components.runtime.Label");
            Lit95 = new FString("com.google.appinventor.components.runtime.Label");
            Lit94 = (SimpleSymbol) new SimpleSymbol("Label20").readResolve();
            Lit93 = new FString("com.google.appinventor.components.runtime.Label");
            Lit92 = (SimpleSymbol) new SimpleSymbol("TimYoungButton$Click").readResolve();
            Lit91 = (SimpleSymbol) new SimpleSymbol("ActivityStarter4").readResolve();
            Lit90 = new FString("com.google.appinventor.components.runtime.Button");
            Lit89 = (SimpleSymbol) new SimpleSymbol("TimYoungButton").readResolve();
            Lit88 = new FString("com.google.appinventor.components.runtime.Button");
            Lit87 = (SimpleSymbol) new SimpleSymbol("InfoButton$Click").readResolve();
            Lit86 = (SimpleSymbol) new SimpleSymbol("ActivityStarter3").readResolve();
            Lit85 = new FString("com.google.appinventor.components.runtime.Button");
            Lit84 = (SimpleSymbol) new SimpleSymbol("InfoButton").readResolve();
            Lit83 = new FString("com.google.appinventor.components.runtime.Button");
            Lit82 = new FString("com.google.appinventor.components.runtime.HorizontalArrangement");
            Lit81 = (SimpleSymbol) new SimpleSymbol("HorizontalArrangement1").readResolve();
            Lit80 = new FString("com.google.appinventor.components.runtime.HorizontalArrangement");
            Lit79 = new FString("com.google.appinventor.components.runtime.Label");
            Lit78 = (SimpleSymbol) new SimpleSymbol("Label18").readResolve();
            Lit77 = new FString("com.google.appinventor.components.runtime.Label");
            Lit76 = (SimpleSymbol) new SimpleSymbol("AnthropomorphicTheMusicalButton$Click").readResolve();
            Lit75 = (SimpleSymbol) new SimpleSymbol("ActivityStarter2").readResolve();
            Lit74 = new FString("com.google.appinventor.components.runtime.Button");
            Lit73 = (SimpleSymbol) new SimpleSymbol("AnthropomorphicTheMusicalButton").readResolve();
            Lit72 = new FString("com.google.appinventor.components.runtime.Button");
            Lit71 = (SimpleSymbol) new SimpleSymbol("ForParentsAndTeachersButton$Click").readResolve();
            Lit70 = (SimpleSymbol) new SimpleSymbol("DataUri").readResolve();
            Lit69 = (SimpleSymbol) new SimpleSymbol("Action").readResolve();
            Lit68 = (SimpleSymbol) new SimpleSymbol("StartActivity").readResolve();
            Lit67 = (SimpleSymbol) new SimpleSymbol("ActivityStarter1").readResolve();
            Lit66 = new FString("com.google.appinventor.components.runtime.Button");
            Lit65 = IntNum.make(20);
            Lit64 = (SimpleSymbol) new SimpleSymbol("ForParentsAndTeachersButton").readResolve();
            Lit63 = new FString("com.google.appinventor.components.runtime.Button");
            Lit62 = new FString("com.google.appinventor.components.runtime.Label");
            Lit61 = (SimpleSymbol) new SimpleSymbol("Label16").readResolve();
            Lit60 = new FString("com.google.appinventor.components.runtime.Label");
            Lit59 = new FString("com.google.appinventor.components.runtime.Label");
            Lit58 = (SimpleSymbol) new SimpleSymbol("Label15").readResolve();
            Lit57 = new FString("com.google.appinventor.components.runtime.Label");
            Lit56 = new FString("com.google.appinventor.components.runtime.Label");
            Lit55 = (SimpleSymbol) new SimpleSymbol("Label14").readResolve();
            Lit54 = new FString("com.google.appinventor.components.runtime.Label");
            Lit53 = new FString("com.google.appinventor.components.runtime.Label");
            Lit52 = (SimpleSymbol) new SimpleSymbol("Label13").readResolve();
            Lit51 = new FString("com.google.appinventor.components.runtime.Label");
            Lit50 = new FString("com.google.appinventor.components.runtime.Label");
            Lit49 = (SimpleSymbol) new SimpleSymbol("Label12").readResolve();
            Lit48 = new FString("com.google.appinventor.components.runtime.Label");
            Lit47 = new FString("com.google.appinventor.components.runtime.Label");
            Lit46 = (SimpleSymbol) new SimpleSymbol("Label11").readResolve();
            Lit45 = new FString("com.google.appinventor.components.runtime.Label");
            Lit44 = new FString("com.google.appinventor.components.runtime.Label");
            Lit43 = (SimpleSymbol) new SimpleSymbol("Label10").readResolve();
            Lit42 = new FString("com.google.appinventor.components.runtime.Label");
            Lit41 = new FString("com.google.appinventor.components.runtime.Label");
            Lit40 = (SimpleSymbol) new SimpleSymbol("Label9").readResolve();
            Lit39 = new FString("com.google.appinventor.components.runtime.Label");
            Lit38 = new FString("com.google.appinventor.components.runtime.Label");
            Lit37 = (SimpleSymbol) new SimpleSymbol("Label8").readResolve();
            Lit36 = new FString("com.google.appinventor.components.runtime.Label");
            Lit35 = new FString("com.google.appinventor.components.runtime.Label");
            Lit34 = (SimpleSymbol) new SimpleSymbol("Label7").readResolve();
            Lit33 = new FString("com.google.appinventor.components.runtime.Label");
            Lit32 = new FString("com.google.appinventor.components.runtime.Label");
            Lit31 = (SimpleSymbol) new SimpleSymbol("Text").readResolve();
            Lit30 = IntNum.make(12);
            Lit29 = (SimpleSymbol) new SimpleSymbol("FontSize").readResolve();
            Lit28 = (SimpleSymbol) new SimpleSymbol(PropertyTypeConstants.PROPERTY_TYPE_BOOLEAN).readResolve();
            Lit27 = (SimpleSymbol) new SimpleSymbol("FontBold").readResolve();
            Lit26 = (SimpleSymbol) new SimpleSymbol("Label6").readResolve();
            Lit25 = new FString("com.google.appinventor.components.runtime.Label");
            Lit24 = new FString("com.google.appinventor.components.runtime.VerticalArrangement");
            Lit23 = IntNum.make(-2);
            int[] iArr = new int[2];
            iArr[0] = Component.COLOR_CYAN;
            Lit22 = IntNum.make(iArr);
            Lit21 = (SimpleSymbol) new SimpleSymbol("VerticalArrangement1").readResolve();
            Lit20 = new FString("com.google.appinventor.components.runtime.VerticalArrangement");
            Lit19 = (SimpleSymbol) new SimpleSymbol("Click").readResolve();
            Lit18 = (SimpleSymbol) new SimpleSymbol("BackButton$Click").readResolve();
            SimpleSymbol simpleSymbol = (SimpleSymbol) new SimpleSymbol(PropertyTypeConstants.PROPERTY_TYPE_TEXT).readResolve();
            Lit4 = simpleSymbol;
            Lit17 = PairWithPosition.make(simpleSymbol, LList.Empty, "/tmp/1480960185199_0.5906416962059402-0/youngandroidproject/../src/appinventor/ai_aributowsky/TuffyApp/AboutPage.yail", 110670);
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
            Lit0 = (SimpleSymbol) new SimpleSymbol("AboutPage").readResolve();
        }

        public AboutPage() {
            ModuleInfo.register(this);
            ModuleBody appinventor_ai_aributowsky_TuffyApp_AboutPage_frame = new frame();
            appinventor_ai_aributowsky_TuffyApp_AboutPage_frame.$main = this;
            this.android$Mnlog$Mnform = new ModuleMethod(appinventor_ai_aributowsky_TuffyApp_AboutPage_frame, 1, Lit119, 4097);
            this.add$Mnto$Mnform$Mnenvironment = new ModuleMethod(appinventor_ai_aributowsky_TuffyApp_AboutPage_frame, 2, Lit120, 8194);
            this.lookup$Mnin$Mnform$Mnenvironment = new ModuleMethod(appinventor_ai_aributowsky_TuffyApp_AboutPage_frame, 3, Lit121, 8193);
            this.is$Mnbound$Mnin$Mnform$Mnenvironment = new ModuleMethod(appinventor_ai_aributowsky_TuffyApp_AboutPage_frame, 5, Lit122, 4097);
            this.add$Mnto$Mnglobal$Mnvar$Mnenvironment = new ModuleMethod(appinventor_ai_aributowsky_TuffyApp_AboutPage_frame, 6, Lit123, 8194);
            this.add$Mnto$Mnevents = new ModuleMethod(appinventor_ai_aributowsky_TuffyApp_AboutPage_frame, 7, Lit124, 8194);
            this.add$Mnto$Mncomponents = new ModuleMethod(appinventor_ai_aributowsky_TuffyApp_AboutPage_frame, 8, Lit125, 16388);
            this.add$Mnto$Mnglobal$Mnvars = new ModuleMethod(appinventor_ai_aributowsky_TuffyApp_AboutPage_frame, 9, Lit126, 8194);
            this.add$Mnto$Mnform$Mndo$Mnafter$Mncreation = new ModuleMethod(appinventor_ai_aributowsky_TuffyApp_AboutPage_frame, 10, Lit127, 4097);
            this.send$Mnerror = new ModuleMethod(appinventor_ai_aributowsky_TuffyApp_AboutPage_frame, 11, Lit128, 4097);
            this.process$Mnexception = new ModuleMethod(appinventor_ai_aributowsky_TuffyApp_AboutPage_frame, 12, "process-exception", 4097);
            this.dispatchEvent = new ModuleMethod(appinventor_ai_aributowsky_TuffyApp_AboutPage_frame, 13, Lit129, 16388);
            this.lookup$Mnhandler = new ModuleMethod(appinventor_ai_aributowsky_TuffyApp_AboutPage_frame, 14, Lit130, 8194);
            PropertySet moduleMethod = new ModuleMethod(appinventor_ai_aributowsky_TuffyApp_AboutPage_frame, 15, null, 0);
            moduleMethod.setProperty("source-location", "/tmp/runtime1791431272433290597.scm:547");
            lambda$Fn1 = moduleMethod;
            this.$define = new ModuleMethod(appinventor_ai_aributowsky_TuffyApp_AboutPage_frame, 16, "$define", 0);
            lambda$Fn2 = new ModuleMethod(appinventor_ai_aributowsky_TuffyApp_AboutPage_frame, 17, null, 0);
            lambda$Fn3 = new ModuleMethod(appinventor_ai_aributowsky_TuffyApp_AboutPage_frame, 18, null, 0);
            lambda$Fn4 = new ModuleMethod(appinventor_ai_aributowsky_TuffyApp_AboutPage_frame, 19, null, 0);
            this.BackButton$Click = new ModuleMethod(appinventor_ai_aributowsky_TuffyApp_AboutPage_frame, 20, Lit18, 0);
            lambda$Fn5 = new ModuleMethod(appinventor_ai_aributowsky_TuffyApp_AboutPage_frame, 21, null, 0);
            lambda$Fn6 = new ModuleMethod(appinventor_ai_aributowsky_TuffyApp_AboutPage_frame, 22, null, 0);
            lambda$Fn7 = new ModuleMethod(appinventor_ai_aributowsky_TuffyApp_AboutPage_frame, 23, null, 0);
            lambda$Fn8 = new ModuleMethod(appinventor_ai_aributowsky_TuffyApp_AboutPage_frame, 24, null, 0);
            lambda$Fn9 = new ModuleMethod(appinventor_ai_aributowsky_TuffyApp_AboutPage_frame, 25, null, 0);
            lambda$Fn10 = new ModuleMethod(appinventor_ai_aributowsky_TuffyApp_AboutPage_frame, 26, null, 0);
            lambda$Fn11 = new ModuleMethod(appinventor_ai_aributowsky_TuffyApp_AboutPage_frame, 27, null, 0);
            lambda$Fn12 = new ModuleMethod(appinventor_ai_aributowsky_TuffyApp_AboutPage_frame, 28, null, 0);
            lambda$Fn13 = new ModuleMethod(appinventor_ai_aributowsky_TuffyApp_AboutPage_frame, 29, null, 0);
            lambda$Fn14 = new ModuleMethod(appinventor_ai_aributowsky_TuffyApp_AboutPage_frame, 30, null, 0);
            lambda$Fn15 = new ModuleMethod(appinventor_ai_aributowsky_TuffyApp_AboutPage_frame, 31, null, 0);
            lambda$Fn16 = new ModuleMethod(appinventor_ai_aributowsky_TuffyApp_AboutPage_frame, 32, null, 0);
            lambda$Fn17 = new ModuleMethod(appinventor_ai_aributowsky_TuffyApp_AboutPage_frame, 33, null, 0);
            lambda$Fn18 = new ModuleMethod(appinventor_ai_aributowsky_TuffyApp_AboutPage_frame, 34, null, 0);
            lambda$Fn19 = new ModuleMethod(appinventor_ai_aributowsky_TuffyApp_AboutPage_frame, 35, null, 0);
            lambda$Fn20 = new ModuleMethod(appinventor_ai_aributowsky_TuffyApp_AboutPage_frame, 36, null, 0);
            lambda$Fn21 = new ModuleMethod(appinventor_ai_aributowsky_TuffyApp_AboutPage_frame, 37, null, 0);
            lambda$Fn22 = new ModuleMethod(appinventor_ai_aributowsky_TuffyApp_AboutPage_frame, 38, null, 0);
            lambda$Fn23 = new ModuleMethod(appinventor_ai_aributowsky_TuffyApp_AboutPage_frame, 39, null, 0);
            lambda$Fn24 = new ModuleMethod(appinventor_ai_aributowsky_TuffyApp_AboutPage_frame, 40, null, 0);
            lambda$Fn25 = new ModuleMethod(appinventor_ai_aributowsky_TuffyApp_AboutPage_frame, 41, null, 0);
            lambda$Fn26 = new ModuleMethod(appinventor_ai_aributowsky_TuffyApp_AboutPage_frame, 42, null, 0);
            lambda$Fn27 = new ModuleMethod(appinventor_ai_aributowsky_TuffyApp_AboutPage_frame, 43, null, 0);
            lambda$Fn28 = new ModuleMethod(appinventor_ai_aributowsky_TuffyApp_AboutPage_frame, 44, null, 0);
            lambda$Fn29 = new ModuleMethod(appinventor_ai_aributowsky_TuffyApp_AboutPage_frame, 45, null, 0);
            lambda$Fn30 = new ModuleMethod(appinventor_ai_aributowsky_TuffyApp_AboutPage_frame, 46, null, 0);
            this.ForParentsAndTeachersButton$Click = new ModuleMethod(appinventor_ai_aributowsky_TuffyApp_AboutPage_frame, 47, Lit71, 0);
            lambda$Fn31 = new ModuleMethod(appinventor_ai_aributowsky_TuffyApp_AboutPage_frame, 48, null, 0);
            lambda$Fn32 = new ModuleMethod(appinventor_ai_aributowsky_TuffyApp_AboutPage_frame, 49, null, 0);
            this.AnthropomorphicTheMusicalButton$Click = new ModuleMethod(appinventor_ai_aributowsky_TuffyApp_AboutPage_frame, 50, Lit76, 0);
            lambda$Fn33 = new ModuleMethod(appinventor_ai_aributowsky_TuffyApp_AboutPage_frame, 51, null, 0);
            lambda$Fn34 = new ModuleMethod(appinventor_ai_aributowsky_TuffyApp_AboutPage_frame, 52, null, 0);
            lambda$Fn35 = new ModuleMethod(appinventor_ai_aributowsky_TuffyApp_AboutPage_frame, 53, null, 0);
            lambda$Fn36 = new ModuleMethod(appinventor_ai_aributowsky_TuffyApp_AboutPage_frame, 54, null, 0);
            this.InfoButton$Click = new ModuleMethod(appinventor_ai_aributowsky_TuffyApp_AboutPage_frame, 55, Lit87, 0);
            lambda$Fn37 = new ModuleMethod(appinventor_ai_aributowsky_TuffyApp_AboutPage_frame, 56, null, 0);
            lambda$Fn38 = new ModuleMethod(appinventor_ai_aributowsky_TuffyApp_AboutPage_frame, 57, null, 0);
            this.TimYoungButton$Click = new ModuleMethod(appinventor_ai_aributowsky_TuffyApp_AboutPage_frame, 58, Lit92, 0);
            lambda$Fn39 = new ModuleMethod(appinventor_ai_aributowsky_TuffyApp_AboutPage_frame, 59, null, 0);
            lambda$Fn40 = new ModuleMethod(appinventor_ai_aributowsky_TuffyApp_AboutPage_frame, 60, null, 0);
            lambda$Fn41 = new ModuleMethod(appinventor_ai_aributowsky_TuffyApp_AboutPage_frame, 61, null, 0);
            lambda$Fn42 = new ModuleMethod(appinventor_ai_aributowsky_TuffyApp_AboutPage_frame, 62, null, 0);
            lambda$Fn43 = new ModuleMethod(appinventor_ai_aributowsky_TuffyApp_AboutPage_frame, 63, null, 0);
            lambda$Fn44 = new ModuleMethod(appinventor_ai_aributowsky_TuffyApp_AboutPage_frame, 64, null, 0);
            lambda$Fn45 = new ModuleMethod(appinventor_ai_aributowsky_TuffyApp_AboutPage_frame, 65, null, 0);
            lambda$Fn46 = new ModuleMethod(appinventor_ai_aributowsky_TuffyApp_AboutPage_frame, 66, null, 0);
            lambda$Fn47 = new ModuleMethod(appinventor_ai_aributowsky_TuffyApp_AboutPage_frame, 67, null, 0);
            lambda$Fn48 = new ModuleMethod(appinventor_ai_aributowsky_TuffyApp_AboutPage_frame, 68, null, 0);
            lambda$Fn49 = new ModuleMethod(appinventor_ai_aributowsky_TuffyApp_AboutPage_frame, 69, null, 0);
            lambda$Fn50 = new ModuleMethod(appinventor_ai_aributowsky_TuffyApp_AboutPage_frame, 70, null, 0);
            lambda$Fn51 = new ModuleMethod(appinventor_ai_aributowsky_TuffyApp_AboutPage_frame, 71, null, 0);
            lambda$Fn52 = new ModuleMethod(appinventor_ai_aributowsky_TuffyApp_AboutPage_frame, 72, null, 0);
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
                AboutPage = null;
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
                        Values.writeValues(runtime.setAndCoerceProperty$Ex(Lit0, Lit8, "AboutPage", Lit4), $result);
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
                        addToComponents(Lit0, Lit24, Lit21, lambda$Fn6);
                    }
                    this.Label6 = null;
                    if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
                        Values.writeValues(runtime.addComponentWithinRepl(Lit21, Lit25, Lit26, lambda$Fn7), $result);
                    } else {
                        addToComponents(Lit21, Lit32, Lit26, lambda$Fn8);
                    }
                    this.Label7 = null;
                    if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
                        Values.writeValues(runtime.addComponentWithinRepl(Lit21, Lit33, Lit34, lambda$Fn9), $result);
                    } else {
                        addToComponents(Lit21, Lit35, Lit34, lambda$Fn10);
                    }
                    this.Label8 = null;
                    if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
                        Values.writeValues(runtime.addComponentWithinRepl(Lit21, Lit36, Lit37, lambda$Fn11), $result);
                    } else {
                        addToComponents(Lit21, Lit38, Lit37, lambda$Fn12);
                    }
                    this.Label9 = null;
                    if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
                        Values.writeValues(runtime.addComponentWithinRepl(Lit21, Lit39, Lit40, lambda$Fn13), $result);
                    } else {
                        addToComponents(Lit21, Lit41, Lit40, lambda$Fn14);
                    }
                    this.Label10 = null;
                    if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
                        Values.writeValues(runtime.addComponentWithinRepl(Lit21, Lit42, Lit43, lambda$Fn15), $result);
                    } else {
                        addToComponents(Lit21, Lit44, Lit43, lambda$Fn16);
                    }
                    this.Label11 = null;
                    if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
                        Values.writeValues(runtime.addComponentWithinRepl(Lit21, Lit45, Lit46, lambda$Fn17), $result);
                    } else {
                        addToComponents(Lit21, Lit47, Lit46, lambda$Fn18);
                    }
                    this.Label12 = null;
                    if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
                        Values.writeValues(runtime.addComponentWithinRepl(Lit21, Lit48, Lit49, lambda$Fn19), $result);
                    } else {
                        addToComponents(Lit21, Lit50, Lit49, lambda$Fn20);
                    }
                    this.Label13 = null;
                    if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
                        Values.writeValues(runtime.addComponentWithinRepl(Lit21, Lit51, Lit52, lambda$Fn21), $result);
                    } else {
                        addToComponents(Lit21, Lit53, Lit52, lambda$Fn22);
                    }
                    this.Label14 = null;
                    if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
                        Values.writeValues(runtime.addComponentWithinRepl(Lit21, Lit54, Lit55, lambda$Fn23), $result);
                    } else {
                        addToComponents(Lit21, Lit56, Lit55, lambda$Fn24);
                    }
                    this.Label15 = null;
                    if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
                        Values.writeValues(runtime.addComponentWithinRepl(Lit21, Lit57, Lit58, lambda$Fn25), $result);
                    } else {
                        addToComponents(Lit21, Lit59, Lit58, lambda$Fn26);
                    }
                    this.Label16 = null;
                    if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
                        Values.writeValues(runtime.addComponentWithinRepl(Lit21, Lit60, Lit61, lambda$Fn27), $result);
                    } else {
                        addToComponents(Lit21, Lit62, Lit61, lambda$Fn28);
                    }
                    this.ForParentsAndTeachersButton = null;
                    if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
                        Values.writeValues(runtime.addComponentWithinRepl(Lit21, Lit63, Lit64, lambda$Fn29), $result);
                    } else {
                        addToComponents(Lit21, Lit66, Lit64, lambda$Fn30);
                    }
                    if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
                        runtime.addToCurrentFormEnvironment(Lit71, this.ForParentsAndTeachersButton$Click);
                    } else {
                        addToFormEnvironment(Lit71, this.ForParentsAndTeachersButton$Click);
                    }
                    if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
                        EventDispatcher.registerEventForDelegation((HandlesEventDispatching) runtime.$Stthis$Mnform$St, "ForParentsAndTeachersButton", "Click");
                    } else {
                        addToEvents(Lit64, Lit19);
                    }
                    this.AnthropomorphicTheMusicalButton = null;
                    if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
                        Values.writeValues(runtime.addComponentWithinRepl(Lit21, Lit72, Lit73, lambda$Fn31), $result);
                    } else {
                        addToComponents(Lit21, Lit74, Lit73, lambda$Fn32);
                    }
                    if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
                        runtime.addToCurrentFormEnvironment(Lit76, this.AnthropomorphicTheMusicalButton$Click);
                    } else {
                        addToFormEnvironment(Lit76, this.AnthropomorphicTheMusicalButton$Click);
                    }
                    if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
                        EventDispatcher.registerEventForDelegation((HandlesEventDispatching) runtime.$Stthis$Mnform$St, "AnthropomorphicTheMusicalButton", "Click");
                    } else {
                        addToEvents(Lit73, Lit19);
                    }
                    this.Label18 = null;
                    if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
                        Values.writeValues(runtime.addComponentWithinRepl(Lit21, Lit77, Lit78, lambda$Fn33), $result);
                    } else {
                        addToComponents(Lit21, Lit79, Lit78, lambda$Fn34);
                    }
                    this.HorizontalArrangement1 = null;
                    if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
                        Values.writeValues(runtime.addComponentWithinRepl(Lit21, Lit80, Lit81, Boolean.FALSE), $result);
                    } else {
                        addToComponents(Lit21, Lit82, Lit81, Boolean.FALSE);
                    }
                    this.InfoButton = null;
                    if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
                        Values.writeValues(runtime.addComponentWithinRepl(Lit81, Lit83, Lit84, lambda$Fn35), $result);
                    } else {
                        addToComponents(Lit81, Lit85, Lit84, lambda$Fn36);
                    }
                    if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
                        runtime.addToCurrentFormEnvironment(Lit87, this.InfoButton$Click);
                    } else {
                        addToFormEnvironment(Lit87, this.InfoButton$Click);
                    }
                    if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
                        EventDispatcher.registerEventForDelegation((HandlesEventDispatching) runtime.$Stthis$Mnform$St, "InfoButton", "Click");
                    } else {
                        addToEvents(Lit84, Lit19);
                    }
                    this.TimYoungButton = null;
                    if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
                        Values.writeValues(runtime.addComponentWithinRepl(Lit81, Lit88, Lit89, lambda$Fn37), $result);
                    } else {
                        addToComponents(Lit81, Lit90, Lit89, lambda$Fn38);
                    }
                    if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
                        runtime.addToCurrentFormEnvironment(Lit92, this.TimYoungButton$Click);
                    } else {
                        addToFormEnvironment(Lit92, this.TimYoungButton$Click);
                    }
                    if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
                        EventDispatcher.registerEventForDelegation((HandlesEventDispatching) runtime.$Stthis$Mnform$St, "TimYoungButton", "Click");
                    } else {
                        addToEvents(Lit89, Lit19);
                    }
                    this.Label20 = null;
                    if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
                        Values.writeValues(runtime.addComponentWithinRepl(Lit21, Lit93, Lit94, lambda$Fn39), $result);
                    } else {
                        addToComponents(Lit21, Lit95, Lit94, lambda$Fn40);
                    }
                    this.Label21 = null;
                    if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
                        Values.writeValues(runtime.addComponentWithinRepl(Lit21, Lit96, Lit97, lambda$Fn41), $result);
                    } else {
                        addToComponents(Lit21, Lit98, Lit97, lambda$Fn42);
                    }
                    this.ActivityStarter1 = null;
                    if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
                        Values.writeValues(runtime.addComponentWithinRepl(Lit0, Lit99, Lit67, lambda$Fn43), $result);
                    } else {
                        addToComponents(Lit0, Lit100, Lit67, lambda$Fn44);
                    }
                    this.ActivityStarter2 = null;
                    if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
                        Values.writeValues(runtime.addComponentWithinRepl(Lit0, Lit101, Lit75, lambda$Fn45), $result);
                    } else {
                        addToComponents(Lit0, Lit102, Lit75, lambda$Fn46);
                    }
                    this.ActivityStarter3 = null;
                    if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
                        Values.writeValues(runtime.addComponentWithinRepl(Lit0, Lit103, Lit86, lambda$Fn47), $result);
                    } else {
                        addToComponents(Lit0, Lit104, Lit86, lambda$Fn48);
                    }
                    this.Web1 = null;
                    if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
                        Values.writeValues(runtime.addComponentWithinRepl(Lit0, Lit105, Lit106, Boolean.FALSE), $result);
                    } else {
                        addToComponents(Lit0, Lit107, Lit106, Boolean.FALSE);
                    }
                    this.Web2 = null;
                    if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
                        Values.writeValues(runtime.addComponentWithinRepl(Lit0, Lit108, Lit109, Boolean.FALSE), $result);
                    } else {
                        addToComponents(Lit0, Lit110, Lit109, Boolean.FALSE);
                    }
                    this.Web3 = null;
                    if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
                        Values.writeValues(runtime.addComponentWithinRepl(Lit0, Lit111, Lit112, Boolean.FALSE), $result);
                    } else {
                        addToComponents(Lit0, Lit113, Lit112, Boolean.FALSE);
                    }
                    this.ActivityStarter4 = null;
                    if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
                        Values.writeValues(runtime.addComponentWithinRepl(Lit0, Lit114, Lit91, lambda$Fn49), $result);
                    } else {
                        addToComponents(Lit0, Lit115, Lit91, lambda$Fn50);
                    }
                    this.ActivityStarter5 = null;
                    if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
                        Values.writeValues(runtime.addComponentWithinRepl(Lit0, Lit116, Lit117, lambda$Fn51), $result);
                    } else {
                        addToComponents(Lit0, Lit118, Lit117, lambda$Fn52);
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
            return runtime.setAndCoerceProperty$Ex(Lit0, Lit8, "AboutPage", Lit4);
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
            runtime.setAndCoerceProperty$Ex(Lit21, Lit5, Lit22, Lit7);
            runtime.setAndCoerceProperty$Ex(Lit21, Lit11, Lit23, Lit7);
            return runtime.setAndCoerceProperty$Ex(Lit21, Lit13, Lit23, Lit7);
        }

        static Object lambda7() {
            runtime.setAndCoerceProperty$Ex(Lit21, Lit5, Lit22, Lit7);
            runtime.setAndCoerceProperty$Ex(Lit21, Lit11, Lit23, Lit7);
            return runtime.setAndCoerceProperty$Ex(Lit21, Lit13, Lit23, Lit7);
        }

        static Object lambda8() {
            runtime.setAndCoerceProperty$Ex(Lit26, Lit27, Boolean.TRUE, Lit28);
            runtime.setAndCoerceProperty$Ex(Lit26, Lit29, Lit30, Lit7);
            return runtime.setAndCoerceProperty$Ex(Lit26, Lit31, "Color Me Tuffy is created by Puppetry Arts, a non-profit org.", Lit4);
        }

        static Object lambda9() {
            runtime.setAndCoerceProperty$Ex(Lit26, Lit27, Boolean.TRUE, Lit28);
            runtime.setAndCoerceProperty$Ex(Lit26, Lit29, Lit30, Lit7);
            return runtime.setAndCoerceProperty$Ex(Lit26, Lit31, "Color Me Tuffy is created by Puppetry Arts, a non-profit org.", Lit4);
        }

        static Object lambda10() {
            runtime.setAndCoerceProperty$Ex(Lit34, Lit27, Boolean.TRUE, Lit28);
            runtime.setAndCoerceProperty$Ex(Lit34, Lit29, Lit30, Lit7);
            return runtime.setAndCoerceProperty$Ex(Lit34, Lit31, "located in New York and South Carolina and is the home of Tuffy", Lit4);
        }

        static Object lambda11() {
            runtime.setAndCoerceProperty$Ex(Lit34, Lit27, Boolean.TRUE, Lit28);
            runtime.setAndCoerceProperty$Ex(Lit34, Lit29, Lit30, Lit7);
            return runtime.setAndCoerceProperty$Ex(Lit34, Lit31, "located in New York and South Carolina and is the home of Tuffy", Lit4);
        }

        static Object lambda12() {
            runtime.setAndCoerceProperty$Ex(Lit37, Lit27, Boolean.TRUE, Lit28);
            runtime.setAndCoerceProperty$Ex(Lit37, Lit29, Lit30, Lit7);
            return runtime.setAndCoerceProperty$Ex(Lit37, Lit31, "Tiger. The mission of Puppetry Arts is to offer creative and cultural", Lit4);
        }

        static Object lambda13() {
            runtime.setAndCoerceProperty$Ex(Lit37, Lit27, Boolean.TRUE, Lit28);
            runtime.setAndCoerceProperty$Ex(Lit37, Lit29, Lit30, Lit7);
            return runtime.setAndCoerceProperty$Ex(Lit37, Lit31, "Tiger. The mission of Puppetry Arts is to offer creative and cultural", Lit4);
        }

        static Object lambda14() {
            runtime.setAndCoerceProperty$Ex(Lit40, Lit27, Boolean.TRUE, Lit28);
            runtime.setAndCoerceProperty$Ex(Lit40, Lit29, Lit30, Lit7);
            return runtime.setAndCoerceProperty$Ex(Lit40, Lit31, "exploration to all individuals through the art of puppetry by", Lit4);
        }

        static Object lambda15() {
            runtime.setAndCoerceProperty$Ex(Lit40, Lit27, Boolean.TRUE, Lit28);
            runtime.setAndCoerceProperty$Ex(Lit40, Lit29, Lit30, Lit7);
            return runtime.setAndCoerceProperty$Ex(Lit40, Lit31, "exploration to all individuals through the art of puppetry by", Lit4);
        }

        static Object lambda16() {
            runtime.setAndCoerceProperty$Ex(Lit43, Lit27, Boolean.TRUE, Lit28);
            runtime.setAndCoerceProperty$Ex(Lit43, Lit29, Lit30, Lit7);
            return runtime.setAndCoerceProperty$Ex(Lit43, Lit31, "providing a venue for emerging artists, innovative teachers, and", Lit4);
        }

        static Object lambda17() {
            runtime.setAndCoerceProperty$Ex(Lit43, Lit27, Boolean.TRUE, Lit28);
            runtime.setAndCoerceProperty$Ex(Lit43, Lit29, Lit30, Lit7);
            return runtime.setAndCoerceProperty$Ex(Lit43, Lit31, "providing a venue for emerging artists, innovative teachers, and", Lit4);
        }

        static Object lambda18() {
            runtime.setAndCoerceProperty$Ex(Lit46, Lit27, Boolean.TRUE, Lit28);
            runtime.setAndCoerceProperty$Ex(Lit46, Lit29, Lit30, Lit7);
            return runtime.setAndCoerceProperty$Ex(Lit46, Lit31, "community members to facilitate youth development, enrich family", Lit4);
        }

        static Object lambda19() {
            runtime.setAndCoerceProperty$Ex(Lit46, Lit27, Boolean.TRUE, Lit28);
            runtime.setAndCoerceProperty$Ex(Lit46, Lit29, Lit30, Lit7);
            return runtime.setAndCoerceProperty$Ex(Lit46, Lit31, "community members to facilitate youth development, enrich family", Lit4);
        }

        static Object lambda20() {
            runtime.setAndCoerceProperty$Ex(Lit49, Lit27, Boolean.TRUE, Lit28);
            runtime.setAndCoerceProperty$Ex(Lit49, Lit29, Lit30, Lit7);
            return runtime.setAndCoerceProperty$Ex(Lit49, Lit31, "activity, empower civic responsibility, and to engage and entertain.", Lit4);
        }

        static Object lambda21() {
            runtime.setAndCoerceProperty$Ex(Lit49, Lit27, Boolean.TRUE, Lit28);
            runtime.setAndCoerceProperty$Ex(Lit49, Lit29, Lit30, Lit7);
            return runtime.setAndCoerceProperty$Ex(Lit49, Lit31, "activity, empower civic responsibility, and to engage and entertain.", Lit4);
        }

        static Object lambda22() {
            runtime.setAndCoerceProperty$Ex(Lit52, Lit27, Boolean.TRUE, Lit28);
            runtime.setAndCoerceProperty$Ex(Lit52, Lit29, Lit30, Lit7);
            return runtime.setAndCoerceProperty$Ex(Lit52, Lit31, "Puppetry Arts provides programming at community events, family", Lit4);
        }

        static Object lambda23() {
            runtime.setAndCoerceProperty$Ex(Lit52, Lit27, Boolean.TRUE, Lit28);
            runtime.setAndCoerceProperty$Ex(Lit52, Lit29, Lit30, Lit7);
            return runtime.setAndCoerceProperty$Ex(Lit52, Lit31, "Puppetry Arts provides programming at community events, family", Lit4);
        }

        static Object lambda24() {
            runtime.setAndCoerceProperty$Ex(Lit55, Lit27, Boolean.TRUE, Lit28);
            runtime.setAndCoerceProperty$Ex(Lit55, Lit29, Lit30, Lit7);
            return runtime.setAndCoerceProperty$Ex(Lit55, Lit31, "programs, and schools in the New York City and Charleston areas", Lit4);
        }

        static Object lambda25() {
            runtime.setAndCoerceProperty$Ex(Lit55, Lit27, Boolean.TRUE, Lit28);
            runtime.setAndCoerceProperty$Ex(Lit55, Lit29, Lit30, Lit7);
            return runtime.setAndCoerceProperty$Ex(Lit55, Lit31, "programs, and schools in the New York City and Charleston areas", Lit4);
        }

        static Object lambda26() {
            runtime.setAndCoerceProperty$Ex(Lit58, Lit27, Boolean.TRUE, Lit28);
            runtime.setAndCoerceProperty$Ex(Lit58, Lit29, Lit30, Lit7);
            return runtime.setAndCoerceProperty$Ex(Lit58, Lit31, "including artist in residencies, performances, events, and", Lit4);
        }

        static Object lambda27() {
            runtime.setAndCoerceProperty$Ex(Lit58, Lit27, Boolean.TRUE, Lit28);
            runtime.setAndCoerceProperty$Ex(Lit58, Lit29, Lit30, Lit7);
            return runtime.setAndCoerceProperty$Ex(Lit58, Lit31, "including artist in residencies, performances, events, and", Lit4);
        }

        static Object lambda28() {
            runtime.setAndCoerceProperty$Ex(Lit61, Lit27, Boolean.TRUE, Lit28);
            runtime.setAndCoerceProperty$Ex(Lit61, Lit29, Lit30, Lit7);
            return runtime.setAndCoerceProperty$Ex(Lit61, Lit31, "volunteer opportunities.", Lit4);
        }

        static Object lambda29() {
            runtime.setAndCoerceProperty$Ex(Lit61, Lit27, Boolean.TRUE, Lit28);
            runtime.setAndCoerceProperty$Ex(Lit61, Lit29, Lit30, Lit7);
            return runtime.setAndCoerceProperty$Ex(Lit61, Lit31, "volunteer opportunities.", Lit4);
        }

        static Object lambda30() {
            runtime.setAndCoerceProperty$Ex(Lit64, Lit27, Boolean.TRUE, Lit28);
            runtime.setAndCoerceProperty$Ex(Lit64, Lit11, Lit65, Lit7);
            return runtime.setAndCoerceProperty$Ex(Lit64, Lit31, "For Parents & Teachers", Lit4);
        }

        static Object lambda31() {
            runtime.setAndCoerceProperty$Ex(Lit64, Lit27, Boolean.TRUE, Lit28);
            runtime.setAndCoerceProperty$Ex(Lit64, Lit11, Lit65, Lit7);
            return runtime.setAndCoerceProperty$Ex(Lit64, Lit31, "For Parents & Teachers", Lit4);
        }

        public Object ForParentsAndTeachersButton$Click() {
            runtime.setThisForm();
            runtime.callComponentMethod(Lit67, Lit68, LList.Empty, LList.Empty);
            runtime.setAndCoerceProperty$Ex(Lit67, Lit69, "android.intent.action.VIEW", Lit4);
            return runtime.setAndCoerceProperty$Ex(Lit67, Lit70, "http://puppetryarts.org/#teacherparent", Lit4);
        }

        static Object lambda32() {
            runtime.setAndCoerceProperty$Ex(Lit73, Lit27, Boolean.TRUE, Lit28);
            runtime.setAndCoerceProperty$Ex(Lit73, Lit11, Lit65, Lit7);
            return runtime.setAndCoerceProperty$Ex(Lit73, Lit31, "Anthropomorphic The Musical", Lit4);
        }

        static Object lambda33() {
            runtime.setAndCoerceProperty$Ex(Lit73, Lit27, Boolean.TRUE, Lit28);
            runtime.setAndCoerceProperty$Ex(Lit73, Lit11, Lit65, Lit7);
            return runtime.setAndCoerceProperty$Ex(Lit73, Lit31, "Anthropomorphic The Musical", Lit4);
        }

        public Object AnthropomorphicTheMusicalButton$Click() {
            runtime.setThisForm();
            runtime.callComponentMethod(Lit75, Lit68, LList.Empty, LList.Empty);
            runtime.setAndCoerceProperty$Ex(Lit75, Lit69, "android.intent.action.VIEW", Lit4);
            return runtime.setAndCoerceProperty$Ex(Lit75, Lit70, "puppetryarts.org/anthropomorphic/", Lit4);
        }

        static Object lambda34() {
            runtime.setAndCoerceProperty$Ex(Lit78, Lit27, Boolean.TRUE, Lit28);
            return runtime.setAndCoerceProperty$Ex(Lit78, Lit31, "Contact Us", Lit4);
        }

        static Object lambda35() {
            runtime.setAndCoerceProperty$Ex(Lit78, Lit27, Boolean.TRUE, Lit28);
            return runtime.setAndCoerceProperty$Ex(Lit78, Lit31, "Contact Us", Lit4);
        }

        static Object lambda36() {
            runtime.setAndCoerceProperty$Ex(Lit84, Lit27, Boolean.TRUE, Lit28);
            runtime.setAndCoerceProperty$Ex(Lit84, Lit29, Lit30, Lit7);
            return runtime.setAndCoerceProperty$Ex(Lit84, Lit31, "info@puppetryarts.org", Lit4);
        }

        static Object lambda37() {
            runtime.setAndCoerceProperty$Ex(Lit84, Lit27, Boolean.TRUE, Lit28);
            runtime.setAndCoerceProperty$Ex(Lit84, Lit29, Lit30, Lit7);
            return runtime.setAndCoerceProperty$Ex(Lit84, Lit31, "info@puppetryarts.org", Lit4);
        }

        public Object InfoButton$Click() {
            runtime.setThisForm();
            runtime.callComponentMethod(Lit86, Lit68, LList.Empty, LList.Empty);
            runtime.setAndCoerceProperty$Ex(Lit86, Lit69, "android.intent.action.VIEW", Lit4);
            return runtime.setAndCoerceProperty$Ex(Lit86, Lit70, "mailto:info@puppetryarts.org", Lit4);
        }

        static Object lambda38() {
            runtime.setAndCoerceProperty$Ex(Lit89, Lit27, Boolean.TRUE, Lit28);
            runtime.setAndCoerceProperty$Ex(Lit89, Lit29, Lit30, Lit7);
            return runtime.setAndCoerceProperty$Ex(Lit89, Lit31, "timyoung@puppetryarts.org", Lit4);
        }

        static Object lambda39() {
            runtime.setAndCoerceProperty$Ex(Lit89, Lit27, Boolean.TRUE, Lit28);
            runtime.setAndCoerceProperty$Ex(Lit89, Lit29, Lit30, Lit7);
            return runtime.setAndCoerceProperty$Ex(Lit89, Lit31, "timyoung@puppetryarts.org", Lit4);
        }

        public Object TimYoungButton$Click() {
            runtime.setThisForm();
            runtime.callComponentMethod(Lit91, Lit68, LList.Empty, LList.Empty);
            runtime.setAndCoerceProperty$Ex(Lit91, Lit69, "android.intent.action.VIEW", Lit4);
            return runtime.setAndCoerceProperty$Ex(Lit91, Lit70, "mailto:timyoung@puppetryarts.org", Lit4);
        }

        static Object lambda40() {
            runtime.setAndCoerceProperty$Ex(Lit94, Lit29, Lit30, Lit7);
            return runtime.setAndCoerceProperty$Ex(Lit94, Lit31, "(718) 768-3703", Lit4);
        }

        static Object lambda41() {
            runtime.setAndCoerceProperty$Ex(Lit94, Lit29, Lit30, Lit7);
            return runtime.setAndCoerceProperty$Ex(Lit94, Lit31, "(718) 768-3703", Lit4);
        }

        static Object lambda42() {
            runtime.setAndCoerceProperty$Ex(Lit97, Lit29, Lit30, Lit7);
            return runtime.setAndCoerceProperty$Ex(Lit97, Lit31, "Monday - Saturday 10:00am - 6:00pm", Lit4);
        }

        static Object lambda43() {
            runtime.setAndCoerceProperty$Ex(Lit97, Lit29, Lit30, Lit7);
            return runtime.setAndCoerceProperty$Ex(Lit97, Lit31, "Monday - Saturday 10:00am - 6:00pm", Lit4);
        }

        static Object lambda44() {
            runtime.setAndCoerceProperty$Ex(Lit67, Lit69, "android.intent.action.VIEW", Lit4);
            return runtime.setAndCoerceProperty$Ex(Lit67, Lit70, "http://puppetryarts.org/#teacherparent", Lit4);
        }

        static Object lambda45() {
            runtime.setAndCoerceProperty$Ex(Lit67, Lit69, "android.intent.action.VIEW", Lit4);
            return runtime.setAndCoerceProperty$Ex(Lit67, Lit70, "http://puppetryarts.org/#teacherparent", Lit4);
        }

        static Object lambda46() {
            runtime.setAndCoerceProperty$Ex(Lit75, Lit69, "android.intent.action.VIEW", Lit4);
            return runtime.setAndCoerceProperty$Ex(Lit75, Lit70, "puppetryarts.org/anthropomorphic/", Lit4);
        }

        static Object lambda47() {
            runtime.setAndCoerceProperty$Ex(Lit75, Lit69, "android.intent.action.VIEW", Lit4);
            return runtime.setAndCoerceProperty$Ex(Lit75, Lit70, "puppetryarts.org/anthropomorphic/", Lit4);
        }

        static Object lambda48() {
            runtime.setAndCoerceProperty$Ex(Lit86, Lit69, "android.intent.action.VIEW", Lit4);
            return runtime.setAndCoerceProperty$Ex(Lit86, Lit70, "mailto:info@puppetryarts.org", Lit4);
        }

        static Object lambda49() {
            runtime.setAndCoerceProperty$Ex(Lit86, Lit69, "android.intent.action.VIEW", Lit4);
            return runtime.setAndCoerceProperty$Ex(Lit86, Lit70, "mailto:info@puppetryarts.org", Lit4);
        }

        static Object lambda50() {
            runtime.setAndCoerceProperty$Ex(Lit91, Lit69, "android.intent.action.VIEW", Lit4);
            return runtime.setAndCoerceProperty$Ex(Lit91, Lit70, "mailto:timyoung@puppetryarts.org", Lit4);
        }

        static Object lambda51() {
            runtime.setAndCoerceProperty$Ex(Lit91, Lit69, "android.intent.action.VIEW", Lit4);
            return runtime.setAndCoerceProperty$Ex(Lit91, Lit70, "mailto:timyoung@puppetryarts.org", Lit4);
        }

        static Object lambda52() {
            return runtime.setAndCoerceProperty$Ex(Lit117, Lit69, "android.intent.action.VIEW", Lit4);
        }

        static Object lambda53() {
            return runtime.setAndCoerceProperty$Ex(Lit117, Lit69, "android.intent.action.VIEW", Lit4);
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
            AboutPage = this;
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
            AboutPage closureEnv = this;
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
