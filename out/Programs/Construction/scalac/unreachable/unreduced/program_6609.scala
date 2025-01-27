package Program_2 

object Test {
sealed trait T_A[A, B]
sealed trait T_B
case class CC_A[C, D](a: T_B, b: T_A[C, Int]) extends T_A[C, Int]
case class CC_B[E](a: T_A[E, T_A[E, Int]], b: CC_A[E, ((Char,Boolean),T_B)], c: CC_A[E, E]) extends T_A[E, Int]
case class CC_C(a: T_A[T_A[T_B, T_B], Int], b: T_A[CC_B[T_B], Int]) extends T_B
case class CC_D(a: T_A[CC_B[(Char,Byte)], Int], b: T_B) extends T_B

val v_a: T_B = null
val v_b: Int = v_a match{
  case CC_C(CC_A(CC_C(_, _), _), CC_A(_, CC_A(_, _))) => 0 
  case CC_C(CC_A(CC_D(_, _), _), CC_A(_, CC_A(_, _))) => 1 
  case CC_C(CC_B(_, CC_A(_, _), CC_A(_, _)), CC_A(_, CC_A(_, _))) => 2 
  case CC_C(CC_A(CC_C(_, _), _), CC_A(_, CC_B(_, _, _))) => 3 
  case CC_C(CC_A(CC_D(_, _), _), CC_A(_, CC_B(_, _, _))) => 4 
  case CC_C(CC_B(_, CC_A(_, _), CC_A(_, _)), CC_A(_, CC_B(_, _, _))) => 5 
  case CC_C(CC_A(CC_C(_, _), _), CC_B(_, _, _)) => 6 
  case CC_C(CC_A(CC_D(_, _), _), CC_B(_, _, _)) => 7 
  case CC_C(CC_B(_, CC_A(_, _), CC_A(_, _)), CC_B(_, _, _)) => 8 
  case CC_D(CC_A(_, _), CC_C(_, _)) => 9 
  case CC_D(CC_A(_, _), CC_D(_, _)) => 10 
  case CC_D(CC_B(_, _, _), CC_C(_, _)) => 11 
  case CC_D(CC_B(_, _, _), CC_D(_, _)) => 12 
}
}