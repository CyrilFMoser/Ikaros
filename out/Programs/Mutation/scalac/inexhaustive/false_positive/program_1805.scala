package Program_15 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C, D]
case class CC_A[E]() extends T_A[T_A[Int, Byte], E]
case class CC_B[F]() extends T_B[F, T_A[Byte, Boolean]]
case class CC_C[G](a: T_A[G, G], b: Char) extends T_B[G, CC_B[Boolean]]

val v_a: T_B[Byte, CC_B[Boolean]] = null
val v_b: Int = v_a match{
  case CC_C(_, 'x') => 0 
}
}
// This is not matched: (CC_A T_A Wildcard T_A)
// Mutation information: 
// Expanded _ at position 4 into: 
// {
//  CC_A(_)
//  CC_B(_, _)
// }
//