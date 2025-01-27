package Program_31 

package Program_12 

object Test {
sealed trait T_A
sealed trait T_B
case class CC_A(a: T_A, b: T_A, c: T_B) extends T_A
case class CC_B(a: Byte, b: CC_A, c: T_A) extends T_A
case class CC_C[A]() extends T_B
case class CC_D(a: Char) extends T_B

val v_a: T_B = null
val v_b: Int = v_a match{
  case CC_C() => 0 
  case CC_D(_) => 1 
  case CC_D('x') => 2 
}
}
// This is not matched: (CC_C T_A T_B)
// This is not matched: (CC_B T_A Wildcard Wildcard T_A)