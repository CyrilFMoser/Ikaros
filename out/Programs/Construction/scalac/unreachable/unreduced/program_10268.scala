package Program_31 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C, D]
case class CC_A[F, E](a: T_B[E, F], b: T_B[E, F]) extends T_A[F, E]
case class CC_B[H, G](a: H, b: H, c: Int) extends T_A[G, H]
case class CC_C[I](a: ((Char,Boolean),T_A[Int, Int]), b: I, c: T_A[I, I]) extends T_B[I, T_B[I, I]]
case class CC_D[J](a: J, b: Boolean) extends T_B[J, T_B[J, J]]

val v_a: T_A[Byte, Int] = null
val v_b: Int = v_a match{
  case CC_A(_, _) => 0 
  case CC_B(_, _, _) => 1 
}
}