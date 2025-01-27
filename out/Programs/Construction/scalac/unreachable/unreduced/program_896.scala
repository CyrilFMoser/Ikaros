package Program_6 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C, D]
case class CC_A[E](a: T_B[E, E], b: T_B[E, E]) extends T_A[E, T_B[E, E]]
case class CC_B[F, G](a: CC_A[F], b: T_A[G, T_B[G, G]]) extends T_A[F, G]
case class CC_C[H](a: H) extends T_A[H, T_B[H, H]]
case class CC_D[I]() extends T_B[I, CC_C[I]]
case class CC_E[J](a: J) extends T_B[J, CC_C[J]]

val v_a: T_A[Char, T_B[Char, Char]] = null
val v_b: Int = v_a match{
  case CC_A(_, _) => 0 
  case CC_B(_, CC_A(_, _)) => 1 
  case CC_B(_, CC_B(_, _)) => 2 
  case CC_B(_, CC_C(_)) => 3 
  case CC_C(_) => 4 
}
}