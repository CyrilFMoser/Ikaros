package Program_31 

object Test {
sealed trait T_A[A, B]
case class CC_A[C](a: Byte, b: T_A[C, C]) extends T_A[T_A[Byte, Byte], C]

val v_a: T_A[T_A[Byte, Byte], Boolean] = null
val v_b: Int = v_a match{
  case CC_A(0, _) => 0 
}
}
// This is not matched: Pattern match is empty without constants