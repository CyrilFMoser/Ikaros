package Program_16 

object Test {
sealed trait T_A[A, B]
case class CC_A[C](a: T_A[C, C], b: T_A[C, C]) extends T_A[T_A[T_A[Byte, Boolean], (Byte,Byte)], C]
case class CC_B[D]() extends T_A[T_A[T_A[Byte, Boolean], (Byte,Byte)], D]
case class CC_C(a: T_A[(Byte,Int), CC_A[Char]]) extends T_A[T_A[T_A[Byte, Boolean], (Byte,Byte)], ((Char,Int),CC_B[Char])]

val v_a: T_A[T_A[T_A[Byte, Boolean], (Byte,Byte)], Boolean] = null
val v_b: Int = v_a match{
  case CC_A(_, _) => 0 
  case CC_B() => 1 
}
}