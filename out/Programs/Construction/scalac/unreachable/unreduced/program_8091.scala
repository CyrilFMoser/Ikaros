package Program_17 

object Test {
sealed trait T_A[A, B]
case class CC_A[C](a: T_A[C, C]) extends T_A[T_A[T_A[Byte, Boolean], ((Byte,Char),Int)], C]
case class CC_B[D]() extends T_A[T_A[T_A[Byte, Boolean], ((Byte,Char),Int)], D]

val v_a: T_A[T_A[T_A[Byte, Boolean], ((Byte,Char),Int)], Byte] = null
val v_b: Int = v_a match{
  case CC_A(_) => 0 
  case CC_B() => 1 
}
}