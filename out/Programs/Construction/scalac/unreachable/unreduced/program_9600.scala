package Program_14 

object Test {
sealed trait T_A[A, B]
case class CC_A[C](a: C, b: T_A[Int, C]) extends T_A[Int, C]
case class CC_B[D](a: D, b: Byte, c: T_A[T_A[Int, D], D]) extends T_A[Int, D]

val v_a: T_A[Int, Byte] = null
val v_b: Int = v_a match{
  case CC_A(_, CC_A(_, _)) => 0 
  case CC_A(_, CC_B(0, _, _)) => 1 
  case CC_A(_, CC_B(_, _, _)) => 2 
  case CC_B(0, _, _) => 3 
  case CC_B(_, _, _) => 4 
}
}