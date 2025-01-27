package Program_2 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C, D]
case class CC_A[E](a: T_B[E, E], b: T_A[T_B[E, E], E], c: Int) extends T_A[E, T_B[E, T_B[E, E]]]
case class CC_B[F](a: Boolean, b: Boolean, c: F) extends T_A[F, T_B[F, T_B[F, F]]]

val v_a: T_A[Boolean, T_B[Boolean, T_B[Boolean, Boolean]]] = null
val v_b: Int = v_a match{
  case CC_A(_, _, _) => 0 
  case CC_B(_, _, _) => 1 
}
}