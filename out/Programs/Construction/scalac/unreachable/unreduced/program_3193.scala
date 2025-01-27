package Program_0 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C, D]
case class CC_A[E]() extends T_A[T_B[E, E], E]
case class CC_B(a: T_B[CC_A[Int], T_A[Int, Boolean]], b: T_A[T_A[Char, Char], T_A[Int, Int]]) extends T_A[T_B[CC_A[T_B[(Int,Boolean), Boolean]], CC_A[T_B[(Int,Boolean), Boolean]]], CC_A[T_B[(Int,Boolean), Boolean]]]
case class CC_C[F, G, H](a: G, b: (T_A[CC_B, CC_B],T_B[(Char,Int), CC_B])) extends T_B[G, F]
case class CC_D[J, I]() extends T_B[I, J]
case class CC_E[L, K]() extends T_B[L, K]

val v_a: T_B[Int, Char] = null
val v_b: Int = v_a match{
  case CC_C(_, (_,CC_C(_, _))) => 0 
  case CC_C(_, (_,CC_D())) => 1 
  case CC_C(_, (_,CC_E())) => 2 
  case CC_D() => 3 
  case CC_E() => 4 
}
}