package Program_1 

object Test {
sealed trait T_A[A, B]
sealed trait T_B
case class CC_A[C]() extends T_A[(T_B,T_A[Byte, T_B]), C]
case class CC_B() extends T_B
case class CC_C(a: (T_B,CC_A[CC_B]), b: T_A[CC_B, CC_B]) extends T_B
case class CC_D(a: Int, b: T_B, c: CC_C) extends T_B

val v_a: T_B = null
val v_b: Int = v_a match{
  case CC_B() => 0 
  case CC_C((CC_B(),CC_A()), _) => 1 
  case CC_C((CC_C(_, _),CC_A()), _) => 2 
  case CC_C((CC_D(_, _, _),CC_A()), _) => 3 
  case CC_D(12, CC_B(), _) => 4 
  case CC_D(12, CC_C((_,_), _), _) => 5 
  case CC_D(12, CC_D(_, CC_B(), _), _) => 6 
  case CC_D(12, CC_D(_, CC_C(_, _), _), _) => 7 
  case CC_D(12, CC_D(_, CC_D(_, _, _), _), _) => 8 
  case CC_D(_, CC_B(), _) => 9 
  case CC_D(_, CC_C((_,_), _), _) => 10 
  case CC_D(_, CC_D(_, CC_B(), _), _) => 11 
  case CC_D(_, CC_D(_, CC_C(_, _), _), _) => 12 
  case CC_D(_, CC_D(_, CC_D(_, _, _), _), _) => 13 
}
}