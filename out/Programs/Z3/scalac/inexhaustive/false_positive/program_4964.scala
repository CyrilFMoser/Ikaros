package Program_15 

package Program_0 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C]
case class CC_A[E, D, F](a: Int, b: T_B[E], c: E) extends T_A[D, E]
case class CC_B[G, H](a: CC_A[H, G, Byte], b: H, c: G) extends T_A[G, H]
case class CC_C[I](a: T_A[I, I]) extends T_B[I]
case class CC_D(a: Byte, b: CC_C[Char], c: CC_A[Char, Boolean, Byte]) extends T_B[T_A[Boolean, (Int,Byte)]]

val v_a: T_B[T_B[T_A[Boolean, (Int,Byte)]]] = null
val v_b: Int = v_a match{
  case CC_C(CC_A(_, _, _)) => 0 
  case CC_C(CC_B(_, _, _)) => 1 
}
}
// This is not matched: (CC_C (T_B (T_A Boolean (Tuple Int Byte)))
//      (CC_A (T_B (T_A Boolean (Tuple Int Byte)))
//            (T_B (T_A Boolean (Tuple Int Byte)))
//            Boolean
//            Wildcard
//            Wildcard
//            Wildcard
//            (T_A (T_B (T_A Boolean (Tuple Int Byte)))
//                 (T_B (T_A Boolean (Tuple Int Byte)))))
//      (T_B (T_B (T_A Boolean (Tuple Int Byte)))))
// This is not matched: (CC_B Wildcard Wildcard Wildcard (T_A (T_A Char)))