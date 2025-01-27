package Program_31 

package Program_2 

object Test {
sealed trait T_A[A, B]
case class CC_A[C](a: T_A[Char, Char], b: C) extends T_A[Char, C]
case class CC_B[D](a: (Byte,Int), b: T_A[D, D], c: D) extends T_A[Boolean, D]
case class CC_C[E](a: CC_A[E], b: E, c: CC_A[E]) extends T_A[Boolean, T_A[Char, Byte]]

val v_a: T_A[Boolean, T_A[Char, Byte]] = null
val v_b: Int = v_a match{
  case CC_B((_,_), _, CC_A(_, _)) => 0 
  case CC_B((_,12), _, CC_A(_, _)) => 1 
  case CC_B(_, _, CC_A(_, _)) => 2 
  case CC_B((_,_), _, _) => 3 
  case CC_B((0,_), _, CC_A(_, _)) => 4 
  case CC_B((0,_), _, _) => 5 
  case CC_B((_,12), _, _) => 6 
  case CC_B(_, _, _) => 7 
  case CC_B((0,12), _, _) => 8 
  case CC_C(_, _, CC_A(_, _)) => 9 
}
}
// This is not matched: (CC_C Boolean
//      (CC_A Boolean
//            (CC_A Char
//                  (CC_A Char Wildcard Char (T_A Char Char))
//                  Wildcard
//                  (T_A Char Char))
//            Boolean
//            (T_A Char Boolean))
//      Boolean
//      (CC_A Boolean Wildcard Wildcard (T_A Char Boolean))
//      (T_A Boolean (T_A Char Byte)))
// This is not matched: (CC_A (Tuple (CC_B (CC_C Wildcard T_A) Wildcard T_A) Wildcard) T_A)