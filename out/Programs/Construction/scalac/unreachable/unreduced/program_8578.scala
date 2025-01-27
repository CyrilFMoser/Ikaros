package Program_7 

object Test {
sealed trait T_A[A, B]
sealed trait T_B
case class CC_A(a: T_B, b: T_A[T_A[T_B, T_B], T_B], c: T_A[T_B, T_A[T_B, T_B]]) extends T_A[T_A[T_B, T_B], T_B]
case class CC_B[C](a: T_B, b: T_B) extends T_A[T_A[T_B, T_B], T_B]
case class CC_C(a: T_A[T_A[T_B, T_B], T_A[CC_A, T_B]], b: CC_A, c: Boolean) extends T_B
case class CC_D() extends T_B

val v_a: T_A[T_A[T_B, T_B], T_B] = null
val v_b: Int = v_a match{
  case CC_A(CC_C(_, _, _), CC_A(_, _, _), _) => 0 
  case CC_A(CC_C(_, _, _), CC_B(_, _), _) => 1 
  case CC_A(CC_D(), CC_A(_, _, _), _) => 2 
  case CC_A(CC_D(), CC_B(_, _), _) => 3 
  case CC_B(CC_C(_, CC_A(_, _, _), _), CC_C(_, CC_A(_, _, _), _)) => 4 
  case CC_B(CC_D(), CC_C(_, CC_A(_, _, _), _)) => 5 
  case CC_B(CC_C(_, CC_A(_, _, _), _), CC_D()) => 6 
  case CC_B(CC_D(), CC_D()) => 7 
}
}