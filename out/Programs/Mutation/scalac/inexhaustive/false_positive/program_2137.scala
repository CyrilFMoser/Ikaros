package Program_28 

object Test {
sealed trait T_A[A]
case class CC_A[B](a: T_A[B]) extends T_A[B]
case class CC_C[D]() extends T_A[D]

val v_a: CC_A[Byte] = null
val v_b: Int = v_a match{
  case CC_A(CC_C()) => 0 
}
}
// This is not matched: (CC_A T_A Wildcard T_A)
// Mutation information: 
// Deleted Pattern CC_A(CC_B()) at position 0