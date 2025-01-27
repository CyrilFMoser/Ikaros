package Program_12 

object Test {
sealed trait T_A[A]
sealed trait T_B[B, C]
case class CC_A[D](a: Char, b: D) extends T_A[D]
case class CC_B[E]() extends T_A[E]
case class CC_C[F](a: Boolean, b: T_B[F, F]) extends T_A[F]
case class CC_D[G](a: Byte) extends T_B[G, T_A[Byte]]

val v_a: T_A[Byte] = null
val v_b: Int = v_a match{
  case CC_A(_, _) => 0 
  case CC_C(_, _) => 1 
}
}
// This is not matched: CC_B()