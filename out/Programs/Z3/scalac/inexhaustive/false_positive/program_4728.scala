package Program_12 

package Program_4 

object Test {
sealed trait T_A
case class CC_A[A](a: T_A) extends T_A

val v_a: T_A = null
val v_b: Int = v_a match{
  case CC_A(_) => 0 
}
}
// This is not matched: (CC_A T_A Wildcard T_A)
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