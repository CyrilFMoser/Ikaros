package Program_15 

package Program_9 

object Test {
sealed trait T_A
sealed trait T_B
case class CC_A(a: T_B, b: T_B, c: T_B) extends T_A
case class CC_B() extends T_A
case class CC_C[A](a: CC_B, b: CC_A) extends T_B
case class CC_D[B]() extends T_B

val v_a: T_B = null
val v_b: Int = v_a match{
  case CC_D() => 0 
  case CC_C(_, _) => 1 
  case CC_C(_, CC_A(_, _, _)) => 2 
}
}
// This is not matched: (CC_C T_A Wildcard Wildcard T_B)
// This is not matched: (CC_C (T_A (T_A Boolean)))