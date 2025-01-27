package Program_25 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C, D]
case class CC_A[E, F](a: T_A[F, F]) extends T_A[F, E]
case class CC_B[G, H](a: G, b: T_A[G, H]) extends T_A[H, G]
case class CC_C[I, J]() extends T_A[I, J]
case class CC_D[K](a: (T_B[Int, Byte],T_A[Int, (Boolean,Char)])) extends T_B[T_B[T_A[K, K], K], K]
case class CC_E(a: CC_C[Char, (Byte,Boolean)]) extends T_B[T_B[T_A[T_A[CC_A[Int, Int], CC_B[Int, (Int,Int)]], T_A[CC_A[Int, Int], CC_B[Int, (Int,Int)]]], T_A[CC_A[Int, Int], CC_B[Int, (Int,Int)]]], T_A[CC_A[Int, Int], CC_B[Int, (Int,Int)]]]
case class CC_F[L](a: T_A[L, T_A[L, L]]) extends T_B[T_B[T_A[L, L], L], L]

val v_a: T_B[T_B[T_A[T_A[CC_A[Int, Int], CC_B[Int, (Int,Int)]], T_A[CC_A[Int, Int], CC_B[Int, (Int,Int)]]], T_A[CC_A[Int, Int], CC_B[Int, (Int,Int)]]], T_A[CC_A[Int, Int], CC_B[Int, (Int,Int)]]] = null
val v_b: Int = v_a match{
  case CC_D((_,CC_A(_))) => 0 
  case CC_D((_,CC_C())) => 1 
  case CC_E(CC_C()) => 2 
  case CC_F(CC_A(_)) => 3 
  case CC_F(CC_B(CC_A(_), _)) => 4 
  case CC_F(CC_B(CC_B(_, _), _)) => 5 
  case CC_F(CC_B(CC_C(), _)) => 6 
  case CC_F(CC_C()) => 7 
}
}
// This is not matched: CC_D((_,CC_B(_, _)))