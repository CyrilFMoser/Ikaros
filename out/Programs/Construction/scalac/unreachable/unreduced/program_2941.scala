package Program_1 

object Test {
sealed trait T_A
sealed trait T_B[A, B]
case class CC_A(a: T_B[T_B[T_A, T_A], ((Char,Char),T_A)]) extends T_A
case class CC_B(a: CC_A) extends T_A
case class CC_C(a: T_A) extends T_A
case class CC_D[C](a: CC_B) extends T_B[(T_A,CC_A), C]
case class CC_E[D](a: CC_A) extends T_B[(T_A,CC_A), D]
case class CC_F[E](a: T_A, b: E, c: T_B[E, E]) extends T_B[CC_D[CC_D[T_A]], E]

val v_a: T_A = null
val v_b: Int = v_a match{
  case CC_A(_) => 0 
  case CC_B(CC_A(_)) => 1 
  case CC_C(CC_A(_)) => 2 
  case CC_C(CC_B(CC_A(_))) => 3 
  case CC_C(CC_C(CC_A(_))) => 4 
  case CC_C(CC_C(CC_B(_))) => 5 
  case CC_C(CC_C(CC_C(_))) => 6 
}
}