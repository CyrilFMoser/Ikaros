package Program_49 

package Program_19 

object Test {
sealed trait T_A[A]
case class CC_A[B, C]() extends T_A[B]
case class CC_B(a: T_A[Int], b: T_A[Char]) extends T_A[(Byte,Boolean)]
case class CC_C[D](a: CC_B, b: CC_A[D, D], c: T_A[D]) extends T_A[D]

val v_a: T_A[T_A[(Byte,Boolean)]] = null
val v_b: Int = v_a match{
  case CC_A() => 0 
  case CC_C(CC_B(CC_A(), _), _, _) => 1 
  case CC_C(_, CC_A(), _) => 2 
  case CC_C(_, _, _) => 3 
  case CC_C(CC_B(_, _), _, CC_C(_, _, _)) => 4 
  case CC_C(_, CC_A(), CC_C(_, _, _)) => 5 
}
}
// This is not matched: (CC_A (T_A (Tuple Byte Boolean)) Boolean (T_A (T_A (Tuple Byte Boolean))))
// Mutation information: 
// Expanded _ at position 1 into: 
// {
//  CC_A()
// }
//
// This is not matched: (CC_A (T_A (Tuple Byte Boolean)) Boolean (T_A (T_A (Tuple Byte Boolean))))
// Mutation information: 
// Deleted Pattern CC_C(CC_B(_, _), _, CC_C(_, _, _)) at position 4