package Program_12 

package Program_4 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C, D]
case class CC_A[E, F](a: T_A[E, E], b: T_B[F, E], c: T_A[E, F]) extends T_A[E, T_B[Int, Char]]

val v_a: T_A[Char, T_B[Int, Char]] = null
val v_b: Int = v_a match{
  case CC_A(_, _, CC_A(_, _, _)) => 0 
}
}
// This is not matched: (CC_A Char Boolean Wildcard Wildcard Wildcard (T_A Char (T_B Int Char)))
// This is not matched: (CC_E T_B)