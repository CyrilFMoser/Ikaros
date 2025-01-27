package Program_30 

object Test {
sealed trait T_A[A]
case class CC_A[B](a: Byte) extends T_A[B]

val v_a: CC_A[Char] = null
val v_b: Int = v_a match{
  case CC_A(0) => 0 
}
}
// This is not matched: (CC_B Byte
//      (T_B (T_A Boolean Int) (CC_B Char Char Boolean Boolean Boolean))
//      Wildcard
//      Wildcard
//      (T_A Byte
//           (T_B (T_A Boolean Int) (CC_B Char Char Boolean Boolean Boolean))))