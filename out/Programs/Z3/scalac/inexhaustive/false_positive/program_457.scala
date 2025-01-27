package Program_31 

package Program_0 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C, D]
case class CC_A[E, F](a: F) extends T_A[E, F]
case class CC_B[H, G](a: H, b: G) extends T_A[H, G]
case class CC_C[I, J](a: T_A[I, J], b: T_A[I, I], c: T_A[J, I]) extends T_A[J, I]
case class CC_D[L, K, M](a: K, b: Int) extends T_B[K, L]

val v_a: T_B[Int, Char] = null
val v_b: Int = v_a match{
  case CC_D(12, 12) => 0 
  case CC_D(12, _) => 1 
  case CC_D(_, _) => 2 
}
}
// This is not matched: (CC_D Char Int Boolean Wildcard Wildcard (T_B Int Char))
// This is not matched: (CC_C (T_A (T_A Char Char) (T_A Char Char)))