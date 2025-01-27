package Program_16 

object Test {
sealed trait T_A[A, B]
case class CC_A[C](a: T_A[T_A[Byte, C], C], b: T_A[C, C]) extends T_A[Byte, C]
case class CC_B[D](a: T_A[Byte, D]) extends T_A[Byte, D]

val v_a: CC_B[Boolean] = null
val v_b: Int = v_a match{
  case CC_B(CC_A(_, _)) => 0 
  case CC_B(CC_B(_)) => 1 
}
}