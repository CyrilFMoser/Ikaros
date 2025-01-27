package Program_27 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C]
case class CC_A[D](a: T_A[D, D]) extends T_A[D, T_B[T_B[Byte]]]
case class CC_B[E](a: CC_A[E]) extends T_A[E, T_B[T_B[Byte]]]
case class CC_C() extends T_B[T_A[Byte, Boolean]]
case class CC_D[F](a: CC_B[CC_A[CC_C]]) extends T_B[F]
case class CC_E(a: Char, b: CC_B[Byte]) extends T_B[T_A[Byte, Boolean]]

val v_a: T_B[T_A[Byte, Boolean]] = null
val v_b: Int = v_a match{
  case CC_C() => 0 
  case CC_E('x', CC_B(CC_A(_))) => 1 
  case CC_E(_, CC_B(CC_A(_))) => 2 
}
}
// This is not matched: CC_D(CC_B(CC_A(_)))