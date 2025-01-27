package Program_0 

object Test {
sealed trait T_A[A, B]
case class CC_A[C](a: C, b: T_A[C, Byte], c: T_A[C, C]) extends T_A[C, Byte]
case class CC_B() extends T_A[Int, Byte]
case class CC_C[D](a: D, b: T_A[Int, Byte], c: T_A[D, Byte]) extends T_A[D, T_A[Int, Byte]]

val v_a: T_A[Int, Byte] = null
val v_b: Int = v_a match{
  case CC_A(_, CC_A(_, _, _), _) => 0 
  case CC_A(_, CC_B(), _) => 1 
  case CC_B() => 2 
}
}