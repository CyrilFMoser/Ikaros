package Program_31 

package Program_13 

object Test {
sealed trait T_A[A]
sealed trait T_B[B]
case class CC_A[C](a: Char) extends T_A[C]
case class CC_B[D, E]() extends T_B[D]
case class CC_C(a: CC_A[Byte], b: (Char,Int)) extends T_B[CC_A[Int]]

val v_a: T_B[Boolean] = null
val v_b: Int = v_a match{
  case CC_B() => 0 
}
}
// This is not matched: (CC_B Boolean Boolean (T_B Boolean))
// This is not matched: (CC_E (CC_B (CC_C (CC_B (CC_B (CC_C Wildcard T_A) T_A) T_A) T_A) (T_B T_A T_A))
//      Wildcard
//      (CC_B (CC_C (CC_B (CC_B (CC_C Wildcard T_A) T_A) T_A) T_A) T_A)
//      (CC_B Wildcard T_A)
//      (T_B (Tuple (CC_A T_A T_A T_A T_A) (CC_A T_A T_A T_A T_A))
//           (CC_B (CC_C (CC_B (CC_B (CC_C Wildcard T_A) T_A) T_A) T_A)
//                 (T_B T_A T_A))))