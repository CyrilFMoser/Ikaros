package Program_61 

object Test {
sealed trait T_A[A]
case class CC_A[B](a: B) extends T_A[B]

val v_a: CC_A[Char] = null
val v_b: Int = v_a match{
  case CC_A('x') => 0 
}
}
// This is not matched: (CC_A Int (CC_A Int Wildcard (T_A Int)) (T_A Int))
// Mutation information: 
// Expanded _ at position 2 into: 
// {
//  CC_A(_)
//  CC_C(_, _, _)
// }
//