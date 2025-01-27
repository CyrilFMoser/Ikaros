package Program_3 

object Test {
sealed trait T_A[A]
sealed trait T_B[B, C]
case class CC_A[D, E](a: T_B[D, D], b: Byte, c: T_A[T_B[Byte, T_A[Int]]]) extends T_A[D]
case class CC_B[G](a: T_A[G], b: G, c: Boolean) extends T_A[G]
case class CC_C[H]() extends T_B[H, CC_A[H, H]]
case class CC_D[I](a: T_A[I], b: Int) extends T_B[I, CC_A[I, I]]

val v_a: T_A[Int] = null
val v_b: Int = v_a match{
  case CC_A(_, _, CC_A(_, _, _)) => 0 
  case CC_A(_, _, CC_B(_, _, _)) => 1 
  case CC_B(CC_A(_, _, CC_A(_, _, _)), _, _) => 2 
  case CC_B(CC_A(_, _, CC_B(_, _, _)), _, _) => 3 
  case CC_B(CC_B(CC_A(_, _, _), _, _), _, _) => 4 
  case CC_B(CC_B(CC_B(_, _, _), _, _), _, _) => 5 
}
}