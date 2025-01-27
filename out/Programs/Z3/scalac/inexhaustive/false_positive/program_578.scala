package Program_31 

package Program_7 

object Test {
sealed trait T_A[A, B]
case class CC_A[C](a: Byte, b: T_A[C, C]) extends T_A[T_A[C, C], C]
case class CC_B[D, E, F]() extends T_A[D, E]
case class CC_C(a: Boolean) extends T_A[T_A[CC_A[Boolean], CC_A[Boolean]], CC_A[Boolean]]

val v_a: T_A[T_A[T_A[CC_A[Boolean], CC_A[Boolean]], CC_A[Boolean]], CC_C] = null
val v_b: Int = v_a match{
  case CC_B() => 0 
}
}
// This is not matched: (CC_B (T_A (T_A (CC_A Boolean Boolean Boolean Boolean)
//                (CC_A Boolean Boolean Boolean Boolean))
//           (CC_A Boolean Boolean Boolean Boolean))
//      (CC_C Boolean Boolean)
//      Boolean
//      (T_A (T_A (T_A (CC_A Boolean Boolean Boolean Boolean)
//                     (CC_A Boolean Boolean Boolean Boolean))
//                (CC_A Boolean Boolean Boolean Boolean))
//           (CC_C Boolean Boolean)))
// This is not matched: (CC_A T_B Wildcard (T_A (T_A T_B)))