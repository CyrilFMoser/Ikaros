package Program_24 

object Test {
sealed trait T_A[A, B]
case class CC_A[C](a: T_A[T_A[C, C], C]) extends T_A[C, T_A[C, C]]
case class CC_B[D](a: T_A[D, T_A[D, D]]) extends T_A[D, T_A[D, D]]

val v_a: CC_B[Byte] = null
val v_b: Int = v_a match{
  case CC_B(CC_A(_)) => 0 
  case CC_B(CC_B(CC_A(_))) => 1 
  case CC_B(CC_B(CC_B(_))) => 2 
}
}