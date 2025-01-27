package Program_31 

object Test {
sealed trait T_A[A]
case class CC_B[D](a: (Byte,Char)) extends T_A[D]

val v_a: CC_B[Byte] = null
val v_b: Int = v_a match{
  case CC_B((_,'x')) => 0 
}
}
// This is not matched: (CC_B Wildcard Wildcard Wildcard T_A)