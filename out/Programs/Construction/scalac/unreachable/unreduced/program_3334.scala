package Program_8 

object Test {
sealed trait T_A[A, B]
sealed trait T_B
case class CC_A[C](a: T_B) extends T_A[C, (T_A[T_B, (Char,Int)],Int)]
case class CC_B(a: CC_A[T_A[(Byte,Byte), Int]], b: T_B, c: T_B) extends T_A[T_A[CC_A[Int], Char], (T_A[T_B, (Char,Int)],Int)]
case class CC_C(a: T_B, b: T_A[(CC_B,CC_B), Boolean]) extends T_B
case class CC_D(a: CC_A[((Boolean,Char),T_B)], b: Char, c: T_A[CC_C, CC_C]) extends T_B
case class CC_E() extends T_B

val v_a: T_A[T_A[CC_A[Int], Char], (T_A[T_B, (Char,Int)],Int)] = null
val v_b: Int = v_a match{
  case CC_A(_) => 0 
  case CC_B(CC_A(_), CC_C(_, _), CC_C(CC_C(_, _), _)) => 1 
  case CC_B(CC_A(_), CC_D(CC_A(_), _, _), CC_C(CC_C(_, _), _)) => 2 
  case CC_B(CC_A(_), CC_E(), CC_C(CC_C(_, _), _)) => 3 
  case CC_B(CC_A(_), CC_C(_, _), CC_C(CC_D(_, _, _), _)) => 4 
  case CC_B(CC_A(_), CC_D(CC_A(_), _, _), CC_C(CC_D(_, _, _), _)) => 5 
  case CC_B(CC_A(_), CC_E(), CC_C(CC_D(_, _, _), _)) => 6 
  case CC_B(CC_A(_), CC_C(_, _), CC_C(CC_E(), _)) => 7 
  case CC_B(CC_A(_), CC_D(CC_A(_), _, _), CC_C(CC_E(), _)) => 8 
  case CC_B(CC_A(_), CC_E(), CC_C(CC_E(), _)) => 9 
  case CC_B(CC_A(_), CC_C(_, _), CC_D(_, 'x', _)) => 10 
  case CC_B(CC_A(_), CC_D(CC_A(_), _, _), CC_D(_, 'x', _)) => 11 
  case CC_B(CC_A(_), CC_E(), CC_D(_, 'x', _)) => 12 
  case CC_B(CC_A(_), CC_C(_, _), CC_D(_, _, _)) => 13 
  case CC_B(CC_A(_), CC_D(CC_A(_), _, _), CC_D(_, _, _)) => 14 
  case CC_B(CC_A(_), CC_E(), CC_D(_, _, _)) => 15 
  case CC_B(CC_A(_), CC_C(_, _), CC_E()) => 16 
  case CC_B(CC_A(_), CC_D(CC_A(_), _, _), CC_E()) => 17 
}
}
// This is not matched: CC_B(CC_A(_), CC_E(), CC_E())