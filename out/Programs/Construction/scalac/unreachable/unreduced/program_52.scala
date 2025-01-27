package Program_24 

object Test {
sealed trait T_A[A, B]
case class CC_A[C](a: T_A[C, C], b: T_A[(Int,Boolean), C], c: Int) extends T_A[T_A[T_A[Int, Byte], (Char,Boolean)], C]
case class CC_B[D](a: T_A[D, D]) extends T_A[T_A[T_A[Int, Byte], (Char,Boolean)], D]
case class CC_C[E](a: CC_B[E], b: E) extends T_A[T_A[T_A[Int, Byte], (Char,Boolean)], E]

val v_a: T_A[T_A[T_A[Int, Byte], (Char,Boolean)], Int] = null
val v_b: Int = v_a match{
  case CC_A(_, _, 12) => 0 
  case CC_A(_, _, _) => 1 
  case CC_B(_) => 2 
  case CC_C(_, _) => 3 
}
}