package Program_8 

object Test {
sealed trait T_A[A, B]
sealed trait T_B
case class CC_A[C](a: C, b: T_A[C, T_B]) extends T_A[C, T_B]
case class CC_B(a: T_B, b: T_B) extends T_A[Char, T_B]
case class CC_C(a: (CC_A[T_B],T_A[CC_B, CC_B]), b: T_A[T_B, T_A[Char, T_B]], c: Byte) extends T_B
case class CC_D(a: Char, b: T_A[Char, T_B], c: T_A[(CC_B,T_B), T_B]) extends T_B

val v_a: T_A[Char, T_B] = null
val v_b: Int = v_a match{
  case CC_A('x', CC_A(_, CC_A(_, _))) => 0 
  case CC_A('x', CC_A(_, CC_B(_, _))) => 1 
  case CC_A('x', CC_B(CC_C(_, _, _), _)) => 2 
  case CC_A('x', CC_B(CC_D(_, _, _), _)) => 3 
  case CC_A(_, CC_A(_, CC_A(_, _))) => 4 
  case CC_A(_, CC_A(_, CC_B(_, _))) => 5 
  case CC_A(_, CC_B(CC_C(_, _, _), _)) => 6 
  case CC_A(_, CC_B(CC_D(_, _, _), _)) => 7 
  case CC_B(CC_C((_,_), _, _), CC_C((_,_), _, _)) => 8 
  case CC_B(CC_C((_,_), _, _), CC_D(_, CC_A(_, _), CC_A(_, _))) => 9 
  case CC_B(CC_C((_,_), _, _), CC_D(_, CC_B(_, _), CC_A(_, _))) => 10 
  case CC_B(CC_D(_, CC_A(_, _), _), CC_C((_,_), _, _)) => 11 
  case CC_B(CC_D(_, CC_A(_, _), _), CC_D(_, CC_A(_, _), CC_A(_, _))) => 12 
  case CC_B(CC_D(_, CC_A(_, _), _), CC_D(_, CC_B(_, _), CC_A(_, _))) => 13 
  case CC_B(CC_D(_, CC_B(_, _), _), CC_C((_,_), _, _)) => 14 
  case CC_B(CC_D(_, CC_B(_, _), _), CC_D(_, CC_A(_, _), CC_A(_, _))) => 15 
  case CC_B(CC_D(_, CC_B(_, _), _), CC_D(_, CC_B(_, _), CC_A(_, _))) => 16 
}
}