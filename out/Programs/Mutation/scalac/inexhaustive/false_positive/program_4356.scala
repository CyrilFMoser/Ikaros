package Program_21 

object Test {
sealed trait T_A[A, B]
case class CC_B[F](a: (Boolean,Byte)) extends T_A[T_A[F, F], F]
case class CC_C() extends T_A[T_A[T_A[Char, Boolean], T_A[Char, Boolean]], T_A[Char, Boolean]]

val v_a: CC_B[CC_C] = null
val v_b: Int = v_a match{
  case CC_B((_,0)) => 0 
}
}
// This is not matched: (CC_C T_B Wildcard Wildcard Wildcard T_B)
// Mutation information: 
// Expanded _ at position 3 into: 
// {
//  CC_A()
// }
//