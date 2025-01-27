package Program_21 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C, D]
case class CC_A[E](a: T_A[T_B[E, E], E], b: Boolean, c: E) extends T_A[T_B[E, E], E]
case class CC_B[G, F](a: T_B[F, T_A[Int, F]], b: T_A[G, G], c: T_B[G, G]) extends T_B[F, G]
case class CC_C[I, J](a: T_B[I, I], b: Byte) extends T_B[I, J]

val v_a: T_B[Byte, Int] = null
val v_b: Int = v_a match{
  case CC_B(_, _, _) => 0 
  case CC_C(CC_B(CC_B(_, _, _), _, CC_C(_, _)), _) => 1 
  case CC_C(CC_B(CC_C(_, _), _, CC_B(_, _, _)), _) => 2 
  case CC_C(CC_B(CC_C(_, _), _, CC_C(_, _)), _) => 3 
  case CC_C(CC_C(_, 0), _) => 4 
  case CC_C(CC_C(_, _), _) => 5 
}
}
// This is not matched: CC_C(CC_B(CC_B(_, _, _), _, CC_B(_, _, _)), _)