package Program_23 

object Test {
sealed trait T_A[A, B]
sealed trait T_B
case class CC_A[D, C]() extends T_A[D, C]
case class CC_B[E](a: E, b: T_A[E, E]) extends T_A[E, T_A[Byte, T_B]]

val v_a: CC_B[Byte] = null
val v_b: Int = v_a match{
  case CC_B(0, CC_A()) => 0 
  case CC_B(_, CC_A()) => 1 
}
}