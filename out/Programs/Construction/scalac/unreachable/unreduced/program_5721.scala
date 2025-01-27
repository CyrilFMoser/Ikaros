package Program_14 

object Test {
sealed trait T_A[A, B]
case class CC_A[C](a: T_A[C, Char], b: T_A[C, C], c: T_A[C, C]) extends T_A[C, T_A[T_A[Byte, Byte], ((Boolean,Char),Int)]]
case class CC_B[D](a: Char, b: D) extends T_A[CC_A[Char], T_A[T_A[Byte, Byte], ((Boolean,Char),Int)]]
case class CC_C(a: T_A[CC_B[Byte], Boolean], b: Int, c: T_A[CC_B[(Byte,Boolean)], T_A[Char, (Char,Char)]]) extends T_A[CC_A[Char], T_A[T_A[Byte, Byte], ((Boolean,Char),Int)]]

val v_a: T_A[CC_A[Char], T_A[T_A[Byte, Byte], ((Boolean,Char),Int)]] = null
val v_b: Int = v_a match{
  case CC_A(_, _, _) => 0 
  case CC_B(_, _) => 1 
  case CC_C(_, _, _) => 2 
}
}