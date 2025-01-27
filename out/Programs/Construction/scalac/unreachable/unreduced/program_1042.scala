package Program_27 

object Test {
sealed trait T_A[A, B]
case class CC_A[C](a: T_A[C, C], b: T_A[C, T_A[C, C]], c: T_A[C, C]) extends T_A[C, T_A[(Boolean,Byte), (Char,Boolean)]]
case class CC_B[D](a: D, b: Byte) extends T_A[D, T_A[(Boolean,Byte), (Char,Boolean)]]
case class CC_C[E](a: CC_A[(Byte,Char)], b: T_A[E, E]) extends T_A[E, CC_A[CC_A[(Int,Boolean)]]]

val v_a: T_A[Int, T_A[(Boolean,Byte), (Char,Boolean)]] = null
val v_b: Int = v_a match{
  case CC_A(_, _, _) => 0 
  case CC_B(_, 0) => 1 
  case CC_B(_, _) => 2 
}
}