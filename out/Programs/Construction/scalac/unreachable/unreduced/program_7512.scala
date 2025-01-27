package Program_2 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C, D]
case class CC_A[E](a: T_A[E, E], b: E) extends T_A[E, Boolean]
case class CC_B[F]() extends T_A[F, Boolean]
case class CC_C[G](a: T_A[CC_A[G], Boolean]) extends T_A[CC_B[G], G]
case class CC_D[I, H](a: T_A[H, Boolean], b: T_A[CC_B[H], H]) extends T_B[H, I]

val v_a: CC_D[Int, Int] = null
val v_b: Int = v_a match{
  case CC_D(CC_A(_, _), CC_C(_)) => 0 
  case CC_D(CC_B(), CC_C(_)) => 1 
}
}