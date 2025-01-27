package Program_13 

object Test {
sealed trait T_A[A, B]
case class CC_B[D](a: (Byte,Char)) extends T_A[D, T_A[D, Int]]

val v_a: CC_B[Boolean] = null
val v_b: Int = v_a match{
  case CC_B((_,'x')) => 0 
}
}
// This is not matched: (CC_B (CC_B (CC_C Wildcard Wildcard T_B) Wildcard Wildcard T_B)
//      Wildcard
//      Wildcard
//      T_B)