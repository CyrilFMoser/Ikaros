package Program_15 

object Test {
sealed trait T_A
case class CC_A(a: T_A) extends T_A
case class CC_B() extends T_A

val v_a: CC_A = null
val v_b: Int = v_a match{
  case CC_A(CC_B()) => 0 
}
}
// This is not matched: (CC_C (T_B (CC_B (T_A Boolean)))
//      (CC_C (T_B (CC_B (T_A Boolean)))
//            (CC_E Wildcard (T_B (T_B (CC_B (T_A Boolean)))))
//            (CC_C (T_B (CC_B (T_A Boolean)))
//                  Wildcard
//                  Wildcard
//                  (T_B (T_B (CC_B (T_A Boolean)))))
//            (T_B (T_B (CC_B (T_A Boolean)))))
//      (CC_C (T_B (CC_B Boolean)) Wildcard Wildcard (T_B (T_B (CC_B Boolean))))
//      (T_B (T_B (CC_B (T_A Boolean)))))