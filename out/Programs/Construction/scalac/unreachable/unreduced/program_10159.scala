package Program_20 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C, D]
case class CC_A[E](a: Int, b: Boolean, c: Char) extends T_A[Char, E]
case class CC_B[F](a: Byte, b: F, c: T_A[F, F]) extends T_A[F, T_A[Char, T_A[Char, Char]]]
case class CC_C[G, H](a: CC_A[G], b: T_A[Char, G], c: T_A[H, H]) extends T_B[G, H]
case class CC_D() extends T_B[Byte, CC_A[CC_A[Int]]]

val v_a: T_B[Byte, CC_A[CC_A[Int]]] = null
val v_b: Int = v_a match{
  case CC_C(_, _, _) => 0 
  case CC_D() => 1 
}
}