package Program_14 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C]
case class CC_A[D](a: D) extends T_A[T_B[(Byte,Char)], D]
case class CC_B[E](a: E, b: E, c: E) extends T_B[E]
case class CC_C[F](a: T_A[F, F], b: T_A[T_A[F, (Char,Byte)], F], c: T_B[F]) extends T_B[F]

val v_a: T_B[Int] = null
val v_b: Int = v_a match{
  case CC_B(_, _, _) => 0 
  case CC_C(_, _, _) => 1 
}
}