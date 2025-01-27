package Program_18 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C, D]
case class CC_A[E](a: T_A[E, T_B[E, E]], b: Byte, c: T_A[E, T_A[E, E]]) extends T_A[E, T_A[E, E]]
case class CC_B[G, F](a: T_B[F, G], b: G, c: T_A[F, F]) extends T_B[G, F]
case class CC_C[I, H]() extends T_B[H, I]
case class CC_D[J](a: J, b: T_B[J, J], c: CC_A[J]) extends T_B[Boolean, J]

val v_a: T_B[Boolean, Char] = null
val v_b: Int = v_a match{
  case CC_B(CC_B(_, _, _), _, _) => 0 
  case CC_C() => 1 
  case CC_D(_, CC_B(_, _, _), CC_A(_, _, _)) => 2 
  case CC_D(_, CC_C(), CC_A(_, _, _)) => 3 
}
}
// This is not matched: CC_B(CC_C(), _, _)