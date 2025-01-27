package Program_27 

object Test {
sealed trait T_A
sealed trait T_B[A]
case class CC_A(a: T_B[T_B[Boolean]], b: T_A, c: T_B[T_A]) extends T_A
case class CC_B[B]() extends T_B[B]
case class CC_C[C]() extends T_B[C]

val v_a: CC_A = null
val v_b: Int = v_a match{
  case CC_A(_, _, CC_B()) => 0 
}
}
// This is not matched: CC_B(CC_A())