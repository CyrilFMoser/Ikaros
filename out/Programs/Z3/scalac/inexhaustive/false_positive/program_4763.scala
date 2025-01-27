package Program_13 

package Program_1 

object Test {
sealed trait T_A[A, B]
case class CC_A[C, D](a: C, b: C) extends T_A[C, D]
case class CC_B(a: CC_A[Byte, Boolean], b: (Boolean,Byte)) extends T_A[T_A[Byte, Boolean], CC_A[Int, (Char,Char)]]
case class CC_C[E](a: (CC_B,CC_B), b: T_A[E, E], c: CC_A[E, E]) extends T_A[T_A[Byte, Boolean], CC_A[Int, (Char,Char)]]

val v_a: T_A[T_A[Byte, Boolean], CC_A[Int, (Char,Char)]] = null
val v_b: Int = v_a match{
  case CC_B(CC_A(_, _), (_,0)) => 0 
  case CC_B(_, (_,_)) => 1 
  case CC_B(_, (_,0)) => 2 
  case CC_B(CC_A(_, _), (_,_)) => 3 
  case CC_B(CC_A(_, _), _) => 4 
  case CC_C(_, CC_A(_, _), _) => 5 
  case CC_C(_, CC_A(_, _), CC_A(_, _)) => 6 
  case CC_C((CC_B(_, _),CC_B(_, _)), CC_A(_, _), CC_A(_, _)) => 7 
  case CC_A(CC_A(_, _), CC_A(_, _)) => 8 
  case CC_A(CC_A(_, _), _) => 9 
}
}
// This is not matched: (CC_C Byte
//      (Tuple Wildcard
//             (CC_B Wildcard
//                   Wildcard
//                   (T_A (T_A Byte Boolean)
//                        (CC_A Int
//                              (Tuple Char Char)
//                              (T_A Boolean Boolean)
//                              Boolean
//                              Boolean))))
//      (CC_A Byte Byte Byte Byte (T_A Byte Byte))
//      (CC_A Byte Byte Wildcard Byte (T_A Byte Byte))
//      (T_A (T_A Byte Boolean)
//           (CC_A Int (Tuple Char Char) Boolean Boolean Boolean)))
// This is not matched: (CC_A Char Boolean Wildcard (T_A Char))