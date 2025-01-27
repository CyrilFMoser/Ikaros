package Program_26 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C]
case class CC_A[D](a: Boolean, b: T_A[D, D], c: T_B[D]) extends T_A[D, Char]
case class CC_B[E](a: T_A[T_B[E], Char], b: Int, c: T_A[E, Char]) extends T_A[E, Char]
case class CC_C[F]() extends T_B[F]
case class CC_D[G](a: T_A[G, Char]) extends T_B[G]
case class CC_E[H]() extends T_B[H]

val v_a: T_A[Byte, Char] = null
val v_b: Int = v_a match{
  case CC_A(_, _, _) => 0 
  case CC_B(CC_A(_, _, _), _, _) => 1 
  case CC_B(CC_B(_, _, CC_A(_, _, _)), _, _) => 2 
  case CC_B(CC_B(_, _, CC_B(_, _, _)), _, _) => 3 
}
}