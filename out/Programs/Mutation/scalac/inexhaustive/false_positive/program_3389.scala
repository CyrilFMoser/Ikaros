package Program_11 

package Program_21 

object Test {
sealed trait T_A[A, B]
case class CC_A[C, D](a: T_A[D, Byte], b: T_A[C, C], c: T_A[C, D]) extends T_A[C, D]
case class CC_B[E](a: Boolean, b: CC_A[E, E], c: T_A[Int, E]) extends T_A[E, T_A[Int, (Byte,Byte)]]
case class CC_C[F, G](a: CC_A[F, G]) extends T_A[F, T_A[Int, (Byte,Byte)]]

val v_a: T_A[Byte, T_A[Int, (Byte,Byte)]] = null
val v_b: Int = v_a match{
  case CC_B(_, _, CC_A(_, _, _)) => 0 
  case CC_B(_, CC_A(_, _, _), CC_A(_, _, _)) => 1 
  case CC_B(_, CC_A(_, _, _), _) => 2 
  case CC_C(_) => 3 
  case CC_A(CC_A(_, _, _), _, _) => 4 
  case CC_A(_, CC_A(_, _, _), CC_B(_, _, _)) => 5 
  case CC_A(CC_A(_, _, _), _, CC_A(_, _, _)) => 6 
  case CC_A(CC_A(_, _, _), CC_A(_, _, _), CC_B(_, _, _)) => 7 
  case CC_A(_, CC_A(_, _, _), CC_C(_)) => 8 
  case CC_A(CC_A(_, _, _), CC_A(_, _, _), _) => 9 
  case CC_A(CC_A(_, _, _), _, CC_B(_, _, _)) => 10 
  case CC_A(CC_A(_, _, _), CC_A(_, _, _), CC_A(_, _, _)) => 11 
  case CC_A(CC_A(_, _, _), CC_A(_, _, _), CC_C(_)) => 12 
  case CC_A(_, _, _) => 13 
  case CC_A(_, _, CC_A(_, _, _)) => 14 
  case CC_A(_, CC_A(_, CC_A(_, _, _), _), _) => 15 
}
}
// This is not matched: (CC_C Byte Boolean Wildcard (T_A Byte (T_A Int (Tuple Byte Byte))))
// Mutation information: 
// Expanded _ at position 15 into: 
// {
//  CC_A(_, _, _)
// }
//
// This is not matched: (CC_C Byte Boolean Wildcard (T_A Byte (T_A Int (Tuple Byte Byte))))
// Mutation information: 
// Expanded _ at position 0 into: 
// {
//  CC_A(_, _, _)
// }
//