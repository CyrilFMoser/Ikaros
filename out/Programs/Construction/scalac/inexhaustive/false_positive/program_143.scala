package Program_29 

object Test {
sealed trait T_A
sealed trait T_B[A]
case class CC_A() extends T_A
case class CC_C(a: Char, b: T_B[CC_A]) extends T_B[CC_A]
case class CC_D() extends T_B[CC_A]

val v_a: CC_C = null
val v_b: Int = v_a match{
  case CC_C(_, CC_C(_, _)) => 0 
}
}
// This is not matched: CC_B((_,CC_B(_)))