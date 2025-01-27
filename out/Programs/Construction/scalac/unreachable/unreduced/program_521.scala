package Program_11 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C, D]
case class CC_A[E]() extends T_A[E, T_B[(Int,Char), Char]]
case class CC_B[F](a: T_A[F, F]) extends T_A[F, T_B[(Int,Char), Char]]

val v_a: T_A[Char, T_B[(Int,Char), Char]] = null
val v_b: Int = v_a match{
  case CC_A() => 0 
  case CC_B(_) => 1 
}
}