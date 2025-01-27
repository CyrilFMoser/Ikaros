package Program_28 

package Program_9 

object Test {
sealed trait T_A
sealed trait T_B
case class CC_A(a: T_A, b: Boolean, c: T_A) extends T_A
case class CC_B[A](a: T_A) extends T_A
case class CC_C(a: (T_A,CC_A)) extends T_B
case class CC_D() extends T_B

val v_a: T_A = null
val v_b: Int = v_a match{
  case CC_A(CC_A(_, _, _), _, _) => 0 
  case CC_A(CC_B(_), _, _) => 1 
  case CC_B(_) => 2 
  case CC_B(CC_B(_)) => 3 
}
}
// This is not matched: (CC_A (CC_B T_A (CC_B T_A Wildcard T_A) T_A) Wildcard Wildcard T_A)
// This is not matched: (CC_B Byte Wildcard (CC_B Byte Wildcard Wildcard (T_A Byte)) (T_A Byte))