package Program_31 

package Program_8 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C, D]
case class CC_A[F, E](a: E, b: T_A[E, F]) extends T_A[E, F]
case class CC_B[G, H, I]() extends T_B[H, G]

val v_a: T_B[Boolean, Boolean] = null
val v_b: Int = v_a match{
  case CC_B() => 0 
}
}
// This is not matched: (CC_B Boolean Boolean Boolean (T_B Boolean Boolean))
// This is not matched: (CC_B Char Wildcard (T_A Char))