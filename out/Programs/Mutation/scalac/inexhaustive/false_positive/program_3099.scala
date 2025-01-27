package Program_31 

package Program_21 

object Test {
sealed trait T_A
sealed trait T_B[A, B]
case class CC_A[C](a: C) extends T_A
case class CC_B[D]() extends T_B[CC_A[T_A], D]

val v_a: T_A = null
val v_b: Int = v_a match{
  case CC_A(_) => 0 
}
}
// This is not matched: (CC_A T_A Wildcard T_A)
// This is not matched: (CC_C Wildcard Wildcard Wildcard T_B)
// Mutation information: 
// Deleted Pattern CC_D(CC_A(), _, CC_B(_, _, _)) at position 3