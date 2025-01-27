package Program_31 

package Program_5 

object Test {
sealed trait T_A[A, B]
case class CC_A[C, D]() extends T_A[Boolean, C]
case class CC_B[E](a: (Char,Boolean), b: T_A[E, E], c: T_A[Boolean, Char]) extends T_A[E, T_A[E, E]]

val v_a: T_A[Char, T_A[Char, Char]] = null
val v_b: Int = v_a match{
  case CC_B((_,_), _, CC_A()) => 0 
  case CC_B(_, _, CC_A()) => 1 
}
}
// This is not matched: (CC_B Char
//      Wildcard
//      Wildcard
//      (CC_A Char Boolean (T_A Boolean Char))
//      (T_A Char (T_A Char Char)))
// This is not matched: (CC_C (T_A Char))