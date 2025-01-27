package Program_20 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C, D]
case class CC_A[F, E](a: T_B[T_B[E, E], F]) extends T_A[F, E]
case class CC_B[G](a: G) extends T_A[G, CC_A[G, G]]
case class CC_C[H](a: H, b: T_B[H, Int]) extends T_B[H, Int]

val v_a: T_A[Int, CC_A[Int, Int]] = null
val v_b: Int = v_a match{
  case CC_A(CC_C(_, _)) => 0 
  case CC_B(_) => 1 
}
}