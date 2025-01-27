package Program_5 

object Test {
sealed trait T_A[A]
sealed trait T_B[B, C]
case class CC_A[D](a: D, b: D, c: T_B[T_A[D], D]) extends T_A[D]
case class CC_B[E](a: E, b: E, c: T_A[E]) extends T_A[E]
case class CC_C(a: T_A[Boolean], b: T_A[Int], c: T_B[T_A[Byte], T_A[Byte]]) extends T_A[T_A[T_B[Char, Boolean]]]
case class CC_D[F]() extends T_B[F, T_A[T_A[CC_C]]]
case class CC_E(a: Char, b: (CC_B[CC_C],T_A[CC_C]), c: T_A[Int]) extends T_B[(T_A[CC_C],Char), CC_D[T_A[CC_C]]]

val v_a: T_A[Int] = null
val v_b: Int = v_a match{
  case CC_A(_, _, _) => 0 
  case CC_B(12, _, CC_A(12, 12, _)) => 1 
  case CC_B(_, _, CC_A(12, 12, _)) => 2 
  case CC_B(12, _, CC_A(_, 12, _)) => 3 
  case CC_B(_, _, CC_A(_, 12, _)) => 4 
  case CC_B(12, _, CC_A(12, _, _)) => 5 
  case CC_B(_, _, CC_A(12, _, _)) => 6 
  case CC_B(12, _, CC_A(_, _, _)) => 7 
  case CC_B(_, _, CC_A(_, _, _)) => 8 
  case CC_B(12, _, CC_B(_, _, CC_A(_, _, _))) => 9 
  case CC_B(12, _, CC_B(_, _, CC_B(_, _, _))) => 10 
  case CC_B(_, _, CC_B(_, _, CC_B(_, _, _))) => 11 
}
}
// This is not matched: CC_B(_, _, CC_B(_, _, CC_A(_, _, _)))