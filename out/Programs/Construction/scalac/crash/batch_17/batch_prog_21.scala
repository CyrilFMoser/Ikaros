package Program_21 

object Test {
sealed trait T_A
sealed trait T_B
case class CC_A() extends T_A
case class CC_B(a: T_A) extends T_A
case class CC_C(a: CC_A, b: CC_A) extends T_A
case class CC_D(a: T_A, b: CC_A, c: CC_B) extends T_B
case class CC_E(a: CC_A, b: T_A) extends T_B
case class CC_F() extends T_B

val v_a: T_B = null
val v_b: Int = v_a match{
  case CC_D(_, _, _) => 0 
  case CC_F() => 1 
}
}
// This is not matched: CC_E(CC_A(), _)