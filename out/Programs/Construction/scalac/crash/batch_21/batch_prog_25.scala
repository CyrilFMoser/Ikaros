package Program_25 

object Test {
sealed trait T_A
case class CC_A(a: T_A, b: Byte) extends T_A
case class CC_B(a: T_A) extends T_A

val v_a: T_A = null
val v_b: Int = v_a match{
  case CC_A(CC_A(CC_A(_, _), 0), _) => 0 
  case CC_A(CC_A(CC_A(_, _), _), _) => 1 
  case CC_A(CC_A(CC_B(_), 0), _) => 2 
  case CC_A(CC_A(CC_B(_), _), _) => 3 
  case CC_A(CC_B(CC_A(_, _)), _) => 4 
  case CC_A(CC_B(CC_B(_)), _) => 5 
  case CC_B(CC_A(CC_A(_, _), _)) => 6 
  case CC_B(CC_A(CC_B(_), _)) => 7 
  case CC_B(CC_B(_)) => 8 
}
}