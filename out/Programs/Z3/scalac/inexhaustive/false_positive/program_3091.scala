package Program_7 

package Program_10 

object Test {
sealed trait T_A[A]
sealed trait T_B[B]
case class CC_A() extends T_A[T_A[(Char,Boolean)]]
case class CC_B(a: T_B[CC_A], b: CC_A) extends T_A[T_A[(Char,Boolean)]]
case class CC_C[C, D](a: T_B[D]) extends T_B[C]

val v_a: CC_B = null
val v_b: Int = v_a match{
  case CC_B(CC_C(_), CC_A()) => 0 
}
}
// This is not matched: (CC_B (CC_C (CC_A Wildcard)
//            (CC_C (CC_A (T_A Boolean)) (CC_A (T_A Boolean)) Boolean Boolean)
//            (CC_C (CC_C (CC_A Boolean) (CC_A Boolean) Boolean Boolean)
//                  Boolean
//                  Wildcard
//                  (T_B (CC_C (CC_A Boolean) (CC_A Boolean) Boolean Boolean)))
//            (T_B (CC_A Wildcard)))
//      Wildcard
//      (T_A (T_A (Tuple Char Boolean))))
// This is not matched: (CC_A T_A Wildcard T_A)