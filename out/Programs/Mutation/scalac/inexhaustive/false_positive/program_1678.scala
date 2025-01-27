package Program_63 

package Program_16 

object Test {
sealed trait T_A
sealed trait T_B
case class CC_A[A](a: A) extends T_A
case class CC_B() extends T_B
case class CC_C(a: T_A, b: CC_B) extends T_B
case class CC_D(a: T_A, b: T_B, c: CC_B) extends T_B

val v_a: T_A = null
val v_b: Int = v_a match{
  case CC_A(_) => 0 
}
}
// This is not matched: (CC_A T_A Wildcard T_A)
// This is not matched: (CC_A Wildcard T_A)