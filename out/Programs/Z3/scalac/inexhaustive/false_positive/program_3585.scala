package Program_15 

object Test {
sealed trait T_A[A, B]
case class CC_A[D, C](a: Int) extends T_A[D, C]

val v_a: CC_A[Byte, Char] = null
val v_b: Int = v_a match{
  case CC_A(12) => 0 
}
}
// This is not matched: (CC_A Boolean Int (T_A Int Boolean))