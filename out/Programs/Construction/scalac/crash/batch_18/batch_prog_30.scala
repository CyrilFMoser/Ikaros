package Program_30 

object Test {
sealed trait T_A
sealed trait T_B[A, B]
case class CC_A(a: T_A) extends T_A
case class CC_B(a: ((Int,CC_A),Boolean), b: Char) extends T_A
case class CC_C(a: T_B[CC_A, (T_A,T_A)], b: CC_B, c: T_A) extends T_A

val v_a: T_A = null
val v_b: Int = v_a match{
  case CC_A(CC_A(CC_A(_))) => 0 
  case CC_A(CC_A(CC_B(_, _))) => 1 
  case CC_A(CC_A(CC_C(_, _, _))) => 2 
  case CC_A(CC_B(_, _)) => 3 
  case CC_A(CC_C(_, CC_B(_, _), CC_A(_))) => 4 
  case CC_A(CC_C(_, CC_B(_, _), CC_B(_, _))) => 5 
  case CC_A(CC_C(_, CC_B(_, _), CC_C(_, _, _))) => 6 
  case CC_B(((_,_),_), 'x') => 7 
  case CC_B(((_,_),_), _) => 8 
  case CC_C(_, CC_B(_, _), CC_A(_)) => 9 
  case CC_C(_, CC_B(_, _), CC_B(_, 'x')) => 10 
  case CC_C(_, CC_B(_, _), CC_B(_, _)) => 11 
  case CC_C(_, CC_B(_, _), CC_C(_, _, _)) => 12 
}
}