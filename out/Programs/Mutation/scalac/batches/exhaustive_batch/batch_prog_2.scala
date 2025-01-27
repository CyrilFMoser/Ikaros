package Program_2 

object Test {
sealed trait T_A[A]
case class CC_A[B]() extends T_A[B]
case class CC_B[C](a: Char, b: T_A[C], c: T_A[C]) extends T_A[C]

val v_a: CC_B[Int] = null
val v_b: Int = v_a match{
  case CC_B('x', _, CC_A()) => 0 
  case CC_B(_, CC_A(), CC_B(_, _, _)) => 1 
  case CC_B(_, _, _) => 2 
  case CC_B('x', _, CC_B(_, _, CC_A())) => 3 
  case CC_B('x', _, CC_B(_, _, _)) => 3 
}
}
// Mutation information: 
// Expanded _ at position 3 into: 
// {
//  CC_A()
// }
//