package Program_10 

object Test {
sealed trait T_A
sealed trait T_B[A, B]
case class CC_A(a: (T_A,T_A), b: T_A, c: (T_A,T_A)) extends T_A
case class CC_B(a: T_B[Byte, CC_A], b: CC_A) extends T_A
case class CC_C() extends T_A
case class CC_D[C]() extends T_B[CC_B, C]

val v_a: T_A = null
val v_b: Int = v_a match{
  case CC_C() => 0 
}
}
// This is not matched: (CC_A Wildcard Wildcard Wildcard T_A)