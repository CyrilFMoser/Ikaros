package Program_27 

object Test {
sealed trait T_A
sealed trait T_B
case class CC_A(a: T_B, b: T_B) extends T_A

val v_a: CC_A = null
val v_b: Int = v_a match{
  case CC_A(_, _) => 0 
}
}