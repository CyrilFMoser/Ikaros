package Program_30 

package Program_14 

object Test {
sealed trait T_A
case class CC_A[A](a: (T_A,T_A)) extends T_A

val v_a: T_A = null
val v_b: Int = v_a match{
  case CC_A(_) => 0 
}
}
// This is not matched: (CC_A T_A Wildcard T_A)
// This is not matched: (CC_E Wildcard
//      (CC_A (CC_D Wildcard Wildcard Wildcard Wildcard)
//            (CC_C Wildcard Wildcard Wildcard)
//            (T_A (CC_D Wildcard Wildcard Wildcard Wildcard)
//                 (CC_C Wildcard Wildcard Wildcard)))
//      Wildcard
//      T_B)