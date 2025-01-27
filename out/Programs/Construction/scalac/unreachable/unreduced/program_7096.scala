package Program_30 

object Test {
sealed trait T_A[A]
sealed trait T_B[B, C]
case class CC_A[D](a: T_B[D, D], b: T_B[D, D], c: T_B[D, D]) extends T_A[D]
case class CC_B[E](a: Boolean, b: T_A[E]) extends T_A[E]
case class CC_C[F, G](a: Byte, b: T_B[G, G], c: CC_A[G]) extends T_B[CC_A[(Int,Byte)], F]
case class CC_D[H](a: T_A[CC_A[H]]) extends T_B[CC_A[(Int,Byte)], H]

val v_a: T_B[CC_A[(Int,Byte)], Char] = null
val v_b: Int = v_a match{
  case CC_D(CC_A(_, _, _)) => 0 
  case CC_D(CC_B(_, _)) => 1 
}
}
// This is not matched: CC_C(_, _, _)