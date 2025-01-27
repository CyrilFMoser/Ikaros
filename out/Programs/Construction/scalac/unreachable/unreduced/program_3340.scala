package Program_1 

object Test {
sealed trait T_A
sealed trait T_B[A]
case class CC_A(a: T_A) extends T_A
case class CC_B(a: T_B[T_A], b: T_B[Byte], c: T_A) extends T_A
case class CC_C(a: T_A, b: T_B[T_B[CC_B]], c: Char) extends T_A
case class CC_D(a: CC_C) extends T_B[CC_B]
case class CC_E(a: T_B[CC_B]) extends T_B[CC_B]
case class CC_F(a: T_A) extends T_B[CC_B]

val v_a: T_A = null
val v_b: Int = v_a match{
  case CC_A(CC_A(CC_A(_))) => 0 
  case CC_A(CC_A(CC_B(_, _, _))) => 1 
  case CC_A(CC_A(CC_C(_, _, _))) => 2 
  case CC_A(CC_B(_, _, CC_A(_))) => 3 
  case CC_A(CC_B(_, _, CC_B(_, _, _))) => 4 
  case CC_A(CC_B(_, _, CC_C(_, _, _))) => 5 
  case CC_A(CC_C(CC_A(_), _, 'x')) => 6 
  case CC_A(CC_C(CC_B(_, _, _), _, 'x')) => 7 
  case CC_A(CC_C(CC_C(_, _, _), _, 'x')) => 8 
  case CC_A(CC_C(CC_A(_), _, _)) => 9 
  case CC_A(CC_C(CC_B(_, _, _), _, _)) => 10 
  case CC_A(CC_C(CC_C(_, _, _), _, _)) => 11 
  case CC_B(_, _, _) => 12 
  case CC_C(CC_A(_), _, _) => 13 
  case CC_C(CC_B(_, _, CC_A(_)), _, _) => 14 
  case CC_C(CC_B(_, _, CC_B(_, _, _)), _, _) => 15 
  case CC_C(CC_B(_, _, CC_C(_, _, _)), _, _) => 16 
  case CC_C(CC_C(_, _, _), _, _) => 17 
}
}