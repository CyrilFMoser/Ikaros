package Program_12 

object Test {
sealed trait T_A[A]
sealed trait T_B[B, C]
case class CC_A() extends T_A[T_B[Char, T_B[Char, Boolean]]]
case class CC_B(a: (CC_A,T_A[CC_A])) extends T_A[T_B[Char, T_B[Char, Boolean]]]
case class CC_C() extends T_A[T_B[Char, T_B[Char, Boolean]]]
case class CC_D[D](a: T_A[T_B[Int, D]], b: CC_A, c: T_B[Int, D]) extends T_B[Int, D]
case class CC_E[E, F](a: T_A[E]) extends T_B[E, CC_C]
case class CC_F[G, H]() extends T_B[H, G]

val v_a: T_A[T_B[Char, T_B[Char, Boolean]]] = null
val v_b: Int = v_a match{
  case CC_A() => 0 
  case CC_B((CC_A(),_)) => 1 
  case CC_C() => 2 
}
}