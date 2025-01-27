package Program_18 

object Test {
sealed trait T_A
sealed trait T_B[A]
case class CC_A(a: T_B[T_B[(Byte,Int)]]) extends T_A
case class CC_B(a: Boolean) extends T_A
case class CC_C(a: T_B[CC_B]) extends T_B[CC_B]
case class CC_D(a: CC_C, b: CC_C, c: CC_C) extends T_B[CC_B]

val v_a: T_A = null
val v_b: Int = v_a match{
  case CC_A(_) => 0 
  case CC_B(true) => 1 
  case CC_B(false) => 2 
}
}