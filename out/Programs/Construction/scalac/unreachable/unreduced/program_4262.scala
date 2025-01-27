package Program_11 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C, D]
case class CC_A[F, E](a: E, b: T_B[E, E]) extends T_A[E, F]
case class CC_B[G, H]() extends T_A[G, H]
case class CC_C(a: CC_A[T_B[(Char,Boolean), Boolean], Char], b: T_B[Byte, T_A[Int, Byte]]) extends T_B[T_A[Char, Char], Boolean]
case class CC_D(a: Int, b: T_A[T_A[CC_C, CC_C], Char]) extends T_B[T_A[Char, Char], Boolean]

val v_a: T_B[T_A[Char, Char], Boolean] = null
val v_b: Int = v_a match{
  case CC_C(CC_A(_, _), _) => 0 
  case CC_D(_, _) => 1 
}
}