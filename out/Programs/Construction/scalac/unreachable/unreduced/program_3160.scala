package Program_20 

object Test {
sealed trait T_A[A, B]
case class CC_A[C](a: T_A[C, C], b: T_A[C, C], c: T_A[C, C]) extends T_A[T_A[(Char,Boolean), T_A[Char, Int]], C]
case class CC_B[D](a: Int) extends T_A[T_A[(Char,Boolean), T_A[Char, Int]], D]
case class CC_C[E](a: CC_B[CC_B[E]]) extends T_A[E, CC_B[E]]

val v_a: T_A[T_A[(Char,Boolean), T_A[Char, Int]], Boolean] = null
val v_b: Int = v_a match{
  case CC_A(_, _, _) => 0 
  case CC_B(_) => 1 
}
}