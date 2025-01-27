package Program_7 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C, D]
case class CC_A[F, E](a: T_B[F, E], b: (T_A[Byte, Boolean],T_A[Boolean, Char]), c: F) extends T_A[F, E]
case class CC_B[G, H](a: T_A[G, T_A[H, G]]) extends T_A[G, H]
case class CC_C[I](a: I, b: T_A[I, T_A[(Boolean,Int), I]], c: T_A[I, I]) extends T_B[I, T_A[I, I]]
case class CC_D[J]() extends T_B[J, T_A[J, J]]

val v_a: T_A[Boolean, Byte] = null
val v_b: Int = v_a match{
  case CC_A(_, (CC_A(_, _, _),CC_A(_, _, _)), _) => 0 
  case CC_A(_, (CC_A(_, _, _),CC_B(_)), _) => 1 
  case CC_A(_, (CC_B(_),CC_A(_, _, _)), _) => 2 
  case CC_B(_) => 3 
}
}
// This is not matched: CC_A(_, (CC_B(_),CC_B(_)), _)