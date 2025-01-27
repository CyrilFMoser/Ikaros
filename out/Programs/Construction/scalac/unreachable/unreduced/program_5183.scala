package Program_13 

object Test {
sealed trait T_A
sealed trait T_B[A, B]
case class CC_A(a: T_B[(T_A,Int), T_A]) extends T_A
case class CC_B(a: T_B[CC_A, Byte], b: T_B[T_B[CC_A, CC_A], T_B[T_A, CC_A]], c: (T_A,(CC_A,T_A))) extends T_A
case class CC_C(a: (T_A,Boolean)) extends T_A
case class CC_D[C]() extends T_B[T_B[CC_B, T_B[CC_A, CC_B]], C]
case class CC_E[D](a: T_B[CC_B, D], b: Char) extends T_B[T_B[CC_B, T_B[CC_A, CC_B]], D]
case class CC_F[E](a: E, b: E, c: CC_A) extends T_B[T_B[E, E], E]

val v_a: T_B[T_B[T_A, T_A], T_A] = null
val v_b: Int = v_a match{
  case CC_F(CC_A(_), CC_A(_), _) => 0 
  case CC_F(CC_A(_), CC_B(_, _, _), _) => 1 
  case CC_F(CC_A(_), CC_C((_,_)), _) => 2 
  case CC_F(CC_B(_, _, _), CC_A(_), _) => 3 
  case CC_F(CC_B(_, _, _), CC_B(_, _, _), _) => 4 
  case CC_F(CC_C((_,_)), CC_A(_), _) => 5 
  case CC_F(CC_C((_,_)), CC_B(_, _, _), _) => 6 
  case CC_F(CC_C((_,_)), CC_C((_,_)), _) => 7 
}
}
// This is not matched: CC_F(CC_B(_, _, _), CC_C((_,_)), _)