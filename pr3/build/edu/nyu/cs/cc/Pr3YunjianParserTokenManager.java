/* Pr3YunjianParserTokenManager.java */
/* Generated By:JavaCC: Do not edit this line. Pr3YunjianParserTokenManager.java */
package edu.nyu.cs.cc;

/** Token Manager. */
@SuppressWarnings("unused")public class Pr3YunjianParserTokenManager implements Pr3YunjianParserConstants {
                    int nesting; int nestedState;

  /** Debug output. */
  public  java.io.PrintStream debugStream = System.out;
  /** Set debug output. */
  public  void setDebugStream(java.io.PrintStream ds) { debugStream = ds; }
private final int jjStopStringLiteralDfa_0(int pos, long active0, long active1){
   switch (pos)
   {
      case 0:
         if ((active0 & 0x3fc00000L) != 0L)
            return 2;
         if ((active0 & 0x1c1ff1c03dfffeL) != 0L || (active1 & 0x1bbbL) != 0L)
         {
            jjmatchedKind = 78;
            return 2;
         }
         return -1;
      case 1:
         if ((active0 & 0x1c01fffeL) != 0L || (active1 & 0x100L) != 0L)
            return 2;
         if ((active0 & 0x1c1ff1e3bc0000L) != 0L || (active1 & 0x1abbL) != 0L)
         {
            if (jjmatchedPos != 1)
            {
               jjmatchedKind = 78;
               jjmatchedPos = 1;
            }
            return 2;
         }
         return -1;
      case 2:
         if ((active0 & 0x81bf0fbbc00e0L) != 0L || (active1 & 0x838L) != 0L)
            return 2;
         if ((active0 & 0x14040100000000L) != 0L || (active1 & 0x1283L) != 0L)
         {
            jjmatchedKind = 78;
            jjmatchedPos = 2;
            return 2;
         }
         return -1;
      case 3:
         if ((active0 & 0x4000000000000L) != 0L || (active1 & 0x81L) != 0L)
            return 2;
         if ((active0 & 0x10040100000000L) != 0L || (active1 & 0x1202L) != 0L)
         {
            jjmatchedKind = 78;
            jjmatchedPos = 3;
            return 2;
         }
         return -1;
      case 4:
         if ((active0 & 0x40100000000L) != 0L || (active1 & 0x1000L) != 0L)
            return 2;
         if ((active0 & 0x10000000000000L) != 0L || (active1 & 0x202L) != 0L)
         {
            jjmatchedKind = 78;
            jjmatchedPos = 4;
            return 2;
         }
         return -1;
      case 5:
         if ((active1 & 0x202L) != 0L)
            return 2;
         if ((active0 & 0x10000000000000L) != 0L)
         {
            jjmatchedKind = 78;
            jjmatchedPos = 5;
            return 2;
         }
         return -1;
      case 6:
         if ((active0 & 0x10000000000000L) != 0L)
         {
            jjmatchedKind = 78;
            jjmatchedPos = 6;
            return 2;
         }
         return -1;
      default :
         return -1;
   }
}
private final int jjStartNfa_0(int pos, long active0, long active1){
   return jjMoveNfa_0(jjStopStringLiteralDfa_0(pos, active0, active1), pos + 1);
}
private int jjStopAtPos(int pos, int kind)
{
   jjmatchedKind = kind;
   jjmatchedPos = pos;
   return pos + 1;
}
private int jjMoveStringLiteralDfa0_0(){
   switch(curChar)
   {
      case 33:
         jjmatchedKind = 33;
         return jjMoveStringLiteralDfa1_0(0x80000000000000L, 0x0L);
      case 35:
         return jjStopAtPos(0, 66);
      case 38:
         jjmatchedKind = 63;
         return jjMoveStringLiteralDfa1_0(0x40000000000000L, 0x0L);
      case 40:
         return jjStopAtPos(0, 48);
      case 41:
         return jjStopAtPos(0, 49);
      case 42:
         return jjStopAtPos(0, 47);
      case 43:
         return jjStopAtPos(0, 61);
      case 44:
         return jjStopAtPos(0, 17);
      case 45:
         return jjStopAtPos(0, 62);
      case 59:
         return jjStopAtPos(0, 74);
      case 60:
         jjmatchedKind = 57;
         return jjMoveStringLiteralDfa1_0(0x400000000000000L, 0x0L);
      case 61:
         jjmatchedKind = 70;
         return jjMoveStringLiteralDfa1_0(0x100000000000000L, 0x0L);
      case 62:
         jjmatchedKind = 59;
         return jjMoveStringLiteralDfa1_0(0x1000000000000000L, 0x0L);
      case 65:
         return jjMoveStringLiteralDfa1_0(0x300000L, 0x0L);
      case 66:
         jjmatchedKind = 22;
         return jjMoveStringLiteralDfa1_0(0x3f800000L, 0x0L);
      case 67:
         return jjMoveStringLiteralDfa1_0(0x40000000L, 0x0L);
      case 68:
         return jjMoveStringLiteralDfa1_0(0x0L, 0x38L);
      case 69:
         return jjMoveStringLiteralDfa1_0(0x80000000L, 0x0L);
      case 76:
         return jjMoveStringLiteralDfa1_0(0x11000c0002L, 0x0L);
      case 77:
         return jjMoveStringLiteralDfa1_0(0xe000000000L, 0x0L);
      case 79:
         return jjMoveStringLiteralDfa1_0(0x10000000000L, 0x0L);
      case 80:
         return jjMoveStringLiteralDfa1_0(0x4L, 0x0L);
      case 82:
         return jjMoveStringLiteralDfa1_0(0x2000000fff8L, 0x0L);
      case 83:
         return jjMoveStringLiteralDfa1_0(0x1c0000010000L, 0x0L);
      case 91:
         return jjStopAtPos(0, 45);
      case 93:
         return jjStopAtPos(0, 46);
      case 99:
         return jjMoveStringLiteralDfa1_0(0x4000000000000L, 0x0L);
      case 101:
         return jjMoveStringLiteralDfa1_0(0x0L, 0x80L);
      case 102:
         return jjMoveStringLiteralDfa1_0(0x10000000000000L, 0x0L);
      case 105:
         return jjMoveStringLiteralDfa1_0(0x8000000000000L, 0x100L);
      case 110:
         return jjMoveStringLiteralDfa1_0(0x0L, 0x1L);
      case 114:
         return jjMoveStringLiteralDfa1_0(0x0L, 0x200L);
      case 115:
         return jjMoveStringLiteralDfa1_0(0x0L, 0x2L);
      case 118:
         return jjMoveStringLiteralDfa1_0(0x0L, 0x800L);
      case 119:
         return jjMoveStringLiteralDfa1_0(0x0L, 0x1000L);
      case 123:
         return jjStopAtPos(0, 34);
      case 124:
         return jjMoveStringLiteralDfa1_0(0x20000000000000L, 0x0L);
      case 125:
         return jjStopAtPos(0, 35);
      default :
         return jjMoveNfa_0(0, 0);
   }
}
private int jjMoveStringLiteralDfa1_0(long active0, long active1){
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
      jjStopStringLiteralDfa_0(0, active0, active1);
      return 1;
   }
   switch(curChar)
   {
      case 38:
         if ((active0 & 0x40000000000000L) != 0L)
            return jjStopAtPos(1, 54);
         break;
      case 48:
         if ((active0 & 0x8L) != 0L)
            return jjStartNfaWithStates_0(1, 3, 2);
         break;
      case 49:
         if ((active0 & 0x10L) != 0L)
         {
            jjmatchedKind = 4;
            jjmatchedPos = 1;
         }
         return jjMoveStringLiteralDfa2_0(active0, 0xe0L, active1, 0L);
      case 50:
         if ((active0 & 0x100L) != 0L)
            return jjStartNfaWithStates_0(1, 8, 2);
         break;
      case 51:
         if ((active0 & 0x200L) != 0L)
            return jjStartNfaWithStates_0(1, 9, 2);
         break;
      case 52:
         if ((active0 & 0x400L) != 0L)
            return jjStartNfaWithStates_0(1, 10, 2);
         break;
      case 53:
         if ((active0 & 0x800L) != 0L)
            return jjStartNfaWithStates_0(1, 11, 2);
         break;
      case 54:
         if ((active0 & 0x1000L) != 0L)
            return jjStartNfaWithStates_0(1, 12, 2);
         break;
      case 55:
         if ((active0 & 0x2000L) != 0L)
            return jjStartNfaWithStates_0(1, 13, 2);
         break;
      case 56:
         if ((active0 & 0x4000L) != 0L)
            return jjStartNfaWithStates_0(1, 14, 2);
         break;
      case 57:
         if ((active0 & 0x8000L) != 0L)
            return jjStartNfaWithStates_0(1, 15, 2);
         break;
      case 61:
         if ((active0 & 0x80000000000000L) != 0L)
            return jjStopAtPos(1, 55);
         else if ((active0 & 0x100000000000000L) != 0L)
            return jjStopAtPos(1, 56);
         else if ((active0 & 0x400000000000000L) != 0L)
            return jjStopAtPos(1, 58);
         else if ((active0 & 0x1000000000000000L) != 0L)
            return jjStopAtPos(1, 60);
         break;
      case 67:
         if ((active0 & 0x4L) != 0L)
            return jjStartNfaWithStates_0(1, 2, 2);
         return jjMoveStringLiteralDfa2_0(active0, 0L, active1, 0x18L);
      case 68:
         return jjMoveStringLiteralDfa2_0(active0, 0x1100100000L, active1, 0L);
      case 69:
         return jjMoveStringLiteralDfa2_0(active0, 0x800000L, active1, 0x20L);
      case 71:
         return jjMoveStringLiteralDfa2_0(active0, 0x3000000L, active1, 0L);
      case 76:
         if ((active0 & 0x4000000L) != 0L)
         {
            jjmatchedKind = 26;
            jjmatchedPos = 1;
         }
         return jjMoveStringLiteralDfa2_0(active0, 0x18000000L, active1, 0L);
      case 77:
         return jjMoveStringLiteralDfa2_0(active0, 0x40000000L, active1, 0L);
      case 78:
         return jjMoveStringLiteralDfa2_0(active0, 0x20200000L, active1, 0L);
      case 79:
         return jjMoveStringLiteralDfa2_0(active0, 0x2080000000L, active1, 0L);
      case 80:
         if ((active0 & 0x10000L) != 0L)
            return jjStartNfaWithStates_0(1, 16, 2);
         break;
      case 82:
         if ((active0 & 0x2L) != 0L)
            return jjStartNfaWithStates_0(1, 1, 2);
         return jjMoveStringLiteralDfa2_0(active0, 0x10000000000L, active1, 0L);
      case 83:
         return jjMoveStringLiteralDfa2_0(active0, 0x200000c0000L, active1, 0L);
      case 84:
         return jjMoveStringLiteralDfa2_0(active0, 0xc0000000000L, active1, 0L);
      case 85:
         return jjMoveStringLiteralDfa2_0(active0, 0x104000000000L, active1, 0L);
      case 86:
         return jjMoveStringLiteralDfa2_0(active0, 0x8000000000L, active1, 0L);
      case 97:
         return jjMoveStringLiteralDfa2_0(active0, 0L, active1, 0x800L);
      case 101:
         return jjMoveStringLiteralDfa2_0(active0, 0L, active1, 0x200L);
      case 102:
         if ((active1 & 0x100L) != 0L)
            return jjStartNfaWithStates_0(1, 72, 2);
         break;
      case 104:
         return jjMoveStringLiteralDfa2_0(active0, 0x4000000000000L, active1, 0x1000L);
      case 105:
         return jjMoveStringLiteralDfa2_0(active0, 0L, active1, 0x2L);
      case 108:
         return jjMoveStringLiteralDfa2_0(active0, 0L, active1, 0x80L);
      case 110:
         return jjMoveStringLiteralDfa2_0(active0, 0x8000000000000L, active1, 0L);
      case 117:
         return jjMoveStringLiteralDfa2_0(active0, 0x10000000000000L, active1, 0x1L);
      case 124:
         if ((active0 & 0x20000000000000L) != 0L)
            return jjStopAtPos(1, 53);
         break;
      default :
         break;
   }
   return jjStartNfa_0(0, active0, active1);
}
private int jjMoveStringLiteralDfa2_0(long old0, long active0, long old1, long active1){
   if (((active0 &= old0) | (active1 &= old1)) == 0L)
      return jjStartNfa_0(0, old0, old1);
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
      jjStopStringLiteralDfa_0(1, active0, active1);
      return 2;
   }
   switch(curChar)
   {
      case 48:
         if ((active0 & 0x20L) != 0L)
            return jjStartNfaWithStates_0(2, 5, 2);
         break;
      case 49:
         if ((active0 & 0x40L) != 0L)
            return jjStartNfaWithStates_0(2, 6, 2);
         break;
      case 50:
         if ((active0 & 0x80L) != 0L)
            return jjStartNfaWithStates_0(2, 7, 2);
         break;
      case 66:
         if ((active0 & 0x20000000000L) != 0L)
            return jjStartNfaWithStates_0(2, 41, 2);
         else if ((active0 & 0x100000000000L) != 0L)
            return jjStartNfaWithStates_0(2, 44, 2);
         break;
      case 68:
         if ((active0 & 0x100000L) != 0L)
            return jjStartNfaWithStates_0(2, 20, 2);
         else if ((active0 & 0x200000L) != 0L)
            return jjStartNfaWithStates_0(2, 21, 2);
         break;
      case 69:
         if ((active0 & 0x1000000L) != 0L)
            return jjStartNfaWithStates_0(2, 24, 2);
         else if ((active0 & 0x8000000L) != 0L)
            return jjStartNfaWithStates_0(2, 27, 2);
         else if ((active0 & 0x20000000L) != 0L)
            return jjStartNfaWithStates_0(2, 29, 2);
         break;
      case 70:
         if ((active1 & 0x20L) != 0L)
            return jjStartNfaWithStates_0(2, 69, 2);
         break;
      case 73:
         if ((active1 & 0x8L) != 0L)
            return jjStartNfaWithStates_0(2, 67, 2);
         break;
      case 76:
         if ((active0 & 0x40000L) != 0L)
            return jjStartNfaWithStates_0(2, 18, 2);
         else if ((active0 & 0x4000000000L) != 0L)
            return jjStartNfaWithStates_0(2, 38, 2);
         break;
      case 77:
         return jjMoveStringLiteralDfa3_0(active0, 0x40100000000L, active1, 0L);
      case 78:
         if ((active0 & 0x8000000000L) != 0L)
            return jjStartNfaWithStates_0(2, 39, 2);
         break;
      case 80:
         if ((active0 & 0x40000000L) != 0L)
            return jjStartNfaWithStates_0(2, 30, 2);
         break;
      case 81:
         if ((active0 & 0x800000L) != 0L)
            return jjStartNfaWithStates_0(2, 23, 2);
         break;
      case 82:
         if ((active0 & 0x80000L) != 0L)
            return jjStartNfaWithStates_0(2, 19, 2);
         else if ((active0 & 0x80000000L) != 0L)
            return jjStartNfaWithStates_0(2, 31, 2);
         else if ((active0 & 0x1000000000L) != 0L)
            return jjStartNfaWithStates_0(2, 36, 2);
         else if ((active0 & 0x10000000000L) != 0L)
            return jjStartNfaWithStates_0(2, 40, 2);
         else if ((active0 & 0x80000000000L) != 0L)
            return jjStartNfaWithStates_0(2, 43, 2);
         break;
      case 83:
         if ((active1 & 0x10L) != 0L)
            return jjStartNfaWithStates_0(2, 68, 2);
         break;
      case 84:
         if ((active0 & 0x2000000L) != 0L)
            return jjStartNfaWithStates_0(2, 25, 2);
         else if ((active0 & 0x10000000L) != 0L)
            return jjStartNfaWithStates_0(2, 28, 2);
         break;
      case 86:
         if ((active0 & 0x2000000000L) != 0L)
            return jjStartNfaWithStates_0(2, 37, 2);
         break;
      case 97:
         return jjMoveStringLiteralDfa3_0(active0, 0x4000000000000L, active1, 0L);
      case 105:
         return jjMoveStringLiteralDfa3_0(active0, 0L, active1, 0x1000L);
      case 108:
         return jjMoveStringLiteralDfa3_0(active0, 0L, active1, 0x1L);
      case 110:
         return jjMoveStringLiteralDfa3_0(active0, 0x10000000000000L, active1, 0L);
      case 114:
         if ((active1 & 0x800L) != 0L)
            return jjStartNfaWithStates_0(2, 75, 2);
         break;
      case 115:
         return jjMoveStringLiteralDfa3_0(active0, 0L, active1, 0x80L);
      case 116:
         if ((active0 & 0x8000000000000L) != 0L)
            return jjStartNfaWithStates_0(2, 51, 2);
         return jjMoveStringLiteralDfa3_0(active0, 0L, active1, 0x200L);
      case 122:
         return jjMoveStringLiteralDfa3_0(active0, 0L, active1, 0x2L);
      default :
         break;
   }
   return jjStartNfa_0(1, active0, active1);
}
private int jjMoveStringLiteralDfa3_0(long old0, long active0, long old1, long active1){
   if (((active0 &= old0) | (active1 &= old1)) == 0L)
      return jjStartNfa_0(1, old0, old1);
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
      jjStopStringLiteralDfa_0(2, active0, active1);
      return 3;
   }
   switch(curChar)
   {
      case 70:
         return jjMoveStringLiteralDfa4_0(active0, 0x40100000000L, active1, 0L);
      case 99:
         return jjMoveStringLiteralDfa4_0(active0, 0x10000000000000L, active1, 0L);
      case 101:
         if ((active1 & 0x80L) != 0L)
            return jjStartNfaWithStates_0(3, 71, 2);
         return jjMoveStringLiteralDfa4_0(active0, 0L, active1, 0x2L);
      case 108:
         if ((active1 & 0x1L) != 0L)
            return jjStartNfaWithStates_0(3, 64, 2);
         return jjMoveStringLiteralDfa4_0(active0, 0L, active1, 0x1000L);
      case 114:
         if ((active0 & 0x4000000000000L) != 0L)
            return jjStartNfaWithStates_0(3, 50, 2);
         break;
      case 117:
         return jjMoveStringLiteralDfa4_0(active0, 0L, active1, 0x200L);
      default :
         break;
   }
   return jjStartNfa_0(2, active0, active1);
}
private int jjMoveStringLiteralDfa4_0(long old0, long active0, long old1, long active1){
   if (((active0 &= old0) | (active1 &= old1)) == 0L)
      return jjStartNfa_0(2, old0, old1);
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
      jjStopStringLiteralDfa_0(3, active0, active1);
      return 4;
   }
   switch(curChar)
   {
      case 68:
         if ((active0 & 0x100000000L) != 0L)
            return jjStartNfaWithStates_0(4, 32, 2);
         else if ((active0 & 0x40000000000L) != 0L)
            return jjStartNfaWithStates_0(4, 42, 2);
         break;
      case 101:
         if ((active1 & 0x1000L) != 0L)
            return jjStartNfaWithStates_0(4, 76, 2);
         break;
      case 111:
         return jjMoveStringLiteralDfa5_0(active0, 0L, active1, 0x2L);
      case 114:
         return jjMoveStringLiteralDfa5_0(active0, 0L, active1, 0x200L);
      case 116:
         return jjMoveStringLiteralDfa5_0(active0, 0x10000000000000L, active1, 0L);
      default :
         break;
   }
   return jjStartNfa_0(3, active0, active1);
}
private int jjMoveStringLiteralDfa5_0(long old0, long active0, long old1, long active1){
   if (((active0 &= old0) | (active1 &= old1)) == 0L)
      return jjStartNfa_0(3, old0, old1);
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
      jjStopStringLiteralDfa_0(4, active0, active1);
      return 5;
   }
   switch(curChar)
   {
      case 102:
         if ((active1 & 0x2L) != 0L)
            return jjStartNfaWithStates_0(5, 65, 2);
         break;
      case 105:
         return jjMoveStringLiteralDfa6_0(active0, 0x10000000000000L, active1, 0L);
      case 110:
         if ((active1 & 0x200L) != 0L)
            return jjStartNfaWithStates_0(5, 73, 2);
         break;
      default :
         break;
   }
   return jjStartNfa_0(4, active0, active1);
}
private int jjMoveStringLiteralDfa6_0(long old0, long active0, long old1, long active1){
   if (((active0 &= old0) | (active1 &= old1)) == 0L)
      return jjStartNfa_0(4, old0, old1);
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
      jjStopStringLiteralDfa_0(5, active0, 0L);
      return 6;
   }
   switch(curChar)
   {
      case 111:
         return jjMoveStringLiteralDfa7_0(active0, 0x10000000000000L);
      default :
         break;
   }
   return jjStartNfa_0(5, active0, 0L);
}
private int jjMoveStringLiteralDfa7_0(long old0, long active0){
   if (((active0 &= old0)) == 0L)
      return jjStartNfa_0(5, old0, 0L);
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
      jjStopStringLiteralDfa_0(6, active0, 0L);
      return 7;
   }
   switch(curChar)
   {
      case 110:
         if ((active0 & 0x10000000000000L) != 0L)
            return jjStartNfaWithStates_0(7, 52, 2);
         break;
      default :
         break;
   }
   return jjStartNfa_0(6, active0, 0L);
}
private int jjStartNfaWithStates_0(int pos, int kind, int state)
{
   jjmatchedKind = kind;
   jjmatchedPos = pos;
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) { return pos + 1; }
   return jjMoveNfa_0(state, pos + 1);
}
static final long[] jjbitVec0 = {
   0x0L, 0x0L, 0xffffffffffffffffL, 0xffffffffffffffffL
};
private int jjMoveNfa_0(int startState, int curPos)
{
   int startsAt = 0;
   jjnewStateCnt = 24;
   int i = 1;
   jjstateSet[0] = startState;
   int kind = 0x7fffffff;
   for (;;)
   {
      if (++jjround == 0x7fffffff)
         ReInitRounds();
      if (curChar < 64)
      {
         long l = 1L << curChar;
         do
         {
            switch(jjstateSet[--i])
            {
               case 0:
                  if ((0x3ff000000000000L & l) != 0L)
                  {
                     if (kind > 79)
                        kind = 79;
                     { jjCheckNAdd(3); }
                  }
                  else if ((0x100002600L & l) != 0L)
                  {
                     if (kind > 77)
                        kind = 77;
                  }
                  else if (curChar == 47)
                     { jjAddStates(0, 1); }
                  else if (curChar == 34)
                     { jjCheckNAddStates(2, 4); }
                  else if (curChar == 36)
                  {
                     if (kind > 78)
                        kind = 78;
                     { jjCheckNAdd(2); }
                  }
                  break;
               case 1:
                  if (curChar != 36)
                     break;
                  if (kind > 78)
                     kind = 78;
                  { jjCheckNAdd(2); }
                  break;
               case 2:
                  if ((0x3ff001000000000L & l) == 0L)
                     break;
                  if (kind > 78)
                     kind = 78;
                  { jjCheckNAdd(2); }
                  break;
               case 3:
                  if ((0x3ff000000000000L & l) == 0L)
                     break;
                  if (kind > 79)
                     kind = 79;
                  { jjCheckNAdd(3); }
                  break;
               case 4:
                  if (curChar == 34)
                     { jjCheckNAddStates(2, 4); }
                  break;
               case 5:
                  if ((0xfffffffbfffffbffL & l) != 0L)
                     { jjCheckNAddStates(2, 4); }
                  break;
               case 7:
                  if ((0xff000000000400L & l) != 0L)
                     { jjCheckNAddStates(2, 4); }
                  break;
               case 8:
                  if (curChar == 34 && kind > 80)
                     kind = 80;
                  break;
               case 10:
                  if ((0x3ff000000000000L & l) != 0L)
                     jjstateSet[jjnewStateCnt++] = 11;
                  break;
               case 11:
                  if ((0x3ff000000000000L & l) != 0L)
                     { jjCheckNAddStates(2, 4); }
                  break;
               case 12:
                  if ((0xff000000000000L & l) != 0L)
                     { jjCheckNAddTwoStates(13, 14); }
                  break;
               case 13:
                  if ((0xff000000000000L & l) != 0L)
                     { jjCheckNAdd(14); }
                  break;
               case 14:
                  if ((0xff000000000000L & l) != 0L)
                     { jjCheckNAddStates(2, 4); }
                  break;
               case 15:
                  if (curChar == 47)
                     { jjAddStates(0, 1); }
                  break;
               case 16:
                  if (curChar != 47)
                     break;
                  if (kind > 77)
                     kind = 77;
                  { jjCheckNAdd(17); }
                  break;
               case 17:
                  if ((0xfffffffffffffbffL & l) == 0L)
                     break;
                  if (kind > 77)
                     kind = 77;
                  { jjCheckNAdd(17); }
                  break;
               case 18:
                  if (curChar == 42)
                     { jjCheckNAddStates(5, 7); }
                  break;
               case 19:
                  if ((0xfffffbffffffffffL & l) != 0L)
                     { jjCheckNAddStates(5, 7); }
                  break;
               case 20:
                  if (curChar == 42)
                     jjstateSet[jjnewStateCnt++] = 21;
                  break;
               case 21:
                  if ((0xffff7fffffffffffL & l) != 0L)
                     { jjCheckNAddStates(5, 7); }
                  break;
               case 22:
                  if (curChar == 47 && kind > 77)
                     kind = 77;
                  break;
               case 23:
                  if (curChar == 42)
                     jjstateSet[jjnewStateCnt++] = 22;
                  break;
               default : break;
            }
         } while(i != startsAt);
      }
      else if (curChar < 128)
      {
         long l = 1L << (curChar & 077);
         do
         {
            switch(jjstateSet[--i])
            {
               case 0:
               case 2:
                  if ((0x7fffffe87fffffeL & l) == 0L)
                     break;
                  if (kind > 78)
                     kind = 78;
                  { jjCheckNAdd(2); }
                  break;
               case 5:
                  if ((0xffffffffefffffffL & l) != 0L)
                     { jjCheckNAddStates(2, 4); }
                  break;
               case 6:
                  if (curChar == 92)
                     { jjAddStates(8, 10); }
                  break;
               case 7:
                  if ((0x10400010000000L & l) != 0L)
                     { jjCheckNAddStates(2, 4); }
                  break;
               case 9:
                  if (curChar == 120)
                     jjstateSet[jjnewStateCnt++] = 10;
                  break;
               case 10:
                  if ((0x7e0000007eL & l) != 0L)
                     jjstateSet[jjnewStateCnt++] = 11;
                  break;
               case 11:
                  if ((0x7e0000007eL & l) != 0L)
                     { jjCheckNAddStates(2, 4); }
                  break;
               case 17:
                  if (kind > 77)
                     kind = 77;
                  jjstateSet[jjnewStateCnt++] = 17;
                  break;
               case 19:
               case 21:
                  { jjCheckNAddStates(5, 7); }
                  break;
               default : break;
            }
         } while(i != startsAt);
      }
      else
      {
         int i2 = (curChar & 0xff) >> 6;
         long l2 = 1L << (curChar & 077);
         do
         {
            switch(jjstateSet[--i])
            {
               case 5:
                  if ((jjbitVec0[i2] & l2) != 0L)
                     { jjAddStates(2, 4); }
                  break;
               case 17:
                  if ((jjbitVec0[i2] & l2) == 0L)
                     break;
                  if (kind > 77)
                     kind = 77;
                  jjstateSet[jjnewStateCnt++] = 17;
                  break;
               case 19:
               case 21:
                  if ((jjbitVec0[i2] & l2) != 0L)
                     { jjCheckNAddStates(5, 7); }
                  break;
               default : break;
            }
         } while(i != startsAt);
      }
      if (kind != 0x7fffffff)
      {
         jjmatchedKind = kind;
         jjmatchedPos = curPos;
         kind = 0x7fffffff;
      }
      ++curPos;
      if ((i = jjnewStateCnt) == (startsAt = 24 - (jjnewStateCnt = startsAt)))
         return curPos;
      try { curChar = input_stream.readChar(); }
      catch(java.io.IOException e) { return curPos; }
   }
}
static final int[] jjnextStates = {
   16, 18, 5, 6, 8, 19, 20, 23, 7, 9, 12, 
};

/** Token literal values. */
public static final String[] jjstrLiteralImages = {
"", "\114\122", "\120\103", "\122\60", "\122\61", "\122\61\60", "\122\61\61", 
"\122\61\62", "\122\62", "\122\63", "\122\64", "\122\65", "\122\66", "\122\67", "\122\70", 
"\122\71", "\123\120", "\54", "\114\123\114", "\114\123\122", "\101\104\104", 
"\101\116\104", "\102", "\102\105\121", "\102\107\105", "\102\107\124", "\102\114", 
"\102\114\105", "\102\114\124", "\102\116\105", "\103\115\120", "\105\117\122", 
"\114\104\115\106\104", "\41", "\173", "\175", "\114\104\122", "\115\117\126", "\115\125\114", 
"\115\126\116", "\117\122\122", "\122\123\102", "\123\124\115\106\104", "\123\124\122", 
"\123\125\102", "\133", "\135", "\52", "\50", "\51", "\143\150\141\162", "\151\156\164", 
"\146\165\156\143\164\151\157\156", "\174\174", "\46\46", "\41\75", "\75\75", "\74", "\74\75", "\76", "\76\75", 
"\53", "\55", "\46", "\156\165\154\154", "\163\151\172\145\157\146", "\43", 
"\104\103\111", "\104\103\123", "\104\105\106", "\75", "\145\154\163\145", "\151\146", 
"\162\145\164\165\162\156", "\73", "\166\141\162", "\167\150\151\154\145", null, null, null, null, null, 
null, null, null, null, null, };
protected Token jjFillToken()
{
   final Token t;
   final String curTokenImage;
   final int beginLine;
   final int endLine;
   final int beginColumn;
   final int endColumn;
   String im = jjstrLiteralImages[jjmatchedKind];
   curTokenImage = (im == null) ? input_stream.GetImage() : im;
   beginLine = input_stream.getBeginLine();
   beginColumn = input_stream.getBeginColumn();
   endLine = input_stream.getEndLine();
   endColumn = input_stream.getEndColumn();
   t = Token.newToken(jjmatchedKind, curTokenImage);

   t.beginLine = beginLine;
   t.endLine = endLine;
   t.beginColumn = beginColumn;
   t.endColumn = endColumn;

   return t;
}

int curLexState = 0;
int defaultLexState = 0;
int jjnewStateCnt;
int jjround;
int jjmatchedPos;
int jjmatchedKind;

/** Get the next Token. */
public Token getNextToken() 
{
  Token matchedToken;
  int curPos = 0;

  EOFLoop :
  for (;;)
  {
   try
   {
      curChar = input_stream.BeginToken();
   }
   catch(java.io.IOException e)
   {
      jjmatchedKind = 0;
      jjmatchedPos = -1;
      matchedToken = jjFillToken();
      return matchedToken;
   }

   jjmatchedKind = 0x7fffffff;
   jjmatchedPos = 0;
   curPos = jjMoveStringLiteralDfa0_0();
   if (jjmatchedKind != 0x7fffffff)
   {
      if (jjmatchedPos + 1 < curPos)
         input_stream.backup(curPos - jjmatchedPos - 1);
      if ((jjtoToken[jjmatchedKind >> 6] & (1L << (jjmatchedKind & 077))) != 0L)
      {
         matchedToken = jjFillToken();
         return matchedToken;
      }
      else
      {
         continue EOFLoop;
      }
   }
   int error_line = input_stream.getEndLine();
   int error_column = input_stream.getEndColumn();
   String error_after = null;
   boolean EOFSeen = false;
   try { input_stream.readChar(); input_stream.backup(1); }
   catch (java.io.IOException e1) {
      EOFSeen = true;
      error_after = curPos <= 1 ? "" : input_stream.GetImage();
      if (curChar == '\n' || curChar == '\r') {
         error_line++;
         error_column = 0;
      }
      else
         error_column++;
   }
   if (!EOFSeen) {
      input_stream.backup(1);
      error_after = curPos <= 1 ? "" : input_stream.GetImage();
   }
   throw new TokenMgrError(EOFSeen, curLexState, error_line, error_column, error_after, curChar, TokenMgrError.LEXICAL_ERROR);
  }
}

private void jjCheckNAdd(int state)
{
   if (jjrounds[state] != jjround)
   {
      jjstateSet[jjnewStateCnt++] = state;
      jjrounds[state] = jjround;
   }
}
private void jjAddStates(int start, int end)
{
   do {
      jjstateSet[jjnewStateCnt++] = jjnextStates[start];
   } while (start++ != end);
}
private void jjCheckNAddTwoStates(int state1, int state2)
{
   jjCheckNAdd(state1);
   jjCheckNAdd(state2);
}

private void jjCheckNAddStates(int start, int end)
{
   do {
      jjCheckNAdd(jjnextStates[start]);
   } while (start++ != end);
}

    /** Constructor. */
    public Pr3YunjianParserTokenManager(SimpleCharStream stream){

      if (SimpleCharStream.staticFlag)
            throw new Error("ERROR: Cannot use a static CharStream class with a non-static lexical analyzer.");

    input_stream = stream;
  }

  /** Constructor. */
  public Pr3YunjianParserTokenManager (SimpleCharStream stream, int lexState){
    ReInit(stream);
    SwitchTo(lexState);
  }

  /** Reinitialise parser. */
  public void ReInit(SimpleCharStream stream)
  {
    jjmatchedPos = jjnewStateCnt = 0;
    curLexState = defaultLexState;
    input_stream = stream;
    ReInitRounds();
  }

  private void ReInitRounds()
  {
    int i;
    jjround = 0x80000001;
    for (i = 24; i-- > 0;)
      jjrounds[i] = 0x80000000;
  }

  /** Reinitialise parser. */
  public void ReInit(SimpleCharStream stream, int lexState)
  {
    ReInit(stream);
    SwitchTo(lexState);
  }

  /** Switch to specified lex state. */
  public void SwitchTo(int lexState)
  {
    if (lexState >= 1 || lexState < 0)
      throw new TokenMgrError("Error: Ignoring invalid lexical state : " + lexState + ". State unchanged.", TokenMgrError.INVALID_LEXICAL_STATE);
    else
      curLexState = lexState;
  }

/** Lexer state names. */
public static final String[] lexStateNames = {
   "DEFAULT",
};
static final long[] jjtoToken = {
   0xffffffffffffffffL, 0x1dfffL, 
};
static final long[] jjtoSkip = {
   0x0L, 0x2000L, 
};
    protected SimpleCharStream  input_stream;

    private final int[] jjrounds = new int[24];
    private final int[] jjstateSet = new int[2 * 24];

    
    protected char curChar;
}
