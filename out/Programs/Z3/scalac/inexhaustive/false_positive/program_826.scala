package Program_31 

package Program_2 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C]
case class CC_A[D](a: (Int,Int), b: T_A[D, D], c: T_A[D, D]) extends T_A[D, T_B[Byte]]
case class CC_B[E]() extends T_A[E, T_B[Byte]]
case class CC_C[F, G](a: T_A[F, F]) extends T_A[F, T_A[Byte, F]]
case class CC_D[H](a: H, b: Char, c: H) extends T_B[H]
case class CC_E[I]() extends T_B[I]

val v_a: T_A[Char, T_A[Byte, Char]] = null
val v_b: Int = v_a match{
  case CC_C(_) => 0 
}
}
// This is not matched: (CC_C Char Boolean Wildcard (T_A Char (T_A Byte Char)))
// This is not matched: Pattern match is empty without constants