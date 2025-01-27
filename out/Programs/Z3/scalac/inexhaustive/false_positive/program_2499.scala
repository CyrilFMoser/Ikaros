package Program_30 

package Program_14 

object Test {
sealed trait T_A[A]
sealed trait T_B[B, C]
case class CC_A[D](a: T_A[D]) extends T_A[D]
case class CC_B(a: T_A[Boolean], b: T_A[Char]) extends T_A[T_B[Byte, Byte]]
case class CC_C[E, F](a: T_A[F], b: ((Byte,Boolean),CC_B), c: CC_A[F]) extends T_B[E, T_A[E]]
case class CC_D[G](a: T_A[G], b: CC_C[G, G], c: Char) extends T_B[G, T_A[G]]
case class CC_E[H](a: CC_C[H, H]) extends T_B[H, T_A[H]]

val v_a: T_B[Char, T_A[Char]] = null
val v_b: Int = v_a match{
  case CC_E(CC_C(_, _, _)) => 0 
  case CC_D(_, CC_C(_, _, _), 'x') => 1 
  case CC_D(CC_A(_), _, 'x') => 2 
  case CC_D(CC_A(_), _, _) => 3 
  case CC_D(_, _, 'x') => 4 
  case CC_D(_, CC_C(_, _, _), _) => 5 
  case CC_C(CC_A(_), ((_,_),CC_B(_, _)), _) => 6 
  case CC_C(CC_B(_, _), _, CC_A(_)) => 7 
}
}
// This is not matched: (CC_C Char
//      (CC_A (T_A (CC_C Boolean Boolean Boolean Boolean Boolean Boolean))
//            Boolean
//            Boolean)
//      Wildcard
//      Wildcard
//      (CC_A (CC_A (T_A (CC_C Boolean
//                             Boolean
//                             (T_A Boolean)
//                             Boolean
//                             Boolean
//                             Boolean))
//                  Boolean
//                  Boolean)
//            Wildcard
//            (T_A (CC_A (T_A (CC_C Boolean
//                                  Boolean
//                                  (T_A Boolean)
//                                  Boolean
//                                  Boolean
//                                  Boolean))
//                       Boolean
//                       Boolean)))
//      (T_B Char (T_A Char)))
// This is not matched: (CC_E Char Wildcard (T_B Char (T_A Char)))