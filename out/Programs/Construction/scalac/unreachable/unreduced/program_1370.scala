package Program_11 

object Test {
sealed trait T_A[A]
sealed trait T_B[B, C]
case class CC_A[D](a: T_A[D], b: D, c: T_B[D, T_B[D, D]]) extends T_A[D]
case class CC_B[E](a: T_A[E], b: T_A[E]) extends T_A[E]
case class CC_C[F](a: (CC_A[Byte],T_A[Boolean]), b: T_A[F], c: Char) extends T_B[T_A[CC_B[Boolean]], F]
case class CC_D[G, H](a: G) extends T_B[T_A[CC_B[Boolean]], G]
case class CC_E[I](a: CC_C[I], b: Char, c: Boolean) extends T_B[T_A[CC_B[Boolean]], I]

val v_a: T_B[T_A[CC_B[Boolean]], Byte] = null
val v_b: Int = v_a match{
  case CC_C(_, CC_A(_, _, _), _) => 0 
  case CC_D(_) => 1 
  case CC_E(_, _, _) => 2 
}
}
// This is not matched: CC_C(_, CC_B(_, _), _)