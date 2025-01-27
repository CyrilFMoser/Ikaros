package Program_12 

object Test {
sealed trait T_A
sealed trait T_B[A]
case class CC_A(a: T_B[T_A]) extends T_A
case class CC_D[C]() extends T_B[C]
case class CC_E[D]() extends T_B[D]

val v_a: CC_A = null
val v_b: Int = v_a match{
  case CC_A(CC_E()) => 0 
}
}
// This is not matched: (CC_B Boolean Byte Wildcard (T_A Boolean Byte))