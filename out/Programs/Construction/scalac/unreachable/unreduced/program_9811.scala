package Program_11 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C]
case class CC_A[D](a: T_A[D, D]) extends T_A[T_B[T_B[Char]], D]
case class CC_B[E, F]() extends T_A[T_B[T_B[Char]], E]
case class CC_C[G, H](a: CC_B[H, G], b: CC_A[G]) extends T_B[G]

val v_a: T_A[T_B[T_B[Char]], Byte] = null
val v_b: Int = v_a match{
  case CC_A(_) => 0 
  case CC_B() => 1 
}
}