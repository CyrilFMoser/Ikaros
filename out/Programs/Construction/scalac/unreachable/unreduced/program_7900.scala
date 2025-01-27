package Program_0 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C]
case class CC_A[D]() extends T_A[Int, D]
case class CC_B[E](a: T_A[E, E]) extends T_A[Int, E]
case class CC_C(a: T_A[Int, T_A[Char, Int]]) extends T_A[Int, CC_B[Byte]]
case class CC_D[F](a: T_B[F], b: F) extends T_B[F]
case class CC_E[G](a: G, b: G, c: G) extends T_B[G]
case class CC_F[H]() extends T_B[H]

val v_a: CC_C = null
val v_b: Int = v_a match{
  case CC_C(CC_A()) => 0 
  case CC_C(CC_B(_)) => 1 
}
}