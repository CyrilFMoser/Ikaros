package Program_15 

package Program_0 

object Test {
sealed trait T_A
case class CC_A(a: T_A) extends T_A
case class CC_B[A](a: (Boolean,CC_A), b: A, c: CC_A) extends T_A

val v_a: CC_B[Byte] = null
val v_b: Int = v_a match{
  case CC_B(_, 0, CC_A(_)) => 0 
}
}
// This is not matched: Pattern match is empty without constants
// This is not matched: (CC_B T_A)