package Program_31 

package Program_8 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C, D]
case class CC_A[E, F](a: T_A[F, F], b: T_B[F, F], c: T_B[E, F]) extends T_A[F, E]
case class CC_B[G]() extends T_A[G, CC_A[G, G]]
case class CC_C[I, H](a: H, b: T_B[H, H], c: Int) extends T_B[I, H]
case class CC_D[K, J, L](a: Int) extends T_B[J, K]
case class CC_E(a: CC_B[Boolean], b: CC_B[Int]) extends T_B[T_A[Char, Char], T_B[Int, Byte]]

val v_a: CC_C[Boolean, Boolean] = null
val v_b: Int = v_a match{
  case CC_C(_, CC_D(_), _) => 0 
  case CC_C(_, _, 12) => 1 
  case CC_C(_, CC_C(_, _, _), _) => 2 
}
}
// This is not matched: (CC_C Boolean
//      Boolean
//      Wildcard
//      (CC_D Boolean Boolean Boolean Wildcard (T_B Boolean Boolean))
//      Wildcard
//      (T_B Boolean Boolean))
// This is not matched: (CC_E Byte Wildcard Byte (T_B Byte (T_A (CC_D Boolean Boolean Boolean))))