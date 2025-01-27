package Program_24 

object Test {
sealed trait T_A[A, B]
case class CC_A[C, D](a: T_A[C, C], b: T_A[D, D]) extends T_A[C, T_A[C, T_A[C, Int]]]
case class CC_B[E](a: T_A[E, E]) extends T_A[E, T_A[E, T_A[E, Int]]]
case class CC_C[F]() extends T_A[F, T_A[F, T_A[F, Int]]]

val v_a: T_A[Char, T_A[Char, T_A[Char, Int]]] = null
val v_b: Int = v_a match{
  case CC_A(_, _) => 0 
  case CC_B(_) => 1 
  case CC_C() => 2 
}
}