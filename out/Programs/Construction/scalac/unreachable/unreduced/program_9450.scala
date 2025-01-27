package Program_19 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C]
case class CC_A[D](a: T_B[D], b: D) extends T_A[T_A[T_A[Byte, Byte], T_B[Int]], D]
case class CC_B(a: T_A[Char, Byte]) extends T_A[T_A[T_A[Byte, Byte], T_B[Int]], Boolean]
case class CC_C[E]() extends T_A[T_A[T_A[Byte, Byte], T_B[Int]], E]
case class CC_D[F](a: Char) extends T_B[F]

val v_a: T_A[T_A[T_A[Byte, Byte], T_B[Int]], Boolean] = null
val v_b: Int = v_a match{
  case CC_A(CC_D(_), _) => 0 
  case CC_B(_) => 1 
  case CC_C() => 2 
}
}