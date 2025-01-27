package Program_9 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C, D]
case class CC_A[F, E](a: F, b: T_A[E, E], c: T_A[E, E]) extends T_A[E, F]
case class CC_B[G]() extends T_A[CC_A[T_A[G, G], G], G]
case class CC_C[I, H](a: T_B[H, H], b: T_B[I, I], c: (CC_A[Char, Int],Boolean)) extends T_B[I, H]
case class CC_D[K, J](a: T_B[K, J], b: K) extends T_B[K, J]
case class CC_E[L](a: CC_D[L, CC_B[L]]) extends T_B[Boolean, L]

val v_a: CC_D[Int, Int] = null
val v_b: Int = v_a match{
  case CC_D(CC_C(CC_C(_, _, _), CC_C(_, _, _), (_,_)), _) => 0 
  case CC_D(CC_C(CC_C(_, _, _), CC_D(_, _), (_,_)), _) => 1 
  case CC_D(CC_C(CC_D(_, _), CC_C(_, _, _), (_,_)), _) => 2 
  case CC_D(CC_C(CC_D(_, _), CC_D(_, _), (_,_)), _) => 3 
  case CC_D(CC_D(_, _), _) => 4 
}
}