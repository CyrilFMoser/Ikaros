package Program_15 

package Program_13 

object Test {
sealed trait T_A[A]
sealed trait T_B[B]
case class CC_A[C, D](a: T_B[D], b: T_A[C]) extends T_A[C]
case class CC_B() extends T_A[CC_A[Byte, Int]]
case class CC_C(a: T_B[CC_B]) extends T_A[CC_A[Byte, Int]]
case class CC_D[E](a: T_A[E], b: Int) extends T_B[E]
case class CC_E(a: T_B[CC_B], b: T_B[CC_B]) extends T_B[CC_B]
case class CC_F(a: Int, b: T_A[CC_B]) extends T_B[CC_B]

val v_a: T_B[CC_F] = null
val v_b: Int = v_a match{
  case CC_D(CC_A(_, _), _) => 0 
}
}
// This is not matched: (CC_D (CC_F Boolean Boolean Boolean)
//      (CC_A (CC_F Boolean Boolean (T_A Boolean))
//            (CC_B Boolean)
//            (CC_E (CC_D (CC_B Wildcard)
//                        (CC_A (CC_B Wildcard)
//                              Boolean
//                              Wildcard
//                              Wildcard
//                              (T_A (CC_B Wildcard)))
//                        Wildcard
//                        (T_B (CC_B Wildcard)))
//                  (CC_D (CC_B Wildcard) Wildcard Int (T_B (CC_B Wildcard)))
//                  (T_B (CC_B Boolean)))
//            (CC_A (CC_F Boolean Boolean Boolean)
//                  Boolean
//                  Wildcard
//                  Wildcard
//                  (T_A (CC_F Boolean Boolean Boolean)))
//            (T_A (CC_F Boolean Boolean (T_A Boolean))))
//      Wildcard
//      (T_B (CC_F Boolean Boolean Boolean)))
// This is not matched: (CC_B Char (T_A Char))