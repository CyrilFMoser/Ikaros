package Program_13 

package Program_4 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C, D]
case class CC_A[E](a: E, b: T_B[E, E]) extends T_A[E, T_B[E, E]]
case class CC_B[F, G](a: (Byte,Byte), b: G, c: T_B[F, G]) extends T_A[F, T_B[F, F]]
case class CC_C[H](a: (Char,Byte), b: CC_B[H, H]) extends T_A[H, T_B[H, H]]

val v_a: T_A[Char, T_B[Char, Char]] = null
val v_b: Int = v_a match{
  case CC_A('x', _) => 0 
  case CC_A(_, _) => 1 
  case CC_B(_, _, _) => 2 
  case CC_B((_,0), _, _) => 3 
  case CC_B((0,0), _, _) => 4 
  case CC_B((0,_), _, _) => 5 
  case CC_C(('x',0), CC_B(_, _, _)) => 6 
  case CC_C((_,_), CC_B(_, _, _)) => 7 
}
}
// This is not matched: (CC_B Char Boolean Wildcard Wildcard Wildcard (T_A Char (T_B Char Char)))
// This is not matched: (CC_B (T_B Char))