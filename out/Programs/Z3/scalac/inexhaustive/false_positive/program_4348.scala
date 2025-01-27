package Program_15 

object Test {
sealed trait T_A
sealed trait T_B
case class CC_A() extends T_A
case class CC_C() extends T_A
case class CC_F(a: Boolean, b: T_A) extends T_B

val v_a: CC_F = null
val v_b: Int = v_a match{
  case CC_F(_, CC_A()) => 0 
}
}
// This is not matched: (CC_B (CC_C Wildcard
//            Wildcard
//            (CC_B (CC_C Wildcard Wildcard Wildcard T_B) Wildcard T_B)
//            T_B)
//      Wildcard
//      T_B)