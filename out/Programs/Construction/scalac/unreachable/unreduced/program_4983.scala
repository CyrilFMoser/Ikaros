package Program_27 

object Test {
sealed trait T_A[A, B]
sealed trait T_B
case class CC_A[C]() extends T_A[T_B, C]
case class CC_B[D](a: T_A[D, D], b: T_A[T_B, D]) extends T_A[T_B, D]
case class CC_C(a: Char) extends T_B

val v_a: T_A[T_B, Boolean] = null
val v_b: Int = v_a match{
  case CC_A() => 0 
  case CC_B(_, CC_A()) => 1 
  case CC_B(_, CC_B(_, CC_A())) => 2 
}
}
// This is not matched: CC_B(_, CC_B(_, CC_B(_, _)))