package Program_19 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C, D]
case class CC_A[E]() extends T_A[E, T_B[E, E]]
case class CC_B[F](a: T_A[F, T_B[F, F]], b: T_A[F, F], c: F) extends T_A[F, T_B[F, F]]
case class CC_C[G](a: G, b: CC_B[G], c: T_A[G, T_B[G, G]]) extends T_A[G, T_B[G, G]]
case class CC_D[H]() extends T_B[H, CC_B[T_B[Char, H]]]
case class CC_E[I, J](a: T_B[I, I], b: T_B[I, I], c: T_A[I, T_B[I, I]]) extends T_B[J, I]

val v_a: T_A[Byte, T_B[Byte, Byte]] = null
val v_b: Int = v_a match{
  case CC_A() => 0 
  case CC_B(CC_A(), _, 0) => 1 
  case CC_B(CC_A(), _, _) => 2 
  case CC_B(CC_B(CC_A(), _, _), _, 0) => 3 
  case CC_B(CC_B(CC_A(), _, _), _, _) => 4 
  case CC_B(CC_B(CC_B(_, _, _), _, _), _, 0) => 5 
  case CC_B(CC_B(CC_B(_, _, _), _, _), _, _) => 6 
  case CC_B(CC_B(CC_C(_, _, _), _, _), _, 0) => 7 
  case CC_B(CC_C(_, CC_B(_, _, _), _), _, 0) => 8 
  case CC_B(CC_C(_, CC_B(_, _, _), _), _, _) => 9 
  case CC_C(0, _, _) => 10 
  case CC_C(_, _, _) => 11 
}
}
// This is not matched: CC_B(CC_B(CC_C(_, _, _), _, _), _, _)