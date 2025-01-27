package Program_27 

object Test {
sealed trait T_A[A, B]
case class CC_A[C](a: T_A[C, Int], b: T_A[C, Int], c: T_A[C, C]) extends T_A[C, Int]
case class CC_B[D, E](a: T_A[D, Int], b: T_A[E, Int], c: D) extends T_A[D, Int]

val v_a: T_A[Byte, Int] = null
val v_b: Int = v_a match{
  case CC_A(CC_A(_, CC_A(_, _, _), _), CC_A(CC_A(_, _, _), CC_A(_, _, _), _), _) => 0 
  case CC_A(CC_A(_, CC_B(_, _, _), _), CC_A(CC_A(_, _, _), CC_A(_, _, _), _), _) => 1 
  case CC_A(CC_B(_, _, _), CC_A(CC_A(_, _, _), CC_A(_, _, _), _), _) => 2 
  case CC_A(CC_A(_, CC_A(_, _, _), _), CC_A(CC_B(_, _, _), CC_A(_, _, _), _), _) => 3 
  case CC_A(CC_A(_, CC_B(_, _, _), _), CC_A(CC_B(_, _, _), CC_A(_, _, _), _), _) => 4 
  case CC_A(CC_B(_, _, _), CC_A(CC_B(_, _, _), CC_A(_, _, _), _), _) => 5 
  case CC_A(CC_A(_, CC_A(_, _, _), _), CC_A(CC_A(_, _, _), CC_B(_, _, _), _), _) => 6 
  case CC_A(CC_A(_, CC_B(_, _, _), _), CC_A(CC_A(_, _, _), CC_B(_, _, _), _), _) => 7 
  case CC_A(CC_B(_, _, _), CC_A(CC_A(_, _, _), CC_B(_, _, _), _), _) => 8 
  case CC_A(CC_A(_, CC_A(_, _, _), _), CC_A(CC_B(_, _, _), CC_B(_, _, _), _), _) => 9 
  case CC_A(CC_A(_, CC_B(_, _, _), _), CC_A(CC_B(_, _, _), CC_B(_, _, _), _), _) => 10 
  case CC_A(CC_B(_, _, _), CC_A(CC_B(_, _, _), CC_B(_, _, _), _), _) => 11 
  case CC_A(CC_A(_, CC_A(_, _, _), _), CC_B(_, _, 0), _) => 12 
  case CC_A(CC_A(_, CC_B(_, _, _), _), CC_B(_, _, 0), _) => 13 
  case CC_A(CC_B(_, _, _), CC_B(_, _, 0), _) => 14 
  case CC_A(CC_A(_, CC_A(_, _, _), _), CC_B(_, _, _), _) => 15 
  case CC_A(CC_A(_, CC_B(_, _, _), _), CC_B(_, _, _), _) => 16 
  case CC_A(CC_B(_, _, _), CC_B(_, _, _), _) => 17 
  case CC_B(_, _, _) => 18 
}
}