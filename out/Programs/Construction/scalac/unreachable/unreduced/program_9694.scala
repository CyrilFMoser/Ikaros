package Program_8 

object Test {
sealed trait T_A[A, B]
case class CC_A[C](a: T_A[C, C]) extends T_A[C, (T_A[(Char,Byte), Boolean],T_A[Byte, Byte])]
case class CC_B[D, E](a: D, b: D, c: CC_A[CC_A[E]]) extends T_A[D, (T_A[(Char,Byte), Boolean],T_A[Byte, Byte])]

val v_a: T_A[Byte, (T_A[(Char,Byte), Boolean],T_A[Byte, Byte])] = null
val v_b: Int = v_a match{
  case CC_A(_) => 0 
  case CC_B(_, 0, _) => 1 
  case CC_B(_, _, _) => 2 
}
}