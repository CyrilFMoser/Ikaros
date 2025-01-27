package Program_9 

object Test {
sealed trait T_A[A, B]
sealed trait T_B
case class CC_A[C](a: T_B, b: Char, c: T_A[C, Char]) extends T_A[C, Char]
case class CC_B(a: Int, b: T_A[Byte, CC_A[(Char,Char)]]) extends T_B
case class CC_C(a: (T_B,Int), b: CC_A[CC_A[CC_B]]) extends T_B

val v_a: CC_A[Int] = null
val v_b: Int = v_a match{
  case CC_A(CC_B(12, _), _, CC_A(CC_B(_, _), _, _)) => 0 
  case CC_A(CC_B(_, _), _, CC_A(CC_B(_, _), _, _)) => 1 
  case CC_A(CC_C((_,_), CC_A(_, _, _)), _, CC_A(CC_B(_, _), _, _)) => 2 
  case CC_A(CC_B(12, _), _, CC_A(CC_C(_, _), _, _)) => 3 
  case CC_A(CC_B(_, _), _, CC_A(CC_C(_, _), _, _)) => 4 
  case CC_A(CC_C((_,_), CC_A(_, _, _)), _, CC_A(CC_C(_, _), _, _)) => 5 
}
}