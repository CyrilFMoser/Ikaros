package Program_21 

object Test {
sealed trait T_A[A, B]
case class CC_A[C](a: T_A[C, C]) extends T_A[T_A[T_A[Byte, Boolean], T_A[(Int,Int), Byte]], C]
case class CC_B[D](a: T_A[D, D]) extends T_A[T_A[T_A[Byte, Boolean], T_A[(Int,Int), Byte]], D]
case class CC_C[E](a: E) extends T_A[T_A[T_A[Byte, Boolean], T_A[(Int,Int), Byte]], E]

val v_a: T_A[T_A[T_A[Byte, Boolean], T_A[(Int,Int), Byte]], Int] = null
val v_b: Int = v_a match{
  case CC_A(_) => 0 
  case CC_B(_) => 1 
  case CC_C(12) => 2 
  case CC_C(_) => 3 
}
}