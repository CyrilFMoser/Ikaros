package Program_2 

object Test {
sealed trait T_A[A, B]
case class CC_A[C](a: T_A[T_A[Boolean, C], C], b: T_A[T_A[Boolean, C], C]) extends T_A[T_A[Boolean, C], C]
case class CC_B[D]() extends T_A[T_A[Boolean, D], D]
case class CC_C[E](a: T_A[E, E]) extends T_A[T_A[Boolean, E], E]

val v_a: T_A[T_A[Boolean, Int], Int] = null
val v_b: Int = v_a match{
  case CC_A(_, CC_A(CC_A(_, _), CC_A(_, _))) => 0 
  case CC_A(_, CC_A(CC_B(), CC_A(_, _))) => 1 
  case CC_A(_, CC_A(CC_C(_), CC_A(_, _))) => 2 
  case CC_A(_, CC_A(CC_A(_, _), CC_B())) => 3 
  case CC_A(_, CC_A(CC_B(), CC_B())) => 4 
  case CC_A(_, CC_A(CC_C(_), CC_B())) => 5 
  case CC_A(_, CC_A(CC_A(_, _), CC_C(_))) => 6 
  case CC_A(_, CC_A(CC_B(), CC_C(_))) => 7 
  case CC_A(_, CC_A(CC_C(_), CC_C(_))) => 8 
  case CC_A(_, CC_B()) => 9 
  case CC_A(_, CC_C(_)) => 10 
  case CC_B() => 11 
  case CC_C(_) => 12 
}
}