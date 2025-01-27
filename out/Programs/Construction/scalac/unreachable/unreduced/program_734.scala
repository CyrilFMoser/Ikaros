package Program_5 

object Test {
sealed trait T_A
sealed trait T_B[A, B]
case class CC_A(a: T_A, b: T_B[Int, Int], c: T_B[T_A, (T_A,T_A)]) extends T_A
case class CC_B(a: Byte, b: CC_A) extends T_A
case class CC_C() extends T_A
case class CC_D[C](a: T_A) extends T_B[CC_C, C]
case class CC_E[D](a: (T_B[T_A, T_A],T_B[CC_A, T_A]), b: T_B[D, D], c: T_A) extends T_B[CC_C, D]
case class CC_F[E](a: T_A, b: CC_E[E]) extends T_B[CC_C, E]

val v_a: T_B[CC_C, CC_C] = null
val v_b: Int = v_a match{
  case CC_D(CC_A(_, _, _)) => 0 
  case CC_D(CC_B(_, _)) => 1 
  case CC_D(CC_C()) => 2 
  case CC_E((_,_), CC_D(_), CC_A(_, _, _)) => 3 
  case CC_E((_,_), CC_E(_, _, _), CC_A(_, _, _)) => 4 
  case CC_E((_,_), CC_F(_, _), CC_A(_, _, _)) => 5 
  case CC_E((_,_), CC_D(_), CC_B(_, _)) => 6 
  case CC_E((_,_), CC_E(_, _, _), CC_B(_, _)) => 7 
  case CC_E((_,_), CC_F(_, _), CC_B(_, _)) => 8 
  case CC_E((_,_), CC_D(_), CC_C()) => 9 
  case CC_E((_,_), CC_E(_, _, _), CC_C()) => 10 
  case CC_E((_,_), CC_F(_, _), CC_C()) => 11 
  case CC_F(CC_A(_, _, _), CC_E(_, _, _)) => 12 
  case CC_F(CC_B(_, _), CC_E(_, _, _)) => 13 
  case CC_F(CC_C(), CC_E(_, _, _)) => 14 
}
}