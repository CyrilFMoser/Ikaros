package Program_15 

object Test {
sealed trait T_A[A]
sealed trait T_B[B, C]
case class CC_A[D, E](a: E, b: T_A[D]) extends T_A[D]
case class CC_B[F]() extends T_A[F]
case class CC_C[G, H](a: T_B[G, G], b: H) extends T_A[G]
case class CC_D[I](a: Char, b: T_B[I, I], c: T_A[I]) extends T_B[T_B[(Int,Char), Int], I]

val v_a: T_A[Char] = null
val v_b: Int = v_a match{
  case CC_A(_, CC_A(_, _)) => 0 
  case CC_A(_, CC_B()) => 1 
  case CC_A(_, CC_C(_, _)) => 2 
  case CC_B() => 3 
  case CC_C(_, _) => 4 
}
}