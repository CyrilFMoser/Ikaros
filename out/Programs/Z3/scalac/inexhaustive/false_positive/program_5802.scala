package Program_14 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C]
case class CC_B[E]() extends T_B[E]
case class CC_C[G]() extends T_B[G]
case class CC_D(a: T_B[Boolean]) extends T_B[T_A[Byte, Char]]

val v_a: CC_D = null
val v_b: Int = v_a match{
  case CC_D(CC_C()) => 0 
}
}
// This is not matched: (CC_B T_A)