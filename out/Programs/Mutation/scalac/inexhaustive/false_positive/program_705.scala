package Program_59 

object Test {
sealed trait T_A
sealed trait T_B[A, B]
case class CC_A(a: Byte, b: T_B[Boolean, Boolean]) extends T_A
case class CC_C() extends T_B[T_A, Byte]

val v_a: T_A = null
val v_b: Int = v_a match{
  case CC_A(0, _) => 0 
}
}
// This is not matched: (CC_B Wildcard Wildcard Wildcard T_A)
// Mutation information: 
// Deleted Pattern CC_A(_, (CC_B(_, _, _),CC_B(_, _, _))) at position 2