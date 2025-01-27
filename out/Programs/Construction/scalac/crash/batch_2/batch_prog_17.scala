package Program_17 

object Test {
sealed trait T_A
sealed trait T_B
case class CC_A(a: Int, b: T_A, c: T_B) extends T_A
case class CC_B() extends T_A
case class CC_C(a: CC_B, b: T_B) extends T_B

val v_a: CC_A = null
val v_b: Int = v_a match{
  case CC_A(_, _, _) => 0 
}
}