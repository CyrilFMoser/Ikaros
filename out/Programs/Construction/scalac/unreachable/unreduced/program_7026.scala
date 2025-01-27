package Program_20 

object Test {
sealed trait T_A[A]
sealed trait T_B[B, C]
case class CC_A[D](a: T_A[D], b: Char, c: T_B[(Int,Int), D]) extends T_A[D]
case class CC_B[E](a: T_A[E]) extends T_A[E]
case class CC_C[F](a: T_A[F], b: T_A[F], c: F) extends T_A[F]
case class CC_D[G]() extends T_B[G, Boolean]
case class CC_E[H](a: CC_A[H]) extends T_B[H, Boolean]
case class CC_F[I](a: CC_A[I], b: CC_C[I]) extends T_B[I, (T_B[Byte, Boolean],T_A[Char])]

val v_a: T_B[Char, Boolean] = null
val v_b: Int = v_a match{
  case CC_D() => 0 
  case CC_E(CC_A(CC_B(_), _, _)) => 1 
  case CC_E(CC_A(CC_C(_, _, _), _, _)) => 2 
}
}
// This is not matched: CC_E(CC_A(CC_A(_, _, _), _, _))