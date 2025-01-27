package Program_31 

package Program_14 

object Test {
sealed trait T_A[A]
sealed trait T_B
case class CC_A[B, C]() extends T_A[B]
case class CC_B() extends T_B

val v_a: T_A[Boolean] = null
val v_b: Int = v_a match{
  case CC_A() => 0 
}
}
// This is not matched: (CC_A Boolean T_B (T_A Boolean))
// This is not matched: (CC_A (CC_A Wildcard Wildcard T_A) (CC_A (CC_B T_A) Wildcard T_A) T_A)