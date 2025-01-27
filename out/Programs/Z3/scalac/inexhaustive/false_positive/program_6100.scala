package Program_15 

object Test {
sealed trait T_A
case class CC_A(a: Byte, b: Char, c: T_A) extends T_A
case class CC_B() extends T_A

val v_a: CC_A = null
val v_b: Int = v_a match{
  case CC_A(_, _, CC_A(_, _, _)) => 0 
}
}
// This is not matched: (CC_B Wildcard Wildcard Wildcard T_A)