package Program_13 

object Test {
sealed trait T_A
sealed trait T_B
case class CC_B(a: T_A, b: T_B) extends T_B
case class CC_C() extends T_B

val v_a: CC_B = null
val v_b: Int = v_a match{
  case CC_B(_, CC_C()) => 0 
}
}
// This is not matched: Pattern match is empty without constants