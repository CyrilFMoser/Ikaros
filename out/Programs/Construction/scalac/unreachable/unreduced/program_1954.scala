package Program_30 

object Test {
sealed trait T_A[A]
sealed trait T_B[B, C]
case class CC_A[D](a: T_B[D, D], b: T_A[D]) extends T_A[D]
case class CC_B[E](a: T_B[E, E], b: T_B[CC_A[E], E]) extends T_A[E]
case class CC_C[F](a: T_A[F]) extends T_A[F]
case class CC_D[G, H](a: G, b: H, c: (T_B[Boolean, Int],T_A[Byte])) extends T_B[G, Byte]
case class CC_E[I](a: I, b: CC_B[I]) extends T_B[I, Byte]
case class CC_F[J](a: Byte) extends T_B[J, Byte]

val v_a: T_A[Int] = null
val v_b: Int = v_a match{
  case CC_A(_, _) => 0 
  case CC_B(_, _) => 1 
  case CC_C(_) => 2 
}
}