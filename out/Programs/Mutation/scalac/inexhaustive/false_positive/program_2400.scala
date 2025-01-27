package Program_25 

object Test {
sealed trait T_B[C]
case class CC_B[D]() extends T_B[D]
case class CC_C[E](a: T_B[E]) extends T_B[E]

val v_a: CC_C[Boolean] = null
val v_b: Int = v_a match{
  case CC_C(CC_B()) => 0 
}
}
// This is not matched: (CC_C Boolean
//      (CC_C Boolean
//            Wildcard
//            Wildcard
//            (CC_D Boolean Wildcard (T_B Boolean))
//            (T_B Boolean))
//      Wildcard
//      (CC_D Boolean Wildcard (T_B Boolean))
//      (T_B Boolean))
// Mutation information: 
// Expanded _ at position 1 into: 
// {
//  CC_B()
//  CC_C(_, _, _)
// }
//