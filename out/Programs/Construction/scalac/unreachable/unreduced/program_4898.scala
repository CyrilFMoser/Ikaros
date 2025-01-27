package Program_5 

object Test {
sealed trait T_A[A, B]
case class CC_A[C](a: T_A[T_A[Int, Int], Byte], b: T_A[C, Byte], c: T_A[C, C]) extends T_A[C, Byte]
case class CC_B[E]() extends T_A[E, Byte]
case class CC_C[F]() extends T_A[F, Byte]

val v_a: T_A[Int, Byte] = null
val v_b: Int = v_a match{
  case CC_A(CC_A(_, _, _), CC_A(_, CC_A(_, _, _), _), _) => 0 
  case CC_A(CC_A(_, _, _), CC_A(_, CC_B(), _), _) => 1 
  case CC_A(CC_A(_, _, _), CC_A(_, CC_C(), _), _) => 2 
  case CC_A(CC_A(_, _, _), CC_B(), _) => 3 
  case CC_A(CC_A(_, _, _), CC_C(), _) => 4 
  case CC_A(CC_B(), CC_A(_, CC_A(_, _, _), _), _) => 5 
  case CC_A(CC_B(), CC_A(_, CC_B(), _), _) => 6 
  case CC_A(CC_B(), CC_A(_, CC_C(), _), _) => 7 
  case CC_A(CC_B(), CC_B(), _) => 8 
  case CC_A(CC_B(), CC_C(), _) => 9 
  case CC_A(CC_C(), CC_A(_, CC_A(_, _, _), _), _) => 10 
  case CC_A(CC_C(), CC_A(_, CC_B(), _), _) => 11 
  case CC_A(CC_C(), CC_A(_, CC_C(), _), _) => 12 
  case CC_A(CC_C(), CC_B(), _) => 13 
  case CC_A(CC_C(), CC_C(), _) => 14 
  case CC_B() => 15 
  case CC_C() => 16 
}
}