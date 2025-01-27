package Program_4 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C, D]
case class CC_A[E](a: (T_B[Char, Int],Char)) extends T_A[T_B[T_A[Boolean, Boolean], T_A[Byte, Int]], E]
case class CC_B[F](a: T_B[F, F], b: F) extends T_A[T_B[T_A[Boolean, Boolean], T_A[Byte, Int]], F]
case class CC_C(a: Char) extends T_A[T_B[T_A[Boolean, Boolean], T_A[Byte, Int]], Boolean]
case class CC_D[H, G](a: T_A[G, G]) extends T_B[G, H]
case class CC_E[I, J]() extends T_B[Byte, I]

val v_a: T_B[Byte, Boolean] = null
val v_b: Int = v_a match{
  case CC_D(_) => 0 
  case CC_E() => 1 
}
}