package Program_62 

package Program_31 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C, D]
case class CC_A[F, E, G](a: T_A[Boolean, E], b: T_A[Byte, F]) extends T_A[E, F]
case class CC_B[H]() extends T_A[H, T_B[H, H]]
case class CC_C[I, J]() extends T_A[I, J]

val v_a: CC_A[Char, Byte, Int] = null
val v_b: Int = v_a match{
  case CC_A(_, CC_A(_, _)) => 0 
  case CC_A(CC_A(_, _), CC_C()) => 1 
  case CC_A(CC_C(), CC_A(CC_C(), _)) => 2 
  case CC_A(CC_C(), CC_A(CC_A(_, _), _)) => 2 
  case CC_A(_, CC_C()) => 3 
}
}
// This is not matched: (CC_A Char
//      Byte
//      Int
//      Wildcard
//      (CC_A Char Byte Byte Wildcard Wildcard (T_A Byte Char))
//      (T_A Byte Char))
// Mutation information: 
// Expanded _ at position 2 into: 
// {
//  CC_A(_, _)
//  CC_C()
// }
//
// This is not matched: (CC_A Char
//      Byte
//      Int
//      Wildcard
//      (CC_A Char Byte Byte Wildcard Wildcard (T_A Byte Char))
//      (T_A Byte Char))
// Mutation information: 
// Expanded _ at position 2 into: 
// {
//  CC_A(_, _)
//  CC_C()
// }
//