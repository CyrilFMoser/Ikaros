package Program_2 

object Test {
sealed trait T_A[A]
sealed trait T_B[B, C]
case class CC_A[D](a: T_A[D]) extends T_A[D]
case class CC_B[E](a: T_B[E, E], b: Int, c: E) extends T_A[E]
case class CC_C[F, G]() extends T_A[F]
case class CC_D[H](a: H) extends T_B[H, (CC_A[Char],T_A[Byte])]
case class CC_E[I](a: T_A[I]) extends T_B[I, (CC_A[Char],T_A[Byte])]

val v_a: CC_E[Char] = null
val v_b: Int = v_a match{
  case CC_E(CC_A(CC_A(_))) => 0 
  case CC_E(CC_A(CC_B(_, _, _))) => 1 
  case CC_E(CC_A(CC_C())) => 2 
  case CC_E(CC_B(_, _, 'x')) => 3 
  case CC_E(CC_B(_, _, _)) => 4 
  case CC_E(CC_C()) => 5 
}
}