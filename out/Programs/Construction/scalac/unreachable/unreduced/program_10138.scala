package Program_8 

object Test {
sealed trait T_A[A, B]
case class CC_A[C]() extends T_A[T_A[(Byte,Byte), T_A[Byte, (Char,Boolean)]], C]
case class CC_B[D](a: T_A[D, T_A[D, D]]) extends T_A[T_A[(Byte,Byte), T_A[Byte, (Char,Boolean)]], D]

val v_a: T_A[T_A[(Byte,Byte), T_A[Byte, (Char,Boolean)]], Byte] = null
val v_b: Int = v_a match{
  case CC_A() => 0 
  case CC_B(_) => 1 
}
}