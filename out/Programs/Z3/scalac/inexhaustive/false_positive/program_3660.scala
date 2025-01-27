package Program_14 

object Test {
sealed trait T_B
case class CC_B(a: T_B) extends T_B
case class CC_C() extends T_B

val v_a: CC_B = null
val v_b: Int = v_a match{
  case CC_B(CC_B(_)) => 0 
}
}
// This is not matched: (CC_B Char
//      Char
//      (CC_B Char
//            T_A
//            (CC_B Char T_A Wildcard Wildcard Char (T_B Char))
//            (CC_B (CC_A T_A T_A T_A)
//                  T_A
//                  Wildcard
//                  Wildcard
//                  Wildcard
//                  (T_B (CC_A T_A T_A T_A)))
//            Char
//            (T_B Char))
//      Wildcard
//      Wildcard
//      (T_B Char))