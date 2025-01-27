package Program_31 

object Test {
sealed trait T_B[B]
case class CC_B(a: Int, b: T_B[Char]) extends T_B[Int]

val v_a: T_B[Int] = null
val v_b: Int = v_a match{
  case CC_B(12, _) => 0 
}
}
// This is not matched: (CC_A Wildcard T_A)