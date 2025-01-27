package Program_26 

object Test {
sealed trait T_A[A, B]
case class CC_A[C](a: T_A[T_A[C, C], C], b: T_A[C, C]) extends T_A[T_A[C, C], C]
case class CC_B[D]() extends T_A[T_A[D, D], D]
case class CC_C[E](a: CC_A[E], b: Char) extends T_A[T_A[E, E], E]

val v_a: T_A[T_A[Boolean, Boolean], Boolean] = null
val v_b: Int = v_a match{
  case CC_A(CC_A(CC_A(_, _), _), _) => 0 
  case CC_A(CC_A(CC_B(), _), _) => 1 
  case CC_A(CC_A(CC_C(_, _), _), _) => 2 
  case CC_A(CC_B(), _) => 3 
  case CC_A(CC_C(_, 'x'), _) => 4 
  case CC_A(CC_C(_, _), _) => 5 
  case CC_B() => 6 
  case CC_C(_, _) => 7 
}
}