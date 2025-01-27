package Program_29 

object Test {
sealed trait T_A[A, B]
case class CC_A[C](a: Char) extends T_A[T_A[Int, T_A[Byte, Int]], C]
case class CC_B[D](a: T_A[D, D], b: (Boolean,CC_A[Char])) extends T_A[T_A[Int, T_A[Byte, Int]], D]
case class CC_C[E](a: T_A[E, E]) extends T_A[T_A[Int, T_A[Byte, Int]], E]

val v_a: T_A[T_A[Int, T_A[Byte, Int]], Boolean] = null
val v_b: Int = v_a match{
  case CC_A(_) => 0 
  case CC_B(_, _) => 1 
}
}
// This is not matched: CC_C(_)