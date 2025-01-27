package Program_15 

package Program_0 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C, D]
case class CC_A[E, F](a: E, b: (Char,Byte), c: T_A[F, E]) extends T_A[T_B[Char, Char], E]

val v_a: T_A[T_B[Char, Char], Char] = null
val v_b: Int = v_a match{
  case CC_A('x', (_,_), _) => 0 
  case CC_A('x', _, CC_A(_, _, _)) => 1 
  case CC_A('x', (_,0), _) => 2 
  case CC_A(_, (_,0), _) => 3 
  case CC_A(_, _, _) => 4 
  case CC_A(_, (_,0), CC_A(_, _, _)) => 5 
  case CC_A('x', ('x',_), _) => 6 
  case CC_A(_, (_,_), CC_A(_, _, _)) => 7 
  case CC_A(_, (_,_), _) => 8 
  case CC_A(_, ('x',_), CC_A(_, _, _)) => 9 
}
}
// This is not matched: (CC_A Char
//      (T_B Boolean Boolean)
//      Wildcard
//      Wildcard
//      Wildcard
//      (T_A (T_B Char Char) Char))
// This is not matched: (CC_B Boolean
//      (CC_A Boolean Wildcard Wildcard (T_A Boolean))
//      Wildcard
//      (T_A Boolean))