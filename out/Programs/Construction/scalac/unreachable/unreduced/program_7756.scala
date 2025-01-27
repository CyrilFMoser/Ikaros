package Program_8 

object Test {
sealed trait T_A[A]
sealed trait T_B[B, C]
case class CC_A[D]() extends T_A[D]
case class CC_B[E](a: (Boolean,T_A[Byte])) extends T_A[E]
case class CC_C[F](a: T_A[F], b: T_B[F, F]) extends T_A[F]
case class CC_D[G]() extends T_B[G, T_A[Boolean]]
case class CC_E[H](a: CC_B[H], b: T_A[H]) extends T_B[H, T_A[Boolean]]
case class CC_F[I]() extends T_B[I, T_A[Boolean]]

val v_a: T_A[Byte] = null
val v_b: Int = v_a match{
  case CC_A() => 0 
  case CC_B(_) => 1 
  case CC_C(CC_B((_,_)), _) => 2 
  case CC_C(CC_C(_, _), _) => 3 
}
}
// This is not matched: CC_C(CC_A(), _)