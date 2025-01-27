package Program_27 

package Program_4 

object Test {
sealed trait T_A[A, B]
case class CC_A[C](a: (Byte,Boolean), b: T_A[C, C], c: T_A[C, C]) extends T_A[Boolean, T_A[Char, Int]]

val v_a: T_A[Boolean, T_A[Char, Int]] = null
val v_b: Int = v_a match{
  case CC_A(_, _, _) => 0 
}
}
// This is not matched: (CC_A Boolean Wildcard Wildcard Wildcard (T_A Boolean (T_A Char Int)))
// This is not matched: (CC_A T_B Int Int (T_A Int T_B))