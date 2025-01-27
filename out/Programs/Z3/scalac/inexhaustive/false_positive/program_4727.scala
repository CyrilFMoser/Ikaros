package Program_13 

object Test {
sealed trait T_A
case class CC_B() extends T_A
case class CC_C(a: T_A) extends T_A

val v_a: CC_C = null
val v_b: Int = v_a match{
  case CC_C(CC_B()) => 0 
}
}
// This is not matched: (CC_B Boolean
//      Int
//      (CC_B Int
//            Int
//            (CC_A Int
//                  Int
//                  (CC_B Int
//                        Int
//                        Wildcard
//                        (CC_A Int
//                              Int
//                              Wildcard
//                              (Tuple Wildcard Wildcard)
//                              (T_A Int Int))
//                        (T_A Int Int))
//                  Wildcard
//                  (T_A Int Int))
//            (CC_A Int
//                  Int
//                  (CC_A Int
//                        Int
//                        (CC_A Int Int Wildcard Wildcard (T_A Int Int))
//                        (Tuple Wildcard Wildcard)
//                        (T_A Int Int))
//                  Wildcard
//                  (T_A Int Int))
//            (T_A Int Int))
//      Wildcard
//      (T_A Boolean Int))