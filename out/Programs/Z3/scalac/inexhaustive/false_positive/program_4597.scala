package Program_14 

package Program_12 

object Test {
sealed trait T_A[A]
case class CC_A[B, C](a: Char, b: T_A[B]) extends T_A[B]

val v_a: T_A[Char] = null
val v_b: Int = v_a match{
  case CC_A(_, _) => 0 
}
}
// This is not matched: (CC_A Char Boolean Wildcard Wildcard (T_A Char))
// This is not matched: (CC_C (CC_B Wildcard Wildcard (T_A T_B))
//      Wildcard
//      (T_A (T_A (CC_A (T_A (T_A T_B)) (T_A T_B)))))