package Program_12 

object Test {
sealed trait T_A[A, B]
case class CC_A[C](a: T_A[C, C], b: T_A[Char, C]) extends T_A[T_A[T_A[Byte, Int], T_A[(Char,Boolean), (Boolean,Boolean)]], C]
case class CC_B[D](a: D) extends T_A[T_A[T_A[Byte, Int], T_A[(Char,Boolean), (Boolean,Boolean)]], D]
case class CC_C[E]() extends T_A[E, Int]

val v_a: T_A[T_A[T_A[Byte, Int], T_A[(Char,Boolean), (Boolean,Boolean)]], Char] = null
val v_b: Int = v_a match{
  case CC_A(_, _) => 0 
  case CC_B('x') => 1 
  case CC_B(_) => 2 
}
}