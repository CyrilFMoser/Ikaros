package Program_7 

object Test {
sealed trait T_A[A, B]
sealed trait T_B
case class CC_A[C](a: T_A[C, C]) extends T_A[T_A[T_B, T_A[T_B, T_B]], C]
case class CC_B[D](a: D, b: T_A[D, D], c: T_A[D, D]) extends T_A[T_A[T_B, T_A[T_B, T_B]], D]
case class CC_C[E](a: E) extends T_A[T_A[T_B, T_A[T_B, T_B]], E]
case class CC_D(a: CC_B[T_A[T_B, Char]]) extends T_B
case class CC_E(a: (CC_D,CC_A[T_B]), b: Boolean) extends T_B

val v_a: T_A[T_A[T_B, T_A[T_B, T_B]], CC_E] = null
val v_b: Int = v_a match{
  case CC_A(_) => 0 
  case CC_C(CC_E((_,_), _)) => 1 
}
}
// This is not matched: CC_B(_, _, _)