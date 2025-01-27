package Program_51 

object Test {
sealed trait T_A[A]
case class CC_A() extends T_A[Char]
case class CC_B(a: T_A[Char], b: T_A[Int]) extends T_A[Char]

val v_a: T_A[Char] = null
val v_b: Int = v_a match{
  case CC_A() => 0 
  case CC_B(CC_A(), _) => 1 
}
}
// This is not matched: (CC_B (CC_B Wildcard Wildcard (Tuple Wildcard Int) (T_A Char))
//      Wildcard
//      Wildcard
//      (T_A Char))
// Mutation information: 
// Expanded _ at position 2 into: 
// {
//  CC_A(_, _)
// }
//