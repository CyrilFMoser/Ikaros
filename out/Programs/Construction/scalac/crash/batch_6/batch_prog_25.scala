package Program_25 

object Test {
sealed trait T_A
sealed trait T_B
case class CC_A() extends T_A
case class CC_B(a: T_B, b: CC_A) extends T_A
case class CC_C(a: ((CC_B,T_A),T_A), b: CC_A, c: CC_A) extends T_A
case class CC_D(a: T_B) extends T_B
case class CC_E(a: CC_A) extends T_B

val v_a: T_B = null
val v_b: Int = v_a match{
  case CC_D(CC_D(_)) => 0 
  case CC_D(CC_E(_)) => 1 
  case CC_E(CC_A()) => 2 
}
}