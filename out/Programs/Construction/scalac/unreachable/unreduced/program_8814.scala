package Program_4 

object Test {
sealed trait T_A[A, B]
case class CC_A[C](a: T_A[C, C], b: C, c: T_A[C, T_A[C, C]]) extends T_A[T_A[C, T_A[C, Byte]], C]
case class CC_B[D](a: CC_A[D], b: CC_A[T_A[D, D]], c: Byte) extends T_A[T_A[D, T_A[D, Byte]], D]
case class CC_C[E](a: CC_A[E], b: CC_A[E], c: CC_B[E]) extends T_A[T_A[E, T_A[E, Byte]], E]

val v_a: T_A[T_A[Int, T_A[Int, Byte]], Int] = null
val v_b: Int = v_a match{
  case CC_A(_, _, _) => 0 
  case CC_B(_, _, _) => 1 
  case CC_C(CC_A(_, _, _), CC_A(_, _, _), CC_B(CC_A(_, _, _), _, _)) => 2 
}
}