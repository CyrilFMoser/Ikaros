package Program_30 

object Test {
sealed trait T_A[A]
sealed trait T_B[B, C]
case class CC_A[D](a: D, b: T_B[D, D]) extends T_A[D]
case class CC_B[E](a: CC_A[E]) extends T_A[E]
case class CC_C() extends T_A[Char]
case class CC_D[F](a: T_A[F], b: Char, c: CC_C) extends T_B[T_A[F], F]

val v_a: T_A[Char] = null
val v_b: Int = v_a match{
  case CC_A(_, _) => 0 
  case CC_B(CC_A('x', _)) => 1 
  case CC_B(CC_A(_, _)) => 2 
  case CC_C() => 3 
}
}