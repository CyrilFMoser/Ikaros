package Program_23 

object Test {
sealed trait T_A[A]
sealed trait T_B[B, C]
case class CC_A(a: T_B[T_A[Char], T_B[Char, Boolean]], b: Char, c: T_A[T_A[Char]]) extends T_A[Char]
case class CC_B[E, D](a: T_A[D], b: T_A[E]) extends T_B[D, E]
case class CC_C[F, G](a: T_A[F]) extends T_B[F, G]
case class CC_D[I, H]() extends T_B[H, I]

val v_a: T_B[Char, CC_A] = null
val v_b: Int = v_a match{
  case CC_B(CC_A(_, _, _), _) => 0 
  case CC_C(_) => 1 
  case CC_D() => 2 
}
}