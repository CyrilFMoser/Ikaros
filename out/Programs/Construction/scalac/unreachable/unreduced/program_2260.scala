package Program_12 

object Test {
sealed trait T_A
sealed trait T_B[A, B]
case class CC_A(a: T_B[T_A, Byte]) extends T_A
case class CC_B(a: T_A, b: T_A) extends T_A
case class CC_C(a: CC_B, b: CC_B) extends T_A
case class CC_D(a: CC_A, b: CC_B, c: Int) extends T_B[T_B[T_A, T_A], T_A]

val v_a: T_A = null
val v_b: Int = v_a match{
  case CC_A(_) => 0 
  case CC_B(_, _) => 1 
  case CC_C(CC_B(CC_A(_), _), CC_B(CC_A(_), CC_A(_))) => 2 
  case CC_C(CC_B(CC_B(_, _), _), CC_B(CC_A(_), CC_A(_))) => 3 
  case CC_C(CC_B(CC_C(_, _), _), CC_B(CC_A(_), CC_A(_))) => 4 
  case CC_C(CC_B(CC_A(_), _), CC_B(CC_B(_, _), CC_A(_))) => 5 
  case CC_C(CC_B(CC_B(_, _), _), CC_B(CC_B(_, _), CC_A(_))) => 6 
  case CC_C(CC_B(CC_A(_), _), CC_B(CC_C(_, _), CC_A(_))) => 7 
  case CC_C(CC_B(CC_B(_, _), _), CC_B(CC_C(_, _), CC_A(_))) => 8 
  case CC_C(CC_B(CC_C(_, _), _), CC_B(CC_C(_, _), CC_A(_))) => 9 
  case CC_C(CC_B(CC_A(_), _), CC_B(CC_A(_), CC_B(_, _))) => 10 
  case CC_C(CC_B(CC_B(_, _), _), CC_B(CC_A(_), CC_B(_, _))) => 11 
  case CC_C(CC_B(CC_C(_, _), _), CC_B(CC_A(_), CC_B(_, _))) => 12 
  case CC_C(CC_B(CC_A(_), _), CC_B(CC_B(_, _), CC_B(_, _))) => 13 
  case CC_C(CC_B(CC_B(_, _), _), CC_B(CC_B(_, _), CC_B(_, _))) => 14 
  case CC_C(CC_B(CC_C(_, _), _), CC_B(CC_B(_, _), CC_B(_, _))) => 15 
  case CC_C(CC_B(CC_A(_), _), CC_B(CC_C(_, _), CC_B(_, _))) => 16 
  case CC_C(CC_B(CC_B(_, _), _), CC_B(CC_C(_, _), CC_B(_, _))) => 17 
  case CC_C(CC_B(CC_C(_, _), _), CC_B(CC_C(_, _), CC_B(_, _))) => 18 
  case CC_C(CC_B(CC_A(_), _), CC_B(CC_A(_), CC_C(_, _))) => 19 
  case CC_C(CC_B(CC_B(_, _), _), CC_B(CC_A(_), CC_C(_, _))) => 20 
  case CC_C(CC_B(CC_C(_, _), _), CC_B(CC_A(_), CC_C(_, _))) => 21 
  case CC_C(CC_B(CC_A(_), _), CC_B(CC_B(_, _), CC_C(_, _))) => 22 
  case CC_C(CC_B(CC_B(_, _), _), CC_B(CC_B(_, _), CC_C(_, _))) => 23 
  case CC_C(CC_B(CC_C(_, _), _), CC_B(CC_B(_, _), CC_C(_, _))) => 24 
  case CC_C(CC_B(CC_A(_), _), CC_B(CC_C(_, _), CC_C(_, _))) => 25 
  case CC_C(CC_B(CC_B(_, _), _), CC_B(CC_C(_, _), CC_C(_, _))) => 26 
  case CC_C(CC_B(CC_C(_, _), _), CC_B(CC_C(_, _), CC_C(_, _))) => 27 
}
}
// This is not matched: CC_C(CC_B(CC_C(_, _), _), CC_B(CC_B(_, _), CC_A(_)))