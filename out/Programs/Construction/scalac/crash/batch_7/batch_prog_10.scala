package Program_10 

object Test {
sealed trait T_A
sealed trait T_B
case class CC_A(a: T_A) extends T_A
case class CC_B() extends T_A
case class CC_C() extends T_B

val v_a: CC_C = null
val v_b: Int = v_a match{
  case CC_C() => 0 
}
}