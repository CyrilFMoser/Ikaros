package Program_30 

object Test {
sealed trait T_A[A]
sealed trait T_B[B, C]
case class CC_A[D](a: Char, b: T_B[D, D], c: (T_A[Boolean],T_B[Byte, Byte])) extends T_A[D]
case class CC_B[E](a: Char, b: E, c: E) extends T_A[E]
case class CC_C[F](a: CC_A[F]) extends T_A[F]
case class CC_D[G](a: G, b: CC_C[G], c: G) extends T_B[G, T_A[Char]]

val v_a: T_A[Int] = null
val v_b: Int = v_a match{
  case CC_A(_, _, _) => 0 
  case CC_B(_, _, 12) => 1 
  case CC_B(_, _, _) => 2 
}
}
// This is not matched: CC_C(_)