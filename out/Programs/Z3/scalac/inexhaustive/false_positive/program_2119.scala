package Program_31 

package Program_15 

object Test {
sealed trait T_A
sealed trait T_B
case class CC_A[A]() extends T_A

val v_a: T_A = null
val v_b: Int = v_a match{
  case CC_A() => 0 
}
}
// This is not matched: (CC_A T_A T_A)
// This is not matched: (CC_A T_A T_A)