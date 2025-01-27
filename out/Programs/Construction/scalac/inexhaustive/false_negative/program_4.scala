package Program_31 

object Test {
sealed trait T_A[A, B]
case class CC_A[C](a: T_A[T_A[C, C], C]) extends T_A[T_A[C, C], C]
case class CC_B[D](a: T_A[D, D]) extends T_A[T_A[D, D], D]
case class CC_C[E](a: T_A[T_A[E, E], E], b: CC_A[E]) extends T_A[T_A[E, E], E]

val v_a: T_A[T_A[Int, Int], Int] = null
val v_b: Int = v_a match{
  case CC_A(_) => 0 
  case CC_B(_) => 1 
  case CC_C(CC_A(_), _) => 2 
  case CC_C(CC_B(_), _) => 3 
  case CC_C(CC_C(CC_A(_), _), _) => 4 
  case CC_C(CC_C(CC_B(_), _), _) => 5 
  case CC_C(CC_C(CC_C(_, _), _), _) => 6 
}
}