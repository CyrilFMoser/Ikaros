package Program_13 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C, D]
case class CC_F[M](a: Byte) extends T_B[M, T_A[M, M]]

val v_a: CC_F[Int] = null
val v_b: Int = v_a match{
  case CC_F(0) => 0 
}
}
// This is not matched: (CC_B Char Wildcard Wildcard Wildcard (T_A Char))