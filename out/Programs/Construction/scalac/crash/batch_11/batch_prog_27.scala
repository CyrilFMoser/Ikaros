package Program_27 

object Test {
sealed trait T_A
sealed trait T_B
case class CC_A() extends T_A

val v_a: T_A = null
val v_b: Int = v_a match{
  case CC_A() => 0 
}
}