package Program_14 

object Test {
sealed trait T_A[A]
sealed trait T_B[B, C]
case class CC_A[D](a: (T_B[Char, Int],T_B[Char, (Char,Boolean)]), b: T_A[D]) extends T_A[D]
case class CC_B[E](a: Boolean) extends T_A[E]
case class CC_C[F, G]() extends T_A[F]
case class CC_D[H](a: T_A[H]) extends T_B[H, T_A[T_A[Int]]]
case class CC_E[I](a: CC_C[I, Boolean]) extends T_B[I, T_A[T_A[Int]]]
case class CC_F[J]() extends T_B[J, T_A[T_A[Int]]]

val v_a: T_A[Char] = null
val v_b: Int = v_a match{
  case CC_A((_,_), CC_A(_, CC_B(_))) => 0 
  case CC_A((_,_), CC_A(_, CC_C())) => 1 
  case CC_A((_,_), CC_B(_)) => 2 
  case CC_A((_,_), CC_C()) => 3 
  case CC_B(_) => 4 
  case CC_C() => 5 
}
}
// This is not matched: CC_A((_,_), CC_A(_, CC_A(_, _)))