package Program_9 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C]
case class CC_A[D](a: T_B[D]) extends T_A[D, Boolean]
case class CC_B[E](a: E) extends T_A[E, Boolean]
case class CC_C[F]() extends T_B[F]
case class CC_D[G](a: CC_C[G], b: T_A[G, G]) extends T_B[G]
case class CC_E[H](a: T_A[H, Boolean], b: T_B[H], c: T_A[H, H]) extends T_B[H]

val v_a: T_B[Int] = null
val v_b: Int = v_a match{
  case CC_C() => 0 
  case CC_D(_, _) => 1 
  case CC_E(CC_A(_), CC_C(), _) => 2 
  case CC_E(CC_A(_), CC_D(CC_C(), _), _) => 3 
  case CC_E(CC_A(_), CC_E(_, _, _), _) => 4 
  case CC_E(CC_B(12), CC_C(), _) => 5 
  case CC_E(CC_B(12), CC_D(CC_C(), _), _) => 6 
  case CC_E(CC_B(12), CC_E(_, _, _), _) => 7 
  case CC_E(CC_B(_), CC_D(CC_C(), _), _) => 8 
  case CC_E(CC_B(_), CC_E(_, _, _), _) => 9 
}
}
// This is not matched: CC_E(CC_B(_), CC_C(), _)