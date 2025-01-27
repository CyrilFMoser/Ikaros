package Program_14 

object Test {
sealed trait T_A[A]
case class CC_A[D]() extends T_A[D]
case class CC_C[E](a: E, b: Byte, c: T_A[E]) extends T_A[E]

val v_a: CC_C[Byte] = null
val v_b: Int = v_a match{
  case CC_C(_, _, CC_A()) => 0 
}
}
// This is not matched: (CC_D Boolean Wildcard Boolean T_B)