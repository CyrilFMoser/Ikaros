package Program_27 

package Program_4 

object Test {
sealed trait T_A[A]
case class CC_A[B, C](a: B) extends T_A[B]
case class CC_B() extends T_A[T_A[Boolean]]
case class CC_C(a: CC_B, b: CC_A[CC_B, (Byte,Char)], c: T_A[CC_B]) extends T_A[T_A[Boolean]]

val v_a: T_A[T_A[Boolean]] = null
val v_b: Int = v_a match{
  case CC_B() => 0 
  case CC_A(CC_A(_)) => 1 
  case CC_C(_, _, _) => 2 
  case CC_C(CC_B(), CC_A(_), _) => 4 
}
}
// This is not matched: (CC_A (T_A Boolean) (T_A Boolean) Wildcard (T_A (T_A Boolean)))
// Mutation information: 
// Deleted Pattern CC_C(CC_B(), _, CC_A(_)) at position 3
// This is not matched: (CC_B Char Wildcard Wildcard (T_A Char))
// Mutation information: 
// Expanded _ at position 2 into: 
// {
//  CC_A(_, _, _)
// }
//