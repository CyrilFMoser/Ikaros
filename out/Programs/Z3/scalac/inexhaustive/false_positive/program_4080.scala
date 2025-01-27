package Program_15 

package Program_6 

object Test {
sealed trait T_A
sealed trait T_B
case class CC_A(a: Boolean, b: T_B, c: Boolean) extends T_A
case class CC_B[A](a: CC_A) extends T_A
case class CC_C[B](a: T_B) extends T_A
case class CC_D(a: CC_A, b: T_A, c: Int) extends T_B
case class CC_E(a: T_B) extends T_B

val v_a: T_A = null
val v_b: Int = v_a match{
  case CC_B(_) => 0 
  case CC_C(_) => 1 
  case CC_A(_, CC_E(_), _) => 2 
  case CC_A(_, CC_D(_, _, _), _) => 3 
}
}
// This is not matched: (CC_B T_A Wildcard T_A)
// This is not matched: (CC_A (T_A (T_A Boolean)))