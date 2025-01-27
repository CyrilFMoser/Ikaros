package Program_14 

object Test {
sealed trait T_A[A]
sealed trait T_B
case class CC_A(a: T_A[T_A[T_B]], b: T_B, c: T_A[T_B]) extends T_A[T_A[T_B]]
case class CC_B(a: T_A[T_A[T_B]], b: T_A[T_A[T_B]]) extends T_A[T_A[T_B]]
case class CC_C() extends T_B

val v_a: T_A[T_A[T_B]] = null
val v_b: Int = v_a match{
  case CC_A(CC_A(CC_A(_, _, _), _, _), CC_C(), _) => 0 
  case CC_A(CC_A(CC_B(_, _), _, _), CC_C(), _) => 1 
  case CC_A(CC_B(CC_A(_, _, _), CC_A(_, _, _)), CC_C(), _) => 2 
  case CC_A(CC_B(CC_A(_, _, _), CC_B(_, _)), CC_C(), _) => 3 
  case CC_A(CC_B(CC_B(_, _), CC_A(_, _, _)), CC_C(), _) => 4 
  case CC_A(CC_B(CC_B(_, _), CC_B(_, _)), CC_C(), _) => 5 
  case CC_B(CC_A(_, CC_C(), _), CC_A(CC_A(_, _, _), CC_C(), _)) => 6 
  case CC_B(CC_B(_, CC_A(_, _, _)), CC_A(CC_A(_, _, _), CC_C(), _)) => 7 
  case CC_B(CC_B(_, CC_B(_, _)), CC_A(CC_A(_, _, _), CC_C(), _)) => 8 
  case CC_B(CC_A(_, CC_C(), _), CC_A(CC_B(_, _), CC_C(), _)) => 9 
  case CC_B(CC_B(_, CC_A(_, _, _)), CC_A(CC_B(_, _), CC_C(), _)) => 10 
  case CC_B(CC_B(_, CC_B(_, _)), CC_A(CC_B(_, _), CC_C(), _)) => 11 
  case CC_B(CC_A(_, CC_C(), _), CC_B(_, CC_A(_, _, _))) => 12 
  case CC_B(CC_B(_, CC_A(_, _, _)), CC_B(_, CC_A(_, _, _))) => 13 
  case CC_B(CC_B(_, CC_B(_, _)), CC_B(_, CC_A(_, _, _))) => 14 
  case CC_B(CC_A(_, CC_C(), _), CC_B(_, CC_B(_, _))) => 15 
  case CC_B(CC_B(_, CC_A(_, _, _)), CC_B(_, CC_B(_, _))) => 16 
  case CC_B(CC_B(_, CC_B(_, _)), CC_B(_, CC_B(_, _))) => 17 
}
}