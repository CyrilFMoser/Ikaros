package Program_30 

package Program_8 

object Test {
sealed trait T_A
case class CC_A[A](a: T_A) extends T_A
case class CC_B(a: T_A, b: Char, c: ((Int,Byte),T_A)) extends T_A

val v_a: CC_B = null
val v_b: Int = v_a match{
  case CC_B(_, _, ((_,_),CC_B(_, _, _))) => 0 
  case CC_B(_, _, ((_,_),CC_A(_))) => 1 
  case CC_B(CC_B(_, _, _), _, ((_,_),CC_A(_))) => 2 
}
}
// This is not matched: (CC_B Wildcard Wildcard (Tuple (Tuple Int Byte) (CC_A T_A Wildcard T_A)) T_A)
// This is not matched: (CC_A (T_B (Tuple Char Byte) Char)
//      Wildcard
//      Wildcard
//      (T_A (T_B (Tuple Char Byte) Char)
//           (T_A (T_B (Tuple Char Byte) Char) (T_B (Tuple Char Byte) Char))))