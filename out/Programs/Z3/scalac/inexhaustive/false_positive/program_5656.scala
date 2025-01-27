package Program_13 

object Test {
sealed trait T_A
case class CC_B(a: Char, b: T_A) extends T_A
case class CC_C() extends T_A

val v_a: CC_B = null
val v_b: Int = v_a match{
  case CC_B(_, CC_C()) => 0 
}
}
// This is not matched: (CC_C Wildcard
//      (CC_A T_A)
//      (CC_C Wildcard (CC_B Wildcard Int T_A) (CC_B Wildcard Wildcard T_A) T_A)
//      T_A)