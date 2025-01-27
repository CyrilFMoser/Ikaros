package Program_51 

package Program_14 

object Test {
sealed trait T_A[A, B]
case class CC_A[C, D]() extends T_A[T_A[C, C], C]
case class CC_B[E](a: E, b: CC_A[E, E]) extends T_A[T_A[E, E], E]

val v_a: T_A[T_A[Boolean, Boolean], Boolean] = null
val v_b: Int = v_a match{
  case CC_A() => 0 
  case CC_B(_, CC_A()) => 1 
}
}
// This is not matched: (CC_A Boolean Boolean (T_A (T_A Boolean Boolean) Boolean))
// This is not matched: (CC_E Boolean Boolean (CC_A Boolean (T_A Boolean)) Wildcard (T_B Boolean))
// Mutation information: 
// Expanded _ at position 3 into: 
// {
//  CC_A()
// }
//