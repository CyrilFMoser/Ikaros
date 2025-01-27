package Program_25 

object Test {
sealed trait T_A[A]
case class CC_A[B](a: B) extends T_A[B]

val v_a: CC_A[Byte] = null
val v_b: Int = v_a match{
  case CC_A(0) => 0 
}
}
// This is not matched: (CC_C (CC_B (T_A (T_A Boolean)) (T_A Boolean) (T_A Boolean) (T_A Boolean))
//      Wildcard
//      (T_A (CC_B (T_A (T_A Boolean)) (T_A Boolean) (T_A Boolean) (T_A Boolean))))
// Mutation information: 
// Expanded _ at position 1 into: 
// {
//  CC_A(_, _)
// }
//