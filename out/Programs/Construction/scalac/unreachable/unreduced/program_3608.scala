package Program_11 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C]
case class CC_A[D](a: T_B[D]) extends T_A[D, T_A[T_A[Char, Int], (Char,Byte)]]
case class CC_B[E](a: T_A[E, E], b: Boolean) extends T_A[E, T_B[T_A[Boolean, Char]]]
case class CC_C[F](a: CC_B[F]) extends T_A[F, T_B[T_A[Boolean, Char]]]
case class CC_D[G](a: G, b: T_B[G], c: T_B[G]) extends T_B[G]
case class CC_E[H](a: T_A[CC_D[H], H]) extends T_B[H]

val v_a: T_A[Byte, T_A[T_A[Char, Int], (Char,Byte)]] = null
val v_b: Int = v_a match{
  case CC_A(CC_D(_, CC_D(_, _, _), CC_D(_, _, _))) => 0 
  case CC_A(CC_D(_, CC_D(_, _, _), CC_E(_))) => 1 
  case CC_A(CC_D(_, CC_E(_), CC_E(_))) => 2 
  case CC_A(CC_E(_)) => 3 
}
}
// This is not matched: CC_A(CC_D(_, CC_E(_), CC_D(_, _, _)))