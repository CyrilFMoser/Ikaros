package Program_31 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C]
case class CC_A[D, E](a: Char, b: T_B[E]) extends T_A[E, D]
case class CC_B[G, F](a: T_A[F, G], b: T_A[F, F]) extends T_A[F, G]
case class CC_C(a: CC_B[T_A[Byte, Char], T_A[Int, Char]], b: T_A[Byte, CC_B[Int, (Int,Boolean)]], c: CC_B[Int, Char]) extends T_B[CC_B[T_A[Boolean, Char], Char]]
case class CC_D(a: T_A[T_A[CC_C, CC_C], Byte]) extends T_B[CC_B[T_A[Boolean, Char], Char]]
case class CC_E() extends T_B[CC_B[T_A[Boolean, Char], Char]]

val v_a: T_A[Char, Int] = null
val v_b: Int = v_a match{
  case CC_B(_, CC_A('x', _)) => 0 
  case CC_B(_, CC_A(_, _)) => 1 
  case CC_B(_, CC_B(_, _)) => 2 
}
}
// This is not matched: CC_A(_, _)