package Program_9 

object Test {
sealed trait T_A[A]
sealed trait T_B[B]
case class CC_A[C](a: C, b: T_A[C]) extends T_A[C]
case class CC_B[D]() extends T_A[D]
case class CC_C[E](a: Boolean, b: Boolean, c: T_A[E]) extends T_A[E]
case class CC_D(a: T_B[T_B[Byte]]) extends T_B[T_A[CC_C[Boolean]]]

val v_a: CC_C[CC_D] = null
val v_b: Int = v_a match{
  case CC_C(_, _, CC_A(CC_D(_), CC_B())) => 0 
  case CC_C(_, _, CC_A(CC_D(_), CC_C(_, _, _))) => 1 
  case CC_C(_, _, CC_B()) => 2 
  case CC_C(_, _, CC_C(_, true, _)) => 3 
  case CC_C(_, _, CC_C(_, false, _)) => 4 
}
}
// This is not matched: CC_C(_, _, CC_A(CC_D(_), CC_A(_, _)))