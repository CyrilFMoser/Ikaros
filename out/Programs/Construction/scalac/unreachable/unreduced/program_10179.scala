package Program_10 

object Test {
sealed trait T_A[A, B]
case class CC_A[C](a: T_A[C, C], b: T_A[C, C]) extends T_A[T_A[T_A[Byte, Int], (Boolean,Char)], C]
case class CC_B[D](a: T_A[D, D]) extends T_A[T_A[T_A[Byte, Int], (Boolean,Char)], D]
case class CC_C[E](a: E) extends T_A[T_A[T_A[Byte, Int], (Boolean,Char)], E]

val v_a: T_A[T_A[T_A[Byte, Int], (Boolean,Char)], Char] = null
val v_b: Int = v_a match{
  case CC_A(_, _) => 0 
  case CC_B(_) => 1 
  case CC_C('x') => 2 
  case CC_C(_) => 3 
}
}