package Program_8 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C]
case class CC_A(a: T_A[Boolean, T_A[Byte, Byte]]) extends T_A[Char, T_B[T_B[Boolean]]]
case class CC_B[D](a: Char) extends T_A[Char, T_B[T_B[Boolean]]]
case class CC_C[E](a: E, b: T_B[E]) extends T_B[E]
case class CC_D[F](a: F, b: T_A[F, F]) extends T_B[F]

val v_a: T_B[Byte] = null
val v_b: Int = v_a match{
  case CC_C(_, CC_C(_, CC_C(_, _))) => 0 
  case CC_C(_, CC_C(_, CC_D(_, _))) => 1 
  case CC_C(_, CC_D(_, _)) => 2 
  case CC_D(_, _) => 3 
}
}