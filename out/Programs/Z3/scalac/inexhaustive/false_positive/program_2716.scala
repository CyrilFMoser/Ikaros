package Program_31 

object Test {
sealed trait T_A[A, B]
sealed trait T_B
case class CC_A[C](a: Int) extends T_A[C, T_A[T_B, C]]

val v_a: CC_A[Int] = null
val v_b: Int = v_a match{
  case CC_A(12) => 0 
}
}
// This is not matched: (CC_A (CC_A (CC_A (CC_A Wildcard (CC_B (CC_B Wildcard T_A) T_A) Wildcard T_A)
//                  (CC_B Wildcard T_A)
//                  Boolean
//                  T_A)
//            (CC_A (CC_A (CC_B (CC_A Wildcard Wildcard Wildcard T_A) T_A)
//                        (CC_B Wildcard T_A)
//                        Wildcard
//                        T_A)
//                  (CC_B Wildcard T_A)
//                  Wildcard
//                  T_A)
//            Wildcard
//            T_A)
//      (CC_B (CC_B (CC_A Wildcard Wildcard Wildcard T_A) T_A) T_A)
//      Wildcard
//      T_A)