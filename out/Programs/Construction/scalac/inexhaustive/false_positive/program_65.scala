package Program_29 

object Test {
sealed trait T_A
sealed trait T_B
case class CC_A() extends T_A
case class CC_B(a: T_B, b: T_A) extends T_A

val v_a: CC_B = null
val v_b: Int = v_a match{
  case CC_B(_, CC_A()) => 0 
}
}
// This is not matched: CC_A(CC_A(_))