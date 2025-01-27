package Program_31 

object Test {
sealed trait T_A[A]
sealed trait T_B[B, C]
case class CC_A() extends T_A[T_B[Boolean, Char]]
case class CC_B(a: T_B[(Int,Char), CC_A]) extends T_A[T_B[Boolean, Char]]
case class CC_C[E, D]() extends T_B[E, D]
case class CC_D[G, F]() extends T_B[G, F]

val v_a: CC_B = null
val v_b: Int = v_a match{
  case CC_B(CC_D()) => 0 
}
}
// This is not matched: (CC_A (CC_B Wildcard (CC_C T_A) T_A)
//      (CC_B (CC_A Wildcard (CC_C T_A) T_A) (CC_C T_A) T_A)
//      T_A)
// Mutation information: 
// Expanded _ at position 2 into: 
// {
//  CC_A(_, _)
//  CC_B(_, _)
// }
//