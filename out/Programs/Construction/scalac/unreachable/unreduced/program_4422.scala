package Program_6 

object Test {
sealed trait T_A[A, B]
case class CC_A[C](a: T_A[C, C]) extends T_A[C, T_A[T_A[Int, Byte], Int]]
case class CC_B[D](a: D) extends T_A[D, T_A[T_A[Int, Byte], Int]]

val v_a: T_A[Boolean, T_A[T_A[Int, Byte], Int]] = null
val v_b: Int = v_a match{
  case CC_A(_) => 0 
  case CC_B(true) => 1 
  case CC_B(false) => 2 
}
}