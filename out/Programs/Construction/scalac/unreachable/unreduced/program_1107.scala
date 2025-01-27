package Program_1 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C, D]
case class CC_A[E](a: E) extends T_A[T_A[T_A[Int, Boolean], Boolean], E]
case class CC_B(a: Int, b: CC_A[T_A[Boolean, Int]]) extends T_A[T_A[T_A[Int, Boolean], Boolean], T_A[T_B[(Boolean,Boolean), Boolean], CC_A[(Byte,Char)]]]
case class CC_C[F, G](a: T_A[F, F], b: T_B[T_A[F, G], F]) extends T_A[F, G]
case class CC_D[H](a: H, b: T_B[T_A[H, H], H]) extends T_B[H, T_A[CC_B, H]]
case class CC_E[I](a: Byte, b: CC_A[I]) extends T_B[I, T_A[CC_B, I]]
case class CC_F() extends T_B[T_B[CC_C[CC_B, CC_B], T_A[CC_B, CC_C[CC_B, CC_B]]], T_A[CC_B, T_B[CC_C[CC_B, CC_B], T_A[CC_B, CC_C[CC_B, CC_B]]]]]

val v_a: T_A[T_A[T_A[Int, Boolean], Boolean], T_A[T_B[(Boolean,Boolean), Boolean], CC_A[(Byte,Char)]]] = null
val v_b: Int = v_a match{
  case CC_A(CC_C(_, _)) => 0 
  case CC_B(_, _) => 1 
  case CC_C(_, _) => 2 
}
}