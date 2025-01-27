package Program_15 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C, D]
case class CC_A[E](a: E, b: T_A[E, T_A[Int, E]]) extends T_A[Int, E]
case class CC_B(a: T_B[(Byte,Boolean), Char], b: CC_A[Byte], c: T_B[Boolean, CC_A[Byte]]) extends T_A[Int, T_A[Int, CC_A[Boolean]]]
case class CC_C[F, G](a: T_A[Int, F]) extends T_A[Int, F]
case class CC_D[H](a: T_A[Int, H]) extends T_B[H, T_B[H, H]]
case class CC_E[I](a: Char, b: CC_B) extends T_B[T_A[(CC_B,CC_B), I], I]
case class CC_F[J](a: CC_B, b: T_B[J, J]) extends T_B[J, T_B[J, J]]

val v_a: T_A[Int, T_A[Int, CC_A[Boolean]]] = null
val v_b: Int = v_a match{
  case CC_A(_, _) => 0 
  case CC_B(_, CC_A(_, _), _) => 1 
  case CC_C(CC_A(CC_A(_, _), _)) => 2 
  case CC_C(CC_A(CC_C(_), _)) => 3 
  case CC_C(CC_B(_, CC_A(_, _), _)) => 4 
  case CC_C(CC_C(CC_A(_, _))) => 5 
  case CC_C(CC_C(CC_B(_, _, _))) => 6 
  case CC_C(CC_C(CC_C(_))) => 7 
}
}