package Program_24 

object Test {
sealed trait T_A[A, B]
case class CC_A(a: T_A[Int, T_A[Char, Char]], b: Int, c: T_A[T_A[Byte, Int], Boolean]) extends T_A[Int, T_A[T_A[(Int,Boolean), Boolean], (Byte,Byte)]]
case class CC_B(a: CC_A, b: Byte) extends T_A[Int, T_A[T_A[(Int,Boolean), Boolean], (Byte,Byte)]]

val v_a: T_A[Int, T_A[T_A[(Int,Boolean), Boolean], (Byte,Byte)]] = null
val v_b: Int = v_a match{
  case CC_A(_, _, _) => 0 
  case CC_B(_, _) => 1 
}
}