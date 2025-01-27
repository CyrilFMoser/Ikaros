package Program_12 

package Program_1 

object Test {
sealed trait T_A
case class CC_A[A]() extends T_A
case class CC_B(a: CC_A[T_A]) extends T_A

val v_a: T_A = null
val v_b: Int = v_a match{
  case CC_A() => 0 
  case CC_B(CC_A()) => 1 
}
}
// This is not matched: (CC_A T_A T_A)
// This is not matched: (CC_C Wildcard T_A)