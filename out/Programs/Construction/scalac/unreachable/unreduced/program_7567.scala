package Program_0 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C]
case class CC_A[D](a: T_B[D], b: T_B[D]) extends T_A[D, T_B[D]]
case class CC_B[E](a: E, b: T_A[E, E], c: E) extends T_B[E]
case class CC_C(a: T_B[T_B[Byte]], b: T_B[T_B[Char]]) extends T_B[T_A[(Int,Int), T_B[(Int,Int)]]]
case class CC_D() extends T_B[T_A[(Int,Int), T_B[(Int,Int)]]]

val v_a: T_B[T_A[(Int,Int), T_B[(Int,Int)]]] = null
val v_b: Int = v_a match{
  case CC_B(_, _, CC_A(_, _)) => 0 
  case CC_D() => 1 
}
}
// This is not matched: CC_C(_, _)