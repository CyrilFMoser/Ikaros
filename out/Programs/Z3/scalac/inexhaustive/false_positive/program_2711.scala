package Program_29 

object Test {
sealed trait T_A[A]
case class CC_A() extends T_A[Byte]
case class CC_B(a: (CC_A,Char)) extends T_A[Byte]

val v_a: CC_B = null
val v_b: Int = v_a match{
  case CC_B((_,'x')) => 0 
}
}
// This is not matched: (CC_B Wildcard Wildcard Wildcard T_A)