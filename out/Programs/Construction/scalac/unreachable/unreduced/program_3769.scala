package Program_4 

object Test {
sealed trait T_A[A]
sealed trait T_B[B, C]
case class CC_A[D](a: Int) extends T_A[D]
case class CC_B[E](a: T_B[E, E], b: CC_A[T_A[E]]) extends T_B[E, T_A[E]]
case class CC_C[F]() extends T_B[F, T_A[F]]
case class CC_D[G](a: Boolean) extends T_B[G, T_A[G]]

val v_a: T_B[Byte, T_A[Byte]] = null
val v_b: Int = v_a match{
  case CC_B(_, _) => 0 
  case CC_D(_) => 1 
}
}
// This is not matched: CC_C()