package Program_29 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C, D]
case class CC_A[E, F](a: T_A[E, E], b: T_A[E, E], c: F) extends T_A[E, F]
case class CC_B[G](a: Boolean) extends T_A[(Byte,T_B[Int, Int]), G]
case class CC_C[H](a: CC_A[H, Byte]) extends T_B[H, T_A[H, H]]

val v_a: T_A[(Byte,T_B[Int, Int]), Int] = null
val v_b: Int = v_a match{
  case CC_A(CC_A(_, _, (_,_)), _, _) => 0 
  case CC_A(CC_B(true), _, _) => 1 
  case CC_A(CC_B(false), _, _) => 2 
  case CC_B(_) => 3 
}
}