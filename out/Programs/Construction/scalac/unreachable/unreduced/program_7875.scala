package Program_13 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C, D]
case class CC_A[E, F](a: (T_A[Char, Boolean],Byte), b: T_A[F, F], c: T_B[F, F]) extends T_A[F, E]
case class CC_B[G](a: CC_A[G, G], b: CC_A[G, G]) extends T_A[G, Byte]
case class CC_C[H](a: T_B[T_A[H, Byte], H], b: H) extends T_A[H, Byte]
case class CC_D[I](a: Byte) extends T_B[Byte, I]
case class CC_E[J](a: CC_C[J], b: T_A[CC_B[J], J], c: J) extends T_B[Byte, J]
case class CC_F[K](a: CC_E[K], b: CC_E[K], c: CC_E[K]) extends T_B[Byte, K]

val v_a: T_B[Byte, Byte] = null
val v_b: Int = v_a match{
  case CC_D(0) => 0 
  case CC_E(CC_C(_, _), _, 0) => 1 
  case CC_E(CC_C(_, _), _, _) => 2 
  case CC_F(CC_E(_, _, _), CC_E(_, _, _), CC_E(CC_C(_, _), CC_A(_, _, _), 0)) => 3 
  case CC_F(CC_E(_, _, _), CC_E(_, _, _), CC_E(CC_C(_, _), CC_B(_, _), 0)) => 4 
  case CC_F(CC_E(_, _, _), CC_E(_, _, _), CC_E(CC_C(_, _), CC_C(_, _), 0)) => 5 
  case CC_F(CC_E(_, _, _), CC_E(_, _, _), CC_E(CC_C(_, _), CC_A(_, _, _), _)) => 6 
  case CC_F(CC_E(_, _, _), CC_E(_, _, _), CC_E(CC_C(_, _), CC_B(_, _), _)) => 7 
  case CC_F(CC_E(_, _, _), CC_E(_, _, _), CC_E(CC_C(_, _), CC_C(_, _), _)) => 8 
}
}
// This is not matched: CC_D(_)