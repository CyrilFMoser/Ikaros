package Program_16 

object Test {
sealed trait T_A[A]
sealed trait T_B[B, C]
case class CC_A[D](a: T_B[D, D]) extends T_A[D]
case class CC_B[E](a: E, b: T_A[E]) extends T_A[E]
case class CC_C[F](a: T_A[F], b: F) extends T_B[T_B[T_B[Byte, Byte], T_A[Char]], F]

val v_a: T_A[Char] = null
val v_b: Int = v_a match{
  case CC_A(_) => 0 
  case CC_B(_, _) => 1 
}
}