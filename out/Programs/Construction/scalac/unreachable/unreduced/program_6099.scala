package Program_1 

object Test {
sealed trait T_A[A]
sealed trait T_B[B, C]
case class CC_A[D](a: T_B[D, D], b: D) extends T_A[D]
case class CC_B[E](a: E, b: T_B[E, E]) extends T_A[E]
case class CC_C[F](a: CC_B[F], b: (Int,CC_A[Boolean]), c: F) extends T_B[F, T_A[T_A[Boolean]]]
case class CC_D(a: CC_A[T_A[Byte]]) extends T_B[T_A[T_A[Char]], T_A[T_A[Boolean]]]
case class CC_E(a: T_A[CC_D], b: Byte) extends T_B[T_A[T_A[Char]], T_A[T_A[Boolean]]]

val v_a: T_B[T_A[T_A[Char]], T_A[T_A[Boolean]]] = null
val v_b: Int = v_a match{
  case CC_C(_, _, _) => 0 
  case CC_D(_) => 1 
  case CC_E(CC_B(_, _), _) => 2 
}
}
// This is not matched: CC_E(CC_A(_, CC_D(_)), _)