package Program_0 

object Test {
sealed trait T_A
sealed trait T_B[A]
case class CC_A(a: Int) extends T_A
case class CC_B(a: Boolean, b: T_B[T_B[Boolean]]) extends T_A
case class CC_C() extends T_A
case class CC_D(a: Char, b: Byte, c: CC_A) extends T_B[CC_C]

val v_a: T_A = null
val v_b: Int = v_a match{
  case CC_A(12) => 0 
  case CC_A(_) => 1 
  case CC_B(_, _) => 2 
  case CC_C() => 3 
}
}