package Program_26 

object Test {
sealed trait T_A[A]
sealed trait T_B[B, C]
case class CC_A[D, E](a: T_A[E], b: T_B[D, D], c: T_B[D, D]) extends T_A[D]
case class CC_B[F](a: F, b: F) extends T_A[F]
case class CC_C[G](a: CC_A[G, G]) extends T_B[(CC_B[Char],CC_A[Byte, Int]), G]
case class CC_D[H](a: H) extends T_B[(CC_B[Char],CC_A[Byte, Int]), H]
case class CC_E[I]() extends T_B[(CC_B[Char],CC_A[Byte, Int]), I]

val v_a: T_A[Int] = null
val v_b: Int = v_a match{
  case CC_A(_, _, _) => 0 
  case CC_B(_, _) => 1 
}
}