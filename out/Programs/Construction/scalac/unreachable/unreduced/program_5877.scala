package Program_25 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C, D]
case class CC_A[E](a: T_A[Byte, T_B[T_A[Byte, Byte], T_A[Byte, Byte]]]) extends T_A[Byte, E]
case class CC_B[H, G](a: T_A[Byte, G], b: T_B[H, G], c: G) extends T_A[G, H]
case class CC_C() extends T_B[T_A[Byte, Int], T_B[T_B[Boolean, Int], Int]]
case class CC_D(a: (T_A[Byte, CC_C],Char), b: CC_A[T_B[CC_C, Int]]) extends T_B[T_A[Byte, Int], T_B[T_B[Boolean, Int], Int]]
case class CC_E[I](a: Byte, b: CC_D, c: T_B[I, I]) extends T_B[I, CC_B[CC_A[(Int,Boolean)], CC_D]]

val v_a: T_A[Byte, Int] = null
val v_b: Int = v_a match{
  case CC_A(CC_A(CC_A(_))) => 0 
  case CC_A(CC_B(_, _, _)) => 1 
  case CC_B(_, _, _) => 2 
}
}
// This is not matched: CC_A(CC_A(CC_B(_, _, _)))