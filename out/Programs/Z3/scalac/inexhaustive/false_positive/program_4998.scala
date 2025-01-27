package Program_14 

object Test {
sealed trait T_A[A, B]
case class CC_A[D](a: T_A[D, D], b: (Byte,Char)) extends T_A[(Char,Byte), D]

val v_a: T_A[(Char,Byte), Byte] = null
val v_b: Int = v_a match{
  case CC_A(_, (_,'x')) => 0 
}
}
// This is not matched: (CC_A Byte T_B Wildcard (T_A Byte Byte))