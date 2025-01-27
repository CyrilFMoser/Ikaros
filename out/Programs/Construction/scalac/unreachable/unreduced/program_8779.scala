package Program_15 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C, D]
case class CC_A[E](a: E, b: E) extends T_A[Byte, E]
case class CC_B[F]() extends T_A[Byte, F]
case class CC_C[H, G](a: H, b: G) extends T_B[G, H]
case class CC_D[I, J, K](a: Int, b: Int) extends T_B[I, J]
case class CC_E[L, M](a: T_B[L, L], b: T_A[M, M]) extends T_B[L, M]

val v_a: T_B[Boolean, Char] = null
val v_b: Int = v_a match{
  case CC_C(_, true) => 0 
  case CC_C(_, false) => 1 
  case CC_D(12, _) => 2 
  case CC_D(_, _) => 3 
  case CC_E(CC_C(_, _), _) => 4 
  case CC_E(CC_D(_, _), _) => 5 
  case CC_E(CC_E(_, _), _) => 6 
}
}