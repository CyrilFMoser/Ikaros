package Program_10 

object Test {
sealed trait T_A[A, B]
sealed trait T_B
case class CC_A[C](a: C, b: T_B) extends T_A[C, T_A[C, C]]
case class CC_B() extends T_B
case class CC_C(a: CC_B, b: T_A[T_A[T_B, Byte], T_B], c: T_A[T_A[T_B, (Char,Char)], T_A[T_A[T_B, (Char,Char)], T_A[T_B, (Char,Char)]]]) extends T_B

val v_a: T_A[Int, T_A[Int, Int]] = null
val v_b: Int = v_a match{
  case CC_A(12, CC_B()) => 0 
  case CC_A(12, CC_C(_, _, _)) => 1 
  case CC_A(_, CC_B()) => 2 
  case CC_A(_, CC_C(_, _, _)) => 3 
}
}