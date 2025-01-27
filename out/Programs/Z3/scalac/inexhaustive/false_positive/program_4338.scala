package Program_14 

object Test {
sealed trait T_A
case class CC_A() extends T_A
case class CC_B(a: CC_A, b: T_A) extends T_A
case class CC_C() extends T_A

val v_a: CC_B = null
val v_b: Int = v_a match{
  case CC_B(_, CC_C()) => 0 
}
}
// This is not matched: (CC_C (T_B Boolean (CC_A T_A))
//      Char
//      Wildcard
//      (T_B Char (T_B Boolean (CC_A T_A))))