package Program_14 

package Program_6 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C]
case class CC_A[D]() extends T_A[D, T_B[Int]]
case class CC_B[E](a: T_B[E], b: T_A[E, E], c: E) extends T_A[E, T_B[Int]]
case class CC_C[F](a: CC_B[F], b: (Char,Int)) extends T_A[F, T_B[Int]]
case class CC_D[G, H](a: T_B[G], b: CC_A[H]) extends T_B[G]
case class CC_E(a: CC_B[Int], b: CC_C[Byte]) extends T_B[Int]

val v_a: T_B[Byte] = null
val v_b: Int = v_a match{
  case CC_D(CC_D(_, _), _) => 0 
  case CC_D(CC_D(_, _), CC_A()) => 1 
}
}
// This is not matched: (CC_D Byte Boolean Wildcard Wildcard (T_B Byte))
// This is not matched: (CC_A (CC_B Int
//            Wildcard
//            (CC_B Int
//                  Wildcard
//                  (CC_A (CC_A Wildcard Wildcard T_A)
//                        (CC_A (CC_A Wildcard Wildcard T_A) Wildcard T_A)
//                        T_A)
//                  T_A)
//            T_A)
//      Wildcard
//      T_A)