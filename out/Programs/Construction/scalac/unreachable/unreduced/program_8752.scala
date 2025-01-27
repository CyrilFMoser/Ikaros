package Program_30 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C, D]
case class CC_A[E, F](a: T_B[E, E]) extends T_A[E, F]
case class CC_B[G](a: G) extends T_A[CC_A[G, T_A[Char, G]], G]
case class CC_C[H](a: Boolean, b: Byte) extends T_A[CC_A[H, T_A[Char, H]], H]
case class CC_D[I](a: I, b: Boolean) extends T_B[I, T_A[Boolean, T_A[Boolean, Boolean]]]

val v_a: T_A[CC_A[Int, T_A[Char, Int]], Int] = null
val v_b: Int = v_a match{
  case CC_A(_) => 0 
  case CC_B(_) => 1 
  case CC_C(_, _) => 2 
}
}