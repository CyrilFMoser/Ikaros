package Program_17 

object Test {
sealed trait T_A[A]
case class CC_A[B](a: T_A[B], b: (T_A[Boolean],T_A[Byte])) extends T_A[B]
case class CC_B[C](a: (T_A[Boolean],T_A[Int]), b: T_A[(Char,Byte)], c: CC_A[C]) extends T_A[C]

val v_a: CC_A[Char] = null
val v_b: Int = v_a match{
  case CC_A(CC_A(_, _), (CC_A(_, _),CC_A(_, _))) => 0 
  case CC_A(CC_B((_,_), CC_A(_, _), CC_A(_, _)), (CC_A(_, _),CC_A(_, _))) => 1 
  case CC_A(CC_B((_,_), CC_B(_, _, _), CC_A(_, _)), (CC_A(_, _),CC_A(_, _))) => 2 
  case CC_A(CC_A(_, _), (CC_A(_, _),CC_B(_, _, _))) => 3 
  case CC_A(CC_B((_,_), CC_A(_, _), CC_A(_, _)), (CC_A(_, _),CC_B(_, _, _))) => 4 
  case CC_A(CC_A(_, _), (CC_B(_, _, _),CC_A(_, _))) => 5 
  case CC_A(CC_B((_,_), CC_A(_, _), CC_A(_, _)), (CC_B(_, _, _),CC_A(_, _))) => 6 
  case CC_A(CC_B((_,_), CC_B(_, _, _), CC_A(_, _)), (CC_B(_, _, _),CC_A(_, _))) => 7 
  case CC_A(CC_A(_, _), (CC_B(_, _, _),CC_B(_, _, _))) => 8 
  case CC_A(CC_B((_,_), CC_A(_, _), CC_A(_, _)), (CC_B(_, _, _),CC_B(_, _, _))) => 9 
  case CC_A(CC_B((_,_), CC_B(_, _, _), CC_A(_, _)), (CC_B(_, _, _),CC_B(_, _, _))) => 10 
}
}
// This is not matched: CC_A(CC_B((_,_), CC_B(_, _, _), CC_A(_, _)), (CC_A(_, _),CC_B(_, _, _)))