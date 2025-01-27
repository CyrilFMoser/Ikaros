package Program_14 

object Test {
sealed trait T_A[A]
sealed trait T_B[B, C]
case class CC_A() extends T_A[T_B[Byte, Byte]]
case class CC_B[E, D]() extends T_B[D, E]
case class CC_C[G, F](a: G, b: T_B[F, CC_A]) extends T_B[F, G]

val v_a: CC_C[CC_A, Byte] = null
val v_b: Int = v_a match{
  case CC_C(_, CC_B()) => 0 
}
}
// This is not matched: (CC_C (CC_A (T_A Boolean) Boolean)
//      Byte
//      Wildcard
//      (CC_B (CC_A Wildcard Wildcard)
//            Byte
//            Wildcard
//            (CC_A (CC_C Char Int Char Wildcard Wildcard (T_B Int Char))
//                  (T_A (T_B Byte Byte)))
//            Wildcard
//            (T_B Byte (CC_A Wildcard Wildcard)))
//      Wildcard
//      (T_B Byte (CC_A (T_A Boolean) Boolean)))