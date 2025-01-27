package Program_15 

package Program_2 

object Test {
sealed trait T_A
sealed trait T_B[A, B]
case class CC_A[C](a: T_A, b: C) extends T_A
case class CC_B[D, E](a: CC_A[D], b: T_A) extends T_B[D, E]
case class CC_C[F, G](a: T_B[G, F]) extends T_B[F, G]
case class CC_D[H, I]() extends T_B[T_B[Char, T_A], H]

val v_a: T_A = null
val v_b: Int = v_a match{
  case CC_A(_, _) => 0 
}
}
// This is not matched: (CC_A T_A Wildcard Wildcard T_A)
// This is not matched: Pattern match is empty without constants