package Program_0 

object Test {
sealed trait T_A
sealed trait T_B
case class CC_A(a: (T_B,T_A), b: Char) extends T_A
case class CC_B(a: T_A, b: CC_A) extends T_A
case class CC_C(a: Boolean, b: CC_B) extends T_A
case class CC_D(a: T_B) extends T_B

val v_a: T_A = null
val v_b: Int = v_a match{
  case CC_A(_, _) => 0 
  case CC_B(CC_A(_, 'x'), CC_A(_, _)) => 1 
  case CC_B(CC_A(_, _), CC_A(_, _)) => 2 
  case CC_B(CC_B(CC_B(_, _), CC_A(_, _)), CC_A(_, _)) => 3 
  case CC_B(CC_B(CC_C(_, _), CC_A(_, _)), CC_A(_, _)) => 4 
  case CC_B(CC_C(_, _), CC_A(_, _)) => 5 
  case CC_C(_, _) => 6 
}
}
// This is not matched: CC_B(CC_B(CC_A(_, _), CC_A(_, _)), CC_A(_, _))