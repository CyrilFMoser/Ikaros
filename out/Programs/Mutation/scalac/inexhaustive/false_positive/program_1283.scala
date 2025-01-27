package Program_63 

object Test {
sealed trait T_A[A]
case class CC_A(a: T_A[Byte], b: T_A[Char]) extends T_A[Char]
case class CC_B() extends T_A[Char]

val v_a: T_A[Char] = null
val v_b: Int = v_a match{
  case CC_A(_, CC_B()) => 0 
  case CC_B() => 1 
}
}
// This is not matched: (CC_B Int Wildcard (CC_A Int Wildcard Wildcard (T_A Int)) (T_A Int))
// Mutation information: 
// Expanded _ at position 3 into: 
// {
//  CC_A(_, _)
// }
//