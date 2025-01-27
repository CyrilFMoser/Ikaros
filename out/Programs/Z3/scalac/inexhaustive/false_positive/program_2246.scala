package Program_31 

object Test {
sealed trait T_A[A, B]
case class CC_B[D](a: T_A[D, D], b: D) extends T_A[T_A[D, D], D]

val v_a: T_A[T_A[Int, Int], Int] = null
val v_b: Int = v_a match{
  case CC_B(_, 12) => 0 
}
}
// This is not matched: (CC_A Wildcard
//      Wildcard
//      (CC_A (CC_A Wildcard
//                  Wildcard
//                  (CC_A (CC_B (Tuple Int Wildcard) T_A)
//                        Wildcard
//                        (CC_B Wildcard T_A)
//                        T_A)
//                  T_A)
//            (CC_B Wildcard T_A)
//            (CC_A Wildcard Wildcard (CC_B Wildcard T_A) T_A)
//            T_A)
//      T_A)