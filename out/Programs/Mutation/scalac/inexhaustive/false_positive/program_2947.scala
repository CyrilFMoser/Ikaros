package Program_30 

object Test {
sealed trait T_A[A]
sealed trait T_B[B, C]
case class CC_D[G](a: Int) extends T_B[G, T_A[Int]]

val v_a: CC_D[Boolean] = null
val v_b: Int = v_a match{
  case CC_D(12) => 0 
}
}
// This is not matched: (CC_B Char Wildcard Wildcard Wildcard (T_A Char))
// Mutation information: 
// Expanded _ at position 1 into: 
// {
//  CC_A(_, _, _)
//  CC_B(_, _, _)
// }
//