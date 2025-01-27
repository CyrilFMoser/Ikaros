package Program_31 

package Program_5 

object Test {
sealed trait T_A
sealed trait T_B
case class CC_A(a: T_B, b: Byte) extends T_A
case class CC_B(a: T_B) extends T_B
case class CC_C[A](a: CC_B, b: T_A) extends T_B

val v_a: T_B = null
val v_b: Int = v_a match{
  case CC_B(CC_C(_, _)) => 0 
  case CC_B(CC_B(_)) => 1 
  case CC_C(_, CC_A(_, _)) => 2 
}
}
// This is not matched: (CC_C T_A Wildcard Wildcard T_B)
// This is not matched: (CC_A Wildcard
//      (CC_B Wildcard
//            (CC_A Wildcard
//                  (CC_B (CC_E T_A Wildcard Wildcard Wildcard (T_B T_A))
//                        Wildcard
//                        (CC_C Wildcard
//                              (CC_D (CC_B Wildcard Wildcard Wildcard Wildcard)
//                                    (T_B (CC_B Wildcard
//                                               Wildcard
//                                               Wildcard
//                                               Wildcard)))
//                              Wildcard
//                              T_A)
//                        T_A)
//                  (CC_C Wildcard
//                        (CC_E (CC_B T_A T_A T_A T_A)
//                              Wildcard
//                              Wildcard
//                              Wildcard
//                              (T_B (CC_B T_A T_A T_A T_A)))
//                        Wildcard
//                        T_A)
//                  T_A)
//            (CC_C (CC_D (CC_B T_A T_A T_A T_A) (T_B (CC_B T_A T_A T_A T_A)))
//                  (CC_D (CC_B T_A T_A T_A T_A) (T_B (CC_B T_A T_A T_A T_A)))
//                  Wildcard
//                  T_A)
//            T_A)
//      Wildcard
//      T_A)