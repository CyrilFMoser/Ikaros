package Program_13 

object Test {
sealed trait T_A[A, B]
case class CC_A[C](a: C, b: Int) extends T_A[T_A[(Char,Int), T_A[Boolean, Int]], C]
case class CC_B[D](a: T_A[D, D], b: CC_A[D]) extends T_A[T_A[(Char,Int), T_A[Boolean, Int]], D]
case class CC_C[E](a: CC_A[E]) extends T_A[T_A[(Char,Int), T_A[Boolean, Int]], E]

val v_a: T_A[T_A[(Char,Int), T_A[Boolean, Int]], Char] = null
val v_b: Int = v_a match{
  case CC_A(_, _) => 0 
  case CC_B(_, CC_A(_, _)) => 1 
  case CC_C(_) => 2 
}
}