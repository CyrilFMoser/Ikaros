package Program_15 

object Test {
sealed trait T_A[A, B]
sealed trait T_B
case class CC_B[D](a: D, b: T_A[D, D]) extends T_A[T_A[D, T_B], D]

val v_a: T_A[T_A[Byte, T_B], Byte] = null
val v_b: Int = v_a match{
  case CC_B(0, _) => 0 
}
}
// This is not matched: (CC_B Byte Byte Wildcard (T_A (T_A Byte T_B) Byte))