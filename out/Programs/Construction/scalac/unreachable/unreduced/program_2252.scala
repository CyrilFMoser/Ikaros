package Program_21 

object Test {
sealed trait T_A
sealed trait T_B[A, B]
case class CC_A(a: (T_A,T_B[(Char,Char), T_A]), b: T_A, c: T_B[T_B[T_A, (Int,Boolean)], Boolean]) extends T_A
case class CC_B() extends T_A
case class CC_C() extends T_A
case class CC_D[C](a: CC_A, b: CC_C) extends T_B[C, T_B[C, CC_C]]

val v_a: T_A = null
val v_b: Int = v_a match{
  case CC_A(_, CC_A((_,_), CC_A(_, _, _), _), _) => 0 
  case CC_A(_, CC_A((_,_), CC_B(), _), _) => 1 
  case CC_A(_, CC_B(), _) => 2 
  case CC_A(_, CC_C(), _) => 3 
  case CC_B() => 4 
  case CC_C() => 5 
}
}
// This is not matched: CC_A(_, CC_A((_,_), CC_C(), _), _)