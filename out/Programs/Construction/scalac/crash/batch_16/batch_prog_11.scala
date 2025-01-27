package Program_11 

object Test {
sealed trait T_A[A, B]
sealed trait T_B
case class CC_A[C](a: T_A[T_B, C]) extends T_A[T_B, C]
case class CC_B() extends T_B
case class CC_C(a: Boolean, b: CC_B, c: Byte) extends T_B
case class CC_D(a: T_A[CC_C, CC_B]) extends T_B

val v_a: T_A[T_B, Char] = null
val v_b: Int = v_a match{
  case CC_A(CC_A(CC_A(_))) => 0 
}
}