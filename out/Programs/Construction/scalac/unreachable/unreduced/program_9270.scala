package Program_5 

object Test {
sealed trait T_A[A]
sealed trait T_B
case class CC_A[B](a: T_A[B], b: Byte, c: T_A[B]) extends T_A[T_B]
case class CC_B(a: T_B, b: T_A[T_B]) extends T_A[T_B]
case class CC_C(a: CC_A[CC_A[CC_B]]) extends T_A[T_B]
case class CC_D(a: T_A[CC_C], b: CC_A[CC_C], c: Byte) extends T_B

val v_a: T_A[T_B] = null
val v_b: Int = v_a match{
  case CC_A(_, _, _) => 0 
  case CC_B(CC_D(_, CC_A(_, _, _), 0), CC_A(_, 0, _)) => 1 
  case CC_B(CC_D(_, CC_A(_, _, _), 0), CC_A(_, _, _)) => 2 
  case CC_B(CC_D(_, CC_A(_, _, _), 0), CC_B(CC_D(_, _, _), CC_A(_, _, _))) => 3 
  case CC_B(CC_D(_, CC_A(_, _, _), 0), CC_B(CC_D(_, _, _), CC_B(_, _))) => 4 
  case CC_B(CC_D(_, CC_A(_, _, _), 0), CC_B(CC_D(_, _, _), CC_C(_))) => 5 
  case CC_B(CC_D(_, CC_A(_, _, _), 0), CC_C(CC_A(_, _, _))) => 6 
  case CC_B(CC_D(_, CC_A(_, _, _), _), CC_A(_, 0, _)) => 7 
  case CC_B(CC_D(_, CC_A(_, _, _), _), CC_A(_, _, _)) => 8 
  case CC_B(CC_D(_, CC_A(_, _, _), _), CC_B(CC_D(_, _, _), CC_A(_, _, _))) => 9 
  case CC_B(CC_D(_, CC_A(_, _, _), _), CC_B(CC_D(_, _, _), CC_B(_, _))) => 10 
  case CC_B(CC_D(_, CC_A(_, _, _), _), CC_B(CC_D(_, _, _), CC_C(_))) => 11 
  case CC_B(CC_D(_, CC_A(_, _, _), _), CC_C(CC_A(_, _, _))) => 12 
  case CC_C(_) => 13 
}
}