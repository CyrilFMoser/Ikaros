package Program_16 

object Test {
sealed trait T_A[A, B]
case class CC_A[C](a: T_A[C, T_A[C, C]], b: T_A[C, T_A[C, C]], c: T_A[T_A[C, Byte], C]) extends T_A[C, T_A[C, C]]
case class CC_B[D](a: Int) extends T_A[D, T_A[D, D]]
case class CC_C(a: T_A[T_A[(Boolean,Boolean), Int], (Byte,Char)]) extends T_A[Int, T_A[Int, Int]]

val v_a: T_A[Int, T_A[Int, Int]] = null
val v_b: Int = v_a match{
  case CC_A(CC_A(_, _, _), CC_A(_, _, _), _) => 0 
  case CC_A(CC_B(12), CC_A(_, _, _), _) => 1 
  case CC_A(CC_B(_), CC_A(_, _, _), _) => 2 
  case CC_A(CC_C(_), CC_A(_, _, _), _) => 3 
  case CC_A(CC_A(_, _, _), CC_B(_), _) => 4 
  case CC_A(CC_B(12), CC_B(_), _) => 5 
  case CC_A(CC_B(_), CC_B(_), _) => 6 
  case CC_A(CC_C(_), CC_B(_), _) => 7 
  case CC_A(CC_A(_, _, _), CC_C(_), _) => 8 
  case CC_A(CC_B(12), CC_C(_), _) => 9 
  case CC_A(CC_B(_), CC_C(_), _) => 10 
  case CC_A(CC_C(_), CC_C(_), _) => 11 
  case CC_B(_) => 12 
  case CC_C(_) => 13 
}
}