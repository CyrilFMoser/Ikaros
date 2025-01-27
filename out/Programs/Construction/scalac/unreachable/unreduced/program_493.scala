package Program_4 

object Test {
sealed trait T_A[A]
sealed trait T_B[B]
case class CC_A[C](a: T_B[C]) extends T_A[C]
case class CC_B[D](a: (CC_A[Boolean],T_A[Boolean])) extends T_A[D]
case class CC_C[E](a: T_A[E], b: T_A[E]) extends T_A[E]
case class CC_D(a: Char) extends T_B[T_B[Char]]

val v_a: CC_C[Boolean] = null
val v_b: Int = v_a match{
  case CC_C(_, CC_A(_)) => 0 
  case CC_C(_, CC_B(_)) => 1 
}
}
// This is not matched: CC_C(_, CC_C(_, _))