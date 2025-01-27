package Program_6 

object Test {
sealed trait T_A[A, B]
case class CC_A[C](a: C, b: (Byte,T_A[(Boolean,Boolean), Int]), c: T_A[Int, C]) extends T_A[Int, C]
case class CC_B[D](a: T_A[Int, D]) extends T_A[D, T_A[T_A[Int, Byte], Int]]
case class CC_C() extends T_A[T_A[(Boolean,Int), T_A[Int, Int]], T_A[T_A[Int, Byte], Int]]

val v_a: T_A[T_A[(Boolean,Int), T_A[Int, Int]], T_A[T_A[Int, Byte], Int]] = null
val v_b: Int = v_a match{
  case CC_B(CC_A(_, _, _)) => 0 
  case CC_C() => 1 
}
}