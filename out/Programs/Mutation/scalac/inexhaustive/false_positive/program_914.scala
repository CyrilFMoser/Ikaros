package Program_46 

object Test {
sealed trait T_A[A]
sealed trait T_B
case class CC_A(a: T_A[T_B], b: T_A[(Boolean,Byte)]) extends T_A[T_B]
case class CC_B(a: T_A[T_B]) extends T_A[T_B]
case class CC_C() extends T_A[T_B]

val v_a: T_A[T_B] = null
val v_b: Int = v_a match{
  case CC_C() => 0 
  case CC_B(CC_C()) => 1 
  case CC_B(CC_A(CC_B(_), _)) => 2 
  case CC_B(CC_B(_)) => 3 
  case CC_A(_, _) => 4 
}
}
// This is not matched: (CC_A Wildcard (CC_B Wildcard Wildcard Char (T_A T_B)) Wildcard (T_A T_B))
// Mutation information: 
// Expanded _ at position 8 into: 
// {
//  CC_A(_, _, _)
//  CC_B(_, _, _)
//  CC_C(_, _)
// }
//