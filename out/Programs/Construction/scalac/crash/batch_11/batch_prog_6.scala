package Program_6 

object Test {
sealed trait T_A
case class CC_A(a: T_A, b: T_A, c: T_A) extends T_A
case class CC_B(a: Int, b: T_A, c: Int) extends T_A
case class CC_C(a: Boolean) extends T_A

val v_a: CC_C = null
val v_b: Int = v_a match{
  case CC_C(true) => 0 
  case CC_C(false) => 1 
}
}