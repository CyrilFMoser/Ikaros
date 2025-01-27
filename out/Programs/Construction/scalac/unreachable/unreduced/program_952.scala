package Program_15 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C, D]
case class CC_A[E]() extends T_A[T_A[E, E], E]
case class CC_B[F, G](a: CC_A[G], b: T_A[G, F]) extends T_B[F, G]
case class CC_C[I, H](a: H, b: (Int,T_B[Char, Char])) extends T_B[H, I]
case class CC_D[J]() extends T_B[CC_C[J, J], J]

val v_a: T_B[CC_C[Boolean, Boolean], Boolean] = null
val v_b: Int = v_a match{
  case CC_B(CC_A(), _) => 0 
  case CC_C(CC_C(_, _), (_,_)) => 1 
  case CC_D() => 2 
}
}