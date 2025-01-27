package Program_30 

object Test {
sealed trait T_A[A, B]
case class CC_A[C](a: C) extends T_A[C, T_A[Boolean, Boolean]]

val v_a: CC_A[Byte] = null
val v_b: Int = v_a match{
  case CC_A(0) => 0 
}
}
// This is not matched: (CC_D (CC_C Byte Wildcard Wildcard Wildcard (T_B Byte))
//      (T_B (CC_A T_A T_A T_A)))