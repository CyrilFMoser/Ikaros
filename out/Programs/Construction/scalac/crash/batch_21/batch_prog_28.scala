package Program_28 

object Test {
sealed trait T_A
case class CC_A(a: T_A) extends T_A
case class CC_B(a: CC_A, b: CC_A) extends T_A
case class CC_C(a: T_A) extends T_A

val v_a: T_A = null
val v_b: Int = v_a match{
  case CC_A(CC_A(CC_A(_))) => 0 
  case CC_A(CC_A(CC_B(_, _))) => 1 
  case CC_A(CC_A(CC_C(_))) => 2 
  case CC_A(CC_B(CC_A(_), CC_A(_))) => 3 
  case CC_A(CC_C(CC_A(_))) => 4 
  case CC_A(CC_C(CC_B(_, _))) => 5 
  case CC_A(CC_C(CC_C(_))) => 6 
  case CC_B(_, _) => 7 
  case CC_C(CC_A(CC_A(_))) => 8 
  case CC_C(CC_A(CC_B(_, _))) => 9 
  case CC_C(CC_A(CC_C(_))) => 10 
  case CC_C(CC_B(_, _)) => 11 
  case CC_C(CC_C(CC_A(_))) => 12 
  case CC_C(CC_C(CC_B(_, _))) => 13 
  case CC_C(CC_C(CC_C(_))) => 14 
}
}