package Program_11 

object Test {
sealed trait T_A[A, B]
case class CC_A[C]() extends T_A[T_A[T_A[Byte, Int], T_A[Int, Int]], C]
case class CC_B[D](a: Int, b: T_A[D, D]) extends T_A[T_A[T_A[Byte, Int], T_A[Int, Int]], D]
case class CC_C[E](a: CC_B[CC_A[Byte]], b: T_A[E, E], c: CC_B[E]) extends T_A[T_A[T_A[Byte, Int], T_A[Int, Int]], E]

val v_a: T_A[T_A[T_A[Byte, Int], T_A[Int, Int]], Char] = null
val v_b: Int = v_a match{
  case CC_A() => 0 
  case CC_C(CC_B(_, _), _, CC_B(_, _)) => 1 
}
}
// This is not matched: CC_B(_, _)