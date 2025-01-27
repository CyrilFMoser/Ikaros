package Program_29 

object Test {
sealed trait T_A[A]
case class CC_B(a: Int, b: T_A[Byte]) extends T_A[T_A[Byte]]

val v_a: T_A[T_A[Byte]] = null
val v_b: Int = v_a match{
  case CC_B(12, _) => 0 
}
}
// This is not matched: (CC_B Wildcard Wildcard Wildcard T_A)
// Mutation information: 
// Deleted Pattern CC_B(CC_A(_, _), _, 0) at position 3