package Program_11 

object Test {
sealed trait T_A
case class CC_A() extends T_A

val v_a: CC_A = null
val v_b: Int = v_a match{
  case CC_A() => 0 
}
}