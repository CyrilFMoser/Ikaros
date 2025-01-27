package Program_13 

package Program_9 

object Test {
sealed trait T_A[A]
sealed trait T_B[B, C]
case class CC_A[D, E](a: T_A[E], b: T_B[E, D]) extends T_A[D]
case class CC_B[G, F](a: T_A[G], b: T_B[F, F], c: T_B[F, F]) extends T_B[F, G]

val v_a: T_A[Int] = null
val v_b: Int = v_a match{
  case CC_A(_, _) => 0 
  case CC_A(CC_A(_, _), _) => 1 
}
}
// This is not matched: (CC_A Int Boolean Wildcard Wildcard (T_A Int))
// This is not matched: (CC_A T_A)