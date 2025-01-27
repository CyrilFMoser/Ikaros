package Program_14 

object Test {
sealed trait T_A[A, B]
sealed trait T_B
case class CC_A[D, E](a: T_B, b: T_A[D, D]) extends T_A[E, D]
case class CC_C[G, H]() extends T_A[G, H]

val v_a: CC_A[Byte, Byte] = null
val v_b: Int = v_a match{
  case CC_A(_, CC_A(_, _)) => 0 
}
}
// This is not matched: (CC_A T_A)