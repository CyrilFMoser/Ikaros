package Program_14 

object Test {
sealed trait T_A[A, B]
case class CC_A[D, C](a: Byte) extends T_A[D, C]

val v_a: CC_A[Char, Char] = null
val v_b: Int = v_a match{
  case CC_A(0) => 0 
}
}
// This is not matched: (CC_A (CC_B (T_A Byte)) Wildcard Wildcard (T_A Byte))