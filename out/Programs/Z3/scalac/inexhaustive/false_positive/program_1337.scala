package Program_30 

package Program_15 

object Test {
sealed trait T_A[A, B]
sealed trait T_B
case class CC_A[D, C](a: T_A[D, T_B], b: Byte) extends T_A[C, D]
case class CC_B[E](a: (T_B,Int), b: T_B, c: CC_A[E, E]) extends T_A[E, T_A[E, E]]
case class CC_C[F](a: T_A[F, T_B], b: F) extends T_A[F, T_A[F, F]]
case class CC_D(a: (T_B,T_B), b: T_A[T_B, Boolean], c: CC_B[T_B]) extends T_B
case class CC_E[G](a: Boolean) extends T_B
case class CC_F(a: T_A[T_B, T_B], b: CC_C[CC_D], c: CC_E[(Byte,Int)]) extends T_B

val v_a: T_B = null
val v_b: Int = v_a match{
  case CC_E(_) => 0 
  case CC_F(_, _, CC_E(_)) => 1 
  case CC_F(CC_A(_, _), _, CC_E(_)) => 2 
  case CC_F(_, CC_C(_, _), _) => 3 
  case CC_D((CC_F(_, _, _),CC_E(_)), CC_A(_, _), CC_B(_, _, _)) => 4 
  case CC_D((CC_E(_),CC_D(_, _, _)), CC_A(_, _), _) => 5 
  case CC_D(_, CC_A(_, _), _) => 6 
  case CC_D((CC_D(_, _, _),CC_E(_)), CC_A(_, _), _) => 7 
  case CC_D((CC_D(_, _, _),CC_E(_)), CC_A(_, _), CC_B(_, _, _)) => 8 
  case CC_D((CC_F(_, _, _),CC_D(_, _, _)), _, CC_B(_, _, _)) => 9 
  case CC_D((CC_D(_, _, _),CC_E(_)), _, CC_B(_, _, _)) => 10 
  case CC_D((CC_D(_, _, _),CC_D(_, _, _)), _, CC_B(_, _, _)) => 11 
}
}
// This is not matched: (CC_E T_B Wildcard T_B)
// This is not matched: (CC_E T_B Wildcard T_B)