package Program_16 

object Test {
sealed trait T_A[A]
sealed trait T_B[B, C]
case class CC_A[D](a: Boolean, b: T_A[D]) extends T_A[D]
case class CC_B[E](a: T_A[E], b: E, c: CC_A[E]) extends T_A[E]
case class CC_C[F](a: T_B[Char, F], b: F) extends T_B[T_A[T_A[Int]], F]
case class CC_D[G](a: CC_C[G]) extends T_B[T_A[T_A[Int]], G]

val v_a: T_B[T_A[T_A[Int]], Char] = null
val v_b: Int = v_a match{
  case CC_C(_, _) => 0 
  case CC_D(_) => 1 
}
}