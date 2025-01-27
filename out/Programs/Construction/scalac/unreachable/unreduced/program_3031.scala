package Program_0 

object Test {
sealed trait T_A[A, B]
case class CC_A[C](a: T_A[C, C]) extends T_A[T_A[Byte, C], C]
case class CC_B[D](a: T_A[T_A[Byte, D], D]) extends T_A[T_A[Byte, D], D]

val v_a: T_A[T_A[Byte, Char], Char] = null
val v_b: Int = v_a match{
  case CC_B(CC_A(_)) => 0 
  case CC_B(CC_B(CC_A(_))) => 1 
  case CC_B(CC_B(CC_B(_))) => 2 
}
}
// This is not matched: CC_A(_)