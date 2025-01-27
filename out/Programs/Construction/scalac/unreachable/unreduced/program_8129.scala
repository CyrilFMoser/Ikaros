package Program_1 

object Test {
sealed trait T_A[A]
sealed trait T_B[B, C]
case class CC_A[D](a: D) extends T_A[D]
case class CC_B[E](a: T_B[E, E], b: CC_A[E]) extends T_A[E]
case class CC_C[F](a: Boolean) extends T_B[CC_A[T_A[Char]], F]

val v_a: T_A[Byte] = null
val v_b: Int = v_a match{
  case CC_A(_) => 0 
  case CC_B(_, CC_A(_)) => 1 
}
}