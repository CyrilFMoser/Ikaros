package Program_14 

object Test {
sealed trait T_A
sealed trait T_B
case class CC_A() extends T_A
case class CC_B() extends T_A
case class CC_C(a: T_A, b: Char, c: CC_A) extends T_A

val v_a: CC_B = null
val v_b: Int = v_a match{
  case CC_B() => 0 
}
}