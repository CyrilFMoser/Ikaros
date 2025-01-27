package Program_60 

package Program_22 

object Test {
sealed trait T_A[A]
sealed trait T_B
case class CC_A[B, C](a: T_B, b: T_A[B]) extends T_A[B]
case class CC_B[D]() extends T_A[D]
case class CC_C[E]() extends T_A[E]
case class CC_D(a: T_A[T_B], b: CC_B[T_B], c: T_B) extends T_B

val v_a: T_A[Byte] = null
val v_b: Int = v_a match{
  case CC_B() => 0 
  case CC_C() => 1 
  case CC_A(_, CC_A(_, _)) => 2 
  case CC_A(CC_D(_, _, _), CC_A(_, CC_A(_, _))) => 3 
  case CC_A(CC_D(_, _, _), CC_B()) => 4 
  case CC_A(_, CC_C()) => 5 
}
}
// This is not matched: (CC_A Byte
//      T_B
//      (CC_D (CC_A T_B T_B Wildcard (CC_C T_B (T_A T_B)) (T_A T_B))
//            (CC_B T_B (T_A T_B))
//            (CC_D Wildcard Wildcard Wildcard T_B)
//            T_B)
//      (CC_A Byte T_B Wildcard (CC_C Byte (T_A Byte)) (T_A Byte))
//      (T_A Byte))
// Mutation information: 
// Expanded _ at position 3 into: 
// {
//  CC_A(_, _)
// }
//
// This is not matched: (CC_A Byte
//      T_B
//      (CC_D (CC_A T_B T_B Wildcard (CC_C T_B (T_A T_B)) (T_A T_B))
//            (CC_B T_B (T_A T_B))
//            (CC_D Wildcard Wildcard Wildcard T_B)
//            T_B)
//      (CC_A Byte T_B Wildcard (CC_C Byte (T_A Byte)) (T_A Byte))
//      (T_A Byte))
// Mutation information: 
// Expanded _ at position 5 into: 
// {
//  CC_D(_, _, _)
// }
//