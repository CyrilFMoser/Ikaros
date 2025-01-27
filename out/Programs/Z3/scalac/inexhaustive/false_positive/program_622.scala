package Program_31 

object Test {
sealed trait T_B[A]
case class CC_B(a: Char, b: T_B[Char]) extends T_B[Int]

val v_a: T_B[Int] = null
val v_b: Int = v_a match{
  case CC_B('x', _) => 0 
}
}
// This is not matched: (CC_A Wildcard Wildcard (CC_C (CC_C (CC_C Wildcard T_A) T_A) T_A) T_A)