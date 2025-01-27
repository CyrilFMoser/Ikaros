package Program_31 

package Program_10 

object Test {
sealed trait T_A[A]
sealed trait T_B[B, C]
case class CC_A(a: T_A[Char], b: T_A[Boolean], c: Byte) extends T_A[T_B[Char, Boolean]]
case class CC_B[E, D, F](a: E, b: (CC_A,CC_A), c: T_B[F, D]) extends T_B[D, E]
case class CC_C[G](a: T_B[G, G], b: CC_A) extends T_B[G, CC_B[CC_A, Byte, (Int,Boolean)]]

val v_a: T_A[T_B[Char, Boolean]] = null
val v_b: Int = v_a match{
  case CC_A(_, _, 0) => 0 
}
}
// This is not matched: Pattern match is empty without constants
// This is not matched: (CC_D Byte Byte (T_B Byte Byte))