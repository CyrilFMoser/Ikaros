package Program_13 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C, D]
case class CC_A[E]() extends T_A[E, T_A[(Char,Char), T_A[Boolean, Char]]]
case class CC_B[G, F]() extends T_A[G, F]
case class CC_C[H](a: T_B[H, H], b: Int, c: (T_A[Char, Char],T_B[Byte, (Int,Int)])) extends T_B[H, CC_A[T_A[Boolean, Boolean]]]
case class CC_D[I](a: I, b: T_A[CC_C[I], I], c: Int) extends T_B[I, CC_A[T_A[Boolean, Boolean]]]
case class CC_E[J](a: T_A[J, J], b: Int) extends T_B[J, CC_A[T_A[Boolean, Boolean]]]

val v_a: T_B[Byte, CC_A[T_A[Boolean, Boolean]]] = null
val v_b: Int = v_a match{
  case CC_C(_, _, _) => 0 
  case CC_E(CC_B(), _) => 1 
}
}
// This is not matched: CC_D(_, _, _)