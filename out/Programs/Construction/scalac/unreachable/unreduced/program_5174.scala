package Program_24 

object Test {
sealed trait T_A[A, B]
case class CC_A[C](a: T_A[C, C], b: T_A[C, C], c: Char) extends T_A[C, T_A[(Boolean,Int), ((Byte,Char),Int)]]
case class CC_B[D](a: T_A[D, D], b: T_A[D, D]) extends T_A[D, T_A[(Boolean,Int), ((Byte,Char),Int)]]
case class CC_C[E](a: E, b: Byte) extends T_A[E, T_A[(Boolean,Int), ((Byte,Char),Int)]]

val v_a: T_A[Char, T_A[(Boolean,Int), ((Byte,Char),Int)]] = null
val v_b: Int = v_a match{
  case CC_A(_, _, _) => 0 
  case CC_B(_, _) => 1 
  case CC_C(_, _) => 2 
}
}