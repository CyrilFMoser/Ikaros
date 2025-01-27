package Program_15 

object Test {
sealed trait T_A[A, B]
sealed trait T_B
case class CC_A[C]() extends T_A[T_B, C]
case class CC_C[E]() extends T_A[T_B, E]
case class CC_D(a: T_A[T_B, (Int,Boolean)]) extends T_B

val v_a: CC_D = null
val v_b: Int = v_a match{
  case CC_D(CC_C()) => 0 
}
}
// This is not matched: (CC_A (T_A Int Boolean) Boolean (T_A (T_A Int Boolean) Boolean))