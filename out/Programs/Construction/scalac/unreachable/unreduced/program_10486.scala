package Program_17 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C, D]
case class CC_A[E](a: T_A[T_A[E, Byte], T_B[E, E]]) extends T_A[E, T_A[E, E]]
case class CC_B[F]() extends T_A[F, T_A[F, F]]
case class CC_C[G, H](a: T_A[H, T_A[H, H]]) extends T_B[G, H]
case class CC_D[I](a: Boolean) extends T_B[I, Int]

val v_a: T_B[Boolean, Int] = null
val v_b: Int = v_a match{
  case CC_C(CC_A(_)) => 0 
  case CC_C(CC_B()) => 1 
  case CC_D(_) => 2 
}
}