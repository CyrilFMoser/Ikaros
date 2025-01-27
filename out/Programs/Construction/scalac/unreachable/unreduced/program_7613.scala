package Program_14 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C, D]
case class CC_A[E](a: T_B[Boolean, E]) extends T_A[E, T_B[(Char,Boolean), T_B[Int, Byte]]]
case class CC_B[F](a: CC_A[F], b: F) extends T_A[F, T_B[(Char,Boolean), T_B[Int, Byte]]]
case class CC_C[G](a: CC_B[G], b: T_A[G, G]) extends T_A[G, T_B[(Char,Boolean), T_B[Int, Byte]]]
case class CC_D[H](a: CC_A[H]) extends T_B[Char, H]
case class CC_E(a: T_B[Char, T_B[Char, Boolean]]) extends T_B[Char, T_A[T_B[Char, Byte], CC_B[Int]]]
case class CC_F(a: CC_B[Char], b: T_B[Char, CC_B[Byte]]) extends T_B[Char, T_A[T_B[Char, Byte], CC_B[Int]]]

val v_a: T_A[Char, T_B[(Char,Boolean), T_B[Int, Byte]]] = null
val v_b: Int = v_a match{
  case CC_A(_) => 0 
  case CC_B(_, _) => 1 
  case CC_C(CC_B(_, 'x'), _) => 2 
}
}
// This is not matched: CC_C(CC_B(_, _), _)