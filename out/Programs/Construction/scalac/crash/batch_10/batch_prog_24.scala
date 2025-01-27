package Program_24 

object Test {
sealed trait T_A[A, B]
sealed trait T_B
case class CC_A[D, C]() extends T_A[C, D]
case class CC_B[E](a: T_A[E, E]) extends T_A[E, T_B]
case class CC_C[F](a: T_A[F, F], b: T_A[F, F], c: Int) extends T_A[F, T_B]
case class CC_D(a: Char, b: Byte, c: Boolean) extends T_B
case class CC_E() extends T_B

val v_a: CC_C[Char] = null
val v_b: Int = v_a match{
  case CC_C(CC_A(), CC_A(), 12) => 0 
  case CC_C(CC_A(), CC_A(), _) => 1 
}
}