package Program_22 

object Test {
sealed trait T_A[A, B]
sealed trait T_B
case class CC_A[C](a: T_A[C, C], b: Byte) extends T_A[(T_B,T_A[Int, T_B]), C]
case class CC_B[D](a: D) extends T_A[(T_B,T_A[Int, T_B]), D]

val v_a: T_A[(T_B,T_A[Int, T_B]), Int] = null
val v_b: Int = v_a match{
  case CC_A(_, _) => 0 
  case CC_B(_) => 1 
}
}