package Program_18 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C, D]
case class CC_A[E]() extends T_A[E, T_A[E, E]]
case class CC_B[G, F](a: (Int,T_A[Int, Int])) extends T_B[F, G]
case class CC_C[I, H](a: T_B[H, I], b: T_B[I, I], c: H) extends T_B[H, I]
case class CC_D[K, J, L](a: T_A[L, K], b: CC_A[K]) extends T_B[J, K]

val v_a: T_B[Byte, Int] = null
val v_b: Int = v_a match{
  case CC_B((_,_)) => 0 
  case CC_C(_, CC_B((_,_)), _) => 1 
  case CC_C(_, CC_C(_, _, _), _) => 2 
  case CC_C(_, CC_D(_, _), _) => 3 
  case CC_D(_, _) => 4 
}
}