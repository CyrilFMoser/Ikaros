package Program_30 

object Test {
sealed trait T_A[A]
sealed trait T_B[B, C]
case class CC_A[D](a: T_B[D, D]) extends T_A[D]
case class CC_B[E](a: E, b: T_A[E], c: T_B[E, E]) extends T_A[E]
case class CC_C[F](a: Boolean) extends T_A[F]
case class CC_D[G](a: (T_A[Boolean],T_A[Int]), b: CC_B[G]) extends T_B[G, T_A[CC_C[G]]]

val v_a: T_A[Int] = null
val v_b: Int = v_a match{
  case CC_B(_, _, _) => 0 
  case CC_C(_) => 1 
}
}
// This is not matched: CC_A(_)