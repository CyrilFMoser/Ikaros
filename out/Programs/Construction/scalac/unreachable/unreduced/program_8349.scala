package Program_1 

object Test {
sealed trait T_A[A]
sealed trait T_B[B, C]
case class CC_A[D](a: D) extends T_A[D]
case class CC_B[E]() extends T_A[E]
case class CC_C[F](a: (CC_A[Byte],CC_B[Boolean])) extends T_A[F]
case class CC_D[G](a: T_A[CC_A[G]], b: T_B[G, G], c: T_A[G]) extends T_B[T_A[G], G]
case class CC_E[H](a: T_A[H], b: CC_C[H], c: CC_C[H]) extends T_B[T_A[H], H]

val v_a: T_B[T_A[Byte], Byte] = null
val v_b: Int = v_a match{
  case CC_D(_, _, _) => 0 
  case CC_E(CC_A(0), _, CC_C((_,_))) => 1 
  case CC_E(CC_A(_), _, CC_C((_,_))) => 2 
  case CC_E(CC_C((_,_)), _, CC_C((_,_))) => 3 
}
}
// This is not matched: CC_E(CC_B(), _, CC_C((_,_)))