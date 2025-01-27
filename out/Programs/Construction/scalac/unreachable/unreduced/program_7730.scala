package Program_1 

object Test {
sealed trait T_A[A, B]
case class CC_A[C](a: T_A[C, Byte]) extends T_A[Char, C]
case class CC_B[D](a: T_A[Char, D]) extends T_A[Char, D]

val v_a: T_A[Char, Byte] = null
val v_b: Int = v_a match{
  case CC_B(CC_A(_)) => 0 
  case CC_B(CC_B(_)) => 1 
}
}
// This is not matched: CC_A(_)