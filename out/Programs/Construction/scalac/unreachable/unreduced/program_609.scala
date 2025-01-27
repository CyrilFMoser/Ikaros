package Program_13 

object Test {
sealed trait T_A[A]
sealed trait T_B
case class CC_A() extends T_A[T_A[Char]]
case class CC_B(a: T_B, b: Int, c: Byte) extends T_A[T_A[Char]]
case class CC_C() extends T_B
case class CC_D(a: T_A[CC_C]) extends T_B
case class CC_E() extends T_B

val v_a: T_B = null
val v_b: Int = v_a match{
  case CC_C() => 0 
  case CC_D(_) => 1 
}
}
// This is not matched: CC_E()