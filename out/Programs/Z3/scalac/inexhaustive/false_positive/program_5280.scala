package Program_15 

object Test {
sealed trait T_B
case class CC_C(a: (T_B,T_B), b: T_B) extends T_B
case class CC_D() extends T_B

val v_a: CC_C = null
val v_b: Int = v_a match{
  case CC_C(_, CC_C(_, _)) => 0 
}
}
// This is not matched: (CC_A (CC_A (CC_B Wildcard Wildcard Byte T_A)
//            Boolean
//            (CC_B Wildcard Char Byte T_A)
//            T_A)
//      Boolean
//      Wildcard
//      T_A)