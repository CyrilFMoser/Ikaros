package Program_31 

object Test {
sealed trait T_A[A, B]
case class CC_A[C](a: T_A[C, C], b: T_A[Byte, T_A[T_A[Byte, Byte], T_A[Byte, Byte]]], c: T_A[Byte, C]) extends T_A[Byte, C]
case class CC_B[E]() extends T_A[Byte, E]

val v_a: T_A[Byte, Boolean] = null
val v_b: Int = v_a match{
  case CC_A(_, CC_A(_, _, _), CC_A(_, _, _)) => 0 
  case CC_A(_, CC_A(_, _, _), CC_B()) => 1 
  case CC_A(_, CC_B(), CC_A(_, _, _)) => 2 
  case CC_A(_, CC_B(), CC_B()) => 3 
  case CC_B() => 4 
}
}