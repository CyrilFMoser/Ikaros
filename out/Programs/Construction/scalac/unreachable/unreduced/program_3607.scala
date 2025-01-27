package Program_25 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C, D]
case class CC_A[E, F]() extends T_A[E, F]
case class CC_B[G](a: Boolean, b: T_A[G, Char], c: CC_A[G, G]) extends T_A[G, Char]
case class CC_C[H](a: H, b: H, c: CC_B[H]) extends T_A[H, Char]
case class CC_D(a: CC_C[CC_A[Char, Char]], b: CC_C[T_B[Int, Char]]) extends T_B[Boolean, T_A[(Char,Boolean), T_A[Byte, Char]]]
case class CC_E[I]() extends T_B[Boolean, T_A[(Char,Boolean), T_A[Byte, Char]]]
case class CC_F(a: CC_B[T_A[CC_D, CC_D]]) extends T_B[Boolean, T_A[(Char,Boolean), T_A[Byte, Char]]]

val v_a: T_B[Boolean, T_A[(Char,Boolean), T_A[Byte, Char]]] = null
val v_b: Int = v_a match{
  case CC_D(CC_C(CC_A(), CC_A(), CC_B(_, _, _)), CC_C(_, _, _)) => 0 
  case CC_E() => 1 
  case CC_F(CC_B(_, _, _)) => 2 
}
}