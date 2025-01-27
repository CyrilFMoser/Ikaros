package Program_10 

object Test {
sealed trait T_A[A, B]
case class CC_A[C](a: T_A[C, C], b: T_A[T_A[C, C], C]) extends T_A[(T_A[(Int,Byte), Boolean],T_A[Byte, Char]), C]
case class CC_B[D]() extends T_A[(T_A[(Int,Byte), Boolean],T_A[Byte, Char]), D]
case class CC_C[E]() extends T_A[(T_A[(Int,Byte), Boolean],T_A[Byte, Char]), E]

val v_a: T_A[(T_A[(Int,Byte), Boolean],T_A[Byte, Char]), Byte] = null
val v_b: Int = v_a match{
  case CC_A(_, _) => 0 
  case CC_B() => 1 
}
}
// This is not matched: CC_C()