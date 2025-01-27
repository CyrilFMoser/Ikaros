package Program_10 

object Test {
sealed trait T_A[A, B]
case class CC_A[C](a: T_A[C, C], b: T_A[C, C], c: T_A[C, C]) extends T_A[T_A[C, T_A[C, C]], C]
case class CC_B[D](a: CC_A[D], b: CC_A[D], c: CC_A[D]) extends T_A[T_A[D, T_A[D, D]], D]
case class CC_C[E](a: CC_A[E]) extends T_A[T_A[E, T_A[E, E]], E]

val v_a: T_A[T_A[Byte, T_A[Byte, Byte]], Byte] = null
val v_b: Int = v_a match{
  case CC_A(_, _, _) => 0 
  case CC_B(CC_A(_, _, _), CC_A(_, _, _), CC_A(_, _, _)) => 1 
  case CC_C(_) => 2 
}
}