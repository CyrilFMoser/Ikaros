package Program_30 

package Program_3 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C]
case class CC_A() extends T_A[(Char,(Int,Byte)), Int]
case class CC_B() extends T_A[(Char,(Int,Byte)), Int]
case class CC_C[D](a: T_B[CC_A]) extends T_B[CC_A]
case class CC_D[E](a: Char, b: E, c: CC_C[E]) extends T_B[E]

val v_a: T_B[CC_A] = null
val v_b: Int = v_a match{
  case CC_C(CC_D(_, _, _)) => 0 
  case CC_C(CC_C(_)) => 1 
  case CC_D(_, _, _) => 2 
  case CC_D('x', _, CC_C(_)) => 3 
}
}
// This is not matched: (CC_C Boolean
//      (CC_D (CC_A Wildcard) Wildcard Wildcard Wildcard (T_B (CC_A Wildcard)))
//      (T_B (CC_A Boolean)))
// This is not matched: (CC_A (Tuple (CC_A Wildcard
//                   (CC_C Wildcard
//                         (CC_C Wildcard
//                               (CC_C Wildcard
//                                     (CC_B (CC_A Wildcard Wildcard Boolean T_A)
//                                           T_A)
//                                     T_A)
//                               T_A)
//                         T_A)
//                   Boolean
//                   T_A)
//             (CC_B Wildcard T_A))
//      Wildcard
//      Wildcard
//      T_A)