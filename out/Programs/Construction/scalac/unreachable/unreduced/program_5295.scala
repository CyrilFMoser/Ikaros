package Program_18 

object Test {
sealed trait T_A[A, B]
sealed trait T_B
case class CC_A[C](a: C, b: (T_A[T_B, Int],Int)) extends T_A[C, T_A[C, C]]
case class CC_B[D](a: T_A[D, T_A[D, D]], b: T_A[D, T_A[D, D]]) extends T_A[D, T_A[D, D]]
case class CC_C[E](a: Char) extends T_A[E, T_A[E, E]]
case class CC_D(a: CC_B[T_A[T_B, T_B]], b: T_A[(T_B,T_B), T_A[(T_B,T_B), (T_B,T_B)]], c: Int) extends T_B

val v_a: T_A[Int, T_A[Int, Int]] = null
val v_b: Int = v_a match{
  case CC_A(_, (_,_)) => 0 
  case CC_B(CC_A(_, (_,_)), CC_A(_, _)) => 1 
  case CC_B(CC_B(_, CC_A(_, _)), CC_A(_, _)) => 2 
  case CC_B(CC_B(_, CC_B(_, _)), CC_A(_, _)) => 3 
  case CC_B(CC_B(_, CC_C(_)), CC_A(_, _)) => 4 
  case CC_B(CC_C(_), CC_A(_, _)) => 5 
  case CC_B(CC_A(_, (_,_)), CC_B(_, _)) => 6 
  case CC_B(CC_B(_, CC_A(_, _)), CC_B(_, _)) => 7 
  case CC_B(CC_B(_, CC_B(_, _)), CC_B(_, _)) => 8 
  case CC_B(CC_B(_, CC_C(_)), CC_B(_, _)) => 9 
  case CC_B(CC_C(_), CC_B(_, _)) => 10 
  case CC_B(CC_A(_, (_,_)), CC_C('x')) => 11 
  case CC_B(CC_B(_, CC_A(_, _)), CC_C('x')) => 12 
  case CC_B(CC_B(_, CC_B(_, _)), CC_C('x')) => 13 
  case CC_B(CC_B(_, CC_C(_)), CC_C('x')) => 14 
  case CC_B(CC_C(_), CC_C('x')) => 15 
  case CC_B(CC_A(_, (_,_)), CC_C(_)) => 16 
  case CC_B(CC_B(_, CC_A(_, _)), CC_C(_)) => 17 
  case CC_B(CC_B(_, CC_B(_, _)), CC_C(_)) => 18 
  case CC_B(CC_B(_, CC_C(_)), CC_C(_)) => 19 
  case CC_B(CC_C(_), CC_C(_)) => 20 
  case CC_C(_) => 21 
}
}