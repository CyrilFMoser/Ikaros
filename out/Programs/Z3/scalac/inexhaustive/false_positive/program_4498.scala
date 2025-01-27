package Program_14 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C]
case class CC_B(a: (Char,Char)) extends T_A[T_A[Byte, Byte], T_B[(Int,Byte)]]

val v_a: CC_B = null
val v_b: Int = v_a match{
  case CC_B((_,'x')) => 0 
}
}
// This is not matched: (CC_B Byte (T_A Byte))