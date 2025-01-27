package Program_30 

object Test {
sealed trait T_A[A, B]
case class CC_A[C](a: Char) extends T_A[C, T_A[C, C]]

val v_a: CC_A[Byte] = null
val v_b: Int = v_a match{
  case CC_A('x') => 0 
}
}
// This is not matched: (CC_D Byte Wildcard (CC_B Byte (T_A Byte)) (T_B (T_A Byte) Byte))
// Mutation information: 
// Deleted Pattern CC_F(CC_D(_, _), _, _) at position 7