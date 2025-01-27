package Program_3 

object Test {
sealed trait T_A
sealed trait T_B[A, B]
case class CC_A(a: T_A) extends T_A
case class CC_B(a: CC_A, b: T_B[CC_A, (Boolean,(Int,Char))], c: CC_A) extends T_A
case class CC_C(a: CC_A, b: T_A, c: T_A) extends T_A
case class CC_D[C](a: T_B[C, C], b: T_B[C, C], c: T_B[C, C]) extends T_B[(T_A,Byte), C]
case class CC_E[D](a: CC_C) extends T_B[(T_A,Byte), D]

val v_a: T_A = null
val v_b: Int = v_a match{
  case CC_A(CC_A(CC_A(_))) => 0 
  case CC_A(CC_A(CC_B(_, _, _))) => 1 
  case CC_A(CC_A(CC_C(_, _, _))) => 2 
  case CC_A(CC_B(_, _, _)) => 3 
  case CC_A(CC_C(CC_A(_), _, _)) => 4 
  case CC_B(_, _, CC_A(CC_B(_, _, _))) => 5 
  case CC_B(_, _, CC_A(CC_C(_, _, _))) => 6 
  case CC_C(_, _, CC_A(CC_A(_))) => 7 
  case CC_C(_, _, CC_A(CC_B(_, _, _))) => 8 
  case CC_C(_, _, CC_A(CC_C(_, _, _))) => 9 
  case CC_C(_, _, CC_B(CC_A(_), _, CC_A(_))) => 10 
  case CC_C(_, _, CC_C(CC_A(_), CC_A(_), CC_A(_))) => 11 
  case CC_C(_, _, CC_C(CC_A(_), CC_B(_, _, _), CC_A(_))) => 12 
  case CC_C(_, _, CC_C(CC_A(_), CC_C(_, _, _), CC_A(_))) => 13 
  case CC_C(_, _, CC_C(CC_A(_), CC_A(_), CC_B(_, _, _))) => 14 
  case CC_C(_, _, CC_C(CC_A(_), CC_B(_, _, _), CC_B(_, _, _))) => 15 
  case CC_C(_, _, CC_C(CC_A(_), CC_C(_, _, _), CC_B(_, _, _))) => 16 
  case CC_C(_, _, CC_C(CC_A(_), CC_A(_), CC_C(_, _, _))) => 17 
  case CC_C(_, _, CC_C(CC_A(_), CC_B(_, _, _), CC_C(_, _, _))) => 18 
  case CC_C(_, _, CC_C(CC_A(_), CC_C(_, _, _), CC_C(_, _, _))) => 19 
}
}
// This is not matched: CC_B(_, _, CC_A(CC_A(_)))