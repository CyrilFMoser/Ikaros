package Program_27 

object Test {
sealed trait T_A
sealed trait T_B[A, B]
case class CC_A(a: T_B[T_A, (Char,T_A)]) extends T_A
case class CC_B() extends T_A
case class CC_C() extends T_A
case class CC_D(a: CC_B, b: CC_C, c: T_A) extends T_B[Byte, T_B[CC_B, T_A]]
case class CC_E(a: T_B[Byte, T_B[CC_B, T_A]], b: CC_A, c: CC_B) extends T_B[Byte, T_B[CC_B, T_A]]

val v_a: T_A = null
val v_b: Int = v_a match{
  case CC_A(_) => 0 
  case CC_C() => 1 
}
}
// This is not matched: CC_B()