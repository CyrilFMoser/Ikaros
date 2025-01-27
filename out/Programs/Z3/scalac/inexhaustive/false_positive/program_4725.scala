package Program_15 

package Program_2 

object Test {
sealed trait T_A
case class CC_A() extends T_A
case class CC_B[A](a: CC_A, b: CC_A) extends T_A

val v_a: T_A = null
val v_b: Int = v_a match{
  case CC_A() => 0 
  case CC_B(CC_A(), _) => 1 
}
}
// This is not matched: (CC_B T_A Wildcard Wildcard T_A)
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