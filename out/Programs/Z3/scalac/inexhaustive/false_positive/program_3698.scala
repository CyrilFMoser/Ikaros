package Program_15 

package Program_13 

object Test {
sealed trait T_A[A]
case class CC_A[B]() extends T_A[B]
case class CC_B[C, D](a: D, b: Int, c: T_A[D]) extends T_A[C]

val v_a: T_A[Boolean] = null
val v_b: Int = v_a match{
  case CC_A() => 0 
  case CC_B(_, _, _) => 1 
  case CC_B(_, 12, CC_B(_, _, _)) => 2 
  case CC_B(_, 12, CC_A()) => 3 
}
}
// This is not matched: (CC_B Boolean Boolean Wildcard Wildcard Wildcard (T_A Boolean))
// This is not matched: (CC_A Boolean (T_A Boolean))