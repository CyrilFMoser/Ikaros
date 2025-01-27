package Program_17 

object Test {
sealed trait T_A[A, B]
case class CC_A[C](a: T_A[C, C], b: T_A[T_A[C, C], C]) extends T_A[T_A[C, C], C]
case class CC_B[D](a: D, b: T_A[T_A[D, D], D]) extends T_A[T_A[D, D], D]

val v_a: T_A[T_A[Byte, Byte], Byte] = null
val v_b: Int = v_a match{
  case CC_A(_, CC_A(_, _)) => 0 
  case CC_A(_, CC_B(_, _)) => 1 
  case CC_B(0, CC_A(_, CC_A(_, _))) => 2 
  case CC_B(0, CC_A(_, CC_B(_, _))) => 3 
  case CC_B(0, CC_B(_, _)) => 4 
  case CC_B(_, CC_A(_, CC_A(_, _))) => 5 
  case CC_B(_, CC_A(_, CC_B(_, _))) => 6 
  case CC_B(_, CC_B(_, _)) => 7 
}
}