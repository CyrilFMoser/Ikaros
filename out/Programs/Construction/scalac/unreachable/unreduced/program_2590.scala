package Program_31 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C]
case class CC_A[E, D]() extends T_A[D, E]
case class CC_B[F](a: T_A[CC_A[F, F], F], b: T_B[F]) extends T_A[CC_A[F, F], F]
case class CC_C[G](a: T_A[G, G], b: G) extends T_A[CC_A[G, G], G]
case class CC_D(a: Char) extends T_B[T_A[Boolean, T_A[Byte, Char]]]
case class CC_E(a: T_B[Boolean]) extends T_B[T_A[Boolean, T_A[Byte, Char]]]
case class CC_F(a: T_A[CC_A[T_A[CC_D, CC_D], T_A[CC_D, CC_D]], T_A[CC_D, CC_D]]) extends T_B[T_A[Boolean, T_A[Byte, Char]]]

val v_a: T_B[T_A[Boolean, T_A[Byte, Char]]] = null
val v_b: Int = v_a match{
  case CC_D(_) => 0 
  case CC_E(_) => 1 
  case CC_F(CC_A()) => 2 
  case CC_F(CC_B(CC_A(), _)) => 3 
  case CC_F(CC_B(CC_C(_, _), _)) => 4 
  case CC_F(CC_C(CC_A(), CC_A())) => 5 
}
}
// This is not matched: CC_F(CC_B(CC_B(_, _), _))