package Program_31 

object Test {
sealed trait T_A[A, B]
case class CC_A[D, C]() extends T_A[D, C]
case class CC_C[F, E](a: T_A[E, E]) extends T_A[F, E]

val v_a: CC_C[Int, Boolean] = null
val v_b: Int = v_a match{
  case CC_C(CC_A()) => 0 
}
}
// This is not matched: (CC_C Int
//      Boolean
//      (CC_C Boolean
//            Boolean
//            (CC_C Boolean
//                  Boolean
//                  Wildcard
//                  Wildcard
//                  Boolean
//                  (T_A Boolean Boolean))
//            Wildcard
//            Wildcard
//            (T_A Boolean Boolean))
//      (Tuple Wildcard (CC_B Wildcard (T_A T_B Char)))
//      Wildcard
//      (T_A Int Boolean))