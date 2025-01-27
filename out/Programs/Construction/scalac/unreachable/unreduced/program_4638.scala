package Program_12 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C]
case class CC_A[D](a: T_A[D, D], b: T_A[D, D], c: T_B[D]) extends T_A[T_B[D], D]
case class CC_B[E](a: E, b: T_A[E, E]) extends T_A[T_B[E], E]
case class CC_C[F]() extends T_B[F]
case class CC_D[G](a: T_A[G, CC_C[Int]]) extends T_B[G]

val v_a: T_B[Byte] = null
val v_b: Int = v_a match{
  case CC_C() => 0 
  case CC_D(_) => 1 
}
}