package Program_31 

package Program_5 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C, D]
case class CC_A[E](a: T_A[E, E], b: T_A[E, E], c: T_B[E, E]) extends T_A[E, T_A[E, E]]
case class CC_B[F, G](a: F, b: Char) extends T_A[F, T_A[F, F]]

val v_a: T_A[Int, T_A[Int, Int]] = null
val v_b: Int = v_a match{
  case CC_B(_, 'x') => 0 
  case CC_B(12, 'x') => 1 
  case CC_B(_, _) => 2 
  case CC_A(_, _, _) => 3 
}
}
// This is not matched: (CC_B Int Boolean Wildcard Char (T_A Int (T_A Int Int)))
// This is not matched: (CC_B Wildcard Wildcard T_A)