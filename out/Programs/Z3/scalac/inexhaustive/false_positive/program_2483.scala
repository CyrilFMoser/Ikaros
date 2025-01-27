package Program_28 

package Program_5 

object Test {
sealed trait T_A[A, B]
case class CC_A[C](a: (Byte,Boolean), b: T_A[C, C], c: T_A[C, C]) extends T_A[Boolean, T_A[Char, Int]]

val v_a: T_A[Boolean, T_A[Char, Int]] = null
val v_b: Int = v_a match{
  case CC_A((_,_), _, _) => 0 
  case CC_A((0,_), _, _) => 1 
}
}
// This is not matched: (CC_A Boolean Wildcard Wildcard Wildcard (T_A Boolean (T_A Char Int)))
// This is not matched: (CC_A T_B Int Int (T_A Int T_B))