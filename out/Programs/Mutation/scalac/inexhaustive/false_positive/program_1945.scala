package Program_30 

package Program_1 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C, D]
case class CC_A[F, E, G](a: G, b: T_A[F, F]) extends T_A[E, F]
case class CC_B[H, I]() extends T_B[I, H]
case class CC_C[K, J, L](a: L, b: T_A[L, Byte], c: CC_B[J, J]) extends T_B[J, K]

val v_a: T_B[Int, Char] = null
val v_b: Int = v_a match{
  case CC_B() => 0 
  case CC_C(_, _, _) => 1 
}
}
// This is not matched: (CC_C Char
//      Int
//      Boolean
//      Wildcard
//      Wildcard
//      (CC_B Int Int (T_B Int Int))
//      (T_B Int Char))
// This is not matched: (CC_B (CC_B Wildcard (T_A Byte)) (T_A Byte))
// Mutation information: 
// Changing a Wildcard in 0 at pattern position 4 to a constant expression:
// {
//  0
// }
//