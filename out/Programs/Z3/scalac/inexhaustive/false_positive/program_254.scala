package Program_31 

object Test {
sealed trait T_A[A]
sealed trait T_B[B, C]
case class CC_A[D]() extends T_A[D]
case class CC_C[F]() extends T_A[F]
case class CC_D[G](a: T_A[G], b: T_B[G, G]) extends T_B[G, T_A[G]]

val v_a: T_B[Byte, T_A[Byte]] = null
val v_b: Int = v_a match{
  case CC_D(CC_A(), _) => 0 
}
}
// This is not matched: (CC_E (CC_A (CC_D Wildcard Wildcard Wildcard Wildcard)
//            Wildcard
//            (CC_A (CC_D Wildcard Wildcard Wildcard Wildcard)
//                  Wildcard
//                  Wildcard
//                  Wildcard
//                  (T_A (CC_D Wildcard Wildcard Wildcard Wildcard)))
//            (CC_B (CC_D T_B T_B T_B T_B)
//                  Wildcard
//                  Wildcard
//                  Wildcard
//                  (T_A (CC_D T_B T_B T_B T_B)))
//            (T_A (CC_D Wildcard Wildcard Wildcard Wildcard)))
//      T_B)