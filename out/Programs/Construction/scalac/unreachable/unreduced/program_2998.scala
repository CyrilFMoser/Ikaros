package Program_15 

object Test {
sealed trait T_A[A, B]
sealed trait T_B
case class CC_A[C](a: T_B) extends T_A[T_B, C]
case class CC_B[D](a: D, b: T_B, c: CC_A[D]) extends T_A[T_B, D]
case class CC_C(a: T_A[T_B, T_A[(Byte,Boolean), T_B]], b: T_A[T_B, CC_B[T_B]]) extends T_B
case class CC_D(a: T_A[T_B, T_A[Boolean, CC_C]], b: Int, c: Int) extends T_B

val v_a: T_B = null
val v_b: Int = v_a match{
  case CC_C(CC_A(_), CC_A(CC_C(_, _))) => 0 
  case CC_C(CC_B(_, CC_C(_, _), CC_A(_)), CC_A(CC_C(_, _))) => 1 
  case CC_C(CC_B(_, CC_D(_, _, _), CC_A(_)), CC_A(CC_C(_, _))) => 2 
  case CC_C(CC_A(_), CC_A(CC_D(_, _, _))) => 3 
  case CC_C(CC_B(_, CC_C(_, _), CC_A(_)), CC_A(CC_D(_, _, _))) => 4 
  case CC_C(CC_A(_), CC_B(CC_B(_, _, _), CC_C(_, _), _)) => 5 
  case CC_C(CC_B(_, CC_C(_, _), CC_A(_)), CC_B(CC_B(_, _, _), CC_C(_, _), _)) => 6 
  case CC_C(CC_B(_, CC_D(_, _, _), CC_A(_)), CC_B(CC_B(_, _, _), CC_C(_, _), _)) => 7 
  case CC_C(CC_A(_), CC_B(CC_B(_, _, _), CC_D(_, _, _), _)) => 8 
  case CC_C(CC_B(_, CC_C(_, _), CC_A(_)), CC_B(CC_B(_, _, _), CC_D(_, _, _), _)) => 9 
  case CC_C(CC_B(_, CC_D(_, _, _), CC_A(_)), CC_B(CC_B(_, _, _), CC_D(_, _, _), _)) => 10 
  case CC_D(_, _, _) => 11 
}
}
// This is not matched: CC_C(CC_B(_, CC_D(_, _, _), CC_A(_)), CC_A(CC_D(_, _, _)))