package Program_15 

package Program_0 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C]
case class CC_A[D](a: T_B[Int]) extends T_A[D, T_B[D]]
case class CC_B[E](a: CC_A[E], b: T_B[E], c: T_B[E]) extends T_A[E, T_B[E]]
case class CC_C[F, G](a: G, b: CC_A[Int]) extends T_B[F]

val v_a: CC_C[Int, Char] = null
val v_b: Int = v_a match{
  case CC_C('x', CC_A(_)) => 0 
  case CC_C('x', _) => 1 
}
}
// This is not matched: Pattern match is empty without constants
// This is not matched: (CC_B Wildcard T_A)