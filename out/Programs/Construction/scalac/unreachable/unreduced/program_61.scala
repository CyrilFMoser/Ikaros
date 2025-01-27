package Program_8 

object Test {
sealed trait T_A[A, B]
case class CC_A[C](a: T_A[C, T_A[C, C]], b: (Byte,T_A[Int, Boolean]), c: T_A[C, C]) extends T_A[C, T_A[T_A[Boolean, Char], (Int,Byte)]]
case class CC_B[D](a: CC_A[D]) extends T_A[D, T_A[T_A[Boolean, Char], (Int,Byte)]]
case class CC_C[E]() extends T_A[E, T_A[T_A[Boolean, Char], (Int,Byte)]]

val v_a: T_A[Int, T_A[T_A[Boolean, Char], (Int,Byte)]] = null
val v_b: Int = v_a match{
  case CC_A(_, _, _) => 0 
  case CC_C() => 1 
}
}
// This is not matched: CC_B(_)