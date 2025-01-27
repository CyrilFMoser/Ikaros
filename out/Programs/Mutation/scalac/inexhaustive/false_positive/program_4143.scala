package Program_30 

package Program_29 

object Test {
sealed trait T_A[A]
case class CC_A[B](a: T_A[B], b: T_A[Byte]) extends T_A[T_A[Int]]
case class CC_B(a: T_A[Char], b: CC_A[Char], c: T_A[Byte]) extends T_A[T_A[Int]]
case class CC_C(a: CC_B) extends T_A[T_A[Int]]

val v_a: T_A[T_A[Int]] = null
val v_b: Int = v_a match{
  case CC_B(_, CC_A(_, _), _) => 0 
  case CC_C(_) => 1 
  case CC_A(CC_C(_), _) => 3 
  case CC_A(CC_B(_, _, _), _) => 4 
}
}
// This is not matched: (CC_A Boolean Wildcard Wildcard (T_A (T_A Int)))
// Mutation information: 
// Deleted Pattern CC_A(_, _) at position 2
// This is not matched: (CC_A Boolean Wildcard Wildcard (T_A (T_A Int)))
// Mutation information: 
// Expanded _ at position 2 into: 
// {
//  CC_A(_, _)
//  CC_B(_, _, _)
// }
//