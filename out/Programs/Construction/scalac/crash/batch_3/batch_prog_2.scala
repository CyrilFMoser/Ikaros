package Program_2 

object Test {
sealed trait T_A[A]
sealed trait T_B[B]
case class CC_A[C](a: T_A[C], b: Byte) extends T_A[C]
case class CC_B[D]() extends T_A[D]
case class CC_C[E]() extends T_A[E]
case class CC_D[F](a: F, b: T_A[T_A[F]]) extends T_B[F]
case class CC_E[G]() extends T_B[G]
case class CC_F() extends T_B[(T_B[Char],CC_A[Byte])]

val v_a: T_A[Byte] = null
val v_b: Int = v_a match{
  case CC_A(_, _) => 0 
  case CC_C() => 1 
}
}
// This is not matched: CC_B()