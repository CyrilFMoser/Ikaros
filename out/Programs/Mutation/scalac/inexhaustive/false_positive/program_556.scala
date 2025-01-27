package Program_63 

package Program_0 

object Test {
sealed trait T_A[A]
sealed trait T_B[B]
case class CC_A[C]() extends T_A[T_A[Char]]
case class CC_B(a: CC_A[(Char,Char)], b: T_A[Char], c: T_A[Char]) extends T_A[T_A[Char]]
case class CC_C(a: T_A[CC_B]) extends T_A[T_A[Char]]

val v_a: T_A[T_A[Char]] = null
val v_b: Int = v_a match{
  case CC_A() => 0 
  case CC_B(CC_A(), _, _) => 1 
  case CC_C(_) => 2 
}
}
// This is not matched: (CC_A Boolean (T_A (T_A Char)))
// This is not matched: (CC_A (T_A Char) Wildcard Wildcard (T_A (T_A Char)))
// Mutation information: 
// Expanded _ at position 2 into: 
// {
//  CC_A(_, _)
// }
//