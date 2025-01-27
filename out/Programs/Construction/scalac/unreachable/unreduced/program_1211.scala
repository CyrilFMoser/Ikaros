package Program_4 

object Test {
sealed trait T_A[A]
sealed trait T_B[B, C]
case class CC_A[D](a: T_B[D, D], b: T_A[D], c: T_A[D]) extends T_A[D]
case class CC_B[E]() extends T_A[E]
case class CC_C[F](a: CC_B[F]) extends T_A[F]
case class CC_D[G](a: CC_A[G], b: Boolean) extends T_B[G, Int]
case class CC_E(a: (CC_A[Char],T_A[Char])) extends T_B[T_A[T_A[Boolean]], Int]
case class CC_F[H](a: CC_E, b: CC_A[H], c: T_A[T_A[H]]) extends T_B[H, Int]

val v_a: T_A[Boolean] = null
val v_b: Int = v_a match{
  case CC_A(_, CC_A(_, _, _), _) => 0 
  case CC_A(_, CC_B(), _) => 1 
  case CC_A(_, CC_C(_), _) => 2 
  case CC_B() => 3 
  case CC_C(_) => 4 
}
}