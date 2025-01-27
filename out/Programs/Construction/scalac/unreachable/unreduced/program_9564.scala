package Program_1 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C]
case class CC_A[E, D](a: Boolean, b: T_A[E, T_B[E]]) extends T_A[E, D]
case class CC_B[G, F](a: T_A[G, G], b: T_A[F, T_A[T_A[F, F], F]]) extends T_A[F, G]
case class CC_C(a: T_A[CC_A[Int, Byte], T_A[Char, Char]], b: CC_A[T_A[Boolean, Boolean], T_A[Int, Byte]]) extends T_B[CC_B[Char, CC_B[Char, Boolean]]]
case class CC_D(a: CC_C, b: T_B[CC_A[CC_C, CC_C]]) extends T_B[CC_B[Char, CC_B[Char, Boolean]]]

val v_a: T_B[CC_B[Char, CC_B[Char, Boolean]]] = null
val v_b: Int = v_a match{
  case CC_C(CC_A(_, CC_A(_, _)), CC_A(_, _)) => 0 
  case CC_C(CC_A(_, CC_B(_, _)), CC_A(_, _)) => 1 
  case CC_C(CC_B(CC_A(_, _), CC_A(_, _)), CC_A(_, _)) => 2 
  case CC_C(CC_B(CC_A(_, _), CC_B(_, _)), CC_A(_, _)) => 3 
  case CC_C(CC_B(CC_B(_, _), CC_B(_, _)), CC_A(_, _)) => 4 
  case CC_D(CC_C(_, CC_A(_, _)), _) => 5 
}
}
// This is not matched: CC_C(CC_B(CC_B(_, _), CC_A(_, _)), CC_A(_, _))