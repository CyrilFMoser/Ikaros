package Program_29 

package Program_1 

object Test {
sealed trait T_A
sealed trait T_B[A]
case class CC_A[B](a: Char, b: B, c: B) extends T_A

val v_a: T_A = null
val v_b: Int = v_a match{
  case CC_A(_, _, _) => 0 
}
}
// This is not matched: (CC_A T_A Wildcard Wildcard Wildcard T_A)
// This is not matched: (CC_E (CC_B Char Boolean Boolean)
//      (CC_C Byte Boolean Boolean)
//      (CC_D (CC_B Char Boolean Boolean)
//            Wildcard
//            (T_B (CC_B Char Boolean Boolean) (CC_B Char Boolean Boolean)))
//      (T_B (CC_B Char Boolean Boolean) (CC_C Byte Boolean Boolean)))