package Program_14 

object Test {
sealed trait T_A
sealed trait T_B
case class CC_A(a: T_A, b: T_A, c: Int) extends T_A
case class CC_B(a: T_B, b: T_B, c: CC_A) extends T_A
case class CC_C(a: Boolean) extends T_B
case class CC_D() extends T_B
case class CC_E(a: T_A, b: CC_B) extends T_B

val v_a: T_B = null
val v_b: Int = v_a match{
  case CC_C(true) => 0 
  case CC_C(false) => 1 
  case CC_D() => 2 
}
}
// This is not matched: CC_E(_, _)