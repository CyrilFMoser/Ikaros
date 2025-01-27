package Program_31 

object Test {
sealed trait T_A[A, B]
sealed trait T_B
case class CC_A[C](a: T_A[(T_B,T_B), C]) extends T_A[Byte, C]
case class CC_B() extends T_B
case class CC_C(a: CC_B, b: Int, c: T_A[Char, CC_B]) extends T_B

val v_a: T_B = null
val v_b: Int = v_a match{
  case CC_B() => 0 
  case CC_C(CC_B(), _, _) => 1 
}
}