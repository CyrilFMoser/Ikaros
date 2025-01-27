package Program_20 

object Test {
sealed trait T_A[A, B]
sealed trait T_B
case class CC_A[C]() extends T_A[T_A[T_B, T_A[T_B, T_B]], C]
case class CC_B(a: T_B, b: CC_A[T_B]) extends T_B
case class CC_C(a: T_B, b: CC_B, c: T_B) extends T_B
case class CC_D(a: CC_C, b: T_A[T_A[T_B, Byte], T_A[T_B, CC_B]], c: CC_B) extends T_B

val v_a: T_B = null
val v_b: Int = v_a match{
  case CC_B(CC_B(CC_B(_, _), CC_A()), _) => 0 
  case CC_B(CC_B(CC_C(_, _, _), CC_A()), _) => 1 
  case CC_B(CC_B(CC_D(_, _, _), CC_A()), _) => 2 
  case CC_B(CC_C(CC_B(_, _), CC_B(_, _), CC_B(_, _)), _) => 3 
  case CC_B(CC_C(CC_C(_, _, _), CC_B(_, _), CC_B(_, _)), _) => 4 
  case CC_B(CC_C(CC_D(_, _, _), CC_B(_, _), CC_B(_, _)), _) => 5 
  case CC_B(CC_C(CC_B(_, _), CC_B(_, _), CC_C(_, _, _)), _) => 6 
  case CC_B(CC_C(CC_C(_, _, _), CC_B(_, _), CC_C(_, _, _)), _) => 7 
  case CC_B(CC_C(CC_D(_, _, _), CC_B(_, _), CC_C(_, _, _)), _) => 8 
  case CC_B(CC_C(CC_B(_, _), CC_B(_, _), CC_D(_, _, _)), _) => 9 
  case CC_B(CC_C(CC_C(_, _, _), CC_B(_, _), CC_D(_, _, _)), _) => 10 
  case CC_B(CC_C(CC_D(_, _, _), CC_B(_, _), CC_D(_, _, _)), _) => 11 
  case CC_B(CC_D(_, _, _), _) => 12 
  case CC_C(_, _, _) => 13 
  case CC_D(CC_C(CC_B(_, _), CC_B(_, _), CC_B(_, _)), _, _) => 14 
  case CC_D(CC_C(CC_B(_, _), CC_B(_, _), CC_D(_, _, _)), _, _) => 15 
  case CC_D(CC_C(CC_C(_, _, _), CC_B(_, _), CC_B(_, _)), _, _) => 16 
  case CC_D(CC_C(CC_C(_, _, _), CC_B(_, _), CC_C(_, _, _)), _, _) => 17 
  case CC_D(CC_C(CC_C(_, _, _), CC_B(_, _), CC_D(_, _, _)), _, _) => 18 
  case CC_D(CC_C(CC_D(_, _, _), CC_B(_, _), CC_B(_, _)), _, _) => 19 
  case CC_D(CC_C(CC_D(_, _, _), CC_B(_, _), CC_C(_, _, _)), _, _) => 20 
  case CC_D(CC_C(CC_D(_, _, _), CC_B(_, _), CC_D(_, _, _)), _, _) => 21 
}
}
// This is not matched: CC_D(CC_C(CC_B(_, _), CC_B(_, _), CC_C(_, _, _)), _, _)