package Program_16 

object Test {
sealed trait T_A
sealed trait T_B[A, B]
case class CC_A[C](a: T_B[C, C]) extends T_A
case class CC_B() extends T_A
case class CC_C[D](a: CC_B, b: Char, c: T_A) extends T_B[T_B[D, ((Byte,Char),CC_B)], D]
case class CC_D[E]() extends T_B[T_B[E, ((Byte,Char),CC_B)], E]
case class CC_E[F](a: CC_A[F]) extends T_B[T_B[F, ((Byte,Char),CC_B)], F]

val v_a: T_B[T_B[Byte, ((Byte,Char),CC_B)], Byte] = null
val v_b: Int = v_a match{
  case CC_D() => 0 
  case CC_E(CC_A(_)) => 1 
}
}
// This is not matched: CC_C(CC_B(), _, _)