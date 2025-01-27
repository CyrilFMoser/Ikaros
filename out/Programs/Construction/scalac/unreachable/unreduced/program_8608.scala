package Program_3 

object Test {
sealed trait T_A
sealed trait T_B[A]
case class CC_A(a: T_A, b: T_A, c: T_A) extends T_A
case class CC_B(a: T_A, b: T_B[Byte], c: Char) extends T_A
case class CC_C(a: CC_B, b: CC_A) extends T_B[T_B[Char]]

val v_a: T_A = null
val v_b: Int = v_a match{
  case CC_A(CC_A(_, _, _), _, _) => 0 
  case CC_A(CC_B(_, _, _), _, _) => 1 
  case CC_B(CC_A(CC_A(_, _, _), CC_A(_, _, _), _), _, 'x') => 2 
  case CC_B(CC_A(CC_A(_, _, _), CC_A(_, _, _), _), _, _) => 3 
  case CC_B(CC_A(CC_A(_, _, _), CC_B(_, _, _), _), _, 'x') => 4 
  case CC_B(CC_A(CC_A(_, _, _), CC_B(_, _, _), _), _, _) => 5 
  case CC_B(CC_A(CC_B(_, _, _), CC_A(_, _, _), _), _, 'x') => 6 
  case CC_B(CC_A(CC_B(_, _, _), CC_A(_, _, _), _), _, _) => 7 
  case CC_B(CC_A(CC_B(_, _, _), CC_B(_, _, _), _), _, 'x') => 8 
  case CC_B(CC_A(CC_B(_, _, _), CC_B(_, _, _), _), _, _) => 9 
  case CC_B(CC_B(CC_A(_, _, _), _, _), _, 'x') => 10 
  case CC_B(CC_B(CC_A(_, _, _), _, _), _, _) => 11 
  case CC_B(CC_B(CC_B(_, _, _), _, _), _, 'x') => 12 
  case CC_B(CC_B(CC_B(_, _, _), _, _), _, _) => 13 
}
}