package Program_30 

package Program_24 

object Test {
sealed trait T_A[A]
sealed trait T_B[B]
case class CC_A() extends T_A[T_A[Char]]
case class CC_B(a: T_A[CC_A]) extends T_A[T_A[Char]]
case class CC_C[C](a: T_A[C], b: ((Int,Int),CC_A)) extends T_A[CC_A]

val v_a: T_A[T_A[Char]] = null
val v_b: Int = v_a match{
  case CC_A() => 0 
  case CC_B(CC_C(_, _)) => 1 
}
}
// This is not matched: (CC_B (CC_C Boolean Wildcard Wildcard (T_A (CC_A Boolean))) (T_A (T_A Char)))
// This is not matched: (CC_A (T_A (T_A Char)))
// Mutation information: 
// Expanded _ at position 0 into: 
// {
//  CC_C(_, _)
// }
//