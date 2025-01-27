package Program_62 

object Test {
sealed trait T_A[A, B]
case class CC_C(a: Char) extends T_A[T_A[Boolean, Int], T_A[(Byte,Char), Byte]]

val v_a: CC_C = null
val v_b: Int = v_a match{
  case CC_C('x') => 0 
}
}
// This is not matched: (CC_D (CC_D Wildcard T_B) T_B)
// Mutation information: 
// Deleted Pattern CC_E(_, 12) at position 1