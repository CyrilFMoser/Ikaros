package Program_7 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C, D]
case class CC_A(a: T_B[T_A[Char, Byte], T_B[Char, Boolean]]) extends T_A[T_B[T_A[(Char,Boolean), Byte], T_A[Int, Char]], T_B[T_B[Boolean, Char], T_B[Byte, Char]]]
case class CC_B(a: Char) extends T_A[T_B[T_A[(Char,Boolean), Byte], T_A[Int, Char]], T_B[T_B[Boolean, Char], T_B[Byte, Char]]]
case class CC_C[E]() extends T_A[T_B[CC_B, T_A[Char, CC_B]], E]
case class CC_D[F](a: T_A[F, F]) extends T_B[CC_A, F]
case class CC_E[G]() extends T_B[CC_A, G]
case class CC_F[H](a: T_B[H, H], b: CC_C[H], c: H) extends T_B[CC_A, H]

val v_a: T_B[CC_A, Char] = null
val v_b: Int = v_a match{
  case CC_D(_) => 0 
  case CC_E() => 1 
  case CC_F(_, _, _) => 2 
}
}