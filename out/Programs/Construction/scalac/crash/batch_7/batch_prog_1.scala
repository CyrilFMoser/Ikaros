package Program_1 

object Test {
sealed trait T_A
case class CC_A() extends T_A
case class CC_B(a: T_A, b: Byte, c: CC_A) extends T_A
case class CC_C(a: Int) extends T_A

val v_a: CC_C = null
val v_b: Int = v_a match{
  case CC_C(_) => 0 
}
}