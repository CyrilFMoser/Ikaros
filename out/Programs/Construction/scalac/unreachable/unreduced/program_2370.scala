package Program_28 

object Test {
sealed trait T_A[A]
sealed trait T_B[B, C]
case class CC_A[D](a: T_B[T_A[D], D], b: Int, c: T_B[D, D]) extends T_A[D]
case class CC_B[E]() extends T_A[E]
case class CC_C(a: T_A[Byte]) extends T_A[T_A[CC_A[Int]]]
case class CC_D[F](a: T_B[F, Int], b: T_A[F], c: T_B[F, F]) extends T_B[F, Int]
case class CC_E[G]() extends T_B[G, Int]
case class CC_F[H](a: T_A[H], b: T_B[H, Int], c: Boolean) extends T_B[H, Int]

val v_a: T_A[CC_C] = null
val v_b: Int = v_a match{
  case CC_A(_, _, _) => 0 
  case CC_B() => 1 
}
}