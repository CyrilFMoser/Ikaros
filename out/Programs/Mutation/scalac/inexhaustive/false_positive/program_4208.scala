package Program_31 

package Program_22 

object Test {
sealed trait T_A[A]
case class CC_A[B, C](a: C) extends T_A[B]

val v_a: T_A[Boolean] = null
val v_b: Int = v_a match{
  case CC_A(_) => 0 
}
}
// This is not matched: (CC_A Boolean Boolean Wildcard (T_A Boolean))
// This is not matched: (CC_B (T_A Byte) (T_A (T_A Byte)))
// Mutation information: 
// Deleted Pattern CC_A(CC_A(_)) at position 0