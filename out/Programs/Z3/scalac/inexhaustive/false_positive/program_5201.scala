package Program_15 

package Program_11 

object Test {
sealed trait T_A[A, B]
case class CC_A[C](a: Char, b: T_A[C, C]) extends T_A[C, Int]
case class CC_B[D, E]() extends T_A[D, Int]

val v_a: T_A[Boolean, Int] = null
val v_b: Int = v_a match{
  case CC_B() => 0 
  case CC_A(_, _) => 1 
}
}
// This is not matched: (CC_B Boolean Boolean (T_A Boolean Int))
// This is not matched: (CC_B Boolean Wildcard Wildcard (T_A (T_A Int Boolean) Boolean))