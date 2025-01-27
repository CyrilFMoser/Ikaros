package Program_15 

object Test {
sealed trait T_A[A, B]
case class CC_A[C](a: T_A[T_A[T_A[Boolean, Boolean], T_A[Boolean, Boolean]], T_A[Boolean, Boolean]], b: Int) extends T_A[T_A[C, C], C]
case class CC_B[E](a: CC_A[E], b: T_A[T_A[E, E], E], c: T_A[E, E]) extends T_A[T_A[E, E], E]

val v_a: T_A[T_A[Boolean, Boolean], Boolean] = null
val v_b: Int = v_a match{
  case CC_A(CC_A(CC_A(_, _), _), _) => 0 
  case CC_A(CC_A(CC_B(_, _, _), _), _) => 1 
  case CC_A(CC_B(_, _, _), _) => 2 
  case CC_B(CC_A(_, _), CC_A(_, _), _) => 3 
  case CC_B(CC_A(_, _), CC_B(_, _, _), _) => 4 
}
}