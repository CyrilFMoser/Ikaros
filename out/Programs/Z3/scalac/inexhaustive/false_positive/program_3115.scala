package Program_15 

object Test {
sealed trait T_A[A, B]
case class CC_A[C, D]() extends T_A[C, D]
case class CC_B(a: Boolean, b: T_A[Byte, (Int,Byte)]) extends T_A[T_A[Byte, Byte], CC_A[Char, Char]]
case class CC_C[F, E]() extends T_A[E, F]

val v_a: CC_B = null
val v_b: Int = v_a match{
  case CC_B(_, CC_C()) => 0 
}
}
// This is not matched: (CC_B T_A)