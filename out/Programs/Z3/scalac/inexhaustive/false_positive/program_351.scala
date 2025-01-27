package Program_31 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C, D]
case class CC_A[E](a: Char, b: T_A[E, E]) extends T_A[T_B[Char, Byte], E]

val v_a: T_A[T_B[Char, Byte], Boolean] = null
val v_b: Int = v_a match{
  case CC_A('x', _) => 0 
}
}
// This is not matched: (CC_A Byte Byte (T_A Byte Byte))