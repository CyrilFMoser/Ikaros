package Program_15 

object Test {
sealed trait T_A
case class CC_A(a: T_A, b: Boolean) extends T_A
case class CC_B(a: Char, b: Boolean, c: T_A) extends T_A
case class CC_C(a: CC_B) extends T_A

val v_a: CC_A = null
val v_b: Int = v_a match{
  case CC_A(CC_A(CC_A(_, _), _), _) => 0 
  case CC_A(CC_A(CC_B(_, _, _), _), _) => 1 
  case CC_A(CC_A(CC_C(_), _), _) => 2 
  case CC_A(CC_B(_, _, _), _) => 3 
  case CC_A(CC_C(CC_B(_, _, _)), _) => 4 
}
}