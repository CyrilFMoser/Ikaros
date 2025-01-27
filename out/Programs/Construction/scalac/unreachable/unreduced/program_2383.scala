package Program_14 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C, D]
case class CC_A[E](a: T_B[E, E]) extends T_A[E, (T_A[Int, Byte],T_B[Int, Boolean])]
case class CC_B[F]() extends T_A[Byte, F]
case class CC_C[G]() extends T_A[Byte, G]
case class CC_D[H]() extends T_B[H, Boolean]
case class CC_E[I](a: CC_A[I], b: T_B[I, Boolean], c: T_B[I, I]) extends T_B[I, Boolean]
case class CC_F[J]() extends T_B[J, Boolean]

val v_a: T_B[Byte, Boolean] = null
val v_b: Int = v_a match{
  case CC_D() => 0 
  case CC_E(CC_A(_), CC_D(), _) => 1 
  case CC_E(CC_A(_), CC_E(CC_A(_), CC_D(), _), _) => 2 
  case CC_E(CC_A(_), CC_E(CC_A(_), CC_E(_, _, _), _), _) => 3 
  case CC_E(CC_A(_), CC_E(CC_A(_), CC_F(), _), _) => 4 
  case CC_E(CC_A(_), CC_F(), _) => 5 
}
}
// This is not matched: CC_F()