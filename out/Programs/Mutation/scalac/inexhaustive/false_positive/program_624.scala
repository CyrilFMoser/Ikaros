package Program_63 

object Test {
sealed trait T_B[B]
case class CC_D[F](a: F) extends T_B[F]

val v_a: CC_D[Char] = null
val v_b: Int = v_a match{
  case CC_D('x') => 0 
}
}
// This is not matched: (CC_A Wildcard Wildcard (CC_B Wildcard (T_A Boolean)) (T_A Boolean))
// Mutation information: 
// Expanded _ at position 0 into: 
// {
//  CC_A(_, _, _)
//  CC_B(_)
//  CC_C(_, _, _)
// }
//