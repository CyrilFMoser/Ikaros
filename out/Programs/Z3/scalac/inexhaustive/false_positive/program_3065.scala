package Program_13 

package Program_7 

object Test {
sealed trait T_A[A]
sealed trait T_B[B, C]
case class CC_A[D](a: T_B[Byte, D], b: T_A[D]) extends T_A[D]
case class CC_B[E, F](a: CC_A[E]) extends T_B[CC_A[Boolean], E]

val v_a: T_B[CC_A[Boolean], Char] = null
val v_b: Int = v_a match{
  case CC_B(CC_A(_, _)) => 0 
}
}
// This is not matched: (CC_B Char Boolean Wildcard (T_B (CC_A Boolean Boolean Boolean Boolean) Char))
// This is not matched: Pattern match is empty without constants