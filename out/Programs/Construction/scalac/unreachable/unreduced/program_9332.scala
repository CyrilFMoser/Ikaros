package Program_21 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C]
case class CC_A[D](a: T_A[D, D], b: D, c: Int) extends T_A[D, T_B[D]]
case class CC_B[E]() extends T_A[E, T_B[E]]
case class CC_C[F, G]() extends T_A[F, T_B[F]]
case class CC_D[H]() extends T_B[H]
case class CC_E(a: T_A[CC_B[Byte], T_B[CC_B[Byte]]], b: CC_A[T_B[Boolean]], c: T_A[CC_A[Byte], T_B[CC_A[Byte]]]) extends T_B[T_B[CC_B[Byte]]]
case class CC_F(a: T_A[(Int,CC_E), T_B[(Int,CC_E)]], b: T_A[CC_D[CC_E], T_B[CC_D[CC_E]]]) extends T_B[T_B[CC_B[Byte]]]

val v_a: T_A[Int, T_B[Int]] = null
val v_b: Int = v_a match{
  case CC_A(_, _, _) => 0 
  case CC_B() => 1 
}
}
// This is not matched: CC_C()