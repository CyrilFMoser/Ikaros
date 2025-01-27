package Program_2 

object Test {
sealed trait T_A[A]
sealed trait T_B[B, C]
case class CC_A(a: Byte) extends T_A[T_A[T_A[(Int,Char)]]]
case class CC_B(a: CC_A, b: Int, c: T_A[CC_A]) extends T_A[T_A[T_A[(Int,Char)]]]
case class CC_C[E, D]() extends T_B[D, E]
case class CC_D[F](a: ((CC_A,CC_A),CC_A), b: CC_A) extends T_B[T_A[T_B[F, F]], F]
case class CC_E[G](a: G, b: T_B[G, G], c: T_B[G, Int]) extends T_B[G, Int]

val v_a: T_A[T_A[T_A[(Int,Char)]]] = null
val v_b: Int = v_a match{
  case CC_A(_) => 0 
  case CC_B(CC_A(0), _, _) => 1 
  case CC_B(CC_A(_), _, _) => 2 
}
}