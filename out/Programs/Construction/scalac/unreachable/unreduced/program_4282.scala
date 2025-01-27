package Program_7 

object Test {
sealed trait T_A[A, B]
case class CC_A[C](a: T_A[C, C]) extends T_A[T_A[T_A[Int, Boolean], Byte], C]
case class CC_B[D](a: Byte) extends T_A[T_A[T_A[Int, Boolean], Byte], D]

val v_a: T_A[T_A[T_A[Int, Boolean], Byte], Char] = null
val v_b: Int = v_a match{
  case CC_A(_) => 0 
  case CC_B(0) => 1 
  case CC_B(_) => 2 
}
}