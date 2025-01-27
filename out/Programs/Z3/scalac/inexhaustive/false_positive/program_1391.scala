package Program_28 

package Program_7 

object Test {
sealed trait T_A
sealed trait T_B[A]
case class CC_A() extends T_A
case class CC_B[B](a: CC_A, b: B, c: Byte) extends T_A
case class CC_C[C](a: (T_A,T_A), b: CC_A) extends T_B[C]

val v_a: T_A = null
val v_b: Int = v_a match{
  case CC_A() => 0 
  case CC_B(_, _, _) => 1 
  case CC_B(CC_A(), _, 0) => 2 
  case CC_B(CC_A(), _, _) => 3 
}
}
// This is not matched: (CC_B T_A Wildcard Wildcard Wildcard T_A)
// This is not matched: (CC_A (CC_A Wildcard Wildcard T_A) (CC_A Wildcard Wildcard T_A) T_A)