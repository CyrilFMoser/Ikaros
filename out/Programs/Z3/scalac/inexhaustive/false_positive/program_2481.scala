package Program_30 

package Program_2 

object Test {
sealed trait T_A[A]
case class CC_A[B, C](a: C, b: B, c: Byte) extends T_A[B]
case class CC_B[D](a: D, b: T_A[D], c: T_A[Char]) extends T_A[Char]

val v_a: T_A[Byte] = null
val v_b: Int = v_a match{
  case CC_A(_, 0, 0) => 0 
  case CC_A(_, _, _) => 1 
}
}
// This is not matched: (CC_A Byte Boolean Wildcard Byte Wildcard (T_A Byte))
// This is not matched: (CC_A T_B Int Int (T_A Int T_B))