package Program_31 

package Program_11 

object Test {
sealed trait T_A[A, B]
case class CC_A[C, D, E](a: T_A[E, E], b: Byte) extends T_A[D, C]
case class CC_B[F](a: Int, b: T_A[F, F], c: T_A[F, F]) extends T_A[T_A[F, F], F]
case class CC_C(a: T_A[Boolean, Int], b: CC_B[Byte]) extends T_A[T_A[CC_A[Boolean, Boolean, Byte], CC_A[Boolean, Boolean, Byte]], CC_A[Boolean, Boolean, Byte]]

val v_a: T_A[CC_C, CC_C] = null
val v_b: Int = v_a match{
  case CC_A(_, _) => 0 
}
}
// This is not matched: (CC_A (CC_C (T_A Boolean Boolean) (T_A Boolean Boolean) (T_A Boolean Boolean))
//      (CC_C (T_A Boolean Boolean)
//            (T_A (T_A Boolean Boolean) Boolean)
//            (T_A Boolean Boolean))
//      Boolean
//      Wildcard
//      Wildcard
//      (T_A (CC_C (T_A Boolean Boolean)
//                 (T_A (T_A Boolean Boolean) Boolean)
//                 (T_A Boolean Boolean))
//           (CC_C (T_A Boolean Boolean)
//                 (T_A Boolean Boolean)
//                 (T_A Boolean Boolean))))
// This is not matched: Pattern match is empty without constants