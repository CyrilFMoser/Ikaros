package Program_11 

object Test {
sealed trait T_A
case class CC_A(a: T_A) extends T_A
case class CC_B(a: T_A) extends T_A

val v_a: T_A = null
val v_b: Int = v_a match{
  case CC_A(CC_A(CC_A(_))) => 0 
  case CC_A(CC_A(CC_B(_))) => 1 
  case CC_A(CC_B(CC_A(_))) => 2 
  case CC_A(CC_B(CC_B(_))) => 3 
  case CC_B(CC_A(CC_A(_))) => 4 
  case CC_B(CC_A(CC_B(_))) => 5 
  case CC_B(CC_B(CC_A(_))) => 6 
  case CC_B(CC_B(CC_B(_))) => 7 
}
}