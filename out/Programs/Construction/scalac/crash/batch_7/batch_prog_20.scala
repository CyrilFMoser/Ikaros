package Program_20 

object Test {
sealed trait T_A
sealed trait T_B
case class CC_A(a: Int, b: T_A) extends T_A
case class CC_B(a: (T_B,CC_A), b: Boolean) extends T_B

val v_a: T_A = null
val v_b: Int = v_a match{
  case CC_A(_, CC_A(12, _)) => 0 
  case CC_A(_, CC_A(_, _)) => 1 
}
}