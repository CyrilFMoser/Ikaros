package Program_22 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C, D]
case class CC_A[F, E](a: F, b: F) extends T_A[E, F]
case class CC_B[H, G](a: H, b: T_B[H, T_A[G, H]], c: T_A[G, G]) extends T_A[G, H]
case class CC_C[J, I]() extends T_A[I, J]
case class CC_D(a: Byte) extends T_B[Char, T_A[Boolean, T_A[Boolean, Byte]]]
case class CC_E() extends T_B[Char, T_A[Boolean, T_A[Boolean, Byte]]]
case class CC_F[K]() extends T_B[K, T_A[T_A[CC_D, Byte], T_A[CC_D, Byte]]]

val v_a: T_A[T_B[Char, T_A[Boolean, T_A[Boolean, Byte]]], Char] = null
val v_b: Int = v_a match{
  case CC_B(_, _, CC_A(CC_D(_), _)) => 0 
  case CC_B(_, _, CC_A(CC_E(), _)) => 1 
  case CC_B(_, _, CC_B(_, _, _)) => 2 
  case CC_B(_, _, CC_C()) => 3 
  case CC_C() => 4 
}
}
// This is not matched: CC_A(_, _)