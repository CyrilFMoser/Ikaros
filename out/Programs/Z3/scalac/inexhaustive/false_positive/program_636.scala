package Program_31 

object Test {
sealed trait T_A[A, B]
sealed trait T_B
case class CC_A[C]() extends T_A[Byte, C]
case class CC_B[D]() extends T_A[Byte, D]
case class CC_C(a: T_A[T_B, T_B], b: T_A[Byte, Byte]) extends T_B

val v_a: CC_C = null
val v_b: Int = v_a match{
  case CC_C(_, CC_B()) => 0 
}
}
// This is not matched: Pattern match is empty without constants