package Program_7 

object Test {
sealed trait T_A[A, B]
case class CC_A[C](a: C, b: T_A[T_A[T_A[T_A[Boolean, Boolean], T_A[Boolean, Boolean]], T_A[T_A[Boolean, Boolean], T_A[Boolean, Boolean]]], T_A[T_A[Boolean, Boolean], T_A[Boolean, Boolean]]], c: C) extends T_A[T_A[C, C], C]
case class CC_B[E](a: Char, b: T_A[T_A[E, E], E], c: T_A[T_A[E, E], E]) extends T_A[T_A[E, E], E]

val v_a: T_A[T_A[Boolean, Boolean], Boolean] = null
val v_b: Int = v_a match{
  case CC_A(_, CC_A(_, _, _), true) => 0 
  case CC_A(_, CC_B(_, _, _), true) => 1 
  case CC_A(_, CC_A(_, _, _), false) => 2 
  case CC_A(_, CC_B(_, _, _), false) => 3 
  case CC_B(_, CC_A(_, CC_A(_, _, _), _), _) => 4 
  case CC_B(_, CC_A(_, CC_B(_, _, _), _), _) => 5 
  case CC_B(_, CC_B(_, _, _), _) => 6 
}
}