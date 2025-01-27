package Program_31 

package Program_5 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C, D]
case class CC_A[E, F, G](a: T_A[Boolean, E]) extends T_A[F, E]

val v_a: T_A[Char, Int] = null
val v_b: Int = v_a match{
  case CC_A(_) => 0 
}
}
// This is not matched: (CC_A Int Char Boolean Wildcard (T_A Char Int))
// This is not matched: (CC_D (CC_B Wildcard T_A)
//      (CC_B Wildcard T_A)
//      (T_B (Tuple T_A T_A) (CC_B Wildcard T_A)))