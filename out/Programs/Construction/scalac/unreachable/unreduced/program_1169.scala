package Program_1 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C, D]
case class CC_A[E, F](a: T_A[Char, F], b: T_A[T_B[E, E], E], c: T_A[Char, F]) extends T_A[Char, E]
case class CC_B[G](a: G, b: G) extends T_A[Char, G]

val v_a: T_A[Char, Int] = null
val v_b: Int = v_a match{
  case CC_A(_, _, _) => 0 
  case CC_B(_, _) => 1 
}
}