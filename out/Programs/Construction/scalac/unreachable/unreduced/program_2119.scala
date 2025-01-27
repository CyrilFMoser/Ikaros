package Program_30 

object Test {
sealed trait T_A
sealed trait T_B[A]
case class CC_A(a: Byte, b: T_B[T_A]) extends T_A
case class CC_B(a: Boolean) extends T_A
case class CC_C(a: Boolean) extends T_B[CC_A]

val v_a: T_A = null
val v_b: Int = v_a match{
  case CC_A(0, _) => 0 
  case CC_A(_, _) => 1 
  case CC_B(true) => 2 
  case CC_B(false) => 3 
}
}