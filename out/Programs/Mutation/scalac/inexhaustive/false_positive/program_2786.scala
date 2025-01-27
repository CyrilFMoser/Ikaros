package Program_16 

object Test {
sealed trait T_A[A, B]
case class CC_A[D, C]() extends T_A[D, C]
case class CC_B[F, E](a: T_A[E, E]) extends T_A[E, F]

val v_a: CC_B[Byte, Boolean] = null
val v_b: Int = v_a match{
  case CC_B(CC_A()) => 0 
}
}
// This is not matched: (CC_B Byte
//      Boolean
//      Wildcard
//      (CC_A (Tuple Int Boolean)
//            Boolean
//            Wildcard
//            (T_A (Tuple Int Boolean) Boolean))
//      (T_A Boolean Byte))
// Mutation information: 
// Expanded _ at position 0 into: 
// {
//  CC_A(_)
//  CC_B(_, _)
// }
//