package Program_23 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C, D]
case class CC_A[E]() extends T_A[E, T_A[E, E]]
case class CC_B[F](a: T_B[F, F], b: CC_A[F]) extends T_A[F, T_A[F, F]]
case class CC_C[G](a: T_B[G, CC_A[Boolean]], b: CC_A[G]) extends T_B[G, CC_A[Boolean]]

val v_a: T_A[Int, T_A[Int, Int]] = null
val v_b: Int = v_a match{
  case CC_A() => 0 
  case CC_B(_, CC_A()) => 1 
}
}