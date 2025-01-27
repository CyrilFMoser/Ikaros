package Program_5 

package Program_21 

object Test {
sealed trait T_A[A]
sealed trait T_B[B]
case class CC_A[C](a: ((Boolean,Char),Char), b: T_B[C], c: (Int,Char)) extends T_A[C]
case class CC_B[D](a: T_B[D], b: D, c: T_B[D]) extends T_B[D]
case class CC_C[E, F](a: T_B[E]) extends T_B[E]
case class CC_D(a: T_A[Boolean], b: T_B[Boolean], c: CC_C[Int, Boolean]) extends T_B[CC_A[Byte]]

val v_a: T_B[Int] = null
val v_b: Int = v_a match{
  case CC_B(CC_C(_), 12, CC_B(_, _, _)) => 0 
  case CC_B(_, _, CC_B(_, _, _)) => 1 
  case CC_B(CC_B(_, _, _), _, CC_B(_, _, _)) => 2 
  case CC_B(_, _, CC_C(_)) => 3 
  case CC_B(_, _, _) => 4 
  case CC_B(CC_B(_, _, _), 12, CC_B(_, _, _)) => 5 
  case CC_B(CC_C(_), _, CC_B(_, _, _)) => 6 
  case CC_B(CC_C(_), _, _) => 7 
  case CC_B(CC_C(_), _, CC_C(_)) => 8 
  case CC_B(CC_C(_), 12, CC_C(_)) => 9 
  case CC_B(CC_C(_), 12, _) => 10 
  case CC_B(_, 12, CC_B(_, _, _)) => 11 
  case CC_B(CC_B(_, _, _), 12, CC_C(_)) => 12 
  case CC_B(CC_B(_, _, _), 12, _) => 13 
  case CC_C(_) => 14 
}
}
// This is not matched: (CC_C Int
//      (CC_A Boolean Boolean (T_A Boolean) Boolean Boolean)
//      Wildcard
//      (T_B Int))
// Mutation information: 
// Expanded _ at position 4 into: 
// {
//  CC_B(_, _, _)
// }
//
// This is not matched: (CC_C Int
//      (CC_A Boolean Boolean (T_A Boolean) Boolean Boolean)
//      Wildcard
//      (T_B Int))
// Mutation information: 
// Deleted Pattern CC_B(CC_B(_, _, _), 12, CC_B(_, _, _)) at position 6