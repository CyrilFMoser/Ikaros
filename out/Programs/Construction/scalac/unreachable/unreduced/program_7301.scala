package Program_26 

object Test {
sealed trait T_A[A]
sealed trait T_B[B, C]
case class CC_A[D](a: T_B[D, D]) extends T_A[D]
case class CC_B[E]() extends T_A[E]
case class CC_C[F](a: (T_A[Boolean],T_A[Boolean])) extends T_A[F]
case class CC_D[G](a: CC_B[G], b: Int, c: Int) extends T_B[T_B[T_A[Boolean], CC_A[Boolean]], G]
case class CC_E[H, I]() extends T_B[CC_A[H], H]

val v_a: T_A[Int] = null
val v_b: Int = v_a match{
  case CC_A(_) => 0 
  case CC_B() => 1 
  case CC_C((CC_A(_),CC_B())) => 2 
  case CC_C((CC_A(_),CC_C(_))) => 3 
  case CC_C((CC_B(),CC_A(_))) => 4 
  case CC_C((CC_B(),CC_B())) => 5 
  case CC_C((CC_B(),CC_C(_))) => 6 
  case CC_C((CC_C(_),CC_A(_))) => 7 
  case CC_C((CC_C(_),CC_B())) => 8 
  case CC_C((CC_C(_),CC_C(_))) => 9 
}
}
// This is not matched: CC_C((CC_A(_),CC_A(_)))