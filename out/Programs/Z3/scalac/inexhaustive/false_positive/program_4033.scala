package Program_15 

package Program_12 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C]
case class CC_A[E, D, F](a: T_A[F, F]) extends T_A[E, D]
case class CC_B[G](a: T_A[G, G]) extends T_A[CC_A[Boolean, Char, Int], G]

val v_a: T_A[Int, Boolean] = null
val v_b: Int = v_a match{
  case CC_A(_) => 0 
  case CC_A(CC_A(_)) => 1 
}
}
// This is not matched: (CC_A Int Boolean Boolean Wildcard (T_A Int Boolean))
// This is not matched: (CC_A (CC_B T_A) Wildcard Wildcard T_A)