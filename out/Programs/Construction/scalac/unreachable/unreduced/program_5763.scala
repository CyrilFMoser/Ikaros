package Program_11 

object Test {
sealed trait T_A
sealed trait T_B[A, B]
case class CC_A(a: (Char,T_B[Char, (Char,Int)]), b: T_A) extends T_A
case class CC_B() extends T_A
case class CC_C(a: T_A, b: T_A, c: CC_B) extends T_A
case class CC_D[C](a: T_A, b: Byte) extends T_B[CC_C, C]
case class CC_E[D](a: (T_B[CC_C, CC_B],T_B[CC_C, Int])) extends T_B[CC_A, D]
case class CC_F[E](a: E, b: E) extends T_B[E, CC_C]

val v_a: T_B[T_A, CC_C] = null
val v_b: Int = v_a match{
  case CC_F(CC_A((_,_), CC_A(_, _)), _) => 0 
  case CC_F(CC_A((_,_), CC_B()), _) => 1 
  case CC_F(CC_A((_,_), CC_C(_, _, _)), _) => 2 
  case CC_F(CC_B(), _) => 3 
  case CC_F(CC_C(CC_A(_, _), CC_A(_, _), CC_B()), _) => 4 
  case CC_F(CC_C(CC_B(), CC_A(_, _), CC_B()), _) => 5 
  case CC_F(CC_C(CC_C(_, _, _), CC_A(_, _), CC_B()), _) => 6 
  case CC_F(CC_C(CC_A(_, _), CC_B(), CC_B()), _) => 7 
  case CC_F(CC_C(CC_B(), CC_B(), CC_B()), _) => 8 
  case CC_F(CC_C(CC_C(_, _, _), CC_B(), CC_B()), _) => 9 
  case CC_F(CC_C(CC_A(_, _), CC_C(_, _, _), CC_B()), _) => 10 
  case CC_F(CC_C(CC_B(), CC_C(_, _, _), CC_B()), _) => 11 
  case CC_F(CC_C(CC_C(_, _, _), CC_C(_, _, _), CC_B()), _) => 12 
}
}