package Program_25 

object Test {
sealed trait T_A[A, B]
case class CC_A[C](a: T_A[C, T_A[C, C]], b: T_A[C, T_A[C, C]]) extends T_A[C, T_A[C, C]]
case class CC_B[D](a: (T_A[Int, Boolean],CC_A[Byte]), b: T_A[D, T_A[D, D]]) extends T_A[D, T_A[D, D]]

val v_a: T_A[Char, T_A[Char, Char]] = null
val v_b: Int = v_a match{
  case CC_A(CC_A(_, _), CC_A(_, _)) => 0 
  case CC_A(CC_B((_,_), CC_A(_, _)), CC_A(_, _)) => 1 
  case CC_A(CC_B((_,_), CC_B(_, _)), CC_A(_, _)) => 2 
  case CC_A(CC_A(_, _), CC_B((_,_), CC_A(_, _))) => 3 
  case CC_A(CC_B((_,_), CC_A(_, _)), CC_B((_,_), CC_A(_, _))) => 4 
  case CC_A(CC_B((_,_), CC_B(_, _)), CC_B((_,_), CC_A(_, _))) => 5 
  case CC_A(CC_A(_, _), CC_B((_,_), CC_B(_, _))) => 6 
  case CC_A(CC_B((_,_), CC_A(_, _)), CC_B((_,_), CC_B(_, _))) => 7 
  case CC_A(CC_B((_,_), CC_B(_, _)), CC_B((_,_), CC_B(_, _))) => 8 
  case CC_B((_,CC_A(_, _)), CC_A(_, _)) => 9 
  case CC_B((_,CC_A(_, _)), CC_B((_,_), CC_A(_, _))) => 10 
  case CC_B((_,CC_A(_, _)), CC_B((_,_), CC_B(_, _))) => 11 
}
}