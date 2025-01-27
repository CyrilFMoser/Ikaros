package Program_23 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C]
case class CC_A[D](a: T_A[D, D], b: D) extends T_A[Char, D]
case class CC_B[E](a: T_A[Char, E], b: T_A[Char, CC_A[Char]]) extends T_B[E]
case class CC_C[F](a: CC_B[F], b: T_A[Char, F]) extends T_B[F]
case class CC_D[G](a: Char, b: T_A[G, G]) extends T_B[G]

val v_a: T_B[Int] = null
val v_b: Int = v_a match{
  case CC_B(_, _) => 0 
  case CC_D(_, _) => 1 
}
}
// This is not matched: CC_C(CC_B(CC_A(_, _), CC_A(_, _)), _)