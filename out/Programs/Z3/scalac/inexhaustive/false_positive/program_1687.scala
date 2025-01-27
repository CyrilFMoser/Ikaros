package Program_31 

package Program_4 

object Test {
sealed trait T_A[A]
case class CC_A[B, C]() extends T_A[B]
case class CC_B(a: T_A[Byte], b: T_A[Char]) extends T_A[CC_A[Byte, Int]]
case class CC_C(a: T_A[CC_B]) extends T_A[CC_A[Byte, Int]]

val v_a: CC_C = null
val v_b: Int = v_a match{
  case CC_C(CC_A()) => 0 
}
}
// This is not matched: (CC_C (CC_A (CC_B Wildcard Wildcard Wildcard)
//            Boolean
//            (T_A (CC_B Wildcard Wildcard Wildcard)))
//      (T_A (CC_A Byte Int Boolean)))
// This is not matched: (CC_A (T_A Byte)
//      (CC_B Wildcard (T_A (T_A Byte)))
//      (CC_B Wildcard (T_A (T_A Byte)))
//      (T_A (T_A Byte)))