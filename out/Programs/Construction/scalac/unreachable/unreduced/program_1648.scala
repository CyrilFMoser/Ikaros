package Program_9 

object Test {
sealed trait T_A[A]
sealed trait T_B[B]
case class CC_A[C](a: Boolean, b: T_A[C]) extends T_A[C]
case class CC_B[D](a: D, b: D) extends T_A[D]
case class CC_C[E](a: T_B[E], b: T_A[E], c: Char) extends T_A[E]
case class CC_D(a: T_A[T_A[Boolean]], b: Int, c: CC_A[Boolean]) extends T_B[T_B[Int]]

val v_a: T_A[Boolean] = null
val v_b: Int = v_a match{
  case CC_A(_, _) => 0 
  case CC_B(_, _) => 1 
  case CC_C(_, CC_B(_, _), _) => 2 
  case CC_C(_, CC_C(_, _, _), _) => 3 
}
}
// This is not matched: CC_C(_, CC_A(_, _), _)