package Program_16 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C, D]
case class CC_A[E](a: T_A[E, Int], b: T_A[E, E]) extends T_A[E, Int]
case class CC_B[F](a: F, b: T_B[F, F], c: Byte) extends T_B[F, T_A[Char, Int]]
case class CC_C[G](a: Byte, b: G) extends T_B[G, T_A[Char, Int]]

val v_a: T_B[Char, T_A[Char, Int]] = null
val v_b: Int = v_a match{
  case CC_B(_, _, _) => 0 
  case CC_C(0, _) => 1 
  case CC_C(_, _) => 2 
}
}