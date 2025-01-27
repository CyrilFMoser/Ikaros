package Program_31 

package Program_8 

object Test {
sealed trait T_A[A]
sealed trait T_B[B, C]
case class CC_A[D](a: T_B[D, D], b: Int) extends T_A[D]
case class CC_B(a: CC_A[Char], b: Char, c: T_A[Byte]) extends T_A[T_B[Boolean, (Boolean,Char)]]
case class CC_C[E, F](a: CC_A[F], b: F) extends T_A[E]
case class CC_D(a: T_A[CC_B], b: (Char,CC_B), c: CC_A[CC_B]) extends T_B[CC_A[Byte], CC_C[CC_B, Boolean]]
case class CC_E(a: T_A[Byte]) extends T_B[CC_A[Byte], CC_C[CC_B, Boolean]]

val v_a: T_A[T_B[Boolean, (Boolean,Char)]] = null
val v_b: Int = v_a match{
  case CC_A(_, 12) => 0 
  case CC_A(_, _) => 1 
  case CC_B(_, 'x', _) => 2 
  case CC_B(CC_A(_, _), _, _) => 3 
  case CC_B(CC_A(_, _), 'x', CC_A(_, _)) => 4 
  case CC_B(CC_A(_, _), 'x', CC_C(_, _)) => 5 
  case CC_B(CC_A(_, _), _, CC_C(_, _)) => 6 
  case CC_B(_, _, _) => 7 
  case CC_B(_, _, CC_A(_, _)) => 8 
  case CC_C(CC_A(_, _), _) => 9 
}
}
// This is not matched: (CC_C (T_B Boolean (Tuple Boolean Char))
//      (T_B (CC_A Byte Boolean Boolean Boolean)
//           (CC_C (CC_B Boolean Boolean Boolean Boolean)
//                 Boolean
//                 Boolean
//                 Boolean
//                 Boolean))
//      (CC_A (T_B (CC_A Byte Boolean Boolean Boolean)
//                 (CC_C (CC_B Boolean Boolean Boolean Boolean)
//                       Boolean
//                       Boolean
//                       Boolean
//                       Boolean))
//            Wildcard
//            Wildcard
//            (T_A (T_B (CC_A Byte Boolean Boolean Boolean)
//                      (CC_C (CC_B Boolean Boolean Boolean Boolean)
//                            Boolean
//                            Boolean
//                            Boolean
//                            Boolean))))
//      (CC_E (CC_A Byte Wildcard Int (T_A Byte))
//            (T_B (CC_A Byte Boolean Boolean Boolean)
//                 (CC_C (CC_B Boolean Boolean Boolean Boolean)
//                       Boolean
//                       Boolean
//                       Boolean
//                       Boolean)))
//      (T_A (T_B Boolean (Tuple Boolean Char))))
// This is not matched: (CC_C Wildcard T_A)