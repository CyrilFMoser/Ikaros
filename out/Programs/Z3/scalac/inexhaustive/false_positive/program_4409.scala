package Program_15 

object Test {
sealed trait T_A[A, B]
sealed trait T_B
case class CC_A[C]() extends T_A[C, T_B]
case class CC_B[D, E]() extends T_A[D, E]
case class CC_C(a: T_A[T_B, T_B], b: CC_A[(Byte,Int)]) extends T_B

val v_a: CC_C = null
val v_b: Int = v_a match{
  case CC_C(CC_A(), _) => 0 
}
}
// This is not matched: (CC_D Wildcard Int (CC_D Char Int Wildcard T_B) T_B)