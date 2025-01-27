package Program_5 

object Test {
sealed trait T_A
sealed trait T_B[A, B]
case class CC_A() extends T_A
case class CC_B(a: T_A, b: T_B[CC_A, Byte]) extends T_A
case class CC_C(a: T_B[Boolean, CC_A]) extends T_A
case class CC_D[C](a: Boolean) extends T_B[CC_B, C]

val v_a: T_A = null
val v_b: Int = v_a match{
  case CC_A() => 0 
  case CC_B(CC_A(), _) => 1 
  case CC_B(CC_B(CC_A(), _), _) => 2 
  case CC_B(CC_B(CC_B(_, _), _), _) => 3 
  case CC_B(CC_B(CC_C(_), _), _) => 4 
  case CC_B(CC_C(_), _) => 5 
  case CC_C(_) => 6 
}
}