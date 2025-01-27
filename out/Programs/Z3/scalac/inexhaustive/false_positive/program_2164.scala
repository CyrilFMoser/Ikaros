package Program_29 

object Test {
sealed trait T_A[A, B]
case class CC_A[D, C](a: Byte) extends T_A[C, D]

val v_a: CC_A[Byte, Char] = null
val v_b: Int = v_a match{
  case CC_A(0) => 0 
}
}
// This is not matched: (CC_A Boolean Wildcard Wildcard (T_A (T_A Boolean)))