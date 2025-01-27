package Program_31 

package Program_13 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C]
case class CC_A[E, D, F](a: T_B[F]) extends T_A[D, E]

val v_a: T_A[Boolean, Char] = null
val v_b: Int = v_a match{
  case CC_A(_) => 0 
}
}
// This is not matched: (CC_A Char Boolean Boolean Wildcard (T_A Boolean Char))
// This is not matched: (CC_A T_A)