package Program_28 

object Test {
sealed trait T_A[A, B]
sealed trait T_B
case class CC_A[C, D](a: T_B, b: T_B) extends T_A[C, T_A[T_B, T_A[T_B, T_B]]]
case class CC_B[E](a: T_B, b: E, c: T_A[E, E]) extends T_A[E, T_A[T_B, T_A[T_B, T_B]]]
case class CC_C[F](a: T_B) extends T_A[F, T_A[T_B, T_A[T_B, T_B]]]

val v_a: T_A[Int, T_A[T_B, T_A[T_B, T_B]]] = null
val v_b: Int = v_a match{
  case CC_A(_, _) => 0 
  case CC_B(_, _, _) => 1 
}
}
// This is not matched: CC_C(_)