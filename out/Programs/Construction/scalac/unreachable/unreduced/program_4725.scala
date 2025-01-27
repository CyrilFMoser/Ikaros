package Program_29 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C]
case class CC_A[D](a: T_A[D, D], b: Char) extends T_A[D, T_B[T_B[Boolean]]]
case class CC_B[E]() extends T_B[E]
case class CC_C[F](a: CC_B[F], b: T_A[F, F], c: CC_A[F]) extends T_B[F]
case class CC_D[G](a: G, b: T_B[G]) extends T_B[G]

val v_a: T_B[Int] = null
val v_b: Int = v_a match{
  case CC_B() => 0 
  case CC_C(CC_B(), _, CC_A(_, _)) => 1 
  case CC_D(_, CC_B()) => 2 
  case CC_D(_, CC_C(_, _, CC_A(_, _))) => 3 
  case CC_D(_, CC_D(_, CC_C(_, _, _))) => 4 
  case CC_D(_, CC_D(_, CC_D(_, _))) => 5 
}
}
// This is not matched: CC_D(_, CC_D(_, CC_B()))