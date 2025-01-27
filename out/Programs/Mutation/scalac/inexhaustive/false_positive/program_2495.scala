package Program_31 

object Test {
sealed trait T_A
sealed trait T_B[A]
case class CC_A() extends T_A
case class CC_D[B](a: T_B[CC_A]) extends T_B[B]
case class CC_E[C]() extends T_B[C]

val v_a: CC_D[Byte] = null
val v_b: Int = v_a match{
  case CC_D(CC_E()) => 0 
}
}
// This is not matched: (CC_C Wildcard (T_A (T_A Int)))
// Mutation information: 
// Deleted Pattern CC_B(_, CC_A(), _) at position 2