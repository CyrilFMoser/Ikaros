package Program_6 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C]
case class CC_A[D](a: T_B[D], b: D, c: D) extends T_A[D, T_A[T_A[Char, Char], T_A[Int, Int]]]
case class CC_B[E](a: CC_A[E], b: T_A[E, E]) extends T_B[E]
case class CC_C[F]() extends T_B[F]
case class CC_D[G](a: G) extends T_B[G]

val v_a: T_B[Int] = null
val v_b: Int = v_a match{
  case CC_B(_, _) => 0 
  case CC_C() => 1 
}
}
// This is not matched: CC_D(_)