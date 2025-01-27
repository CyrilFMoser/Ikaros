package Program_30 

package Program_31 

object Test {
sealed trait T_A[A]
case class CC_A[B]() extends T_A[B]
case class CC_B[C](a: CC_A[C], b: T_A[C], c: Boolean) extends T_A[C]
case class CC_C[D](a: Char) extends T_A[CC_B[Int]]

val v_a: T_A[CC_B[Int]] = null
val v_b: Int = v_a match{
  case CC_A() => 0 
  case CC_C('x') => 1 
  case CC_C(_) => 2 
  case CC_B(_, CC_B(_, _, _), _) => 3 
  case CC_B(CC_A(), CC_B(_, CC_B(_, _, _), _), _) => 4 
  case CC_B(CC_A(), CC_B(_, CC_A(), _), _) => 4 
  case CC_B(CC_A(), CC_A(), _) => 5 
  case CC_B(CC_A(), CC_C(_), _) => 6 
}
}
// This is not matched: (CC_C Boolean Char (T_A (CC_B Int Boolean Boolean Boolean Boolean)))
// Mutation information: 
// Expanded _ at position 4 into: 
// {
//  CC_A()
//  CC_B(_, _, _)
// }
//
// This is not matched: (CC_C Boolean Char (T_A (CC_B Int Boolean Boolean Boolean Boolean)))
// Mutation information: 
// Expanded _ at position 4 into: 
// {
//  CC_A()
//  CC_B(_, _, _)
// }
//