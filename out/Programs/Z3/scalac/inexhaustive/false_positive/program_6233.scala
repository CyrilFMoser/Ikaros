package Program_11 

object Test {
sealed trait T_A[A, B]
case class CC_A[D, C](a: T_A[C, C]) extends T_A[D, C]
case class CC_B[E]() extends T_A[E, Byte]

val v_a: CC_A[Byte, Byte] = null
val v_b: Int = v_a match{
  case CC_A(CC_B()) => 0 
}
}
// This is not matched: Pattern match is empty without constants