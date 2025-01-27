package Program_5 

object Test {
sealed trait T_A
sealed trait T_B[A, B]
case class CC_A(a: T_A, b: (T_A,T_A)) extends T_A
case class CC_B(a: T_B[Char, CC_A]) extends T_A
case class CC_C(a: CC_A, b: Int, c: (CC_B,T_A)) extends T_A
case class CC_D[C](a: T_A) extends T_B[(CC_A,CC_C), C]
case class CC_E[D](a: D) extends T_B[(CC_A,CC_C), D]

val v_a: T_A = null
val v_b: Int = v_a match{
  case CC_A(CC_A(_, _), _) => 0 
  case CC_A(CC_B(_), _) => 1 
  case CC_A(CC_C(_, _, _), _) => 2 
  case CC_B(_) => 3 
  case CC_C(CC_A(CC_A(_, _), _), 12, _) => 4 
  case CC_C(CC_A(CC_B(_), _), 12, _) => 5 
  case CC_C(CC_A(CC_C(_, _, _), _), 12, _) => 6 
  case CC_C(CC_A(CC_A(_, _), _), _, _) => 7 
  case CC_C(CC_A(CC_B(_), _), _, _) => 8 
  case CC_C(CC_A(CC_C(_, _, _), _), _, _) => 9 
}
}