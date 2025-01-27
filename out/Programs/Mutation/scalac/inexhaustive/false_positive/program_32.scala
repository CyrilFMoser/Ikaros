package Program_61 

object Test {
sealed trait T_A
sealed trait T_B[A, B]
case class CC_A(a: T_A) extends T_A
case class CC_B() extends T_A
case class CC_C[C](a: T_B[C, C], b: CC_A) extends T_B[Byte, C]

val v_a: T_B[Byte, Int] = null
val v_b: Int = v_a match{
  case CC_C(_, CC_A(CC_A(_))) => 0 
}
}
// This is not matched: (CC_A Wildcard T_A)
// Mutation information: 
// Deleted Pattern CC_B((CC_A(_),CC_A(CC_A(_)))) at position 6