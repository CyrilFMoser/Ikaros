package Program_15 

package Program_5 

object Test {
sealed trait T_A[A]
sealed trait T_B[B, C]
case class CC_A() extends T_A[Boolean]
case class CC_B[E, D, F]() extends T_B[D, E]
case class CC_C(a: ((Char,Int),CC_A), b: T_A[Boolean]) extends T_B[T_B[CC_A, Boolean], T_B[CC_A, Int]]

val v_a: T_B[T_B[CC_A, Boolean], T_B[CC_A, Int]] = null
val v_b: Int = v_a match{
  case CC_B() => 0 
  case CC_C(_, CC_A()) => 1 
  case CC_C(_, _) => 2 
}
}
// This is not matched: (CC_B (T_B (CC_A Boolean) Int)
//      (T_B (CC_A Boolean) Boolean)
//      Boolean
//      (T_B (T_B (CC_A Boolean) Boolean) (T_B (CC_A Boolean) Int)))
// This is not matched: (CC_A Wildcard Wildcard Wildcard T_A)