package Program_15 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C, D]
case class CC_F(a: (Int,Char)) extends T_B[Int, Char]

val v_a: CC_F = null
val v_b: Int = v_a match{
  case CC_F((_,'x')) => 0 
}
}
// This is not matched: (CC_E Wildcard Wildcard T_B)