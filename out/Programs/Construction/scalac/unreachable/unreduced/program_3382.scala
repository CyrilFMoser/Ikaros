package Program_2 

object Test {
sealed trait T_A[A, B]
case class CC_A[C](a: T_A[T_A[C, C], C], b: T_A[C, C], c: Byte) extends T_A[C, Int]
case class CC_B[D](a: D, b: T_A[T_A[D, Int], Int]) extends T_A[D, Int]
case class CC_C[E]() extends T_A[E, Int]

val v_a: T_A[Boolean, Int] = null
val v_b: Int = v_a match{
  case CC_A(_, _, _) => 0 
  case CC_B(_, CC_A(_, _, _)) => 1 
  case CC_B(_, CC_B(CC_A(_, _, _), CC_A(_, _, _))) => 2 
  case CC_B(_, CC_B(CC_B(_, _), CC_A(_, _, _))) => 3 
  case CC_B(_, CC_B(CC_C(), CC_A(_, _, _))) => 4 
  case CC_B(_, CC_B(CC_A(_, _, _), CC_B(_, _))) => 5 
  case CC_B(_, CC_B(CC_B(_, _), CC_B(_, _))) => 6 
  case CC_B(_, CC_B(CC_C(), CC_B(_, _))) => 7 
  case CC_B(_, CC_B(CC_A(_, _, _), CC_C())) => 8 
  case CC_B(_, CC_B(CC_B(_, _), CC_C())) => 9 
  case CC_B(_, CC_B(CC_C(), CC_C())) => 10 
  case CC_B(_, CC_C()) => 11 
  case CC_C() => 12 
}
}