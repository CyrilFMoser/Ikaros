package Program_18 

object Test {
sealed trait T_A[A, B]
case class CC_A[C](a: Byte, b: T_A[C, C], c: T_A[C, C]) extends T_A[C, T_A[T_A[Int, Byte], Int]]
case class CC_B[D](a: Byte) extends T_A[D, T_A[T_A[Int, Byte], Int]]
case class CC_C() extends T_A[CC_A[T_A[Boolean, Byte]], CC_B[T_A[Int, Byte]]]

val v_a: T_A[CC_C, T_A[T_A[Int, Byte], Int]] = null
val v_b: Int = v_a match{
  case CC_A(_, _, _) => 0 
  case CC_B(_) => 1 
}
}