package Program_22 

object Test {
sealed trait T_A[A, B]
sealed trait T_B
case class CC_A[C](a: Int, b: C, c: Boolean) extends T_A[T_A[C, T_B], C]
case class CC_B[D](a: Int, b: T_A[T_B, D], c: T_A[T_A[D, T_B], D]) extends T_A[T_A[D, T_B], D]

val v_a: T_A[T_A[Boolean, T_B], Boolean] = null
val v_b: Int = v_a match{
  case CC_A(_, _, _) => 0 
  case CC_B(_, _, _) => 1 
}
}