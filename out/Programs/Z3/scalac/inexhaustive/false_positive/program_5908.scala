package Program_11 

object Test {
sealed trait T_A[A, B]
case class CC_B[D](a: (Boolean,Char)) extends T_A[(Byte,Byte), D]

val v_a: CC_B[Byte] = null
val v_b: Int = v_a match{
  case CC_B((_,'x')) => 0 
}
}
// This is not matched: (CC_A T_A)