package Program_24 

object Test {
sealed trait T_A[A, B]
sealed trait T_B
case class CC_B[D](a: T_A[T_B, D], b: T_A[D, D]) extends T_A[T_B, D]
case class CC_C[E]() extends T_A[T_B, E]

val v_a: CC_B[Byte] = null
val v_b: Int = v_a match{
  case CC_B(CC_C(), _) => 0 
}
}
// This is not matched: (CC_B Byte
//      Wildcard
//      (CC_B Byte
//            Wildcard
//            (CC_C Byte Wildcard (T_A T_B Byte))
//            Wildcard
//            (T_A T_B Byte))
//      Wildcard
//      (T_A T_B Byte))
// Mutation information: 
// Expanded _ at position 1 into: 
// {
//  CC_A(_, _)
// }
//