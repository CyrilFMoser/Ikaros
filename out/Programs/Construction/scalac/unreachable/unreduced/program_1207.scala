package Program_26 

object Test {
sealed trait T_A[A, B]
case class CC_A[C](a: T_A[C, C], b: C) extends T_A[((Int,Char),T_A[Int, Char]), C]
case class CC_B[D](a: CC_A[D], b: Byte) extends T_A[((Int,Char),T_A[Int, Char]), D]

val v_a: T_A[((Int,Char),T_A[Int, Char]), Int] = null
val v_b: Int = v_a match{
  case CC_A(_, _) => 0 
  case CC_B(_, _) => 1 
}
}