package Program_31 

object Test {
sealed trait T_A[A, B]
sealed trait T_B
case class CC_A[C, D]() extends T_A[C, D]
case class CC_B[F, E](a: CC_A[E, F], b: T_A[E, F], c: CC_A[T_A[F, F], F]) extends T_A[E, F]

val v_a: T_A[Int, Int] = null
val v_b: Int = v_a match{
  case CC_B(_, _, _) => 0 
}
}
// This is not matched: CC_A()