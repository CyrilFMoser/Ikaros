package Program_30 

package Program_11 

object Test {
sealed trait T_A
sealed trait T_B
case class CC_A() extends T_A
case class CC_B(a: (T_B,CC_A), b: T_B) extends T_A
case class CC_C[A]() extends T_B

val v_a: CC_B = null
val v_b: Int = v_a match{
  case CC_B((CC_C(),CC_A()), _) => 0 
}
}
// This is not matched: (CC_B (Tuple (CC_C T_A T_B) Wildcard) Wildcard T_A)
// This is not matched: (CC_A (Tuple (CC_B T_A) (Tuple Int Boolean)) Wildcard T_A)