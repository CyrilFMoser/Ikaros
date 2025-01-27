package Program_29 

object Test {
sealed trait T_A
sealed trait T_B[B]
case class CC_B[C]() extends T_B[C]
case class CC_C[D](a: T_B[D]) extends T_B[D]

val v_a: CC_C[T_B[T_A]] = null
val v_b: Int = v_a match{
  case CC_C(CC_C(CC_C(_))) => 0 
}
}
// This is not matched: (CC_A Boolean Wildcard (T_A Boolean))
// Mutation information: 
// Expanded _ at position 3 into: 
// {
//  CC_A(_)
// }
//