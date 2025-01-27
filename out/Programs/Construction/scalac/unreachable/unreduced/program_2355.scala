package Program_28 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C]
case class CC_A[D](a: T_B[D], b: Char) extends T_A[D, T_B[T_B[Char]]]
case class CC_B[E](a: T_B[E], b: Byte) extends T_A[E, T_B[T_B[Char]]]
case class CC_C[F](a: CC_A[F]) extends T_A[F, T_B[T_B[Char]]]
case class CC_D(a: CC_A[((Byte,Boolean),Char)], b: T_B[T_B[Boolean]], c: CC_C[CC_A[Char]]) extends T_B[T_B[(Byte,Byte)]]
case class CC_E[G](a: CC_C[G], b: Int, c: T_A[G, G]) extends T_B[G]
case class CC_F[H]() extends T_B[H]

val v_a: T_A[Char, T_B[T_B[Char]]] = null
val v_b: Int = v_a match{
  case CC_A(CC_E(_, _, _), 'x') => 0 
  case CC_A(CC_E(_, _, _), _) => 1 
  case CC_A(CC_F(), 'x') => 2 
  case CC_A(CC_F(), _) => 3 
  case CC_B(CC_E(CC_C(_), _, _), 0) => 4 
  case CC_B(CC_F(), 0) => 5 
  case CC_B(CC_E(CC_C(_), _, _), _) => 6 
  case CC_B(CC_F(), _) => 7 
  case CC_C(CC_A(CC_F(), _)) => 8 
}
}
// This is not matched: CC_C(CC_A(CC_E(_, _, _), _))