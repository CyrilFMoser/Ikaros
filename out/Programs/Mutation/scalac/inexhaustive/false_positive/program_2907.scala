package Program_31 

package Program_23 

object Test {
sealed trait T_A[A]
sealed trait T_B
case class CC_A[B, C](a: T_A[B], b: T_B, c: T_A[B]) extends T_A[B]
case class CC_B[D](a: T_A[D]) extends T_A[D]
case class CC_C(a: CC_B[T_B], b: (T_B,T_B)) extends T_A[T_A[Byte]]
case class CC_D(a: CC_C, b: T_A[CC_C]) extends T_B
case class CC_E(a: Int, b: (CC_D,T_B)) extends T_B
case class CC_F(a: Boolean, b: T_A[(Byte,Int)]) extends T_B

val v_a: T_A[CC_D] = null
val v_b: Int = v_a match{
  case CC_B(_) => 0 
  case CC_A(CC_B(_), _, CC_B(_)) => 1 
  case CC_A(_, _, _) => 2 
  case CC_A(CC_A(_, _, _), _, _) => 3 
  case CC_A(CC_A(_, _, _), _, CC_B(_)) => 4 
  case CC_A(CC_A(_, _, _), CC_F(_, _), _) => 5 
  case CC_A(_, _, CC_A(_, _, _)) => 6 
  case CC_A(_, _, CC_B(_)) => 7 
  case CC_A(CC_A(_, _, CC_B(_)), CC_E(_, _), CC_A(_, _, _)) => 8 
  case CC_A(CC_A(_, _, CC_A(_, _, _)), CC_E(_, _), CC_A(_, _, _)) => 8 
}
}
// This is not matched: (CC_A (CC_D T_B T_B (T_A T_B))
//      T_B
//      Wildcard
//      Wildcard
//      Wildcard
//      (T_A (CC_D T_B T_B (T_A T_B))))
// Mutation information: 
// Expanded _ at position 8 into: 
// {
//  CC_A(_, _, _)
//  CC_B(_)
// }
//
// This is not matched: (CC_B (CC_D T_B T_B T_B) Wildcard (T_A (CC_D T_B T_B T_B)))