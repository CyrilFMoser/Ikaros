package Program_9 

package Program_10 

object Test {
sealed trait T_A[A]
sealed trait T_B[B, C]
case class CC_A[D](a: Byte, b: T_A[Boolean], c: T_B[D, D]) extends T_A[D]
case class CC_B[E, F](a: T_A[F], b: T_A[F]) extends T_A[E]
case class CC_C[G](a: T_A[G], b: G, c: Boolean) extends T_A[G]
case class CC_D[I, H](a: Char, b: T_A[Char]) extends T_B[H, I]
case class CC_E[J]() extends T_B[CC_B[Byte, Char], J]
case class CC_F(a: CC_E[Int], b: T_A[Boolean], c: Int) extends T_B[CC_B[Byte, Char], Char]

val v_a: CC_C[Char] = null
val v_b: Int = v_a match{
  case CC_C(CC_A(_, _, _), 'x', _) => 0 
  case CC_C(CC_A(_, _, _), _, _) => 1 
}
}
// This is not matched: (CC_C Char
//      (CC_C Char Wildcard Wildcard Wildcard (T_A Char))
//      Wildcard
//      Wildcard
//      (T_A Char))
// This is not matched: (CC_A T_A Wildcard Wildcard Wildcard T_A)