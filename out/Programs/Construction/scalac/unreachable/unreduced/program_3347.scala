package Program_10 

object Test {
sealed trait T_A[A, B]
case class CC_A[C](a: T_A[T_A[T_A[T_A[Int, Byte], T_A[Int, Byte]], T_A[T_A[Int, Byte], T_A[Int, Byte]]], T_A[T_A[Int, Byte], T_A[Int, Byte]]], b: T_A[T_A[C, C], C], c: T_A[T_A[C, C], T_A[C, C]]) extends T_A[T_A[C, C], C]
case class CC_B[E]() extends T_A[T_A[E, E], E]

val v_a: T_A[T_A[Byte, Byte], Byte] = null
val v_b: Int = v_a match{
  case CC_A(CC_A(CC_A(_, _, _), CC_A(_, _, _), _), CC_A(_, CC_A(_, _, _), _), _) => 0 
  case CC_A(CC_A(CC_B(), CC_A(_, _, _), _), CC_A(_, CC_A(_, _, _), _), _) => 1 
  case CC_A(CC_A(CC_A(_, _, _), CC_B(), _), CC_A(_, CC_A(_, _, _), _), _) => 2 
  case CC_A(CC_A(CC_B(), CC_B(), _), CC_A(_, CC_A(_, _, _), _), _) => 3 
  case CC_A(CC_B(), CC_A(_, CC_A(_, _, _), _), _) => 4 
  case CC_A(CC_A(CC_A(_, _, _), CC_A(_, _, _), _), CC_A(_, CC_B(), _), _) => 5 
  case CC_A(CC_A(CC_B(), CC_A(_, _, _), _), CC_A(_, CC_B(), _), _) => 6 
  case CC_A(CC_A(CC_A(_, _, _), CC_B(), _), CC_A(_, CC_B(), _), _) => 7 
  case CC_A(CC_A(CC_B(), CC_B(), _), CC_A(_, CC_B(), _), _) => 8 
  case CC_A(CC_B(), CC_A(_, CC_B(), _), _) => 9 
  case CC_A(CC_A(CC_A(_, _, _), CC_A(_, _, _), _), CC_B(), _) => 10 
  case CC_A(CC_A(CC_B(), CC_A(_, _, _), _), CC_B(), _) => 11 
  case CC_A(CC_A(CC_A(_, _, _), CC_B(), _), CC_B(), _) => 12 
  case CC_A(CC_A(CC_B(), CC_B(), _), CC_B(), _) => 13 
  case CC_A(CC_B(), CC_B(), _) => 14 
  case CC_B() => 15 
}
}