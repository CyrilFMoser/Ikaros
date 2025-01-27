package Program_13 

object Test {
sealed trait T_A[A]
sealed trait T_B
case class CC_A(a: T_B, b: Byte) extends T_A[T_B]
case class CC_B(a: T_B, b: T_A[T_B], c: T_B) extends T_B
case class CC_C(a: T_A[CC_A]) extends T_B

val v_a: T_B = null
val v_b: Int = v_a match{
  case CC_B(CC_B(_, CC_A(_, _), CC_B(_, _, _)), _, CC_B(CC_B(_, _, _), CC_A(_, _), CC_B(_, _, _))) => 0 
  case CC_B(CC_B(_, CC_A(_, _), CC_B(_, _, _)), _, CC_B(CC_C(_), CC_A(_, _), CC_B(_, _, _))) => 1 
  case CC_B(CC_B(_, CC_A(_, _), CC_B(_, _, _)), _, CC_B(CC_B(_, _, _), CC_A(_, _), CC_C(_))) => 2 
  case CC_B(CC_B(_, CC_A(_, _), CC_B(_, _, _)), _, CC_B(CC_C(_), CC_A(_, _), CC_C(_))) => 3 
  case CC_B(CC_B(_, CC_A(_, _), CC_B(_, _, _)), _, CC_C(_)) => 4 
  case CC_B(CC_B(_, CC_A(_, _), CC_C(_)), _, CC_B(CC_B(_, _, _), CC_A(_, _), CC_B(_, _, _))) => 5 
  case CC_B(CC_B(_, CC_A(_, _), CC_C(_)), _, CC_B(CC_C(_), CC_A(_, _), CC_B(_, _, _))) => 6 
  case CC_B(CC_B(_, CC_A(_, _), CC_C(_)), _, CC_B(CC_B(_, _, _), CC_A(_, _), CC_C(_))) => 7 
  case CC_B(CC_B(_, CC_A(_, _), CC_C(_)), _, CC_B(CC_C(_), CC_A(_, _), CC_C(_))) => 8 
  case CC_B(CC_B(_, CC_A(_, _), CC_C(_)), _, CC_C(_)) => 9 
  case CC_B(CC_C(_), _, CC_B(CC_B(_, _, _), CC_A(_, _), CC_B(_, _, _))) => 10 
  case CC_B(CC_C(_), _, CC_B(CC_C(_), CC_A(_, _), CC_B(_, _, _))) => 11 
  case CC_B(CC_C(_), _, CC_B(CC_B(_, _, _), CC_A(_, _), CC_C(_))) => 12 
  case CC_B(CC_C(_), _, CC_B(CC_C(_), CC_A(_, _), CC_C(_))) => 13 
  case CC_B(CC_C(_), _, CC_C(_)) => 14 
  case CC_C(_) => 15 
}
}