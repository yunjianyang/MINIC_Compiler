/* Generated By:JavaCC: Do not edit this line. Pr3YunjianHxConstants.java */
package edu.nyu.cs.cc;


/**
 * Token literal values and constants.
 * Generated by org.javacc.parser.OtherFilesGen#start()
 */
public interface Pr3YunjianHxConstants {

  /** End of File. */
  int EOF = 0;
  /** RegularExpression Id. */
  int T_HX_CONCRETE = 84;
  /** RegularExpression Id. */
  int T_HX_PP_UNCONCRETE = 94;
  /** RegularExpression Id. */
  int T_HX_SEMI = 97;
  /** RegularExpression Id. */
  int T_HX_BAR = 98;
  /** RegularExpression Id. */
  int T_HX_LPAREN = 99;
  /** RegularExpression Id. */
  int T_HX_RPAREN = 100;
  /** RegularExpression Id. */
  int T_HX_STAR = 101;
  /** RegularExpression Id. */
  int T_HX_PLUS = 102;
  /** RegularExpression Id. */
  int T_HX_QUEST = 103;
  /** RegularExpression Id. */
  int T_HX_SUB = 104;
  /** RegularExpression Id. */
  int T_HX_DOT = 105;
  /** RegularExpression Id. */
  int T_HX_COLON = 106;
  /** RegularExpression Id. */
  int T_HX_LBRACE = 107;
  /** RegularExpression Id. */
  int T_HX_RBRACE = 108;
  /** RegularExpression Id. */
  int T_HX_LBRACKET = 109;
  /** RegularExpression Id. */
  int T_HX_RBRACKET = 110;
  /** RegularExpression Id. */
  int T_HX_COMMA = 111;
  /** RegularExpression Id. */
  int T_HX_FORALL = 112;
  /** RegularExpression Id. */
  int T_HX_ARROW = 113;
  /** RegularExpression Id. */
  int T_HX_UP = 114;
  /** RegularExpression Id. */
  int T_HX_DOWN = 115;
  /** RegularExpression Id. */
  int T_HX_NOT = 116;
  /** RegularExpression Id. */
  int T_HX_AT = 117;
  /** RegularExpression Id. */
  int T_HX_DOTTEDNAME = 118;
  /** RegularExpression Id. */
  int T_HX_AS = 119;
  /** RegularExpression Id. */
  int T_HX_ATTRIBUTE = 120;
  /** RegularExpression Id. */
  int T_HX_AUTOMATIC = 121;
  /** RegularExpression Id. */
  int T_HX_BINDS = 122;
  /** RegularExpression Id. */
  int T_HX_COMPOSE = 123;
  /** RegularExpression Id. */
  int T_HX_DATA = 124;
  /** RegularExpression Id. */
  int T_HX_DEFAULT = 125;
  /** RegularExpression Id. */
  int T_HX_FREE = 126;
  /** RegularExpression Id. */
  int T_HX_FRESH = 127;
  /** RegularExpression Id. */
  int T_HX_GLOBAL = 128;
  /** RegularExpression Id. */
  int T_HX_IMPORT = 129;
  /** RegularExpression Id. */
  int T_HX_MAIN = 130;
  /** RegularExpression Id. */
  int T_HX_MODULE = 131;
  /** RegularExpression Id. */
  int T_HX_PRIORITY = 132;
  /** RegularExpression Id. */
  int T_HX_RULE = 133;
  /** RegularExpression Id. */
  int T_HX_SCHEME = 134;
  /** RegularExpression Id. */
  int T_HX_SORT = 135;
  /** RegularExpression Id. */
  int T_HX_STATIC = 136;
  /** RegularExpression Id. */
  int T_HX_SUGAR = 137;
  /** RegularExpression Id. */
  int T_HX_SYMBOL = 138;
  /** RegularExpression Id. */
  int T_HX_TAG = 139;
  /** RegularExpression Id. */
  int T_HX_SPACE = 140;
  /** RegularExpression Id. */
  int T_HX_TOKEN = 141;
  /** RegularExpression Id. */
  int T_HX_FRAGMENT = 142;
  /** RegularExpression Id. */
  int T_HX_NESTED = 143;
  /** RegularExpression Id. */
  int T_HX_FRAGMENT_REF = 144;
  /** RegularExpression Id. */
  int T_HX_RE_NAME = 145;
  /** RegularExpression Id. */
  int T_HX_RE_WORD = 146;
  /** RegularExpression Id. */
  int T_HX_META = 147;
  /** RegularExpression Id. */
  int T_HX_VAR = 148;
  /** RegularExpression Id. */
  int T_HX_NATURAL = 149;
  /** RegularExpression Id. */
  int T_HX_INTEGER = 150;
  /** RegularExpression Id. */
  int T_HX_UNNATURAL = 151;
  /** RegularExpression Id. */
  int T_HX_STRING = 152;
  /** RegularExpression Id. */
  int T_HX_STRING1CHAR = 153;
  /** RegularExpression Id. */
  int T_HX_STRING2CHAR = 154;
  /** RegularExpression Id. */
  int T_HX_ESCAPEDCHAR = 155;
  /** RegularExpression Id. */
  int T_HX_HEX = 156;
  /** RegularExpression Id. */
  int T_HX_CHAR_CLASS = 157;
  /** RegularExpression Id. */
  int T_HX_CC_NOT = 158;
  /** RegularExpression Id. */
  int T_HX_CC_RBRACKET = 159;
  /** RegularExpression Id. */
  int T_HX_CC_DASH = 160;
  /** RegularExpression Id. */
  int T_HX_CC_OTHER = 161;
  /** RegularExpression Id. */
  int T_HX_CC_SKIP = 162;
  /** RegularExpression Id. */
  int T_HX_PP_CONCRETE_SPACE = 163;
  /** RegularExpression Id. */
  int T_HX_PP_CONCRETE_WORD = 164;

  /** Lexical state. */
  int DEFAULT = 0;
  /** Lexical state. */
  int HX_RE = 1;
  /** Lexical state. */
  int HX_IN_CONCRETE = 2;
  /** Lexical state. */
  int HX_IN_NESTED_CONCRETE = 3;
  /** Lexical state. */
  int HX_NESTED_COMMENT = 4;
  /** Lexical state. */
  int HX_PP = 5;
  /** Lexical state. */
  int IN_PP_UNCONCRETE = 6;
  /** Lexical state. */
  int IN_PP_NESTED_UNCONCRETE = 7;
  /** Lexical state. */
  int HX_CC = 8;

  /** Literal token values. */
  String[] tokenImage = {
    "<EOF>",
    "\"INT\"",
    "\"ID\"",
    "\"STR\"",
    "\"Integers\"",
    "\"Mem\"",
    "\"Regs\"",
    "\"Expression\"",
    "\"Label\"",
    "\"FT\"",
    "\"ArgumentSignature\"",
    "\"Op\"",
    "\"Constant\"",
    "\"TypeIdentifierTail\"",
    "\"IfTail\"",
    "\"Reg\"",
    "\"After1\"",
    "\"ExpressionListTail\"",
    "\"Local\"",
    "\"Declaration\"",
    "\"Identifier\"",
    "\"Statement\"",
    "\"Rs\"",
    "\"String\"",
    "\"TypeList\"",
    "\"Instruction\"",
    "\"Instructions\"",
    "\"Declarations\"",
    "\"Computed\"",
    "\"Statements\"",
    "\"Type\"",
    "\"TypeListTail\"",
    "\"Sign\"",
    "\"Integer\"",
    "\"Arg\"",
    "\"Program\"",
    "\"ExpressionList\"",
    "\"FrameAccess\"",
    "\"FrameAccess1\"",
    "\"FrameAccess2\"",
    "\"NoFT\"",
    "\"MoFT\"",
    "\"AppendFT\"",
    "\"Immediate\"",
    "\"Reference\"",
    "\"Data1\"",
    "\"Join1\"",
    "\"P1\"",
    "\"P1Ds\"",
    "\"D\"",
    "\"RegLocal\"",
    "\"FrameLocal\"",
    "\"NoRs\"",
    "\"MoRs\"",
    "\"AppendRs\"",
    "\"XRegs\"",
    "\"XRegs1\"",
    "\"XRegs2\"",
    "\"AddConstant\"",
    "\"AddConstant1\"",
    "\"AddConstant2\"",
    "\"Compile\"",
    "\"P2\"",
    "\"P2Load\"",
    "\"P\"",
    "\"Ds\"",
    "\"F\"",
    "\"AS\"",
    "\"AS2\"",
    "\"Store\"",
    "\"StoreReg\"",
    "\"Load\"",
    "\"S\"",
    "\"SingleS\"",
    "\"IT\"",
    "\"FunctionCall\"",
    "\"FunctionCall2\"",
    "\"E\"",
    "\"Incr\"",
    "\"__HACS__\"",
    "\"\\u27e6\"",
    "\"\\u27e6\"",
    "\"\\u27e6\"",
    "\"\\u27e7\"",
    "\"\\u27e7\"",
    "<token of kind 85>",
    "\"/*\"",
    "\"/*\"",
    "\"*/\"",
    "<token of kind 89>",
    "\"\\u27e8\"",
    "\"\\u27e8\"",
    "\"\\u27e8\"",
    "\"\\u27e9\"",
    "\"\\u27e9\"",
    "<token of kind 95>",
    "<token of kind 96>",
    "\";\"",
    "\"|\"",
    "\"(\"",
    "\")\"",
    "\"*\"",
    "\"+\"",
    "\"?\"",
    "\"_\"",
    "\".\"",
    "\":\"",
    "\"{\"",
    "\"}\"",
    "\"[\"",
    "\"]\"",
    "\",\"",
    "\"\\u2200\"",
    "\"\\u2192\"",
    "\"\\u2191\"",
    "\"\\u2193\"",
    "\"\\u00ac\"",
    "\"@\"",
    "<T_HX_DOTTEDNAME>",
    "\"as\"",
    "\"attribute\"",
    "\"automatic\"",
    "\"binds\"",
    "\"compose\"",
    "\"data\"",
    "\"default\"",
    "\"free\"",
    "\"fresh\"",
    "\"global\"",
    "\"import\"",
    "\"main\"",
    "\"module\"",
    "\"priority\"",
    "\"rule\"",
    "\"scheme\"",
    "\"sort\"",
    "\"static\"",
    "\"sugar\"",
    "\"symbol\"",
    "\"tag\"",
    "\"space\"",
    "\"token\"",
    "\"fragment\"",
    "\"nested\"",
    "<T_HX_FRAGMENT_REF>",
    "<T_HX_RE_NAME>",
    "<T_HX_RE_WORD>",
    "<T_HX_META>",
    "<T_HX_VAR>",
    "<T_HX_NATURAL>",
    "<T_HX_INTEGER>",
    "<T_HX_UNNATURAL>",
    "<T_HX_STRING>",
    "<T_HX_STRING1CHAR>",
    "<T_HX_STRING2CHAR>",
    "<T_HX_ESCAPEDCHAR>",
    "<T_HX_HEX>",
    "<T_HX_CHAR_CLASS>",
    "\"^\"",
    "\"]\"",
    "\"-\"",
    "<T_HX_CC_OTHER>",
    "\"\\u0001\"",
    "<T_HX_PP_CONCRETE_SPACE>",
    "<T_HX_PP_CONCRETE_WORD>",
  };

}
