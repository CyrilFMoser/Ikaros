package Program_14 

object Test {
sealed trait T_A[A, B]
sealed trait T_B
case class CC_B[E, F](a: T_B, b: T_A[F, F]) extends T_A[E, F]
case class CC_C[G, H]() extends T_A[H, G]

val v_a: CC_B[Char, Char] = null
val v_b: Int = v_a match{
  case CC_B(_, CC_C()) => 0 
}
}
// This is not matched: (CC_A Char Int Boolean Wildcard Wildcard (T_A Int Char))