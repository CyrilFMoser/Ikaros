package Program_0 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C, D]
case class CC_A[E](a: T_A[E, E]) extends T_A[E, T_B[E, E]]
case class CC_B[F](a: T_A[F, T_B[F, F]]) extends T_A[F, T_B[F, F]]
case class CC_C[G](a: G, b: T_A[G, T_B[G, G]], c: T_A[(Int,(Byte,Boolean)), Char]) extends T_A[G, T_B[G, G]]
case class CC_D[H, I]() extends T_B[H, I]
case class CC_E[J, K](a: T_B[K, K], b: T_B[J, J]) extends T_B[J, K]
case class CC_F[L, M](a: Byte) extends T_B[CC_E[T_B[Byte, Int], T_B[Boolean, (Byte,Boolean)]], L]

val v_a: T_A[Boolean, T_B[Boolean, Boolean]] = null
val v_b: Int = v_a match{
  case CC_A(_) => 0 
  case CC_B(CC_A(_)) => 1 
  case CC_B(CC_B(_)) => 2 
  case CC_B(CC_C(_, CC_A(_), _)) => 3 
  case CC_B(CC_C(_, CC_B(_), _)) => 4 
  case CC_B(CC_C(_, CC_C(_, _, _), _)) => 5 
  case CC_C(_, CC_A(_), _) => 6 
  case CC_C(_, CC_B(CC_A(_)), _) => 7 
  case CC_C(_, CC_B(CC_B(_)), _) => 8 
  case CC_C(_, CC_B(CC_C(_, _, _)), _) => 9 
  case CC_C(_, CC_C(_, CC_A(_), _), _) => 10 
  case CC_C(_, CC_C(_, CC_B(_), _), _) => 11 
  case CC_C(_, CC_C(_, CC_C(_, _, _), _), _) => 12 
}
}