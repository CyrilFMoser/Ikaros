package Program_15 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C]
case class CC_A[D, E](a: T_B[D], b: T_A[D, D]) extends T_A[E, D]
case class CC_C[G, H]() extends T_A[G, H]

val v_a: CC_A[Byte, Byte] = null
val v_b: Int = v_a match{
  case CC_A(_, CC_C()) => 0 
}
}
// This is not matched: (CC_A T_A)