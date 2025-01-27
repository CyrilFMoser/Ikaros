package Program_14 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C]
case class CC_A[D, E]() extends T_A[D, E]
case class CC_B[F]() extends T_B[F]
case class CC_C[G](a: CC_A[G, G], b: G, c: T_B[G]) extends T_B[G]

val v_a: CC_C[Int] = null
val v_b: Int = v_a match{
  case CC_C(_, _, CC_B()) => 0 
}
}
// This is not matched: (CC_C Int
//      Wildcard
//      Wildcard
//      (CC_C Int
//            (CC_A Int Int Wildcard Int Wildcard (T_A Int Int))
//            Int
//            Wildcard
//            (T_B Int))
//      (T_B Int))