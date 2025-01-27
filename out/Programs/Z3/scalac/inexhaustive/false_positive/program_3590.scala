package Program_12 

object Test {
sealed trait T_A[A]
case class CC_B[C](a: C) extends T_A[C]

val v_a: CC_B[Char] = null
val v_b: Int = v_a match{
  case CC_B('x') => 0 
}
}
// This is not matched: (CC_B Byte
//      (CC_B Byte Wildcard Wildcard (T_B Byte))
//      (CC_C Char (CC_C Char Wildcard (T_B Char)) (T_B Char))
//      (T_B Byte))