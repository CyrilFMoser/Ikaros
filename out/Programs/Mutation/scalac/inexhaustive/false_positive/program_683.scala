package Program_58 

package Program_13 

object Test {
sealed trait T_A[A]
sealed trait T_B[B]
case class CC_A[C](a: (Char,Int), b: T_B[C], c: T_A[C]) extends T_A[C]
case class CC_B[D, E](a: Int) extends T_A[D]
case class CC_C(a: T_A[Int]) extends T_B[T_B[Int]]
case class CC_D() extends T_B[T_B[Int]]

val v_a: T_A[Int] = null
val v_b: Int = v_a match{
  case CC_B(_) => 0 
  case CC_A(_, _, CC_B(_)) => 2 
  case CC_A((_,12), _, _) => 3 
  case CC_A((_,_), _, CC_B(_)) => 4 
  case CC_A(('x',12), _, _) => 5 
  case CC_A(('x',_), _, _) => 6 
  case CC_A((_,_), _, _) => 7 
  case CC_A(('x',_), _, CC_B(_)) => 8 
  case CC_A(('x',12), _, CC_B(_)) => 9 
  case CC_A(_, _, CC_A(_, _, _)) => 10 
  case CC_A((_,12), _, CC_B(_)) => 11 
}
}
// This is not matched: (CC_B Int Boolean Wildcard (T_A Int))
// Mutation information: 
// Deleted Pattern CC_B(12) at position 1
// This is not matched: (CC_B Int Boolean Wildcard (T_A Int))
// Mutation information: 
// Expanded _ at position 10 into: 
// {
//  CC_A(_, _, _)
// }
//