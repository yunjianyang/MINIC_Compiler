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
  int T_HX_CONCRETE = 78;
  /** RegularExpression Id. */
  int T_HX_PP_UNCONCRETE = 88;
  /** RegularExpression Id. */
  int T_HX_SEMI = 91;
  /** RegularExpression Id. */
  int T_HX_BAR = 92;
  /** RegularExpression Id. */
  int T_HX_LPAREN = 93;
  /** RegularExpression Id. */
  int T_HX_RPAREN = 94;
  /** RegularExpression Id. */
  int T_HX_STAR = 95;
  /** RegularExpression Id. */
  int T_HX_PLUS = 96;
  /** RegularExpression Id. */
  int T_HX_QUEST = 97;
  /** RegularExpression Id. */
  int T_HX_SUB = 98;
  /** RegularExpression Id. */
  int T_HX_DOT = 99;
  /** RegularExpression Id. */
  int T_HX_COLON = 100;
  /** RegularExpression Id. */
  int T_HX_LBRACE = 101;
  /** RegularExpression Id. */
  int T_HX_RBRACE = 102;
  /** RegularExpression Id. */
  int T_HX_LBRACKET = 103;
  /** RegularExpression Id. */
  int T_HX_RBRACKET = 104;
  /** RegularExpression Id. */
  int T_HX_COMMA = 105;
  /** RegularExpression Id. */
  int T_HX_FORALL = 106;
  /** RegularExpression Id. */
  int T_HX_ARROW = 107;
  /** RegularExpression Id. */
  int T_HX_UP = 108;
  /** RegularExpression Id. */
  int T_HX_DOWN = 109;
  /** RegularExpression Id. */
  int T_HX_NOT = 110;
  /** RegularExpression Id. */
  int T_HX_AT = 111;
  /** RegularExpression Id. */
  int T_HX_DOTTEDNAME = 112;
  /** RegularExpression Id. */
  int T_HX_AS = 113;
  /** RegularExpression Id. */
  int T_HX_ATTRIBUTE = 114;
  /** RegularExpression Id. */
  int T_HX_AUTOMATIC = 115;
  /** RegularExpression Id. */
  int T_HX_BINDS = 116;
  /** RegularExpression Id. */
  int T_HX_COMPOSE = 117;
  /** RegularExpression Id. */
  int T_HX_DATA = 118;
  /** RegularExpression Id. */
  int T_HX_DEFAULT = 119;
  /** RegularExpression Id. */
  int T_HX_FREE = 120;
  /** RegularExpression Id. */
  int T_HX_FRESH = 121;
  /** RegularExpression Id. */
  int T_HX_GLOBAL = 122;
  /** RegularExpression Id. */
  int T_HX_IMPORT = 123;
  /** RegularExpression Id. */
  int T_HX_MAIN = 124;
  /** RegularExpression Id. */
  int T_HX_MODULE = 125;
  /** RegularExpression Id. */
  int T_HX_PRIORITY = 126;
  /** RegularExpression Id. */
  int T_HX_RULE = 127;
  /** RegularExpression Id. */
  int T_HX_SCHEME = 128;
  /** RegularExpression Id. */
  int T_HX_SORT = 129;
  /** RegularExpression Id. */
  int T_HX_STATIC = 130;
  /** RegularExpression Id. */
  int T_HX_SUGAR = 131;
  /** RegularExpression Id. */
  int T_HX_SYMBOL = 132;
  /** RegularExpression Id. */
  int T_HX_TAG = 133;
  /** RegularExpression Id. */
  int T_HX_SPACE = 134;
  /** RegularExpression Id. */
  int T_HX_TOKEN = 135;
  /** RegularExpression Id. */
  int T_HX_FRAGMENT = 136;
  /** RegularExpression Id. */
  int T_HX_NESTED = 137;
  /** RegularExpression Id. */
  int T_HX_FRAGMENT_REF = 138;
  /** RegularExpression Id. */
  int T_HX_RE_NAME = 139;
  /** RegularExpression Id. */
  int T_HX_RE_WORD = 140;
  /** RegularExpression Id. */
  int T_HX_META = 141;
  /** RegularExpression Id. */
  int T_HX_VAR = 142;
  /** RegularExpression Id. */
  int T_HX_NATURAL = 143;
  /** RegularExpression Id. */
  int T_HX_INTEGER = 144;
  /** RegularExpression Id. */
  int T_HX_UNNATURAL = 145;
  /** RegularExpression Id. */
  int T_HX_STRING = 146;
  /** RegularExpression Id. */
  int T_HX_STRING1CHAR = 147;
  /** RegularExpression Id. */
  int T_HX_STRING2CHAR = 148;
  /** RegularExpression Id. */
  int T_HX_ESCAPEDCHAR = 149;
  /** RegularExpression Id. */
  int T_HX_HEX = 150;
  /** RegularExpression Id. */
  int T_HX_CHAR_CLASS = 151;
  /** RegularExpression Id. */
  int T_HX_CC_NOT = 152;
  /** RegularExpression Id. */
  int T_HX_CC_RBRACKET = 153;
  /** RegularExpression Id. */
  int T_HX_CC_DASH = 154;
  /** RegularExpression Id. */
  int T_HX_CC_OTHER = 155;
  /** RegularExpression Id. */
  int T_HX_CC_SKIP = 156;
  /** RegularExpression Id. */
  int T_HX_PP_CONCRETE_SPACE = 157;
  /** RegularExpression Id. */
  int T_HX_PP_CONCRETE_WORD = 158;

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
    "\"STR\"",
    "\"ID\"",
    "\"Instructions\"",
    "\"Instruction\"",
    "\"Type\"",
    "\"IfTail\"",
    "\"Declarations\"",
    "\"Integers\"",
    "\"Label\"",
    "\"Arg\"",
    "\"TypeList\"",
    "\"Constant\"",
    "\"Identifier\"",
    "\"Reg\"",
    "\"Declaration\"",
    "\"Expression\"",
    "\"ExpressionList\"",
    "\"Local\"",
    "\"TypeIdentifierTail\"",
    "\"Statements\"",
    "\"After1\"",
    "\"ArgumentSignature\"",
    "\"Program\"",
    "\"Regs\"",
    "\"Statement\"",
    "\"Sign\"",
    "\"Computed\"",
    "\"Mem\"",
    "\"Integer\"",
    "\"Rs\"",
    "\"FT\"",
    "\"String\"",
    "\"Op\"",
    "\"ExpressionListTail\"",
    "\"TypeListTail\"",
    "\"Compile\"",
    "\"P2\"",
    "\"P2Load\"",
    "\"P\"",
    "\"Ds\"",
    "\"F\"",
    "\"AS\"",
    "\"AS2\"",
    "\"S\"",
    "\"SingleS\"",
    "\"E\"",
    "\"AddConstant\"",
    "\"AddConstant1\"",
    "\"AddConstant2\"",
    "\"Immediate\"",
    "\"Reference\"",
    "\"RegLocal\"",
    "\"FrameLocal\"",
    "\"Data1\"",
    "\"Join1\"",
    "\"P1\"",
    "\"P1Ds\"",
    "\"D\"",
    "\"Dummy\"",
    "\"FrameAccess\"",
    "\"FrameAccess1\"",
    "\"FrameAccess2\"",
    "\"NoRs\"",
    "\"MoRs\"",
    "\"AppendRs\"",
    "\"XRegs\"",
    "\"XRegs1\"",
    "\"XRegs2\"",
    "\"NoFT\"",
    "\"MoFT\"",
    "\"AppendFT\"",
    "\"__HACS__\"",
    "\"\\u27e6\"",
    "\"\\u27e6\"",
    "\"\\u27e6\"",
    "\"\\u27e7\"",
    "\"\\u27e7\"",
    "<token of kind 79>",
    "\"/*\"",
    "\"/*\"",
    "\"*/\"",
    "<token of kind 83>",
    "\"\\u27e8\"",
    "\"\\u27e8\"",
    "\"\\u27e8\"",
    "\"\\u27e9\"",
    "\"\\u27e9\"",
    "<token of kind 89>",
    "<token of kind 90>",
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