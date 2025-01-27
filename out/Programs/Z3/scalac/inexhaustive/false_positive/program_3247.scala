package Program_13 

package Program_11 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C]
case class CC_A[E, D, F](a: T_A[F, F], b: Boolean) extends T_A[E, D]
case class CC_B[G, H](a: CC_A[H, G, H], b: T_A[H, Byte], c: T_A[H, Boolean]) extends T_A[H, G]
case class CC_C[I]() extends T_A[T_A[I, I], I]
case class CC_D[J](a: CC_B[Int, J]) extends T_B[J]
case class CC_E[K]() extends T_B[K]
case class CC_F() extends T_B[T_B[Char]]

val v_a: CC_A[Boolean, Char, Int] = null
val v_b: Int = v_a match{
  case CC_A(CC_A(_, _), _) => 0 
}
}
// This is not matched: (CC_A Boolean
//      Char
//      Int
//      (CC_B Int Int Wildcard Wildcard Wildcard (T_A Int Int))
//      Wildcard
//      (T_A Boolean Char))
// This is not matched: (CC_A (T_A Boolean) Wildcard (CC_B (T_A Boolean)) (T_A (T_A Boolean)))