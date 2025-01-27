package Program_15 

object Test {
sealed trait T_A
sealed trait T_B[A]
case class CC_A() extends T_A
case class CC_B(a: T_B[CC_A]) extends T_A
case class CC_C() extends T_B[CC_A]
case class CC_E() extends T_B[CC_A]

val v_a: CC_B = null
val v_b: Int = v_a match{
  case CC_B(CC_C()) => 0 
}
}
// This is not matched: (CC_A (T_A Char Int)
//      (CC_A Char Boolean (T_A Boolean Boolean) Boolean)
//      Wildcard
//      (T_A (T_A Char Int) (CC_A Char Boolean (T_A Boolean Boolean) Boolean)))