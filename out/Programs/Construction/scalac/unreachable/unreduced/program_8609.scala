package Program_15 

object Test {
sealed trait T_A[A]
sealed trait T_B[B, C]
case class CC_A[D](a: T_B[D, D], b: T_A[D], c: Char) extends T_A[D]
case class CC_B() extends T_A[T_A[T_A[Char]]]
case class CC_C(a: T_B[T_A[CC_B], CC_A[Boolean]], b: CC_A[T_A[CC_B]]) extends T_A[CC_B]
case class CC_D[E](a: T_A[Byte], b: T_B[E, E]) extends T_B[E, (T_A[CC_C],T_A[CC_B])]
case class CC_E[F]() extends T_B[T_A[CC_B], F]
case class CC_F[G](a: CC_C, b: CC_C, c: (CC_B,T_A[CC_B])) extends T_B[T_A[CC_B], G]

val v_a: T_A[CC_B] = null
val v_b: Int = v_a match{
  case CC_A(_, CC_A(_, _, _), _) => 0 
  case CC_C(CC_E(), CC_A(CC_E(), CC_A(_, _, _), _)) => 1 
  case CC_C(CC_E(), CC_A(CC_F(_, _, _), CC_A(_, _, _), _)) => 2 
  case CC_C(CC_F(_, _, _), CC_A(CC_E(), CC_A(_, _, _), _)) => 3 
  case CC_C(CC_F(_, _, _), CC_A(CC_F(_, _, _), CC_A(_, _, _), _)) => 4 
}
}
// This is not matched: CC_A(_, CC_C(_, CC_A(_, _, _)), _)