package Program_30 

object Test {
sealed trait T_A
case class CC_A(a: T_A) extends T_A
case class CC_B(a: T_A, b: T_A) extends T_A
case class CC_C(a: CC_A, b: CC_A) extends T_A

val v_a: T_A = null
val v_b: Int = v_a match{
  case CC_A(_) => 0 
  case CC_B(_, CC_A(CC_A(_))) => 1 
  case CC_B(_, CC_A(CC_B(_, _))) => 2 
  case CC_B(_, CC_A(CC_C(_, _))) => 3 
  case CC_B(_, CC_B(_, _)) => 4 
  case CC_B(_, CC_C(_, _)) => 5 
  case CC_C(_, CC_A(CC_A(_))) => 6 
  case CC_C(_, CC_A(CC_C(_, _))) => 7 
}
}
// This is not matched: CC_C(_, CC_A(CC_B(_, _)))