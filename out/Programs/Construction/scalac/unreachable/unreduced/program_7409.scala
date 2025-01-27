package Program_29 

object Test {
sealed trait T_A[A, B]
sealed trait T_B
case class CC_A(a: T_A[(T_B,T_B), T_B], b: T_A[T_B, T_A[T_B, T_B]]) extends T_A[T_A[T_A[T_B, T_B], T_A[Byte, Byte]], Int]
case class CC_B() extends T_B
case class CC_C(a: T_B, b: CC_A) extends T_B
case class CC_D(a: CC_C) extends T_B

val v_a: T_B = null
val v_b: Int = v_a match{
  case CC_B() => 0 
  case CC_C(CC_B(), CC_A(_, _)) => 1 
  case CC_C(CC_C(CC_B(), _), CC_A(_, _)) => 2 
  case CC_C(CC_C(CC_C(_, _), _), CC_A(_, _)) => 3 
  case CC_C(CC_C(CC_D(_), _), CC_A(_, _)) => 4 
  case CC_C(CC_D(_), CC_A(_, _)) => 5 
  case CC_D(CC_C(CC_B(), _)) => 6 
  case CC_D(CC_C(CC_C(_, _), _)) => 7 
  case CC_D(CC_C(CC_D(_), _)) => 8 
}
}