package Program_28 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C, D]
case class CC_A[F, E](a: E) extends T_A[E, F]
case class CC_B[H, G](a: T_A[Boolean, H]) extends T_A[H, G]
case class CC_C[I, J](a: T_A[I, I], b: T_B[J, T_A[I, I]]) extends T_A[J, I]
case class CC_D[K](a: T_A[K, K]) extends T_B[K, T_A[K, K]]

val v_a: T_A[Char, Int] = null
val v_b: Int = v_a match{
  case CC_A(_) => 0 
  case CC_B(CC_A(_)) => 1 
  case CC_B(CC_B(_)) => 2 
  case CC_B(CC_C(CC_A(_), _)) => 3 
  case CC_B(CC_C(CC_B(_), _)) => 4 
  case CC_B(CC_C(CC_C(_, _), _)) => 5 
  case CC_C(CC_A(_), _) => 6 
  case CC_C(CC_B(CC_A(_)), _) => 7 
  case CC_C(CC_B(CC_B(_)), _) => 8 
  case CC_C(CC_B(CC_C(_, _)), _) => 9 
  case CC_C(CC_C(CC_A(_), _), _) => 10 
  case CC_C(CC_C(CC_B(_), _), _) => 11 
  case CC_C(CC_C(CC_C(_, _), _), _) => 12 
}
}