package Program_9 

object Test {
sealed trait T_A[A, B]
case class CC_A[C]() extends T_A[Byte, C]
case class CC_B[D](a: T_A[CC_A[D], D]) extends T_A[Byte, D]
case class CC_C[E](a: CC_A[E], b: CC_A[E]) extends T_A[Byte, E]

val v_a: T_A[Byte, Byte] = null
val v_b: Int = v_a match{
  case CC_A() => 0 
  case CC_B(_) => 1 
  case CC_C(_, CC_A()) => 2 
}
}