package Program_3 

object Test {
sealed trait T_A[A, B]
case class CC_A[C](a: T_A[C, Char], b: T_A[C, Char], c: T_A[C, C]) extends T_A[C, Char]
case class CC_B[D](a: D) extends T_A[D, Char]

val v_a: T_A[Boolean, Char] = null
val v_b: Int = v_a match{
  case CC_A(CC_A(CC_A(_, _, _), CC_A(_, _, _), _), CC_A(_, CC_A(_, _, _), _), _) => 0 
  case CC_A(CC_A(CC_A(_, _, _), CC_B(_), _), CC_A(_, CC_A(_, _, _), _), _) => 1 
  case CC_A(CC_A(CC_B(_), CC_A(_, _, _), _), CC_A(_, CC_A(_, _, _), _), _) => 2 
  case CC_A(CC_A(CC_B(_), CC_B(_), _), CC_A(_, CC_A(_, _, _), _), _) => 3 
  case CC_A(CC_B(true), CC_A(_, CC_A(_, _, _), _), _) => 4 
  case CC_A(CC_B(false), CC_A(_, CC_A(_, _, _), _), _) => 5 
  case CC_A(CC_A(CC_A(_, _, _), CC_A(_, _, _), _), CC_A(_, CC_B(_), _), _) => 6 
  case CC_A(CC_A(CC_A(_, _, _), CC_B(_), _), CC_A(_, CC_B(_), _), _) => 7 
  case CC_A(CC_A(CC_B(_), CC_A(_, _, _), _), CC_A(_, CC_B(_), _), _) => 8 
  case CC_A(CC_A(CC_B(_), CC_B(_), _), CC_A(_, CC_B(_), _), _) => 9 
  case CC_A(CC_B(true), CC_A(_, CC_B(_), _), _) => 10 
  case CC_A(CC_B(false), CC_A(_, CC_B(_), _), _) => 11 
  case CC_A(CC_A(CC_A(_, _, _), CC_A(_, _, _), _), CC_B(_), _) => 12 
  case CC_A(CC_A(CC_A(_, _, _), CC_B(_), _), CC_B(_), _) => 13 
  case CC_A(CC_A(CC_B(_), CC_A(_, _, _), _), CC_B(_), _) => 14 
  case CC_A(CC_A(CC_B(_), CC_B(_), _), CC_B(_), _) => 15 
  case CC_A(CC_B(true), CC_B(_), _) => 16 
  case CC_A(CC_B(false), CC_B(_), _) => 17 
  case CC_B(_) => 18 
}
}