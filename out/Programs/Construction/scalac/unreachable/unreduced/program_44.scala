package Program_25 

object Test {
sealed trait T_A[A]
sealed trait T_B[B, C]
case class CC_A(a: Boolean, b: T_A[T_A[Char]]) extends T_A[(T_A[Byte],T_B[Byte, Boolean])]
case class CC_B[E, D](a: E, b: CC_A) extends T_B[D, E]
case class CC_C[F, G](a: CC_B[T_B[F, F], G], b: CC_B[F, G]) extends T_B[G, F]

val v_a: T_B[Char, Byte] = null
val v_b: Int = v_a match{
  case CC_B(0, CC_A(_, _)) => 0 
  case CC_B(_, CC_A(_, _)) => 1 
  case CC_C(_, CC_B(_, _)) => 2 
}
}