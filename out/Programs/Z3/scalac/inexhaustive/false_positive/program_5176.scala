package Program_13 

object Test {
sealed trait T_A
sealed trait T_B[A, B]
case class CC_C[C]() extends T_B[C, Char]
case class CC_E[E](a: T_B[T_A, Char]) extends T_B[E, Char]

val v_a: CC_E[Int] = null
val v_b: Int = v_a match{
  case CC_E(CC_C()) => 0 
}
}
// This is not matched: (CC_A (CC_B T_A) T_A)