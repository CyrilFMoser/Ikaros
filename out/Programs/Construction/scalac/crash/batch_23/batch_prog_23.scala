package Program_23 

object Test {
sealed trait T_A[A]
sealed trait T_B[B, C]
case class CC_A[D](a: T_B[D, D], b: D) extends T_A[D]
case class CC_B[E](a: CC_A[E], b: Char) extends T_A[E]
case class CC_C[F](a: Byte) extends T_A[F]
case class CC_D[G](a: T_A[G], b: CC_B[G]) extends T_B[CC_C[T_A[Int]], G]
case class CC_E[H](a: CC_B[H], b: CC_C[T_A[H]]) extends T_B[CC_C[T_A[Int]], H]

val v_a: T_B[CC_C[T_A[Int]], Byte] = null
val v_b: Int = v_a match{
  case CC_D(CC_A(_, _), CC_B(_, _)) => 0 
  case CC_D(CC_B(CC_A(_, _), 'x'), CC_B(_, _)) => 1 
  case CC_D(CC_B(CC_A(_, _), _), CC_B(_, _)) => 2 
  case CC_D(CC_C(0), CC_B(_, _)) => 3 
  case CC_D(CC_C(_), CC_B(_, _)) => 4 
  case CC_E(CC_B(_, _), CC_C(_)) => 5 
}
}