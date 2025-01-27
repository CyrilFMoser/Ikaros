package Program_1 

object Test {
sealed trait T_A[A]
sealed trait T_B[B, C]
case class CC_A[D](a: T_A[D]) extends T_A[D]
case class CC_B[E]() extends T_B[E, T_A[E]]
case class CC_C[F](a: T_B[F, CC_B[F]], b: T_A[F]) extends T_B[F, T_A[F]]
case class CC_D[G](a: CC_B[G]) extends T_B[G, T_A[G]]

val v_a: T_B[Boolean, T_A[Boolean]] = null
val v_b: Int = v_a match{
  case CC_B() => 0 
  case CC_C(_, _) => 1 
}
}
// This is not matched: CC_D(CC_B())