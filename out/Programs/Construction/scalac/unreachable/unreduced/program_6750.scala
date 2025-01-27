package Program_9 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C, D]
case class CC_A[F, E]() extends T_A[E, F]
case class CC_B[G](a: G, b: (((Char,Char),Boolean),T_A[Char, Char])) extends T_A[G, T_A[G, G]]
case class CC_C[H](a: H, b: T_B[H, H], c: T_B[H, H]) extends T_A[H, T_A[H, H]]
case class CC_D[I](a: CC_C[I], b: T_A[I, I], c: Char) extends T_B[I, Char]

val v_a: T_A[Boolean, T_A[Boolean, Boolean]] = null
val v_b: Int = v_a match{
  case CC_A() => 0 
  case CC_C(true, _, _) => 1 
  case CC_C(false, _, _) => 2 
}
}
// This is not matched: CC_B(_, ((_,_),CC_A()))