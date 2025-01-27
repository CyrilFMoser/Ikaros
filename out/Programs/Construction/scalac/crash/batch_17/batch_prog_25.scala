package Program_25 

object Test {
sealed trait T_A[A, B]
sealed trait T_B
case class CC_A[D, C]() extends T_A[C, D]
case class CC_B[E](a: T_B) extends T_A[T_A[E, E], E]
case class CC_C(a: T_A[CC_B[(Byte,Boolean)], (Boolean,T_B)], b: T_A[Byte, T_B]) extends T_B

val v_a: T_A[T_A[Byte, Byte], Byte] = null
val v_b: Int = v_a match{
  case CC_B(CC_C(CC_A(), _)) => 0 
}
}
// This is not matched: CC_A()