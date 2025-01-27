package Program_30 

package Program_3 

object Test {
sealed trait T_A
sealed trait T_B[A, B]
case class CC_A(a: T_B[Byte, T_A]) extends T_A
case class CC_B[D, C, E](a: T_B[C, C]) extends T_B[D, C]
case class CC_C[F, G](a: CC_B[T_A, F, G], b: CC_A, c: T_B[G, G]) extends T_B[F, G]

val v_a: T_B[Boolean, CC_A] = null
val v_b: Int = v_a match{
  case CC_B(_) => 0 
  case CC_C(_, _, _) => 1 
}
}
// This is not matched: (CC_B Boolean
//      (CC_A T_A T_A)
//      T_A
//      (CC_B (CC_A T_A T_A)
//            (CC_A T_A T_A)
//            T_A
//            (CC_B (CC_A T_A T_A)
//                  (CC_A T_A T_A)
//                  T_A
//                  (CC_B (CC_A T_A T_A)
//                        (CC_A T_A T_A)
//                        T_A
//                        Wildcard
//                        (T_B (CC_A T_A T_A) (CC_A T_A T_A)))
//                  (T_B (CC_A T_A T_A) (CC_A T_A T_A)))
//            (T_B (CC_A T_A T_A) (CC_A T_A T_A)))
//      (T_B Boolean (CC_A T_A T_A)))
// This is not matched: (CC_C Wildcard Wildcard Wildcard T_A)