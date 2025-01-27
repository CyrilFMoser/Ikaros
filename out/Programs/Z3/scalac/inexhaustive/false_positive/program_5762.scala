package Program_12 

object Test {
sealed trait T_A
sealed trait T_B
case class CC_C() extends T_B
case class CC_D(a: Byte, b: T_A, c: T_B) extends T_B

val v_a: CC_D = null
val v_b: Int = v_a match{
  case CC_D(_, _, CC_C()) => 0 
}
}
// This is not matched: Pattern match is empty without constants