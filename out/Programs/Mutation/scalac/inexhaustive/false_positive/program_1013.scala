package Program_63 

object Test {
sealed trait T_A[A, B]
case class CC_A[C](a: (Char,Int)) extends T_A[C, T_A[C, C]]

val v_a: CC_A[Int] = null
val v_b: Int = v_a match{
  case CC_A(('x',_)) => 0 
}
}
// This is not matched: (CC_A Boolean Wildcard (T_A Boolean))
// Mutation information: 
// Expanded _ at position 0 into: 
// {
//  CC_A(_)
// }
//