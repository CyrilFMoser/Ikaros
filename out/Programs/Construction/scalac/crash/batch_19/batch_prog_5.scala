package Program_5 

object Test {
sealed trait T_A[A]
sealed trait T_B[B]
case class CC_A(a: T_A[Byte]) extends T_A[Byte]
case class CC_B(a: T_A[T_B[Char]], b: T_A[CC_A]) extends T_A[T_B[Char]]
case class CC_C[C](a: T_A[C], b: C, c: T_B[C]) extends T_A[C]
case class CC_D[D, E](a: D) extends T_B[D]
case class CC_E[F](a: T_B[F], b: T_B[F]) extends T_B[F]

val v_a: CC_C[CC_B] = null
val v_b: Int = v_a match{
  case CC_C(_, CC_B(_, _), _) => 0 
}
}