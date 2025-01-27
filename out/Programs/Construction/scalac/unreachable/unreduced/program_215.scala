package Program_8 

object Test {
sealed trait T_A[A]
sealed trait T_B[B, C]
case class CC_A[D](a: Boolean, b: T_A[D]) extends T_A[D]
case class CC_B[E](a: Boolean, b: T_A[E]) extends T_A[E]
case class CC_C[F](a: T_B[F, F], b: CC_B[F]) extends T_B[T_A[T_A[Byte]], F]
case class CC_D[G](a: CC_B[G], b: CC_B[G]) extends T_B[T_A[T_A[Byte]], G]

val v_a: T_B[T_A[T_A[Byte]], Byte] = null
val v_b: Int = v_a match{
  case CC_C(_, CC_B(_, _)) => 0 
  case CC_D(CC_B(_, _), _) => 1 
}
}