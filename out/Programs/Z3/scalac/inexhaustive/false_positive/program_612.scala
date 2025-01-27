package Program_31 

package Program_8 

object Test {
sealed trait T_A[A, B]
case class CC_A[D, C, E](a: D, b: T_A[E, Boolean], c: C) extends T_A[C, D]
case class CC_B[F](a: CC_A[F, F, F], b: F, c: T_A[F, F]) extends T_A[CC_A[F, F, F], F]
case class CC_C[G](a: CC_B[Int], b: T_A[G, G], c: G) extends T_A[CC_A[G, G, G], G]

val v_a: CC_C[Int] = null
val v_b: Int = v_a match{
  case CC_C(CC_B(_, _, _), CC_A(_, _, _), _) => 0 
  case CC_C(_, _, 12) => 1 
  case CC_C(_, CC_A(_, _, _), 12) => 2 
}
}
// This is not matched: (CC_C Int
//      Wildcard
//      (CC_A Int
//            Int
//            (CC_A (CC_B Boolean Boolean Boolean Boolean Boolean)
//                  Boolean
//                  Boolean
//                  Boolean
//                  Boolean
//                  Boolean
//                  Boolean)
//            Wildcard
//            (CC_A Boolean
//                  (CC_A (CC_B Boolean
//                              Boolean
//                              Boolean
//                              (T_A Boolean Boolean)
//                              Boolean)
//                        Boolean
//                        Boolean
//                        Boolean
//                        Boolean
//                        Boolean
//                        Boolean)
//                  Boolean
//                  Boolean
//                  Wildcard
//                  Wildcard
//                  (T_A (CC_A (CC_B Boolean
//                                   Boolean
//                                   Boolean
//                                   (T_A Boolean Boolean)
//                                   Boolean)
//                             Boolean
//                             Boolean
//                             Boolean
//                             Boolean
//                             Boolean
//                             Boolean)
//                       Boolean))
//            Int
//            (T_A Int Int))
//      Wildcard
//      (T_A (CC_A Int Int Int Boolean Boolean Boolean Boolean) Int))
// This is not matched: (CC_B T_A)