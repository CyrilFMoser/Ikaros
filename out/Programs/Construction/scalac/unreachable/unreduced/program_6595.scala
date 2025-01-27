package Program_6 

object Test {
sealed trait T_A[A]
sealed trait T_B[B, C]
case class CC_A[D](a: T_A[T_A[D]], b: T_B[D, D]) extends T_A[D]
case class CC_B(a: T_B[T_A[Char], Int]) extends T_A[T_A[CC_A[Byte]]]
case class CC_C[E]() extends T_A[E]
case class CC_D[F](a: CC_B, b: T_B[F, Char], c: CC_C[CC_A[CC_B]]) extends T_B[F, Char]
case class CC_E[G](a: CC_A[G]) extends T_B[G, Char]

val v_a: T_A[Boolean] = null
val v_b: Int = v_a match{
  case CC_A(CC_A(_, _), _) => 0 
  case CC_A(CC_C(), _) => 1 
  case CC_C() => 2 
}
}