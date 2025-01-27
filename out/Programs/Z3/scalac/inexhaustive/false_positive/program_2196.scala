package Program_31 

object Test {
sealed trait T_A[A, B]
case class CC_B[D](a: (Byte,Char)) extends T_A[D, T_A[Boolean, D]]

val v_a: CC_B[Byte] = null
val v_b: Int = v_a match{
  case CC_B((_,'x')) => 0 
}
}
// This is not matched: (CC_B T_B (T_A T_B T_B) Wildcard (T_A T_B (T_A T_B T_B)))