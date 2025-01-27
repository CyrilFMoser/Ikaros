package Program_5 

object Test {
sealed trait T_A[A]
sealed trait T_B[B, C]
case class CC_A[D, E](a: T_A[E], b: T_A[E], c: T_A[E]) extends T_A[D]
case class CC_B[F](a: T_B[F, F], b: T_B[T_A[Byte], F]) extends T_A[F]
case class CC_C[G](a: T_A[G], b: Byte) extends T_B[G, T_B[Boolean, G]]
case class CC_D() extends T_B[CC_A[Boolean, Byte], T_B[Boolean, CC_A[Boolean, Byte]]]

val v_a: T_A[T_B[CC_A[Boolean, Byte], T_B[Boolean, CC_A[Boolean, Byte]]]] = null
val v_b: Int = v_a match{
  case CC_A(_, _, _) => 0 
  case CC_B(_, _) => 1 
}
}