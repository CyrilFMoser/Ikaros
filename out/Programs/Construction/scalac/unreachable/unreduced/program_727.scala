package Program_29 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C, D]
case class CC_A[F, E](a: T_B[E, E]) extends T_A[E, F]
case class CC_B[H, G]() extends T_A[H, G]
case class CC_C[I, J](a: T_A[I, I]) extends T_A[J, I]
case class CC_D[K](a: CC_B[K, K], b: T_A[K, K]) extends T_B[K, T_A[K, K]]
case class CC_E(a: CC_A[Boolean, CC_B[Char, Boolean]], b: T_A[CC_D[Char], CC_A[Boolean, Boolean]]) extends T_B[CC_D[Int], T_A[CC_D[Int], CC_D[Int]]]

val v_a: T_B[CC_D[Int], T_A[CC_D[Int], CC_D[Int]]] = null
val v_b: Int = v_a match{
  case CC_D(_, _) => 0 
  case CC_E(CC_A(_), CC_A(_)) => 1 
  case CC_E(CC_A(_), CC_B()) => 2 
}
}
// This is not matched: CC_E(CC_A(_), CC_C(_))