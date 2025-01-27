package Program_5 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C, D]
case class CC_A[E]() extends T_A[E, T_B[E, E]]
case class CC_B[G, F]() extends T_B[G, F]
case class CC_C[H, I]() extends T_B[H, I]
case class CC_D[J](a: Boolean, b: CC_B[T_A[J, J], J], c: T_A[J, J]) extends T_B[Byte, J]

val v_a: T_B[Byte, Byte] = null
val v_b: Int = v_a match{
  case CC_C() => 0 
  case CC_D(_, _, _) => 1 
}
}
// This is not matched: CC_B()