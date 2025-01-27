package Program_19 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C, D]
case class CC_A[E](a: T_B[E, E], b: Boolean) extends T_A[E, T_B[T_A[(Int,Boolean), Char], T_B[Byte, Int]]]
case class CC_B[F](a: CC_A[T_A[F, F]], b: T_A[F, F]) extends T_A[F, T_B[T_A[(Int,Boolean), Char], T_B[Byte, Int]]]
case class CC_C(a: T_A[T_B[Byte, (Char,Char)], CC_B[Boolean]], b: Char, c: CC_A[CC_A[Byte]]) extends T_A[CC_A[Boolean], T_B[T_A[(Int,Boolean), Char], T_B[Byte, Int]]]
case class CC_D[H, G]() extends T_B[H, G]
case class CC_E[I]() extends T_B[I, Char]
case class CC_F[J, K](a: Boolean) extends T_B[(CC_E[CC_C],Int), J]

val v_a: T_A[CC_A[Boolean], T_B[T_A[(Int,Boolean), Char], T_B[Byte, Int]]] = null
val v_b: Int = v_a match{
  case CC_A(_, _) => 0 
  case CC_C(_, 'x', CC_A(_, _)) => 1 
  case CC_C(_, _, CC_A(_, _)) => 2 
}
}
// This is not matched: CC_B(CC_A(CC_D(), _), _)