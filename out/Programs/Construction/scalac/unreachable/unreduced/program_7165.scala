package Program_22 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C]
case class CC_A(a: T_B[T_A[Int, Char]], b: Int, c: Char) extends T_A[T_B[T_B[Char]], Char]
case class CC_B[D](a: T_B[D], b: T_B[D], c: Byte) extends T_B[D]
case class CC_C[E](a: E, b: T_A[E, E]) extends T_B[E]

val v_a: T_B[CC_A] = null
val v_b: Int = v_a match{
  case CC_B(CC_B(CC_B(_, _, _), _, _), _, _) => 0 
  case CC_B(CC_B(CC_C(_, _), _, _), _, _) => 1 
  case CC_C(_, _) => 2 
}
}
// This is not matched: CC_B(CC_C(CC_A(_, _, _), _), _, _)