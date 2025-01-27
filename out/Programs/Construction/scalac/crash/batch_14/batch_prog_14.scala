package Program_14 

object Test {
sealed trait T_A
case class CC_A(a: T_A) extends T_A
case class CC_B(a: (CC_A,T_A), b: T_A, c: Boolean) extends T_A

val v_a: T_A = null
val v_b: Int = v_a match{
  case CC_A(CC_A(CC_A(_))) => 0 
  case CC_A(CC_A(CC_B(_, _, _))) => 1 
  case CC_A(CC_B(_, CC_A(_), _)) => 2 
  case CC_A(CC_B(_, CC_B(_, _, _), _)) => 3 
  case CC_B(_, _, true) => 4 
  case CC_B(_, _, false) => 5 
}
}