package Program_31 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C, D]
case class CC_A[E, F]() extends T_A[F, E]
case class CC_B[G](a: Byte, b: T_B[G, G], c: G) extends T_A[G, Int]
case class CC_C[H](a: T_A[H, H]) extends T_B[H, CC_B[H]]
case class CC_D[I](a: Int) extends T_B[I, CC_B[I]]
case class CC_E[J](a: CC_D[J]) extends T_B[J, CC_B[J]]

val v_a: T_A[Boolean, Int] = null
val v_b: Int = v_a match{
  case CC_A() => 0 
  case CC_B(_, _, _) => 1 
}
}