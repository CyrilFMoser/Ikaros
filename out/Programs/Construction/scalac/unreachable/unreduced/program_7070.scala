package Program_13 

object Test {
sealed trait T_A[A]
sealed trait T_B[B]
case class CC_A[C](a: T_A[T_B[T_A[Char]]]) extends T_A[C]
case class CC_B(a: Boolean) extends T_A[T_A[T_B[Int]]]
case class CC_C[E](a: T_A[E], b: T_B[E], c: T_A[E]) extends T_A[E]
case class CC_D(a: (T_A[CC_B],CC_C[CC_B]), b: T_A[CC_C[CC_B]]) extends T_B[CC_A[T_A[CC_B]]]

val v_a: T_A[Boolean] = null
val v_b: Int = v_a match{
  case CC_A(_) => 0 
  case CC_C(_, _, CC_A(CC_C(_, _, _))) => 1 
  case CC_C(_, _, CC_C(_, _, _)) => 2 
}
}
// This is not matched: CC_C(_, _, CC_A(CC_A(_)))