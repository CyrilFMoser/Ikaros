package Program_17 

object Test {
sealed trait T_A[A]
sealed trait T_B[B, C]
case class CC_A[D](a: D) extends T_A[D]
case class CC_B[E](a: T_A[E]) extends T_A[E]
case class CC_C[F](a: T_A[F], b: T_B[F, F]) extends T_A[F]
case class CC_D[G](a: T_A[Byte]) extends T_B[G, CC_A[G]]

val v_a: T_A[Boolean] = null
val v_b: Int = v_a match{
  case CC_A(_) => 0 
  case CC_B(_) => 1 
  case CC_C(_, _) => 2 
}
}