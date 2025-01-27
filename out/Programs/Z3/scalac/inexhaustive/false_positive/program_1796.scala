package Program_31 

package Program_4 

object Test {
sealed trait T_A
case class CC_A[A]() extends T_A
case class CC_B(a: CC_A[T_A]) extends T_A

val v_a: T_A = null
val v_b: Int = v_a match{
  case CC_A() => 0 
  case CC_B(_) => 1 
}
}
// This is not matched: (CC_A T_A T_A)
// This is not matched: (CC_A Int Wildcard Wildcard Wildcard (T_A Int (T_A Boolean Byte)))