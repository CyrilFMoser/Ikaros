package Program_63 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C]
case class CC_A[D, E]() extends T_A[E, D]
case class CC_B[G, F](a: T_B[F], b: T_A[G, G]) extends T_A[F, G]
case class CC_C() extends T_B[(Int,Boolean)]

val v_a: CC_B[Byte, Byte] = null
val v_b: Int = v_a match{
  case CC_B(_, CC_B(_, CC_A())) => 0 
}
}
// This is not matched: (CC_B Byte Byte Wildcard (CC_A Byte Byte (T_A Byte Byte)) (T_A Byte Byte))
// Mutation information: 
// Expanded _ at position 0 into: 
// {
//  CC_A()
//  CC_B(_, _)
// }
//