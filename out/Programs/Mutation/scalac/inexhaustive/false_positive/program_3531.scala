package Program_26 

object Test {
sealed trait T_A[A]
sealed trait T_B[B]
case class CC_A(a: Int, b: T_A[(Boolean,Int)], c: T_B[Byte]) extends T_A[T_B[Char]]
case class CC_B(a: CC_A) extends T_A[T_B[Char]]
case class CC_C[C]() extends T_B[C]
case class CC_D[D]() extends T_B[D]

val v_a: CC_B = null
val v_b: Int = v_a match{
  case CC_B(CC_A(_, _, CC_C())) => 0 
}
}
// This is not matched: Pattern match is empty without constants
// Mutation information: 
// Expanded _ at position 0 into: 
// {
//  CC_A(_, _, _)
// }
//