package Program_25 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C]
case class CC_A(a: T_B[T_B[Char]], b: Boolean) extends T_A[T_B[T_B[Int]], T_A[(Int,Int), T_B[Char]]]
case class CC_B(a: T_A[T_B[CC_A], (Char,Int)]) extends T_A[T_B[T_B[Int]], T_A[(Int,Int), T_B[Char]]]
case class CC_C[D](a: D, b: CC_B, c: T_A[D, D]) extends T_B[D]
case class CC_D(a: CC_C[Byte], b: T_B[CC_B], c: T_B[CC_C[CC_B]]) extends T_B[CC_B]
case class CC_E[E](a: (T_B[CC_D],T_B[(Char,Boolean)])) extends T_B[E]

val v_a: T_A[T_B[T_B[Int]], T_A[(Int,Int), T_B[Char]]] = null
val v_b: Int = v_a match{
  case CC_A(_, _) => 0 
  case CC_B(_) => 1 
}
}