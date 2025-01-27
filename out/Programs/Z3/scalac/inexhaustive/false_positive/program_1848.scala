package Program_30 

package Program_0 

object Test {
sealed trait T_A
sealed trait T_B[A, B]
case class CC_A[C](a: Char, b: Byte, c: (T_A,Int)) extends T_A
case class CC_B[D](a: D, b: T_B[D, D], c: T_B[Byte, D]) extends T_B[Byte, D]

val v_a: T_A = null
val v_b: Int = v_a match{
  case CC_A('x', _, (CC_A(_, _, _),12)) => 0 
  case CC_A(_, _, _) => 1 
  case CC_A(_, 0, _) => 2 
  case CC_A(_, 0, (CC_A(_, _, _),_)) => 3 
  case CC_A('x', _, (CC_A(_, _, _),_)) => 4 
  case CC_A('x', 0, (CC_A(_, _, _),12)) => 5 
}
}
// This is not matched: (CC_A T_A Wildcard Wildcard Wildcard T_A)
// This is not matched: (CC_A Wildcard Wildcard Wildcard T_A)