package Program_12 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C, D]
case class CC_A[E](a: Boolean, b: T_A[E, E]) extends T_A[T_B[E, E], E]
case class CC_B() extends T_A[T_B[CC_A[T_B[Char, Char]], CC_A[T_B[Char, Char]]], CC_A[T_B[Char, Char]]]
case class CC_C(a: CC_B, b: T_A[T_B[T_B[Int, CC_B], T_B[Int, CC_B]], T_B[Int, CC_B]]) extends T_A[T_B[CC_A[T_B[Char, Char]], CC_A[T_B[Char, Char]]], CC_A[T_B[Char, Char]]]
case class CC_D[F]() extends T_B[F, CC_A[F]]

val v_a: T_A[T_B[CC_A[T_B[Char, Char]], CC_A[T_B[Char, Char]]], CC_A[T_B[Char, Char]]] = null
val v_b: Int = v_a match{
  case CC_A(_, _) => 0 
  case CC_B() => 1 
  case CC_C(_, _) => 2 
}
}