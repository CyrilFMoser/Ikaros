package Program_0 

object Test {
sealed trait T_A[A]
sealed trait T_B[B, C]
case class CC_A[D](a: T_B[D, T_A[Int]], b: T_A[D]) extends T_A[D]
case class CC_B[E]() extends T_B[CC_A[Boolean], E]
case class CC_C[F](a: Int, b: CC_A[F], c: T_B[CC_A[Boolean], F]) extends T_B[CC_A[Boolean], F]
case class CC_D[G](a: T_B[CC_A[Boolean], G], b: T_B[G, G], c: G) extends T_B[CC_A[Boolean], G]

val v_a: T_B[CC_A[Boolean], Int] = null
val v_b: Int = v_a match{
  case CC_B() => 0 
  case CC_C(_, _, _) => 1 
  case CC_D(_, _, _) => 2 
}
}