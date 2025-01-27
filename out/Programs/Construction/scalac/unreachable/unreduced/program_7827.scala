package Program_10 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C]
case class CC_A[D](a: T_B[D]) extends T_A[D, T_A[T_B[Boolean], T_B[Int]]]
case class CC_B[E]() extends T_B[E]
case class CC_C[F](a: T_A[F, F], b: CC_B[F]) extends T_B[F]
case class CC_D() extends T_B[Boolean]

val v_a: T_B[CC_D] = null
val v_b: Int = v_a match{
  case CC_B() => 0 
  case CC_C(_, _) => 1 
}
}