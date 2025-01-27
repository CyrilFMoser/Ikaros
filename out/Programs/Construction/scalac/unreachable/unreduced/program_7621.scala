package Program_4 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C, D]
case class CC_A[E](a: T_A[E, E]) extends T_A[E, Boolean]
case class CC_B[F, G](a: T_A[Boolean, Boolean], b: CC_A[G], c: G) extends T_B[F, G]
case class CC_C[I, H](a: Int, b: T_B[H, H]) extends T_B[H, I]

val v_a: T_B[Byte, Int] = null
val v_b: Int = v_a match{
  case CC_B(CC_A(CC_A(_)), _, _) => 0 
  case CC_C(_, CC_B(CC_A(_), CC_A(_), _)) => 1 
  case CC_C(_, CC_C(_, CC_B(_, _, _))) => 2 
  case CC_C(_, CC_C(_, CC_C(_, _))) => 3 
}
}