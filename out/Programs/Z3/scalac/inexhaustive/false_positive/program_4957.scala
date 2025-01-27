package Program_15 

object Test {
sealed trait T_A[A, B]
case class CC_A[D, E](a: D) extends T_A[E, D]

val v_a: CC_A[Int, Boolean] = null
val v_b: Int = v_a match{
  case CC_A(12) => 0 
}
}
// This is not matched: (CC_E Byte Wildcard (T_B Byte (T_B Byte Byte)))