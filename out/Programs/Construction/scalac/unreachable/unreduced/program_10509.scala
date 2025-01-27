package Program_9 

object Test {
sealed trait T_A[A]
sealed trait T_B[B]
case class CC_A(a: Int, b: T_B[T_B[Boolean]], c: T_A[T_A[Byte]]) extends T_A[T_A[Byte]]
case class CC_B(a: T_B[T_B[CC_A]], b: CC_A) extends T_A[T_A[Byte]]
case class CC_C(a: Int, b: T_A[T_A[Byte]]) extends T_A[T_A[Byte]]
case class CC_D(a: CC_B, b: Int) extends T_B[CC_B]
case class CC_E[C](a: T_B[C]) extends T_B[CC_B]
case class CC_F(a: T_B[CC_B], b: CC_C, c: CC_A) extends T_B[CC_B]

val v_a: T_A[T_A[Byte]] = null
val v_b: Int = v_a match{
  case CC_A(_, _, CC_A(_, _, CC_A(_, _, _))) => 0 
  case CC_A(_, _, CC_A(_, _, CC_B(_, _))) => 1 
  case CC_A(_, _, CC_A(_, _, CC_C(_, _))) => 2 
  case CC_A(_, _, CC_B(_, _)) => 3 
  case CC_A(_, _, CC_C(_, _)) => 4 
  case CC_B(_, CC_A(_, _, _)) => 5 
  case CC_C(_, CC_A(_, _, CC_A(_, _, _))) => 6 
  case CC_C(_, CC_A(_, _, CC_B(_, _))) => 7 
  case CC_C(_, CC_A(_, _, CC_C(_, _))) => 8 
  case CC_C(_, CC_B(_, CC_A(_, _, _))) => 9 
  case CC_C(_, CC_C(_, _)) => 10 
}
}