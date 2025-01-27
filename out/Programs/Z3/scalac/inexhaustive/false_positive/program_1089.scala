package Program_30 

package Program_12 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C]
case class CC_A[E, D](a: Int, b: Boolean, c: E) extends T_A[E, D]
case class CC_B[G, F](a: T_A[G, Char], b: T_A[F, G], c: T_A[Int, Int]) extends T_A[G, F]
case class CC_C[I, H](a: Byte, b: CC_B[I, I], c: CC_A[H, H]) extends T_A[H, I]
case class CC_D[J](a: T_B[J], b: J) extends T_B[J]
case class CC_E(a: Int) extends T_B[Boolean]
case class CC_F[K](a: CC_A[K, K], b: CC_B[K, K]) extends T_B[Boolean]

val v_a: T_B[Boolean] = null
val v_b: Int = v_a match{
  case CC_E(12) => 0 
  case CC_E(_) => 1 
  case CC_D(_, _) => 2 
  case CC_D(CC_F(_, _), _) => 3 
  case CC_D(CC_D(_, _), _) => 4 
  case CC_F(CC_A(_, _, _), _) => 5 
  case CC_F(_, CC_B(_, _, _)) => 6 
  case CC_F(CC_A(_, _, _), CC_B(_, _, _)) => 7 
}
}
// This is not matched: (CC_F (CC_F (T_B (CC_D Boolean (T_A Boolean Boolean) Boolean Boolean))
//            (T_A Boolean Boolean)
//            (T_A Boolean Boolean)
//            (T_A Boolean Boolean))
//      (CC_A (CC_F (T_B (CC_D Boolean Boolean (T_A Boolean Boolean) Boolean))
//                  (T_A Boolean Boolean)
//                  (T_A Boolean Boolean)
//                  (T_A Boolean Boolean))
//            (CC_F (T_B (CC_D Boolean Boolean Boolean Boolean))
//                  Boolean
//                  Boolean
//                  Boolean)
//            Wildcard
//            Boolean
//            Wildcard
//            (T_A (CC_F (T_B (CC_D Boolean Boolean (T_A Boolean Boolean) Boolean))
//                       (T_A Boolean Boolean)
//                       (T_A Boolean Boolean)
//                       (T_A Boolean Boolean))
//                 (CC_F (T_B (CC_D Boolean Boolean Boolean Boolean))
//                       Boolean
//                       Boolean
//                       Boolean)))
//      Wildcard
//      (T_B Boolean))
// This is not matched: (CC_B Wildcard Wildcard Wildcard (T_A (T_A Int)))