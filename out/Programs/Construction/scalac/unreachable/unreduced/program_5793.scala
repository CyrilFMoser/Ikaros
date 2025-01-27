package Program_10 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C, D]
case class CC_A[E](a: E, b: E, c: T_A[Int, E]) extends T_A[Int, E]
case class CC_B[G, F](a: T_B[F, F], b: T_A[F, G], c: Char) extends T_B[F, G]
case class CC_C[I, H](a: T_B[H, I], b: T_B[H, H], c: T_B[CC_B[I, (Boolean,Int)], CC_B[I, (Boolean,Int)]]) extends T_B[H, I]
case class CC_D[K, L]() extends T_B[L, K]

val v_a: T_B[Int, Int] = null
val v_b: Int = v_a match{
  case CC_B(CC_B(CC_B(_, _, _), CC_A(_, _, _), _), CC_A(_, _, _), _) => 0 
  case CC_B(CC_B(CC_C(_, _, _), CC_A(_, _, _), _), CC_A(_, _, _), _) => 1 
  case CC_B(CC_B(CC_D(), CC_A(_, _, _), _), CC_A(_, _, _), _) => 2 
  case CC_B(CC_D(), CC_A(_, _, _), _) => 3 
  case CC_C(_, _, CC_B(_, _, _)) => 4 
  case CC_C(_, _, CC_C(_, _, _)) => 5 
  case CC_C(_, _, CC_D()) => 6 
  case CC_D() => 7 
}
}
// This is not matched: CC_B(CC_C(_, _, _), CC_A(_, _, _), _)