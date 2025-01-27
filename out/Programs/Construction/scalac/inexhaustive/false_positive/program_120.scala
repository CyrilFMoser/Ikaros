package Program_29 

object Test {
sealed trait T_A
sealed trait T_B[A, B]
case class CC_A() extends T_A
case class CC_C() extends T_A
case class CC_E[D](a: D, b: T_A) extends T_B[CC_C, D]

val v_a: CC_E[CC_C] = null
val v_b: Int = v_a match{
  case CC_E(_, CC_C()) => 0 
}
}
// This is not matched: CC_B()