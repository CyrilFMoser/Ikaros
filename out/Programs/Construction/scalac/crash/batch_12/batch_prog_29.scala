package Program_29 

object Test {
sealed trait T_A[A, B]
sealed trait T_B
case class CC_A(a: T_B, b: T_A[(T_B,T_B), Byte]) extends T_A[T_B, Int]
case class CC_B(a: Boolean, b: T_A[CC_A, (Boolean,T_B)], c: CC_A) extends T_B
case class CC_C() extends T_B
case class CC_D(a: Char) extends T_B

val v_a: CC_C = null
val v_b: Int = v_a match{
  case CC_C() => 0 
}
}