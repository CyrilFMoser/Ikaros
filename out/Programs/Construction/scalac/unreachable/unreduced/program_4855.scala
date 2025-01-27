package Program_25 

object Test {
sealed trait T_A[A, B]
sealed trait T_B
case class CC_A[C](a: Byte, b: T_B, c: C) extends T_A[C, T_B]
case class CC_B(a: Int, b: T_A[Boolean, T_B], c: T_B) extends T_A[T_A[T_A[T_B, T_B], T_B], T_B]
case class CC_C(a: T_A[Int, T_A[Boolean, T_B]], b: Boolean, c: T_A[CC_A[CC_B], Int]) extends T_B
case class CC_D(a: T_B, b: T_A[CC_B, T_B]) extends T_B

val v_a: T_A[T_A[T_A[T_B, T_B], T_B], T_B] = null
val v_b: Int = v_a match{
  case CC_A(_, _, _) => 0 
  case CC_B(_, CC_A(_, _, true), CC_C(_, _, _)) => 1 
  case CC_B(_, CC_A(_, _, true), CC_D(CC_C(_, _, _), CC_A(_, _, _))) => 2 
  case CC_B(_, CC_A(_, _, true), CC_D(CC_D(_, _), CC_A(_, _, _))) => 3 
  case CC_B(_, CC_A(_, _, false), CC_C(_, _, _)) => 4 
  case CC_B(_, CC_A(_, _, false), CC_D(CC_C(_, _, _), CC_A(_, _, _))) => 5 
  case CC_B(_, CC_A(_, _, false), CC_D(CC_D(_, _), CC_A(_, _, _))) => 6 
}
}