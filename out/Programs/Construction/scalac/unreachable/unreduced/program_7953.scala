package Program_7 

object Test {
sealed trait T_A[A]
sealed trait T_B[B, C]
case class CC_A[D]() extends T_A[D]
case class CC_B[E](a: T_B[E, E], b: T_A[E], c: T_A[E]) extends T_A[E]
case class CC_C[F]() extends T_A[F]
case class CC_D[G]() extends T_B[(CC_A[Byte],CC_C[Byte]), G]
case class CC_E(a: T_A[Boolean]) extends T_B[(CC_A[Byte],CC_C[Byte]), Byte]
case class CC_F[H](a: T_B[T_A[H], H], b: H) extends T_B[(CC_A[Byte],CC_C[Byte]), H]

val v_a: T_B[(CC_A[Byte],CC_C[Byte]), Int] = null
val v_b: Int = v_a match{
  case CC_D() => 0 
  case CC_F(_, _) => 1 
}
}