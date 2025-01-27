package Program_0 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C, D]
case class CC_A[F, E](a: T_B[F, E], b: T_A[T_A[F, F], F]) extends T_A[E, F]
case class CC_B[H, G](a: T_A[T_A[G, G], H], b: T_B[G, H]) extends T_A[H, G]
case class CC_C[I, J](a: (Boolean,T_A[Boolean, Boolean])) extends T_A[I, J]
case class CC_D[K](a: T_A[K, K], b: T_B[K, K], c: T_A[K, K]) extends T_B[K, Int]
case class CC_E[L](a: T_A[L, L], b: T_B[L, Int]) extends T_B[L, Int]

val v_a: T_A[Char, Int] = null
val v_b: Int = v_a match{
  case CC_A(_, CC_A(_, CC_A(_, _))) => 0 
  case CC_A(_, CC_A(_, CC_B(_, _))) => 1 
  case CC_A(_, CC_A(_, CC_C(_))) => 2 
  case CC_A(_, CC_B(_, _)) => 3 
  case CC_A(_, CC_C((_,_))) => 4 
  case CC_B(CC_A(_, CC_A(_, _)), _) => 5 
  case CC_B(CC_A(_, CC_B(_, _)), _) => 6 
  case CC_B(CC_A(_, CC_C(_)), _) => 7 
  case CC_B(CC_B(_, _), _) => 8 
  case CC_B(CC_C((_,_)), _) => 9 
  case CC_C(_) => 10 
}
}