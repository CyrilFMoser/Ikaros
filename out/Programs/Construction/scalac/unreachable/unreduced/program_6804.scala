package Program_22 

object Test {
sealed trait T_A[A]
sealed trait T_B[B]
case class CC_A[C](a: T_B[C]) extends T_A[C]
case class CC_B[D, E]() extends T_A[D]
case class CC_C[F](a: F, b: F, c: T_A[F]) extends T_A[F]
case class CC_D(a: CC_B[CC_A[(Int,Boolean)], Byte]) extends T_B[T_A[CC_C[Char]]]
case class CC_E[G](a: G, b: T_A[G]) extends T_B[T_A[CC_C[Char]]]
case class CC_F(a: Char, b: T_A[T_A[CC_D]], c: T_A[T_B[CC_D]]) extends T_B[T_A[CC_C[Char]]]

val v_a: T_B[T_A[CC_C[Char]]] = null
val v_b: Int = v_a match{
  case CC_D(CC_B()) => 0 
  case CC_E(_, _) => 1 
  case CC_F(_, CC_A(_), CC_A(_)) => 2 
  case CC_F(_, CC_A(_), CC_B()) => 3 
  case CC_F(_, CC_A(_), CC_C(_, _, _)) => 4 
  case CC_F(_, CC_B(), CC_A(_)) => 5 
  case CC_F(_, CC_B(), CC_B()) => 6 
  case CC_F(_, CC_C(_, _, _), CC_A(_)) => 7 
  case CC_F(_, CC_C(_, _, _), CC_B()) => 8 
  case CC_F(_, CC_C(_, _, _), CC_C(_, _, _)) => 9 
}
}
// This is not matched: CC_F(_, CC_B(), CC_C(_, _, _))