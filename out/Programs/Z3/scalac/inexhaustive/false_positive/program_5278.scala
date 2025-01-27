package Program_12 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C, D]
case class CC_A[E, F]() extends T_A[E, F]
case class CC_B[G]() extends T_A[G, Byte]
case class CC_C[I, J](a: T_A[J, J]) extends T_B[I, J]

val v_a: CC_C[Int, Byte] = null
val v_b: Int = v_a match{
  case CC_C(CC_B()) => 0 
}
}
// This is not matched: (CC_C (T_A (CC_A T_B)))