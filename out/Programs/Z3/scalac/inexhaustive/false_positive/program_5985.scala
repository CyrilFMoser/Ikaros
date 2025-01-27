package Program_14 

object Test {
sealed trait T_A[A, B]
case class CC_A[C](a: Byte) extends T_A[C, Char]

val v_a: CC_A[Boolean] = null
val v_b: Int = v_a match{
  case CC_A(0) => 0 
}
}
// This is not matched: (CC_B Wildcard T_A)