package Program_14 

object Test {
sealed trait T_A[A]
sealed trait T_B[B, C]
case class CC_A(a: Boolean) extends T_A[T_A[T_B[Boolean, Char]]]
case class CC_B[D, E](a: T_A[D], b: T_B[D, D], c: E) extends T_B[D, E]
case class CC_C[F, G](a: F, b: T_B[G, F], c: Char) extends T_B[G, F]
case class CC_D[H](a: T_B[H, H]) extends T_B[CC_A, H]

val v_a: CC_D[Byte] = null
val v_b: Int = v_a match{
  case CC_D(CC_B(_, _, _)) => 0 
  case CC_D(CC_C(_, _, _)) => 1 
}
}