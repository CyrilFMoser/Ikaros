package Program_18 

object Test {
sealed trait T_A[A, B]
case class CC_A[C](a: C, b: T_A[C, C]) extends T_A[C, T_A[Int, C]]
case class CC_B[D]() extends T_A[D, T_A[Int, D]]

val v_a: T_A[Byte, T_A[Int, Byte]] = null
val v_b: Int = v_a match{
  case CC_A(_, _) => 0 
  case CC_B() => 1 
}
}