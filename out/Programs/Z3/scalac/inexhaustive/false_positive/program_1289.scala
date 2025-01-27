package Program_31 

object Test {
sealed trait T_A[A]
sealed trait T_B[B]
case class CC_A[D](a: Byte, b: T_B[D]) extends T_A[D]
case class CC_B() extends T_B[CC_A[Int]]

val v_a: T_A[Char] = null
val v_b: Int = v_a match{
  case CC_A(0, _) => 0 
}
}
// This is not matched: (CC_E (CC_B Char Boolean Boolean)
//      (CC_C Byte Boolean Boolean)
//      (CC_D (CC_B Char Boolean Boolean)
//            Wildcard
//            (T_B (CC_B Char Boolean Boolean) (CC_B Char Boolean Boolean)))
//      (T_B (CC_B Char Boolean Boolean) (CC_C Byte Boolean Boolean)))