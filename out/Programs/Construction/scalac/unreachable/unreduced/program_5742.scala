package Program_2 

object Test {
sealed trait T_A[A, B]
sealed trait T_B
case class CC_A[C](a: C, b: T_A[C, C], c: T_A[C, T_B]) extends T_A[C, T_B]
case class CC_B[D](a: (T_A[Char, Int],(T_B,Byte)), b: T_A[D, D], c: T_A[D, T_B]) extends T_A[D, T_B]
case class CC_C[E, F](a: T_B, b: F, c: F) extends T_A[E, T_B]

val v_a: T_A[Int, T_B] = null
val v_b: Int = v_a match{
  case CC_A(12, _, CC_A(_, _, _)) => 0 
  case CC_A(_, _, CC_A(_, _, _)) => 1 
  case CC_A(12, _, CC_B((_,_), _, _)) => 2 
  case CC_A(_, _, CC_B((_,_), _, _)) => 3 
  case CC_A(12, _, CC_C(_, _, _)) => 4 
  case CC_A(_, _, CC_C(_, _, _)) => 5 
  case CC_B((_,(_,_)), _, _) => 6 
  case CC_C(_, _, _) => 7 
}
}