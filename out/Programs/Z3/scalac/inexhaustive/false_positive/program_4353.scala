package Program_10 

object Test {
sealed trait T_B
case class CC_C() extends T_B
case class CC_D(a: T_B, b: T_B) extends T_B

val v_a: CC_D = null
val v_b: Int = v_a match{
  case CC_D(_, CC_C()) => 0 
}
}
// This is not matched: (CC_B (CC_C Wildcard
//            Wildcard
//            (CC_B (CC_C Wildcard Wildcard Wildcard T_B) Wildcard T_B)
//            T_B)
//      Wildcard
//      T_B)