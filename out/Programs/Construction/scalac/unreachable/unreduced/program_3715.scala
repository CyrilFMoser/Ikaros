package Program_5 

object Test {
sealed trait T_A[A, B]
case class CC_A[C](a: T_A[C, C]) extends T_A[C, T_A[T_A[Int, Byte], (Byte,Byte)]]
case class CC_B[D](a: T_A[D, T_A[D, D]], b: Char, c: T_A[D, T_A[D, D]]) extends T_A[D, T_A[T_A[Int, Byte], (Byte,Byte)]]
case class CC_C[E](a: CC_A[E]) extends T_A[T_A[(Int,Byte), Boolean], T_A[T_A[Int, Byte], (Byte,Byte)]]

val v_a: T_A[T_A[(Int,Byte), Boolean], T_A[T_A[Int, Byte], (Byte,Byte)]] = null
val v_b: Int = v_a match{
  case CC_A(_) => 0 
  case CC_B(_, _, _) => 1 
  case CC_C(_) => 2 
}
}