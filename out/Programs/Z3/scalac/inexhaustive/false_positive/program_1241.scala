package Program_31 

object Test {
sealed trait T_A[A, B]
case class CC_A[C, D](a: C) extends T_A[C, D]

val v_a: CC_A[Int, Int] = null
val v_b: Int = v_a match{
  case CC_A(12) => 0 
}
}
// This is not matched: (CC_A (CC_B (CC_A Wildcard Wildcard Wildcard T_A)
//            (CC_A Wildcard
//                  (CC_B Wildcard (CC_B Wildcard Wildcard T_A) T_A)
//                  Wildcard
//                  T_A)
//            T_A)
//      Wildcard
//      Wildcard
//      T_A)