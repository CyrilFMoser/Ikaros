package Program_19 

object Test {
sealed trait T_A[A, B]
case class CC_A(a: T_A[Char, T_A[Byte, (Char,Char)]], b: T_A[Int, T_A[Byte, Byte]]) extends T_A[(T_A[Byte, Boolean],Byte), Boolean]
case class CC_B(a: T_A[T_A[CC_A, CC_A], CC_A]) extends T_A[(T_A[Byte, Boolean],Byte), Boolean]
case class CC_C[C]() extends T_A[(T_A[Byte, Boolean],Byte), Boolean]

val v_a: T_A[(T_A[Byte, Boolean],Byte), Boolean] = null
val v_b: Int = v_a match{
  case CC_A(_, _) => 0 
  case CC_B(_) => 1 
  case CC_C() => 2 
}
}