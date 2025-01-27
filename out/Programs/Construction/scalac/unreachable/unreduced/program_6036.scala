package Program_17 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C, D]
case class CC_A[F, E]() extends T_A[F, E]
case class CC_B[G, H](a: T_B[G, G], b: T_A[H, H], c: T_A[G, G]) extends T_A[G, H]
case class CC_C() extends T_A[((Boolean,Int),Byte), T_A[T_A[Char, Boolean], T_B[Boolean, Int]]]
case class CC_D[I](a: T_A[I, T_A[I, I]], b: Int) extends T_B[CC_A[I, I], I]
case class CC_E[J, K](a: J, b: J, c: J) extends T_B[CC_A[J, J], J]

val v_a: T_A[T_A[((Boolean,Int),Byte), T_A[T_A[Char, Boolean], T_B[Boolean, Int]]], Byte] = null
val v_b: Int = v_a match{
  case CC_A() => 0 
  case CC_B(_, _, CC_B(_, _, CC_A())) => 1 
  case CC_B(_, _, CC_B(_, _, CC_B(_, _, _))) => 2 
}
}
// This is not matched: CC_B(_, _, CC_A())