package Program_63 

object Test {
sealed trait T_A[A]
sealed trait T_B
case class CC_A() extends T_A[T_B]
case class CC_B(a: T_A[T_B]) extends T_A[T_B]
case class CC_C(a: CC_B, b: T_A[CC_B]) extends T_A[T_B]

val v_a: T_A[T_B] = null
val v_b: Int = v_a match{
  case CC_C(CC_B(CC_A()), _) => 0 
  case CC_B(_) => 1 
  case CC_A() => 2 
}
}
// This is not matched: (CC_A Wildcard (CC_B Wildcard Wildcard Char (T_A T_B)) Wildcard (T_A T_B))
// Mutation information: 
// Expanded _ at position 0 into: 
// {
//  CC_A(_, _, _)
// }
//