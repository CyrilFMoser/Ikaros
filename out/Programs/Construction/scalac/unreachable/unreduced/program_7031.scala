package Program_28 

object Test {
sealed trait T_A[A, B]
sealed trait T_B
case class CC_A[C](a: T_A[T_A[C, C], C], b: C) extends T_A[T_A[C, C], C]
case class CC_B[D](a: D) extends T_A[T_A[D, D], D]
case class CC_C[E](a: T_A[E, E], b: (CC_B[T_B],Char), c: CC_A[E]) extends T_A[T_A[E, E], E]
case class CC_D(a: T_A[T_A[CC_A[T_B], CC_A[T_B]], CC_A[T_B]]) extends T_B

val v_a: T_A[T_A[Int, Int], Int] = null
val v_b: Int = v_a match{
  case CC_A(_, _) => 0 
  case CC_B(_) => 1 
  case CC_C(_, _, CC_A(CC_A(_, _), _)) => 2 
  case CC_C(_, _, CC_A(CC_B(_), _)) => 3 
}
}
// This is not matched: CC_C(_, _, CC_A(CC_C(_, _, _), _))