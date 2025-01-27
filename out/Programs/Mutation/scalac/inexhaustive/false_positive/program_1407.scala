package Program_63 

package Program_8 

object Test {
sealed trait T_A[A, B]
case class CC_A[C, D](a: ((Byte,Byte),Boolean), b: T_A[C, D]) extends T_A[T_A[Boolean, Boolean], C]
case class CC_B[E]() extends T_A[CC_A[Boolean, Char], E]

val v_a: T_A[T_A[Boolean, Boolean], Boolean] = null
val v_b: Int = v_a match{
  case CC_A(((_,_),_), _) => 0 
}
}
// This is not matched: (CC_A Boolean Boolean Wildcard Wildcard (T_A (T_A Boolean Boolean) Boolean))
// This is not matched: (CC_B T_A)
// Mutation information: 
// Deleted Pattern CC_A(CC_A(_, _, _), CC_A(_, _, _), CC_C(_, _, _)) at position 3