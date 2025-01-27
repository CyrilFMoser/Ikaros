package Program_15 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C, D]
case class CC_A[E](a: T_B[E, E]) extends T_A[E, (Int,Char)]
case class CC_D[H, I]() extends T_B[I, H]
case class CC_E[J, K]() extends T_B[J, K]

val v_a: CC_A[Byte] = null
val v_b: Int = v_a match{
  case CC_A(CC_D()) => 0 
}
}
// This is not matched: (CC_A Byte
//      Wildcard
//      (CC_A Byte
//            Wildcard
//            (CC_A Byte
//                  Byte
//                  (CC_B Byte Wildcard Wildcard Wildcard (T_A Byte))
//                  (T_A Byte))
//            (T_A Byte))
//      (T_A Byte))