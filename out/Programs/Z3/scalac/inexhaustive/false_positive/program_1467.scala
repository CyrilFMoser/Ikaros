package Program_30 

package Program_4 

object Test {
sealed trait T_A
sealed trait T_B
case class CC_A() extends T_A
case class CC_B(a: T_A, b: T_A, c: T_A) extends T_A
case class CC_C(a: T_A, b: T_A, c: (CC_A,CC_A)) extends T_A
case class CC_D() extends T_B
case class CC_E[A](a: Boolean, b: A, c: T_B) extends T_B

val v_a: T_B = null
val v_b: Int = v_a match{
  case CC_D() => 0 
  case CC_E(_, _, CC_D()) => 1 
  case CC_E(_, _, _) => 2 
}
}
// This is not matched: (CC_E T_A Wildcard Wildcard Wildcard T_B)
// This is not matched: (CC_A Wildcard Wildcard (T_A (T_A Int)))