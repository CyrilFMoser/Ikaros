package Program_31 

package Program_10 

object Test {
sealed trait T_A
case class CC_A[A]() extends T_A

val v_a: T_A = null
val v_b: Int = v_a match{
  case CC_A() => 0 
}
}
// This is not matched: (CC_A T_A T_A)
// This is not matched: (CC_B Wildcard (CC_B Wildcard (CC_C T_B) T_B) T_B)