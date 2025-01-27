package Program_18 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C]
case class CC_A[D](a: T_B[D]) extends T_A[D, Boolean]
case class CC_B[E](a: T_A[E, E], b: T_B[T_A[E, Boolean]]) extends T_A[E, Boolean]
case class CC_C[F](a: Byte, b: Char) extends T_B[F]

val v_a: T_A[Byte, Boolean] = null
val v_b: Int = v_a match{
  case CC_A(CC_C(_, _)) => 0 
  case CC_B(_, _) => 1 
}
}