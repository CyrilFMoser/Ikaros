package Program_17 

object Test {
sealed trait T_A[A, B]
case class CC_A[C](a: T_A[C, C]) extends T_A[C, T_A[Int, (Char,Byte)]]
case class CC_B[D](a: D, b: Int, c: Int) extends T_A[D, T_A[Int, (Char,Byte)]]

val v_a: T_A[Int, T_A[Int, (Char,Byte)]] = null
val v_b: Int = v_a match{
  case CC_A(_) => 0 
  case CC_B(_, _, _) => 1 
}
}