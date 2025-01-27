package Program_18 

object Test {
sealed trait T_A
sealed trait T_B[A, B]
case class CC_A[C](a: Boolean, b: T_B[T_A, C]) extends T_A
case class CC_B() extends T_A
case class CC_C() extends T_A
case class CC_D[D](a: CC_B) extends T_B[T_B[T_A, T_A], D]
case class CC_E[E](a: CC_A[E], b: CC_D[E], c: T_B[T_B[T_A, T_A], E]) extends T_B[T_B[T_A, T_A], E]
case class CC_F[F](a: F, b: Byte) extends T_B[T_B[T_A, T_A], F]

val v_a: T_A = null
val v_b: Int = v_a match{
  case CC_A(_, _) => 0 
  case CC_B() => 1 
  case CC_C() => 2 
}
}