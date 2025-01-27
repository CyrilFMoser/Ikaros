package Program_13 

object Test {
sealed trait T_A
sealed trait T_B[A, B]
case class CC_A() extends T_A
case class CC_B[C](a: T_B[C, C]) extends T_B[C, CC_A]
case class CC_D[G]() extends T_B[G, CC_A]

val v_a: CC_B[CC_A] = null
val v_b: Int = v_a match{
  case CC_B(CC_B(_)) => 0 
}
}
// This is not matched: (CC_A Wildcard Wildcard Wildcard T_A)