package Program_27 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C]
case class CC_A[D](a: D, b: T_A[D, D], c: T_B[D]) extends T_A[D, T_A[T_B[Boolean], T_B[Byte]]]
case class CC_B[E](a: T_A[E, E], b: CC_A[E]) extends T_A[E, T_A[T_B[Boolean], T_B[Byte]]]
case class CC_C[F, G](a: Byte, b: T_B[G], c: T_A[F, G]) extends T_A[F, T_A[T_B[Boolean], T_B[Byte]]]
case class CC_D[H](a: T_B[H], b: T_A[H, H]) extends T_B[H]
case class CC_E[I, J](a: (T_B[Char],Boolean)) extends T_B[I]

val v_a: T_A[Boolean, T_A[T_B[Boolean], T_B[Byte]]] = null
val v_b: Int = v_a match{
  case CC_A(_, _, CC_D(CC_D(_, _), _)) => 0 
  case CC_A(_, _, CC_D(CC_E(_), _)) => 1 
  case CC_A(_, _, CC_E((_,_))) => 2 
  case CC_B(_, _) => 3 
  case CC_C(_, _, _) => 4 
}
}