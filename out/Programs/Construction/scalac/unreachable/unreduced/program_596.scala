package Program_29 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C, D]
case class CC_A[E, F](a: T_B[Char, E]) extends T_A[E, F]
case class CC_B[G](a: T_B[G, G], b: G, c: T_B[Byte, G]) extends T_B[G, T_B[CC_A[Int, Char], T_B[Char, Boolean]]]
case class CC_C[H, I]() extends T_B[H, T_B[CC_A[Int, Char], T_B[Char, Boolean]]]
case class CC_D[J]() extends T_B[J, T_B[CC_A[Int, Char], T_B[Char, Boolean]]]

val v_a: T_B[Byte, T_B[CC_A[Int, Char], T_B[Char, Boolean]]] = null
val v_b: Int = v_a match{
  case CC_B(_, _, _) => 0 
  case CC_C() => 1 
  case CC_D() => 2 
}
}