package Program_23 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C]
case class CC_A[D](a: T_B[D], b: Byte) extends T_A[T_B[T_A[Boolean, Char]], D]
case class CC_B[E](a: CC_A[E], b: E, c: T_A[E, E]) extends T_A[T_B[T_A[Boolean, Char]], E]

val v_a: T_A[T_B[T_A[Boolean, Char]], Boolean] = null
val v_b: Int = v_a match{
  case CC_A(_, 0) => 0 
  case CC_A(_, _) => 1 
  case CC_B(CC_A(_, _), _, _) => 2 
}
}