package Program_14 

object Test {
sealed trait T_A[A]
case class CC_A[B]() extends T_A[B]
case class CC_B[C](a: Char, b: T_A[C], c: T_A[C]) extends T_A[C]

val v_a: CC_B[Int] = null
val v_b: Int = v_a match{
  case CC_B(_, _, CC_B(_, _, _)) => 0 
  case CC_B('x', CC_B(_, _, _), _) => 1 
  case CC_B('x', CC_A(), CC_B(_, _, _)) => 2 
  case CC_B('x', CC_A(), CC_A()) => 2 
}
}
// This is not matched: (CC_B Int Wildcard Wildcard (CC_A Int (T_A Int)) (T_A Int))
// Mutation information: 
// Expanded _ at position 2 into: 
// {
//  CC_A()
//  CC_B(_, _, _)
// }
//