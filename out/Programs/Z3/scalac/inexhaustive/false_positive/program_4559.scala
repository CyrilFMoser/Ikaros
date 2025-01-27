package Program_14 

object Test {
sealed trait T_A[A, B]
sealed trait T_B
case class CC_C(a: Char, b: (T_B,Int)) extends T_B
case class CC_D() extends T_B

val v_a: CC_C = null
val v_b: Int = v_a match{
  case CC_C(_, (CC_D(),_)) => 0 
}
}
// This is not matched: (CC_B (T_A Byte) (T_A (T_A Byte)))