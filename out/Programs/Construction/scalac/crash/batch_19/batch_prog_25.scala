package Program_25 

object Test {
sealed trait T_A
case class CC_A(a: Boolean, b: T_A) extends T_A
case class CC_B(a: CC_A, b: CC_A) extends T_A

val v_a: CC_B = null
val v_b: Int = v_a match{
  case CC_B(CC_A(_, _), CC_A(true, CC_A(_, _))) => 0 
  case CC_B(CC_A(_, _), CC_A(false, CC_A(_, _))) => 1 
  case CC_B(CC_A(_, _), CC_A(true, CC_B(_, _))) => 2 
  case CC_B(CC_A(_, _), CC_A(false, CC_B(_, _))) => 3 
}
}