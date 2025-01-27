package Program_11 

object Test {
sealed trait T_A
sealed trait T_B
case class CC_A(a: T_A, b: T_B) extends T_A
case class CC_B(a: CC_A, b: T_B, c: T_B) extends T_B
case class CC_C(a: Boolean, b: T_A, c: Char) extends T_B

val v_a: T_A = null
val v_b: Int = v_a match{
  case CC_A(CC_A(_, _), _) => 0 
}
}