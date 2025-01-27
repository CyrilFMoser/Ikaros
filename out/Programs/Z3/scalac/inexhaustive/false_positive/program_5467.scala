package Program_11 

object Test {
sealed trait T_A[A]
case class CC_A[B](a: Int) extends T_A[B]

val v_a: CC_A[Byte] = null
val v_b: Int = v_a match{
  case CC_A(12) => 0 
}
}
// This is not matched: (CC_B Wildcard
//      Wildcard
//      (CC_B Wildcard
//            (CC_C Wildcard
//                  (CC_B Wildcard
//                        Wildcard
//                        (CC_B (Tuple Char Wildcard)
//                              (CC_C Wildcard Wildcard T_B)
//                              (CC_B Wildcard Wildcard Wildcard T_A)
//                              T_A)
//                        T_A)
//                  T_B)
//            (CC_B Wildcard Wildcard Wildcard T_A)
//            T_A)
//      T_A)