package Program_30 

package Program_9 

object Test {
sealed trait T_A
case class CC_A() extends T_A
case class CC_B[A](a: Byte, b: Byte) extends T_A
case class CC_C(a: CC_A) extends T_A

val v_a: T_A = null
val v_b: Int = v_a match{
  case CC_A() => 0 
  case CC_C(CC_A()) => 1 
  case CC_C(_) => 2 
  case CC_B(_, 0) => 3 
  case CC_B(0, 0) => 4 
  case CC_B(_, _) => 5 
  case CC_B(0, _) => 6 
}
}
// This is not matched: (CC_B T_A Wildcard Wildcard T_A)
// This is not matched: (CC_A (CC_B T_A) T_A)