package Program_15 

object Test {
sealed trait T_A[A, B]
sealed trait T_B
case class CC_A[C](a: Int) extends T_A[C, T_B]
case class CC_B[D](a: CC_A[D], b: T_A[D, T_B]) extends T_A[D, T_B]
case class CC_C[E](a: T_A[E, E], b: T_A[E, T_B]) extends T_A[E, T_B]
case class CC_D(a: T_A[T_A[T_B, T_B], T_B], b: CC_C[CC_B[Int]]) extends T_B
case class CC_E(a: CC_B[CC_A[T_B]]) extends T_B

val v_a: T_A[CC_D, T_B] = null
val v_b: Int = v_a match{
  case CC_B(_, _) => 0 
  case CC_C(_, CC_A(_)) => 1 
  case CC_C(_, CC_B(_, CC_A(_))) => 2 
  case CC_C(_, CC_B(_, CC_B(_, _))) => 3 
  case CC_C(_, CC_B(_, CC_C(_, _))) => 4 
  case CC_C(_, CC_C(_, CC_A(_))) => 5 
  case CC_C(_, CC_C(_, CC_B(_, _))) => 6 
  case CC_C(_, CC_C(_, CC_C(_, _))) => 7 
}
}
// This is not matched: CC_A(_)