package Program_27 

object Test {
sealed trait T_A[A, B]
sealed trait T_B
case class CC_A[C](a: T_A[C, C], b: T_A[C, C]) extends T_A[C, T_B]
case class CC_B[D](a: T_A[D, T_B], b: ((Int,(Int,Byte)),(T_B,T_B))) extends T_A[D, T_B]
case class CC_C[E](a: E) extends T_A[E, T_B]
case class CC_D() extends T_B
case class CC_E(a: CC_A[CC_D]) extends T_B
case class CC_F(a: CC_E) extends T_B

val v_a: T_A[Int, T_B] = null
val v_b: Int = v_a match{
  case CC_A(_, _) => 0 
  case CC_C(_) => 1 
}
}
// This is not matched: CC_B(_, _)