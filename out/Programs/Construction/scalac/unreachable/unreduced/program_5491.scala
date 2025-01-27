package Program_9 

object Test {
sealed trait T_A[A, B]
case class CC_A[C](a: T_A[C, C], b: Byte, c: C) extends T_A[C, T_A[C, C]]
case class CC_B[D](a: CC_A[D], b: T_A[D, T_A[D, D]]) extends T_A[D, T_A[D, D]]
case class CC_C[E](a: E, b: (T_A[Byte, (Byte,Char)],CC_B[Int])) extends T_A[E, T_A[E, E]]

val v_a: T_A[Int, T_A[Int, Int]] = null
val v_b: Int = v_a match{
  case CC_A(_, 0, _) => 0 
  case CC_A(_, _, _) => 1 
  case CC_B(CC_A(_, _, _), CC_A(_, _, _)) => 2 
  case CC_B(CC_A(_, _, _), CC_B(CC_A(_, _, _), CC_A(_, _, _))) => 3 
  case CC_B(CC_A(_, _, _), CC_B(CC_A(_, _, _), CC_B(_, _))) => 4 
  case CC_B(CC_A(_, _, _), CC_B(CC_A(_, _, _), CC_C(_, _))) => 5 
  case CC_B(CC_A(_, _, _), CC_C(_, (_,_))) => 6 
  case CC_C(_, _) => 7 
}
}