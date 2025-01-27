package Program_15 

package Program_9 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C]
case class CC_A[D](a: (Int,Boolean), b: T_B[D]) extends T_A[D, T_A[D, D]]
case class CC_B(a: CC_A[Byte], b: T_B[Byte], c: T_B[Char]) extends T_A[Char, T_A[Char, Char]]
case class CC_C[E, F, G](a: CC_A[F]) extends T_A[F, E]
case class CC_D[H](a: T_A[H, H], b: CC_A[H], c: T_B[H]) extends T_B[H]
case class CC_E() extends T_B[CC_D[CC_B]]
case class CC_F(a: T_B[Boolean], b: CC_B, c: (CC_B,CC_E)) extends T_B[CC_D[CC_B]]

val v_a: T_A[Char, T_A[Char, Char]] = null
val v_b: Int = v_a match{
  case CC_C(_) => 0 
  case CC_A((_,_), CC_D(_, _, _)) => 1 
  case CC_A((12,_), CC_D(_, _, _)) => 2 
  case CC_A(_, _) => 3 
  case CC_A((_,_), _) => 4 
  case CC_B(_, CC_D(_, _, _), CC_D(_, _, _)) => 5 
  case CC_B(_, _, _) => 6 
  case CC_B(CC_A(_, _), _, _) => 7 
  case CC_B(CC_A(_, _), CC_D(_, _, _), CC_D(_, _, _)) => 8 
  case CC_B(_, _, CC_D(_, _, _)) => 9 
}
}
// This is not matched: (CC_C (T_A Char Char) Char Boolean Wildcard (T_A Char (T_A Char Char)))
// This is not matched: (CC_B Boolean Int (T_A Int Boolean))