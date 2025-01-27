package Program_18 

object Test {
sealed trait T_A
sealed trait T_B[A, B]
case class CC_A(a: T_A) extends T_A
case class CC_B(a: CC_A, b: Boolean) extends T_A
case class CC_C(a: Char, b: T_B[Char, T_B[CC_A, CC_B]]) extends T_A
case class CC_D[C](a: C, b: CC_C, c: (T_B[(Char,Char), CC_B],T_A)) extends T_B[C, CC_B]
case class CC_E[D](a: D, b: T_A, c: (CC_A,T_B[Int, CC_B])) extends T_B[D, CC_B]

val v_a: T_A = null
val v_b: Int = v_a match{
  case CC_A(CC_A(CC_B(_, _))) => 0 
  case CC_A(CC_A(CC_C(_, _))) => 1 
  case CC_A(CC_B(CC_A(_), _)) => 2 
  case CC_A(CC_C(_, _)) => 3 
  case CC_B(_, _) => 4 
  case CC_C('x', _) => 5 
  case CC_C(_, _) => 6 
}
}
// This is not matched: CC_A(CC_A(CC_A(_)))