package Program_4 

object Test {
sealed trait T_A[A]
sealed trait T_B[B, C]
case class CC_A[D](a: T_B[Boolean, D], b: (T_B[Char, Char],T_A[Char])) extends T_A[D]
case class CC_B[E](a: CC_A[E]) extends T_A[E]
case class CC_C[F](a: CC_B[F], b: Int) extends T_A[F]
case class CC_D[G](a: T_A[G]) extends T_B[CC_A[CC_C[Int]], G]

val v_a: T_A[Boolean] = null
val v_b: Int = v_a match{
  case CC_B(CC_A(_, _)) => 0 
  case CC_C(_, _) => 1 
}
}
// This is not matched: CC_A(_, _)