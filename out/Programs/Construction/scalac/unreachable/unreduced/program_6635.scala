package Program_9 

object Test {
sealed trait T_A[A]
sealed trait T_B[B, C]
case class CC_A() extends T_A[T_B[T_A[Char], Int]]
case class CC_B() extends T_A[T_B[T_A[Char], Int]]
case class CC_C[D](a: T_A[D], b: D, c: T_A[D]) extends T_A[D]
case class CC_D[E](a: T_A[T_A[E]], b: E) extends T_B[T_A[CC_A], E]

val v_a: T_A[T_B[T_A[Char], Int]] = null
val v_b: Int = v_a match{
  case CC_A() => 0 
  case CC_B() => 1 
  case CC_C(_, _, CC_A()) => 2 
  case CC_C(_, _, CC_B()) => 3 
  case CC_C(_, _, CC_C(CC_A(), _, CC_A())) => 4 
  case CC_C(_, _, CC_C(CC_B(), _, CC_A())) => 5 
  case CC_C(_, _, CC_C(CC_C(_, _, _), _, CC_A())) => 6 
  case CC_C(_, _, CC_C(CC_A(), _, CC_B())) => 7 
  case CC_C(_, _, CC_C(CC_B(), _, CC_B())) => 8 
  case CC_C(_, _, CC_C(CC_C(_, _, _), _, CC_B())) => 9 
  case CC_C(_, _, CC_C(CC_A(), _, CC_C(_, _, _))) => 10 
  case CC_C(_, _, CC_C(CC_B(), _, CC_C(_, _, _))) => 11 
  case CC_C(_, _, CC_C(CC_C(_, _, _), _, CC_C(_, _, _))) => 12 
}
}