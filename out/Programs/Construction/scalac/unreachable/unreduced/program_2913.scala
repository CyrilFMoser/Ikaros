package Program_21 

object Test {
sealed trait T_A
sealed trait T_B[A]
case class CC_A(a: T_B[T_B[T_A]], b: T_A, c: T_B[T_A]) extends T_A
case class CC_B() extends T_A
case class CC_C(a: T_A, b: T_B[T_A], c: Int) extends T_A
case class CC_D[B]() extends T_B[T_A]
case class CC_E(a: T_B[Boolean], b: CC_C) extends T_B[T_A]
case class CC_F(a: (CC_B,Boolean), b: T_B[T_B[T_A]], c: T_A) extends T_B[T_A]

val v_a: T_A = null
val v_b: Int = v_a match{
  case CC_A(_, CC_A(_, _, _), CC_D()) => 0 
  case CC_A(_, CC_B(), CC_D()) => 1 
  case CC_A(_, CC_C(_, _, _), CC_D()) => 2 
  case CC_A(_, CC_A(_, _, _), CC_E(_, CC_C(_, _, _))) => 3 
  case CC_A(_, CC_B(), CC_E(_, CC_C(_, _, _))) => 4 
  case CC_A(_, CC_C(_, _, _), CC_E(_, CC_C(_, _, _))) => 5 
  case CC_A(_, CC_A(_, _, _), CC_F((_,_), _, CC_A(_, _, _))) => 6 
  case CC_A(_, CC_B(), CC_F((_,_), _, CC_A(_, _, _))) => 7 
  case CC_A(_, CC_C(_, _, _), CC_F((_,_), _, CC_A(_, _, _))) => 8 
  case CC_A(_, CC_A(_, _, _), CC_F((_,_), _, CC_B())) => 9 
  case CC_A(_, CC_B(), CC_F((_,_), _, CC_B())) => 10 
  case CC_A(_, CC_C(_, _, _), CC_F((_,_), _, CC_B())) => 11 
  case CC_A(_, CC_A(_, _, _), CC_F((_,_), _, CC_C(_, _, _))) => 12 
  case CC_A(_, CC_B(), CC_F((_,_), _, CC_C(_, _, _))) => 13 
  case CC_A(_, CC_C(_, _, _), CC_F((_,_), _, CC_C(_, _, _))) => 14 
  case CC_B() => 15 
  case CC_C(_, _, _) => 16 
}
}