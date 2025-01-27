package Program_30 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C]
case class CC_A[E, F](a: Char, b: T_B[E]) extends T_A[F, E]
case class CC_C() extends T_B[T_A[Int, Char]]

val v_a: T_A[Boolean, T_B[T_A[Int, Char]]] = null
val v_b: Int = v_a match{
  case CC_A('x', _) => 0 
}
}
// This is not matched: (CC_C T_A)