package Program_7 

object Test {
sealed trait T_A
case class CC_A() extends T_A
case class CC_B() extends T_A

val v_a: T_A = null
val v_b: Int = v_a match{
  case CC_A() => 0 
  case CC_B() => 1 
}
}