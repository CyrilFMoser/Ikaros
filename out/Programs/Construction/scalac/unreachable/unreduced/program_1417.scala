package Program_17 

object Test {
sealed trait T_A[A]
sealed trait T_B[B, C]
case class CC_A[D]() extends T_A[D]
case class CC_B[E](a: T_B[E, E], b: Int, c: T_A[E]) extends T_A[E]
case class CC_C[F]() extends T_A[F]
case class CC_D[G]() extends T_B[G, CC_C[Int]]

val v_a: T_A[Boolean] = null
val v_b: Int = v_a match{
  case CC_B(_, _, _) => 0 
  case CC_C() => 1 
}
}
// This is not matched: CC_A()