package Program_7 

object Test {
sealed trait T_A[A, B]
case class CC_A[C](a: T_A[C, C], b: T_A[C, C], c: T_A[C, C]) extends T_A[C, T_A[T_A[Char, (Byte,Byte)], (Byte,Char)]]
case class CC_B[D]() extends T_A[D, T_A[T_A[Char, (Byte,Byte)], (Byte,Char)]]

val v_a: T_A[Int, T_A[T_A[Char, (Byte,Byte)], (Byte,Char)]] = null
val v_b: Int = v_a match{
  case CC_A(_, _, _) => 0 
  case CC_B() => 1 
}
}