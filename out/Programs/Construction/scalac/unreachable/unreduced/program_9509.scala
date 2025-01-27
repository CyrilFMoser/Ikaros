package Program_17 

object Test {
sealed trait T_A[A]
sealed trait T_B[B, C]
case class CC_A[D](a: T_B[D, T_B[D, D]]) extends T_A[D]
case class CC_B[E](a: Byte, b: Int) extends T_A[E]
case class CC_C[F](a: Char, b: T_A[F], c: Byte) extends T_A[F]
case class CC_D[G]() extends T_B[G, CC_B[CC_B[G]]]
case class CC_E[H](a: (Int,Byte), b: H, c: Int) extends T_B[H, CC_B[CC_B[H]]]
case class CC_F[I](a: T_A[I]) extends T_B[I, CC_B[CC_B[I]]]

val v_a: T_A[Char] = null
val v_b: Int = v_a match{
  case CC_A(_) => 0 
  case CC_B(_, _) => 1 
  case CC_C(_, CC_A(_), _) => 2 
  case CC_C(_, CC_B(_, _), _) => 3 
  case CC_C(_, CC_C(_, _, _), _) => 4 
}
}