package Program_8 

object Test {
sealed trait T_A
sealed trait T_B[A, B]
case class CC_A(a: T_A) extends T_A
case class CC_B(a: T_B[CC_A, T_A], b: T_A, c: T_B[T_A, (CC_A,T_A)]) extends T_A
case class CC_C(a: Int) extends T_A
case class CC_D[C](a: CC_C, b: T_A) extends T_B[CC_A, C]
case class CC_E[D](a: T_B[D, D]) extends T_B[CC_A, D]
case class CC_F[E]() extends T_B[CC_A, E]

val v_a: T_A = null
val v_b: Int = v_a match{
  case CC_A(CC_A(_)) => 0 
  case CC_A(CC_B(_, CC_A(_), _)) => 1 
  case CC_A(CC_B(_, CC_B(_, _, _), _)) => 2 
  case CC_A(CC_B(_, CC_C(_), _)) => 3 
  case CC_A(CC_C(_)) => 4 
  case CC_C(_) => 5 
}
}
// This is not matched: CC_B(_, _, _)