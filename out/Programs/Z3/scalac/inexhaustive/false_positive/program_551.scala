package Program_30 

object Test {
sealed trait T_A[A]
case class CC_A[B](a: B) extends T_A[B]

val v_a: CC_A[Byte] = null
val v_b: Int = v_a match{
  case CC_A(0) => 0 
}
}
// This is not matched: (CC_E Char (CC_B T_A T_A) Wildcard (T_B (CC_B T_A T_A) Char))