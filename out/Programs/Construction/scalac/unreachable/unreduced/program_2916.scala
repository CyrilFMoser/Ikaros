package Program_12 

object Test {
sealed trait T_A[A, B]
sealed trait T_B
case class CC_A[C](a: T_A[C, T_A[Int, T_B]], b: T_A[C, T_A[Int, T_B]]) extends T_A[C, T_A[Int, T_B]]
case class CC_B[D](a: (Byte,T_A[T_B, Char]), b: Boolean) extends T_A[D, T_A[Int, T_B]]
case class CC_C[E](a: E, b: CC_A[E], c: CC_A[E]) extends T_A[E, T_A[Int, T_B]]
case class CC_D(a: T_A[T_A[Int, T_B], CC_A[T_B]], b: T_A[CC_B[T_B], T_A[Int, T_B]], c: Char) extends T_B
case class CC_E() extends T_B
case class CC_F(a: T_A[T_A[T_B, CC_D], T_A[Int, T_B]]) extends T_B

val v_a: T_A[CC_D, T_A[Int, T_B]] = null
val v_b: Int = v_a match{
  case CC_A(CC_A(CC_A(_, _), CC_A(_, _)), CC_A(_, _)) => 0 
  case CC_A(CC_A(CC_A(_, _), CC_A(_, _)), CC_B((_,_), _)) => 1 
  case CC_A(CC_A(CC_A(_, _), CC_A(_, _)), CC_C(CC_D(_, _, _), CC_A(_, _), _)) => 2 
  case CC_A(CC_A(CC_A(_, _), CC_B(_, _)), CC_A(_, _)) => 3 
  case CC_A(CC_A(CC_A(_, _), CC_B(_, _)), CC_B((_,_), _)) => 4 
  case CC_A(CC_A(CC_A(_, _), CC_B(_, _)), CC_C(CC_D(_, _, _), CC_A(_, _), _)) => 5 
  case CC_A(CC_A(CC_A(_, _), CC_C(_, _, _)), CC_A(_, _)) => 6 
  case CC_A(CC_A(CC_A(_, _), CC_C(_, _, _)), CC_B((_,_), _)) => 7 
  case CC_A(CC_A(CC_A(_, _), CC_C(_, _, _)), CC_C(CC_D(_, _, _), CC_A(_, _), _)) => 8 
  case CC_A(CC_A(CC_B(_, _), CC_A(_, _)), CC_A(_, _)) => 9 
  case CC_A(CC_A(CC_B(_, _), CC_A(_, _)), CC_B((_,_), _)) => 10 
  case CC_A(CC_A(CC_B(_, _), CC_A(_, _)), CC_C(CC_D(_, _, _), CC_A(_, _), _)) => 11 
  case CC_A(CC_A(CC_B(_, _), CC_B(_, _)), CC_A(_, _)) => 12 
  case CC_A(CC_A(CC_B(_, _), CC_B(_, _)), CC_B((_,_), _)) => 13 
  case CC_A(CC_A(CC_B(_, _), CC_B(_, _)), CC_C(CC_D(_, _, _), CC_A(_, _), _)) => 14 
  case CC_A(CC_A(CC_B(_, _), CC_C(_, _, _)), CC_A(_, _)) => 15 
  case CC_A(CC_A(CC_B(_, _), CC_C(_, _, _)), CC_B((_,_), _)) => 16 
  case CC_A(CC_A(CC_B(_, _), CC_C(_, _, _)), CC_C(CC_D(_, _, _), CC_A(_, _), _)) => 17 
  case CC_A(CC_A(CC_C(_, _, _), CC_A(_, _)), CC_A(_, _)) => 18 
  case CC_A(CC_A(CC_C(_, _, _), CC_A(_, _)), CC_B((_,_), _)) => 19 
  case CC_A(CC_A(CC_C(_, _, _), CC_A(_, _)), CC_C(CC_D(_, _, _), CC_A(_, _), _)) => 20 
  case CC_A(CC_A(CC_C(_, _, _), CC_B(_, _)), CC_A(_, _)) => 21 
  case CC_A(CC_A(CC_C(_, _, _), CC_B(_, _)), CC_B((_,_), _)) => 22 
  case CC_A(CC_A(CC_C(_, _, _), CC_B(_, _)), CC_C(CC_D(_, _, _), CC_A(_, _), _)) => 23 
  case CC_A(CC_A(CC_C(_, _, _), CC_C(_, _, _)), CC_A(_, _)) => 24 
  case CC_A(CC_A(CC_C(_, _, _), CC_C(_, _, _)), CC_B((_,_), _)) => 25 
  case CC_A(CC_A(CC_C(_, _, _), CC_C(_, _, _)), CC_C(CC_D(_, _, _), CC_A(_, _), _)) => 26 
  case CC_A(CC_B((_,_), _), CC_A(_, _)) => 27 
  case CC_A(CC_B((_,_), _), CC_B((_,_), _)) => 28 
  case CC_A(CC_B((_,_), _), CC_C(CC_D(_, _, _), CC_A(_, _), _)) => 29 
  case CC_A(CC_C(CC_D(_, _, _), CC_A(_, _), CC_A(_, _)), CC_A(_, _)) => 30 
  case CC_A(CC_C(CC_D(_, _, _), CC_A(_, _), CC_A(_, _)), CC_B((_,_), _)) => 31 
  case CC_A(CC_C(CC_D(_, _, _), CC_A(_, _), CC_A(_, _)), CC_C(CC_D(_, _, _), CC_A(_, _), _)) => 32 
  case CC_B((0,_), _) => 33 
  case CC_B((_,_), _) => 34 
  case CC_C(_, _, _) => 35 
}
}