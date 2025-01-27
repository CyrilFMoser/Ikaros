package Program_28 

object Test {
sealed trait T_A[A]
case class CC_B[C](a: C) extends T_A[C]

val v_a: CC_B[Char] = null
val v_b: Int = v_a match{
  case CC_B('x') => 0 
}
}
// This is not matched: (CC_B Byte
//      (T_B (T_A Boolean Int) (CC_B Char Char Boolean Boolean Boolean))
//      Wildcard
//      Wildcard
//      (T_A Byte
//           (T_B (T_A Boolean Int) (CC_B Char Char Boolean Boolean Boolean))))