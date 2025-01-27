package Program_30 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C, D]
case class CC_A[E](a: E, b: T_A[E, E]) extends T_A[E, T_B[Char, Byte]]
case class CC_B[F, G](a: CC_A[F]) extends T_B[G, F]

val v_a: T_B[Boolean, Char] = null
val v_b: Int = v_a match{
  case CC_B(CC_A('x', _)) => 0 
}
}
// This is not matched: Pattern match is empty without constants