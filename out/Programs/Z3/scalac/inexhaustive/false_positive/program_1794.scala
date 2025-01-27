package Program_31 

package Program_4 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C]
case class CC_A[D, E]() extends T_A[D, T_B[D]]
case class CC_B[F](a: T_A[F, F], b: CC_A[F, F]) extends T_A[CC_A[Boolean, Char], F]
case class CC_C[G](a: CC_A[Byte, G]) extends T_B[G]

val v_a: T_A[Char, T_B[Char]] = null
val v_b: Int = v_a match{
  case CC_A() => 0 
}
}
// This is not matched: (CC_A Char Boolean (T_A Char (T_B Char)))
// This is not matched: Pattern match is empty without constants