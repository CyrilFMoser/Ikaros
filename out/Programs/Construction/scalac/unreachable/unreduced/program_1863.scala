package Program_3 

object Test {
sealed trait T_A[A]
sealed trait T_B[B, C]
case class CC_A(a: T_B[Char, Byte], b: T_B[T_B[Boolean, Byte], T_B[Char, Int]]) extends T_A[Char]
case class CC_B[D]() extends T_A[Char]
case class CC_C() extends T_A[Char]
case class CC_D[E]() extends T_B[T_A[E], E]
case class CC_E[F](a: Int, b: F, c: T_B[F, F]) extends T_B[(T_A[Char],CC_C), F]
case class CC_F[G]() extends T_B[(T_A[Char],CC_C), G]

val v_a: T_A[Char] = null
val v_b: Int = v_a match{
  case CC_A(_, _) => 0 
  case CC_C() => 1 
}
}
// This is not matched: CC_B()