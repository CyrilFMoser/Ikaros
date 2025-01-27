package Program_31 

object Test {
sealed trait T_A[A]
sealed trait T_B
case class CC_A() extends T_A[T_A[T_B]]
case class CC_B() extends T_B
case class CC_C(a: T_B, b: T_A[CC_A]) extends T_B

val v_a: T_B = null
val v_b: Int = v_a match{
  case CC_B() => 0 
  case CC_C(CC_C(_, _), _) => 1 
}
}
// This is not matched: (CC_E (T_B (T_B (CC_B Boolean))))
// Mutation information: 
// Expanded _ at position 0 into: 
// {
//  CC_A(_)
// }
//