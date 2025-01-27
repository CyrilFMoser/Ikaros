package Program_25 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C, D]
case class CC_A[E](a: T_A[E, E], b: Int, c: T_A[E, E]) extends T_A[Boolean, E]
case class CC_B[F](a: F) extends T_A[Boolean, F]
case class CC_C[G](a: Int) extends T_B[G, T_A[Boolean, G]]
case class CC_D[I, H]() extends T_B[H, I]

val v_a: T_A[Boolean, Char] = null
val v_b: Int = v_a match{
  case CC_A(_, _, _) => 0 
  case CC_B(_) => 1 
}
}