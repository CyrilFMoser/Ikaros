package Program_31 

object Test {
sealed trait T_A
sealed trait T_B[C]
case class CC_A(a: (Int,Int), b: T_B[Byte]) extends T_A
case class CC_C() extends T_B[T_B[CC_A]]

val v_a: T_A = null
val v_b: Int = v_a match{
  case CC_A((_,12), _) => 0 
}
}
// This is not matched: (CC_E (CC_B T_A T_A) Wildcard Wildcard (T_B (CC_B T_A T_A)))