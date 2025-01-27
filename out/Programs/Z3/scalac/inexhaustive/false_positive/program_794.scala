package Program_31 

package Program_15 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C]
case class CC_A[D, E](a: T_B[E], b: T_B[D], c: T_A[E, E]) extends T_A[E, D]
case class CC_B[G, F](a: T_A[F, F], b: CC_A[G, F], c: G) extends T_A[G, F]
case class CC_C[H]() extends T_A[T_A[Boolean, Char], H]
case class CC_D[I, J](a: J) extends T_B[I]
case class CC_E(a: T_A[Char, Char], b: CC_B[Byte, Byte]) extends T_B[T_A[Int, (Boolean,Char)]]
case class CC_F(a: CC_E, b: T_A[CC_E, (Boolean,Boolean)], c: T_B[CC_E]) extends T_B[T_A[Int, (Boolean,Char)]]

val v_a: CC_A[CC_F, Boolean] = null
val v_b: Int = v_a match{
  case CC_A(_, CC_D(_), _) => 0 
  case CC_A(CC_D(_), CC_D(_), CC_A(_, _, _)) => 1 
  case CC_A(CC_D(_), _, _) => 2 
  case CC_A(CC_D(_), CC_D(_), CC_B(_, _, _)) => 3 
}
}
// This is not matched: (CC_A (CC_F (T_A Boolean Boolean)
//            (T_A Boolean Boolean)
//            (T_A Boolean Boolean)
//            (T_A Boolean Boolean))
//      Boolean
//      (CC_D Boolean Boolean Wildcard (T_B Boolean))
//      (CC_D (CC_F (T_A Boolean Boolean)
//                  (T_A Boolean Boolean)
//                  (T_A Boolean Boolean)
//                  (T_A Boolean Boolean))
//            Byte
//            Byte
//            (T_B (CC_F (T_A Boolean Boolean)
//                       (T_A Boolean Boolean)
//                       (T_A Boolean Boolean)
//                       (T_A Boolean Boolean))))
//      Wildcard
//      (T_A Boolean
//           (CC_F (T_A Boolean Boolean)
//                 (T_A Boolean Boolean)
//                 (T_A Boolean Boolean)
//                 (T_A Boolean Boolean))))
// This is not matched: (CC_A (CC_F (T_A Boolean Boolean)
//            (T_A Boolean Boolean)
//            (T_A Boolean Boolean)
//            (T_A Boolean Boolean))
//      Boolean
//      (CC_D Boolean Boolean Wildcard (T_B Boolean))
//      (CC_D (CC_F (T_A Boolean Boolean)
//                  (T_A Boolean Boolean)
//                  (T_A Boolean Boolean)
//                  (T_A Boolean Boolean))
//            Byte
//            Byte
//            (T_B (CC_F (T_A Boolean Boolean)
//                       (T_A Boolean Boolean)
//                       (T_A Boolean Boolean)
//                       (T_A Boolean Boolean))))
//      Wildcard
//      (T_A Boolean
//           (CC_F (T_A Boolean Boolean)
//                 (T_A Boolean Boolean)
//                 (T_A Boolean Boolean)
//                 (T_A Boolean Boolean))))