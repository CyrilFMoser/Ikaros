package Program_13 

object Test {
sealed trait T_A[A, B]
sealed trait T_B
case class CC_A[D, C](a: T_A[C, D], b: T_A[D, T_B]) extends T_A[C, D]
case class CC_C[H, G]() extends T_A[G, H]
case class CC_D() extends T_B

val v_a: CC_A[Byte, CC_D] = null
val v_b: Int = v_a match{
  case CC_A(_, CC_A(_, _)) => 0 
}
}
// This is not matched: (CC_B Char
//      Char
//      (CC_B Char
//            T_A
//            (CC_B Char T_A Wildcard Wildcard Char (T_B Char))
//            (CC_B (CC_A T_A T_A T_A)
//                  T_A
//                  Wildcard
//                  Wildcard
//                  Wildcard
//                  (T_B (CC_A T_A T_A T_A)))
//            Char
//            (T_B Char))
//      Wildcard
//      Wildcard
//      (T_B Char))