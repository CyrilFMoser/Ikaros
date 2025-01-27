package Program_6 

object Test {
sealed trait T_A[A, B]
case class CC_A[C](a: (T_A[Int, Int],T_A[Byte, Int]), b: Boolean, c: T_A[C, C]) extends T_A[Byte, C]
case class CC_B[D](a: T_A[Byte, D], b: T_A[Byte, D]) extends T_A[Byte, D]

val v_a: T_A[Byte, Byte] = null
val v_b: Int = v_a match{
  case CC_A((_,CC_A(_, _, _)), _, _) => 0 
  case CC_A((_,CC_B(_, _)), _, _) => 1 
  case CC_B(CC_A(_, true, CC_A(_, _, _)), CC_A((_,_), _, CC_A(_, _, _))) => 2 
  case CC_B(CC_A(_, false, CC_A(_, _, _)), CC_A((_,_), _, CC_A(_, _, _))) => 3 
  case CC_B(CC_A(_, true, CC_B(_, _)), CC_A((_,_), _, CC_A(_, _, _))) => 4 
  case CC_B(CC_A(_, false, CC_B(_, _)), CC_A((_,_), _, CC_A(_, _, _))) => 5 
  case CC_B(CC_B(_, _), CC_A((_,_), _, CC_A(_, _, _))) => 6 
  case CC_B(CC_A(_, true, CC_A(_, _, _)), CC_A((_,_), _, CC_B(_, _))) => 7 
  case CC_B(CC_A(_, false, CC_A(_, _, _)), CC_A((_,_), _, CC_B(_, _))) => 8 
  case CC_B(CC_A(_, true, CC_B(_, _)), CC_A((_,_), _, CC_B(_, _))) => 9 
  case CC_B(CC_A(_, false, CC_B(_, _)), CC_A((_,_), _, CC_B(_, _))) => 10 
  case CC_B(CC_B(_, _), CC_A((_,_), _, CC_B(_, _))) => 11 
  case CC_B(CC_A(_, true, CC_A(_, _, _)), CC_B(_, _)) => 12 
  case CC_B(CC_A(_, false, CC_A(_, _, _)), CC_B(_, _)) => 13 
  case CC_B(CC_A(_, true, CC_B(_, _)), CC_B(_, _)) => 14 
  case CC_B(CC_A(_, false, CC_B(_, _)), CC_B(_, _)) => 15 
  case CC_B(CC_B(_, _), CC_B(_, _)) => 16 
}
}