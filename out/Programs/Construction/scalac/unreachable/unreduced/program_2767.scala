package Program_29 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C, D]
case class CC_A[F, E](a: T_B[E, F]) extends T_A[F, E]
case class CC_B[H, G]() extends T_A[G, H]
case class CC_C[I]() extends T_A[I, CC_A[T_B[Char, (Int,Char)], T_A[Char, Int]]]
case class CC_D[J](a: T_B[T_A[J, J], J], b: CC_B[J, J]) extends T_B[T_A[J, J], J]

val v_a: T_A[Char, CC_A[T_B[Char, (Int,Char)], T_A[Char, Int]]] = null
val v_b: Int = v_a match{
  case CC_A(_) => 0 
  case CC_C() => 1 
}
}
// This is not matched: CC_B()