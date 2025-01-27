package Program_28 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C]
case class CC_A[D](a: T_A[D, D]) extends T_A[T_B[D], D]
case class CC_B(a: T_A[T_B[T_A[Int, Boolean]], T_A[Int, Boolean]], b: CC_A[T_A[Int, Byte]], c: T_B[T_B[Byte]]) extends T_A[T_B[T_B[T_A[Char, Byte]]], T_B[T_A[Char, Byte]]]
case class CC_C[E](a: E, b: E, c: T_A[E, E]) extends T_A[T_B[E], E]
case class CC_D[F]() extends T_B[F]
case class CC_E(a: T_B[CC_D[CC_B]], b: CC_B, c: T_A[Int, CC_C[CC_B]]) extends T_B[Char]
case class CC_F(a: T_B[Char], b: Boolean) extends T_B[Char]

val v_a: T_B[Char] = null
val v_b: Int = v_a match{
  case CC_D() => 0 
  case CC_E(_, CC_B(_, _, _), _) => 1 
  case CC_F(CC_D(), true) => 2 
  case CC_F(CC_E(_, _, _), true) => 3 
  case CC_F(CC_F(_, _), true) => 4 
  case CC_F(CC_D(), false) => 5 
  case CC_F(CC_E(_, _, _), false) => 6 
  case CC_F(CC_F(_, _), false) => 7 
}
}