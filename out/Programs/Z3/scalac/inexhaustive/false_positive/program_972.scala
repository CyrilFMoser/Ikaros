package Program_29 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C]
case class CC_A[D]() extends T_A[D, Byte]
case class CC_B[E, F](a: T_A[F, F], b: T_B[E]) extends T_A[F, E]
case class CC_C() extends T_B[CC_B[Boolean, Byte]]

val v_a: T_A[Byte, Byte] = null
val v_b: Int = v_a match{
  case CC_A() => 0 
  case CC_B(CC_B(_, _), _) => 1 
}
}
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