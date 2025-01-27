package Program_6 

object Test {
sealed trait T_A
sealed trait T_B[A, B]
case class CC_A() extends T_A
case class CC_B(a: T_B[Int, T_A], b: T_B[T_B[CC_A, T_A], CC_A]) extends T_A
case class CC_C(a: Char, b: T_A) extends T_A
case class CC_D[C](a: CC_C) extends T_B[CC_B, C]
case class CC_E[D](a: T_B[D, D], b: CC_A) extends T_B[CC_B, D]
case class CC_F[E]() extends T_B[CC_B, E]

val v_a: T_A = null
val v_b: Int = v_a match{
  case CC_B(_, _) => 0 
  case CC_C(_, _) => 1 
}
}
// This is not matched: CC_A()