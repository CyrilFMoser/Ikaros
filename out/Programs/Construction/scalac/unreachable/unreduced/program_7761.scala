package Program_28 

object Test {
sealed trait T_A[A]
sealed trait T_B[B]
case class CC_A(a: T_A[T_B[Byte]]) extends T_A[T_B[T_B[Int]]]
case class CC_B(a: T_B[CC_A], b: Char, c: T_B[T_A[CC_A]]) extends T_A[T_B[T_A[Int]]]
case class CC_C(a: T_A[CC_B], b: T_A[CC_A], c: T_B[CC_B]) extends T_A[CC_B]
case class CC_D[C](a: CC_C, b: CC_C, c: T_B[C]) extends T_B[C]
case class CC_E[D](a: CC_C, b: Byte, c: T_B[D]) extends T_B[D]
case class CC_F[E](a: T_B[E]) extends T_B[E]

val v_a: T_A[T_B[T_A[Int]]] = null
val v_b: Int = v_a match{
  case CC_B(_, _, CC_D(_, CC_C(_, _, _), CC_D(_, _, _))) => 0 
  case CC_B(_, _, CC_D(_, CC_C(_, _, _), CC_E(_, _, _))) => 1 
  case CC_B(_, _, CC_D(_, CC_C(_, _, _), CC_F(_))) => 2 
  case CC_B(_, _, CC_E(_, _, CC_D(_, _, _))) => 3 
  case CC_B(_, _, CC_E(_, _, CC_E(_, _, _))) => 4 
  case CC_B(_, _, CC_E(_, _, CC_F(_))) => 5 
  case CC_B(_, _, CC_F(_)) => 6 
}
}