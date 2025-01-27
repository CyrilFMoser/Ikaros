package Program_29 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C, D]
case class CC_A[E](a: T_B[E, E], b: Char) extends T_A[E, T_B[Boolean, (Boolean,Byte)]]
case class CC_D[H]() extends T_B[H, T_A[Int, Int]]

val v_a: T_A[Int, T_B[Boolean, (Boolean,Byte)]] = null
val v_b: Int = v_a match{
  case CC_A(_, 'x') => 0 
}
}
// This is not matched: (CC_A (Tuple T_B Char) T_B (T_A (Tuple T_B Char)))