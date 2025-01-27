package Program_5 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C]
case class CC_A[D](a: T_B[D], b: T_A[T_B[D], D]) extends T_A[T_B[D], D]
case class CC_B[E](a: T_A[T_B[E], E], b: (T_B[Byte],T_A[Char, Boolean]), c: T_A[T_B[E], E]) extends T_A[T_B[E], E]
case class CC_C[F](a: F, b: T_A[T_B[T_B[F]], T_B[F]]) extends T_B[F]
case class CC_D[G]() extends T_B[G]
case class CC_E[H](a: T_B[T_B[H]], b: T_B[H]) extends T_B[H]

val v_a: T_B[Int] = null
val v_b: Int = v_a match{
  case CC_C(_, CC_A(_, CC_A(_, _))) => 0 
  case CC_C(_, CC_A(_, CC_B(_, _, _))) => 1 
  case CC_C(_, CC_B(_, (_,_), CC_A(_, _))) => 2 
  case CC_C(_, CC_B(_, (_,_), CC_B(_, _, _))) => 3 
  case CC_D() => 4 
  case CC_E(_, CC_C(_, CC_B(_, _, _))) => 5 
  case CC_E(_, CC_D()) => 6 
  case CC_E(_, CC_E(_, _)) => 7 
}
}
// This is not matched: CC_E(_, CC_C(_, CC_A(_, _)))