package Program_15 

package Program_7 

object Test {
sealed trait T_A[A, B]
case class CC_A(a: (Char,Boolean), b: T_A[Boolean, Boolean], c: T_A[Boolean, Boolean]) extends T_A[T_A[Char, Byte], T_A[Char, Char]]
case class CC_B[C](a: (Boolean,Boolean), b: (CC_A,CC_A), c: CC_A) extends T_A[T_A[Char, Byte], T_A[Char, Char]]

val v_a: T_A[T_A[Char, Byte], T_A[Char, Char]] = null
val v_b: Int = v_a match{
  case CC_A(_, _, _) => 0 
  case CC_B((_,_), _, _) => 1 
}
}
// This is not matched: (CC_B Boolean Wildcard Wildcard Wildcard (T_A (T_A Char Byte) (T_A Char Char)))
// This is not matched: (CC_B T_A)