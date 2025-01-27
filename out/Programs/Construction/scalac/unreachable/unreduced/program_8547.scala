package Program_30 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C]
case class CC_A[D](a: D, b: D, c: Int) extends T_A[T_B[D], D]
case class CC_B[E](a: T_B[E], b: T_A[T_B[T_A[Int, CC_A[(Byte,Char)]]], T_A[Int, CC_A[(Byte,Char)]]]) extends T_A[T_B[E], E]

val v_a: T_A[T_B[Byte], Byte] = null
val v_b: Int = v_a match{
  case CC_A(_, _, _) => 0 
  case CC_B(_, CC_A(_, _, _)) => 1 
  case CC_B(_, CC_B(_, CC_B(_, _))) => 2 
}
}
// This is not matched: CC_B(_, CC_B(_, CC_A(_, _, _)))