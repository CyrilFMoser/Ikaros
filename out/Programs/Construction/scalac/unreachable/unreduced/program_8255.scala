package Program_18 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C, D]
case class CC_A[F, E](a: T_A[E, E], b: T_B[E, E]) extends T_A[F, E]
case class CC_B[G, H](a: T_A[G, G], b: T_A[G, H]) extends T_A[G, H]
case class CC_C[I](a: I, b: I) extends T_B[I, T_A[CC_A[Char, Int], Boolean]]

val v_a: T_A[Byte, Int] = null
val v_b: Int = v_a match{
  case CC_A(CC_A(_, _), _) => 0 
  case CC_A(CC_B(_, _), _) => 1 
  case CC_B(_, _) => 2 
}
}