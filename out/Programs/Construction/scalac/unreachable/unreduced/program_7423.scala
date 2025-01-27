package Program_16 

object Test {
sealed trait T_A[A, B]
case class CC_A[C](a: T_A[C, C]) extends T_A[T_A[T_A[Char, Byte], (Char,Int)], C]
case class CC_B[D](a: D, b: CC_A[D]) extends T_A[T_A[T_A[Char, Byte], (Char,Int)], D]
case class CC_C[E]() extends T_A[T_A[T_A[Char, Byte], (Char,Int)], E]

val v_a: T_A[T_A[T_A[Char, Byte], (Char,Int)], Char] = null
val v_b: Int = v_a match{
  case CC_A(_) => 0 
  case CC_B(_, CC_A(_)) => 1 
  case CC_C() => 2 
}
}