package Program_3 

object Test {
sealed trait T_A[A, B]
case class CC_A[C](a: T_A[T_A[C, C], C]) extends T_A[C, T_A[T_A[C, C], C]]
case class CC_B[D]() extends T_A[D, T_A[T_A[D, D], D]]

val v_a: T_A[Byte, T_A[T_A[Byte, Byte], Byte]] = null
val v_b: Int = v_a match{
  case CC_A(_) => 0 
  case CC_B() => 1 
}
}