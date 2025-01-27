package Program_22 

object Test {
sealed trait T_A[A]
sealed trait T_B
case class CC_A(a: Byte) extends T_A[T_B]
case class CC_B(a: Char, b: T_A[T_A[CC_A]]) extends T_B
case class CC_C() extends T_B

val v_a: T_B = null
val v_b: Int = v_a match{
  case CC_B(_, _) => 0 
  case CC_C() => 1 
}
}