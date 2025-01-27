package Program_7 

object Test {
sealed trait T_A[A]
sealed trait T_B
case class CC_A[B]() extends T_A[B]
case class CC_B[C]() extends T_A[C]
case class CC_D(a: T_A[Int], b: Char, c: T_A[T_B]) extends T_B

val v_a: CC_D = null
val v_b: Int = v_a match{
  case CC_D(_, _, CC_B()) => 0 
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