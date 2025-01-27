package Program_15 

package Program_0 

object Test {
sealed trait T_A[A]
sealed trait T_B[B]
case class CC_A[C, D](a: T_A[C]) extends T_A[C]
case class CC_B[E](a: E, b: T_A[E]) extends T_A[E]
case class CC_C[F](a: T_A[F], b: Char, c: T_B[F]) extends T_B[F]

val v_a: T_A[Boolean] = null
val v_b: Int = v_a match{
  case CC_A(_) => 0 
  case CC_B(_, _) => 1 
}
}
// This is not matched: (CC_A Boolean Boolean Wildcard (T_A Boolean))
// This is not matched: Pattern match is empty without constants