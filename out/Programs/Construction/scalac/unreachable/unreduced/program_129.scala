package Program_9 

object Test {
sealed trait T_A[A]
sealed trait T_B[B, C]
case class CC_A(a: T_A[T_B[Int, Int]], b: Byte) extends T_A[T_B[T_B[Char, Byte], T_A[Byte]]]
case class CC_B(a: T_A[Boolean], b: T_B[Byte, CC_A], c: T_A[CC_A]) extends T_A[T_B[T_B[Char, Byte], T_A[Byte]]]
case class CC_C(a: CC_B, b: T_B[CC_B, T_A[Char]]) extends T_A[T_B[T_B[Char, Byte], T_A[Byte]]]
case class CC_D[D, E]() extends T_B[E, D]
case class CC_E[F](a: CC_B, b: CC_A, c: T_B[F, F]) extends T_B[CC_C, F]
case class CC_F[G](a: CC_D[G, G], b: T_B[CC_C, G]) extends T_B[CC_C, G]

val v_a: T_B[CC_C, CC_A] = null
val v_b: Int = v_a match{
  case CC_D() => 0 
  case CC_E(CC_B(_, _, _), CC_A(_, _), _) => 1 
  case CC_F(CC_D(), _) => 2 
}
}