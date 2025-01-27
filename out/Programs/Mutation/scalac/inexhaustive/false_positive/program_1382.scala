package Program_11 

object Test {
sealed trait T_A[A]
sealed trait T_B[B]
case class CC_A[C]() extends T_A[C]
case class CC_B[D](a: CC_A[D], b: CC_A[D]) extends T_A[D]
case class CC_C(a: CC_B[Byte], b: Int) extends T_B[Int]
case class CC_D[E](a: T_B[E], b: E) extends T_B[E]

val v_a: T_B[Int] = null
val v_b: Int = v_a match{
  case CC_D(CC_D(_, _), _) => 0 
  case CC_D(CC_C(_, _), 12) => 1 
  case CC_D(CC_D(_, _), 12) => 2 
}
}
// This is not matched: (CC_C Byte (T_B (CC_B Byte Byte T_A T_A T_A) Byte))
// Mutation information: 
// Expanded _ at position 1 into: 
// {
//  CC_A(_)
// }
//