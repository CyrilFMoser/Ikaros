package Program_10 

object Test {
sealed trait T_A[A]
sealed trait T_B[B, C]
case class CC_A() extends T_A[Boolean]
case class CC_B[D]() extends T_A[D]
case class CC_C() extends T_A[Boolean]
case class CC_D[E]() extends T_B[T_A[(CC_A,CC_C)], E]
case class CC_E[F](a: T_B[F, F]) extends T_B[T_A[(CC_A,CC_C)], F]
case class CC_F(a: (T_A[CC_C],Byte), b: Char, c: Int) extends T_B[T_A[(CC_A,CC_C)], CC_A]

val v_a: T_B[T_A[(CC_A,CC_C)], CC_A] = null
val v_b: Int = v_a match{
  case CC_D() => 0 
  case CC_E(_) => 1 
}
}
// This is not matched: CC_F(_, _, _)