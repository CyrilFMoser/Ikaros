package Program_29 

object Test {
sealed trait T_A[A, B]
case class CC_A[C](a: T_A[C, C], b: Byte) extends T_A[C, T_A[Int, (Int,Char)]]

val v_a: T_A[Int, T_A[Int, (Int,Char)]] = null
val v_b: Int = v_a match{
  case CC_A(_, 0) => 0 
}
}
// This is not matched: (CC_B (T_A Boolean))