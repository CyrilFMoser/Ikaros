package Program_25 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C]
case class CC_A[D, E](a: T_B[E], b: T_A[D, D]) extends T_A[E, D]
case class CC_B[G, F](a: T_A[F, F], b: T_A[F, T_A[T_A[F, F], F]]) extends T_A[F, G]
case class CC_C(a: (Int,CC_A[Char, Boolean]), b: T_A[CC_A[Int, Boolean], T_A[Byte, Boolean]]) extends T_B[CC_B[Char, Byte]]

val v_a: CC_B[T_B[CC_B[Char, Byte]], Char] = null
val v_b: Int = v_a match{
  case CC_B(_, CC_A(_, CC_A(_, _))) => 0 
  case CC_B(_, CC_A(_, CC_B(_, _))) => 1 
  case CC_B(_, CC_B(CC_A(_, _), CC_A(_, _))) => 2 
  case CC_B(_, CC_B(CC_B(_, _), CC_A(_, _))) => 3 
  case CC_B(_, CC_B(CC_A(_, _), CC_B(_, _))) => 4 
  case CC_B(_, CC_B(CC_B(_, _), CC_B(_, _))) => 5 
}
}