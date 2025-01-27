package Program_15 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C, D]
case class CC_A() extends T_A[(Boolean,Boolean), T_B[Byte, Int]]
case class CC_B() extends T_A[(Boolean,Boolean), T_B[Byte, Int]]
case class CC_C[E](a: E, b: T_B[CC_A, E]) extends T_B[E, CC_B]

val v_a: T_B[Byte, CC_B] = null
val v_b: Int = v_a match{
  case CC_C(0, _) => 0 
}
}
// This is not matched: (CC_A Wildcard T_A)