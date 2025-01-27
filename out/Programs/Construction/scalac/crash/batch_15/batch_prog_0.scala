package Program_0 

object Test {
sealed trait T_A[A]
sealed trait T_B[B, C]
case class CC_A[D]() extends T_A[D]
case class CC_B[E](a: T_B[E, Byte], b: T_A[E], c: Byte) extends T_B[(Byte,CC_A[Byte]), E]
case class CC_C[F](a: F, b: F, c: T_A[(Int,Char)]) extends T_B[(Byte,CC_A[Byte]), F]
case class CC_D[G](a: G, b: CC_C[G]) extends T_B[(Byte,CC_A[Byte]), G]

val v_a: T_B[(Byte,CC_A[Byte]), Int] = null
val v_b: Int = v_a match{
  case CC_B(_, _, _) => 0 
  case CC_C(_, _, CC_A()) => 1 
  case CC_D(12, _) => 2 
}
}
// This is not matched: CC_D(_, _)