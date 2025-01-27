package Program_13 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C, D]
case class CC_A[E](a: T_B[E, E]) extends T_A[E, T_A[E, E]]
case class CC_B(a: ((Char,Char),CC_A[Boolean]), b: T_A[CC_A[Byte], T_A[Int, Char]], c: CC_A[CC_A[Byte]]) extends T_A[Char, T_A[Char, Char]]
case class CC_C(a: T_A[Char, T_A[Char, Char]], b: T_A[Char, T_A[Char, Char]], c: Byte) extends T_A[CC_A[CC_B], T_A[CC_A[CC_B], CC_A[CC_B]]]
case class CC_D[F, G](a: T_B[F, G], b: F, c: T_B[F, F]) extends T_B[F, G]
case class CC_E[H](a: H, b: T_A[H, T_A[H, H]], c: Boolean) extends T_B[H, Boolean]

val v_a: CC_C = null
val v_b: Int = v_a match{
  case CC_C(CC_A(CC_D(_, _, _)), CC_A(CC_D(_, _, _)), _) => 0 
  case CC_C(CC_B((_,_), _, _), CC_A(CC_D(_, _, _)), _) => 1 
  case CC_C(CC_B((_,_), _, _), CC_B((_,_), _, CC_A(_)), _) => 2 
}
}
// This is not matched: CC_C(CC_A(CC_D(_, _, _)), CC_B((_,_), _, CC_A(_)), _)