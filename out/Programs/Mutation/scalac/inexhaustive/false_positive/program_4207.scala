package Program_12 

object Test {
sealed trait T_A[A]
case class CC_A[B]() extends T_A[B]
case class CC_B[C](a: T_A[C]) extends T_A[C]

val v_a: CC_B[Int] = null
val v_b: Int = v_a match{
  case CC_B(CC_A()) => 0 
}
}
// This is not matched: (CC_C (T_A (CC_A Byte Boolean)))
// Mutation information: 
// Deleted Pattern CC_B(CC_A(), _) at position 1