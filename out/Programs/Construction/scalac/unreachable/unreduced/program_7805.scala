package Program_11 

object Test {
sealed trait T_A[A]
case class CC_A(a: T_A[T_A[(Boolean,Boolean)]], b: T_A[T_A[Int]], c: T_A[T_A[Byte]]) extends T_A[T_A[((Int,Char),Int)]]
case class CC_B[B](a: Boolean, b: CC_A, c: T_A[B]) extends T_A[T_A[((Int,Char),Int)]]

val v_a: T_A[T_A[((Int,Char),Int)]] = null
val v_b: Int = v_a match{
  case CC_A(_, _, _) => 0 
  case CC_B(_, _, _) => 1 
}
}