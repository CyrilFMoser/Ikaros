package Program_25 

object Test {
sealed trait T_A[A, B]
case class CC_A[C](a: T_A[T_A[Byte, C], C]) extends T_A[T_A[T_A[Byte, Char], T_A[Byte, (Byte,Char)]], C]
case class CC_B[D]() extends T_A[T_A[T_A[Byte, Char], T_A[Byte, (Byte,Char)]], D]
case class CC_C[E]() extends T_A[T_A[T_A[Byte, Char], T_A[Byte, (Byte,Char)]], E]

val v_a: T_A[T_A[T_A[Byte, Char], T_A[Byte, (Byte,Char)]], Boolean] = null
val v_b: Int = v_a match{
  case CC_A(_) => 0 
  case CC_B() => 1 
  case CC_C() => 2 
}
}