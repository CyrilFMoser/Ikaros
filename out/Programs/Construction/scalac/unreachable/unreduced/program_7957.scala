package Program_23 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C]
case class CC_A[D](a: D, b: D) extends T_A[D, T_B[T_A[D, D]]]
case class CC_B(a: T_B[CC_A[Boolean]]) extends T_A[T_B[Boolean], CC_A[CC_A[Char]]]
case class CC_C[F, E](a: T_A[E, T_B[T_A[E, E]]], b: T_B[F], c: T_A[E, F]) extends T_A[E, F]
case class CC_D(a: T_A[T_A[CC_B, CC_B], Char]) extends T_B[T_A[T_A[CC_B, CC_B], CC_C[Byte, CC_B]]]
case class CC_E(a: CC_D, b: T_A[T_A[Char, CC_B], CC_A[CC_B]]) extends T_B[T_A[T_A[CC_B, CC_B], CC_C[Byte, CC_B]]]

val v_a: T_B[T_A[T_A[CC_B, CC_B], CC_C[Byte, CC_B]]] = null
val v_b: Int = v_a match{
  case CC_D(CC_C(CC_C(_, _, _), _, _)) => 0 
  case CC_E(_, _) => 1 
}
}
// This is not matched: CC_D(CC_C(CC_A(_, _), _, _))