package Program_31 

package Program_1 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C, D]
case class CC_A[E, F, G](a: E, b: T_A[G, F], c: T_A[G, F]) extends T_A[E, F]
case class CC_B[H](a: T_B[H, H], b: Boolean) extends T_B[T_B[Int, Boolean], H]
case class CC_C[I](a: Boolean, b: CC_B[I]) extends T_B[T_B[Int, Boolean], I]

val v_a: T_A[Char, Int] = null
val v_b: Int = v_a match{
  case CC_A(_, CC_A(_, _, _), _) => 0 
}
}
// This is not matched: (CC_A Char Int Boolean Wildcard Wildcard Wildcard (T_A Char Int))
// This is not matched: (CC_A Boolean Wildcard (T_A Boolean))