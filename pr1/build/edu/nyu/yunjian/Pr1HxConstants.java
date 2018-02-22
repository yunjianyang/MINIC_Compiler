/* Generated By:JavaCC: Do not edit this line. Pr1HxConstants.java */
package edu.nyu.yunjian;


/**
 * Token literal values and constants.
 * Generated by org.javacc.parser.OtherFilesGen#start()
 */
public interface Pr1HxConstants {

  /** End of File. */
  int EOF = 0;
  /** RegularExpression Id. */
  int T_HX_CONCRETE = 18;
  /** RegularExpression Id. */
  int T_HX_PP_UNCONCRETE = 28;
  /** RegularExpression Id. */
  int T_HX_SEMI = 31;
  /** RegularExpression Id. */
  int T_HX_BAR = 32;
  /** RegularExpression Id. */
  int T_HX_LPAREN = 33;
  /** RegularExpression Id. */
  int T_HX_RPAREN = 34;
  /** RegularExpression Id. */
  int T_HX_STAR = 35;
  /** RegularExpression Id. */
  int T_HX_PLUS = 36;
  /** RegularExpression Id. */
  int T_HX_QUEST = 37;
  /** RegularExpression Id. */
  int T_HX_SUB = 38;
  /** RegularExpression Id. */
  int T_HX_DOT = 39;
  /** RegularExpression Id. */
  int T_HX_COLON = 40;
  /** RegularExpression Id. */
  int T_HX_LBRACE = 41;
  /** RegularExpression Id. */
  int T_HX_RBRACE = 42;
  /** RegularExpression Id. */
  int T_HX_LBRACKET = 43;
  /** RegularExpression Id. */
  int T_HX_RBRACKET = 44;
  /** RegularExpression Id. */
  int T_HX_COMMA = 45;
  /** RegularExpression Id. */
  int T_HX_FORALL = 46;
  /** RegularExpression Id. */
  int T_HX_ARROW = 47;
  /** RegularExpression Id. */
  int T_HX_UP = 48;
  /** RegularExpression Id. */
  int T_HX_DOWN = 49;
  /** RegularExpression Id. */
  int T_HX_NOT = 50;
  /** RegularExpression Id. */
  int T_HX_AT = 51;
  /** RegularExpression Id. */
  int T_HX_DOTTEDNAME = 52;
  /** RegularExpression Id. */
  int T_HX_AS = 53;
  /** RegularExpression Id. */
  int T_HX_ATTRIBUTE = 54;
  /** RegularExpression Id. */
  int T_HX_AUTOMATIC = 55;
  /** RegularExpression Id. */
  int T_HX_BINDS = 56;
  /** RegularExpression Id. */
  int T_HX_COMPOSE = 57;
  /** RegularExpression Id. */
  int T_HX_DATA = 58;
  /** RegularExpression Id. */
  int T_HX_DEFAULT = 59;
  /** RegularExpression Id. */
  int T_HX_FREE = 60;
  /** RegularExpression Id. */
  int T_HX_FRESH = 61;
  /** RegularExpression Id. */
  int T_HX_GLOBAL = 62;
  /** RegularExpression Id. */
  int T_HX_IMPORT = 63;
  /** RegularExpression Id. */
  int T_HX_MAIN = 64;
  /** RegularExpression Id. */
  int T_HX_MODULE = 65;
  /** RegularExpression Id. */
  int T_HX_PRIORITY = 66;
  /** RegularExpression Id. */
  int T_HX_RULE = 67;
  /** RegularExpression Id. */
  int T_HX_SCHEME = 68;
  /** RegularExpression Id. */
  int T_HX_SORT = 69;
  /** RegularExpression Id. */
  int T_HX_STATIC = 70;
  /** RegularExpression Id. */
  int T_HX_SUGAR = 71;
  /** RegularExpression Id. */
  int T_HX_SYMBOL = 72;
  /** RegularExpression Id. */
  int T_HX_TAG = 73;
  /** RegularExpression Id. */
  int T_HX_SPACE = 74;
  /** RegularExpression Id. */
  int T_HX_TOKEN = 75;
  /** RegularExpression Id. */
  int T_HX_FRAGMENT = 76;
  /** RegularExpression Id. */
  int T_HX_NESTED = 77;
  /** RegularExpression Id. */
  int T_HX_FRAGMENT_REF = 78;
  /** RegularExpression Id. */
  int T_HX_RE_NAME = 79;
  /** RegularExpression Id. */
  int T_HX_RE_WORD = 80;
  /** RegularExpression Id. */
  int T_HX_META = 81;
  /** RegularExpression Id. */
  int T_HX_VAR = 82;
  /** RegularExpression Id. */
  int T_HX_NATURAL = 83;
  /** RegularExpression Id. */
  int T_HX_INTEGER = 84;
  /** RegularExpression Id. */
  int T_HX_UNNATURAL = 85;
  /** RegularExpression Id. */
  int T_HX_STRING = 86;
  /** RegularExpression Id. */
  int T_HX_STRING1CHAR = 87;
  /** RegularExpression Id. */
  int T_HX_STRING2CHAR = 88;
  /** RegularExpression Id. */
  int T_HX_ESCAPEDCHAR = 89;
  /** RegularExpression Id. */
  int T_HX_HEX = 90;
  /** RegularExpression Id. */
  int T_HX_CHAR_CLASS = 91;
  /** RegularExpression Id. */
  int T_HX_CC_NOT = 92;
  /** RegularExpression Id. */
  int T_HX_CC_RBRACKET = 93;
  /** RegularExpression Id. */
  int T_HX_CC_DASH = 94;
  /** RegularExpression Id. */
  int T_HX_CC_OTHER = 95;
  /** RegularExpression Id. */
  int T_HX_CC_SKIP = 96;
  /** RegularExpression Id. */
  int T_HX_PP_CONCRETE_SPACE = 97;
  /** RegularExpression Id. */
  int T_HX_PP_CONCRETE_WORD = 98;

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
    "\"Identifier\"",
    "\"Integer\"",
    "\"String\"",
    "\"Type\"",
    "\"Typehelper\"",
    "\"Expr\"",
    "\"Exprhelper\"",
    "\"Statement\"",
    "\"Statementhelper\"",
    "\"Declaration\"",
    "\"Declarationhelper\"",
    "\"Program\"",
    "\"__HACS__\"",
    "\"\\u27e6\"",
    "\"\\u27e6\"",
    "\"\\u27e6\"",
    "\"\\u27e7\"",
    "\"\\u27e7\"",
    "<token of kind 19>",
    "\"/*\"",
    "\"/*\"",
    "\"*/\"",
    "<token of kind 23>",
    "\"\\u27e8\"",
    "\"\\u27e8\"",
    "\"\\u27e8\"",
    "\"\\u27e9\"",
    "\"\\u27e9\"",
    "<token of kind 29>",
    "<token of kind 30>",
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
