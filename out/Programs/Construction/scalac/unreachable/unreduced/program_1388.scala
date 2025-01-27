package Program_1 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C]
case class CC_A[D](a: Boolean, b: T_A[D, D]) extends T_A[D, Byte]
case class CC_B[E](a: CC_A[E]) extends T_B[E]
case class CC_C[F]() extends T_B[F]

val v_a: T_B[Char] = null
val v_b: Int = v_a match{
  case CC_B(CC_A(_, _)) => 0 
  case CC_C() => 1 
}
}