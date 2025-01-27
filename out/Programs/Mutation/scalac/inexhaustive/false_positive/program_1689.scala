package Program_62 

package Program_31 

object Test {
sealed trait T_A[A, B]
sealed trait T_B
case class CC_A[C](a: (T_B,T_B), b: T_B, c: C) extends T_A[Char, C]
case class CC_B(a: T_B) extends T_A[Char, T_A[Char, T_B]]
case class CC_C(a: CC_A[T_B]) extends T_A[Char, T_A[Char, T_B]]
case class CC_D(a: T_A[Char, Byte], b: Int) extends T_B
case class CC_E[D](a: Byte) extends T_B

val v_a: T_A[Char, CC_D] = null
val v_b: Int = v_a match{
  case CC_A((CC_E(_),CC_E(_)), CC_D(_, _), _) => 0 
  case CC_A((CC_E(_),CC_D(_, _)), CC_D(_, _), CC_D(_, _)) => 1 
  case CC_A((CC_D(_, _),CC_E(_)), CC_E(_), CC_D(CC_A(_, _, _), _)) => 2 
  case CC_A((CC_D(_, _),CC_D(_, _)), CC_D(_, _), CC_D(_, _)) => 3 
  case CC_A((CC_D(_, _),CC_D(_, _)), CC_E(_), CC_D(_, _)) => 4 
  case CC_A(_, CC_D(_, _), CC_D(_, _)) => 5 
  case CC_A((CC_E(_),CC_E(_)), CC_D(_, _), CC_D(_, _)) => 6 
  case CC_A(_, CC_E(_), CC_D(_, _)) => 7 
  case CC_A((CC_D(_, _),CC_D(_, _)), _, CC_D(_, _)) => 8 
  case CC_A((CC_D(_, _),CC_E(_)), _, _) => 9 
  case CC_A((CC_E(_),CC_D(_, _)), _, CC_D(_, _)) => 10 
  case CC_A((CC_D(_, _),CC_E(_)), CC_D(_, _), CC_D(_, _)) => 11 
}
}
// This is not matched: (CC_A (CC_D Wildcard Int T_B)
//      (Tuple (CC_D (CC_A Byte Wildcard Wildcard Wildcard (T_A Char Byte))
//                   Int
//                   T_B)
//             (CC_E T_B Wildcard T_B))
//      (CC_E T_B Byte T_B)
//      (CC_D Wildcard Int T_B)
//      (T_A Char (CC_D Wildcard Int T_B)))
// Mutation information: 
// Expanded _ at position 2 into: 
// {
//  CC_A(_, _, _)
// }
//
// This is not matched: (CC_A (CC_D Wildcard Int T_B)
//      (Tuple (CC_D (CC_A Byte Wildcard Wildcard Wildcard (T_A Char Byte))
//                   Int
//                   T_B)
//             (CC_E T_B Wildcard T_B))
//      (CC_E T_B Byte T_B)
//      (CC_D Wildcard Int T_B)
//      (T_A Char (CC_D Wildcard Int T_B)))
// Mutation information: 
// Expanded _ at position 2 into: 
// {
//  CC_A(_, _, _)
// }
//