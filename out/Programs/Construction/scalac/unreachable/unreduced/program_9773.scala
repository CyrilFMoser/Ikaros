package Program_5 

object Test {
sealed trait T_A
sealed trait T_B[A, B]
case class CC_A(a: T_B[T_A, T_A], b: T_A) extends T_A
case class CC_B() extends T_A
case class CC_C() extends T_A
case class CC_D[C]() extends T_B[CC_B, C]
case class CC_E[D]() extends T_B[CC_B, D]
case class CC_F[E](a: CC_D[E], b: CC_E[E]) extends T_B[CC_B, E]

val v_a: T_A = null
val v_b: Int = v_a match{
  case CC_A(_, CC_A(_, CC_A(_, _))) => 0 
  case CC_A(_, CC_A(_, CC_B())) => 1 
  case CC_A(_, CC_A(_, CC_C())) => 2 
  case CC_A(_, CC_B()) => 3 
  case CC_A(_, CC_C()) => 4 
  case CC_B() => 5 
}
}
// This is not matched: CC_C()