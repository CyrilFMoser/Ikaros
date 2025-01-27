package Program_27 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C]
case class CC_A[D](a: Byte) extends T_A[D, T_A[T_A[Byte, Char], T_B[(Byte,Int)]]]
case class CC_B[E](a: E) extends T_B[E]
case class CC_C[F](a: F, b: T_A[F, F]) extends T_B[F]

val v_a: T_B[Byte] = null
val v_b: Int = v_a match{
  case CC_B(_) => 0 
  case CC_C(_, _) => 1 
}
}