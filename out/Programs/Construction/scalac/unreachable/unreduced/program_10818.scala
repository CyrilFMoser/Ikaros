package Program_27 

object Test {
sealed trait T_A[A]
sealed trait T_B[B, C]
case class CC_A(a: Int, b: T_A[Char]) extends T_A[Boolean]
case class CC_B[D](a: T_B[D, D]) extends T_A[D]
case class CC_C[E](a: E) extends T_A[E]
case class CC_D[F]() extends T_B[T_A[F], F]

val v_a: T_A[Byte] = null
val v_b: Int = v_a match{
  case CC_B(_) => 0 
  case CC_C(_) => 1 
}
}