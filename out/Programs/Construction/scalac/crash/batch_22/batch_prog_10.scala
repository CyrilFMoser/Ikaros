package Program_10 

object Test {
sealed trait T_A
sealed trait T_B
case class CC_A() extends T_A
case class CC_B() extends T_B
case class CC_C(a: CC_A, b: T_A) extends T_B

val v_a: T_A = null
val v_b: Int = v_a match{
  case CC_A() => 0 
}
}