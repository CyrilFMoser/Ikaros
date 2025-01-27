package Program_30 

package Program_7 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C]
case class CC_A[D, E]() extends T_A[D, E]
case class CC_B[F](a: T_A[F, F], b: F) extends T_B[F]
case class CC_C[G, H]() extends T_B[G]

val v_a: T_B[Int] = null
val v_b: Int = v_a match{
  case CC_C() => 0 
  case CC_B(_, 12) => 1 
  case CC_B(CC_A(), 12) => 2 
  case CC_B(_, _) => 3 
}
}
// This is not matched: (CC_C Int Boolean (T_B Int))
// This is not matched: (CC_A (CC_A (CC_B Wildcard Wildcard Wildcard T_A) Wildcard T_A)
//      (Tuple (CC_B Wildcard
//                   (CC_B (CC_A (CC_A (CC_A Wildcard Wildcard T_A) Wildcard T_A)
//                               Wildcard
//                               T_A)
//                         (CC_A (CC_A Wildcard Wildcard T_A) Wildcard T_A)
//                         (CC_A Wildcard Wildcard T_A)
//                         T_A)
//                   (CC_A (CC_A (CC_B (CC_A Wildcard Wildcard T_A)
//                                     (CC_A Wildcard Wildcard T_A)
//                                     Wildcard
//                                     T_A)
//                               Wildcard
//                               T_A)
//                         Wildcard
//                         T_A)
//                   T_A)
//             (CC_A (CC_A Wildcard Wildcard T_A) (Tuple Wildcard Wildcard) T_A))
//      T_A)