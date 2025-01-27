package Program_6 

object Test {
sealed trait T_A[A]
sealed trait T_B
case class CC_A(a: T_B) extends T_A[Int]
case class CC_C() extends T_B
case class CC_D(a: (CC_A,T_B)) extends T_B

val v_a: CC_D = null
val v_b: Int = v_a match{
  case CC_D((CC_A(CC_D(_)),_)) => 0 
}
}
// This is not matched: (CC_D (Tuple Wildcard (CC_C Wildcard Wildcard T_B))
//      (CC_C Wildcard Wildcard T_B)
//      Wildcard
//      T_B)
// Mutation information: 
// Expanded _ at position 4 into: 
// {
//  CC_C(_, _)
//  CC_D(_, _, _)
//  CC_E(_, _)
// }
//