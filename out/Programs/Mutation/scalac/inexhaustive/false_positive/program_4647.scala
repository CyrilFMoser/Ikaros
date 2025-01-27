package Program_29 

object Test {
sealed trait T_A[A]
case class CC_B[C](a: Char) extends T_A[C]

val v_a: CC_B[Int] = null
val v_b: Int = v_a match{
  case CC_B('x') => 0 
}
}
// This is not matched: (CC_B Int Wildcard Wildcard (CC_A Int (T_A Int)) (T_A Int))
// Mutation information: 
// Expanded _ at position 0 into: 
// {
//  CC_A()
// }
//