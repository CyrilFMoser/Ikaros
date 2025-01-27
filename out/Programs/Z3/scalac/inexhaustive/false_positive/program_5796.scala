package Program_15 

object Test {
sealed trait T_A
sealed trait T_B[A, B]
case class CC_A() extends T_A
case class CC_B() extends T_A
case class CC_C(a: Byte, b: T_B[CC_B, Byte]) extends T_A
case class CC_D[C]() extends T_B[CC_A, C]

val v_a: T_A = null
val v_b: Int = v_a match{
  case CC_A() => 0 
  case CC_B() => 1 
  case CC_C(0, _) => 2 
}
}
// This is not matched: (CC_C Wildcard Wildcard Wildcard T_A)