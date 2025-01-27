package Program_24 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C]
case class CC_A[D, E](a: Boolean, b: T_B[E]) extends T_A[E, D]
case class CC_B[F]() extends T_A[F, Byte]
case class CC_C(a: Boolean, b: Boolean, c: T_A[T_A[Byte, Boolean], Byte]) extends T_B[T_A[Char, Byte]]

val v_a: T_B[T_A[Char, Byte]] = null
val v_b: Int = v_a match{
  case CC_C(_, _, CC_A(_, _)) => 0 
  case CC_C(_, _, CC_B()) => 1 
}
}