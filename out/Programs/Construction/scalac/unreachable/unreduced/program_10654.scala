package Program_23 

object Test {
sealed trait T_A[A]
sealed trait T_B[B]
case class CC_A(a: Int, b: T_A[T_A[Char]]) extends T_A[T_A[T_A[Boolean]]]
case class CC_B(a: Int, b: T_A[T_A[CC_A]]) extends T_A[T_A[T_A[Boolean]]]
case class CC_C(a: CC_A, b: T_B[T_B[CC_A]]) extends T_A[T_A[T_A[Boolean]]]
case class CC_D[C, D](a: T_A[D]) extends T_B[C]
case class CC_E[E]() extends T_B[E]

val v_a: T_A[T_A[T_A[Boolean]]] = null
val v_b: Int = v_a match{
  case CC_A(_, _) => 0 
  case CC_C(_, _) => 1 
}
}
// This is not matched: CC_B(_, _)