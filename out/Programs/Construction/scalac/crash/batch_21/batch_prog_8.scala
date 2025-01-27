package Program_8 

object Test {
sealed trait T_A
sealed trait T_B[A, B]
case class CC_A(a: T_A, b: T_B[T_B[T_A, Int], T_B[T_A, T_A]]) extends T_A
case class CC_B(a: T_B[T_B[T_A, T_A], (T_A,T_A)], b: CC_A) extends T_A
case class CC_C() extends T_A
case class CC_D[C, D]() extends T_B[D, C]
case class CC_E[E](a: E) extends T_B[CC_B, E]

val v_a: CC_E[CC_A] = null
val v_b: Int = v_a match{
  case CC_E(CC_A(_, _)) => 0 
}
}