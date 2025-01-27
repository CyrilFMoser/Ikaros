package Program_7 

object Test {
sealed trait T_A
sealed trait T_B[A]
case class CC_A(a: Char, b: Int, c: T_A) extends T_A
case class CC_B(a: T_B[Byte], b: Char, c: Byte) extends T_A
case class CC_C() extends T_A
case class CC_D() extends T_B[CC_B]

val v_a: T_A = null
val v_b: Int = v_a match{
  case CC_B(_, 'x', _) => 0 
  case CC_B(_, _, _) => 1 
  case CC_C() => 2 
}
}
// This is not matched: CC_A(_, _, _)