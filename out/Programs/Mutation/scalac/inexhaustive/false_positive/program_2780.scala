package Program_22 

object Test {
sealed trait T_A[A]
sealed trait T_B[B]
case class CC_C[C]() extends T_B[C]
case class CC_D[D](a: T_B[D]) extends T_B[D]

val v_a: CC_D[Int] = null
val v_b: Int = v_a match{
  case CC_D(CC_C()) => 0 
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