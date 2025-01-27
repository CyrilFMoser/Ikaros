package Program_30 

object Test {
sealed trait T_A[A, B]
case class CC_C[E, F](a: Int) extends T_A[E, F]

val v_a: CC_C[Byte, Byte] = null
val v_b: Int = v_a match{
  case CC_C(12) => 0 
}
}
// This is not matched: (CC_B T_A)