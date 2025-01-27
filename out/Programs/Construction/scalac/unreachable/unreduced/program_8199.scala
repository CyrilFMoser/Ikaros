package Program_2 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C]
case class CC_A[D](a: T_A[D, D]) extends T_A[(T_A[Byte, Int],(Char,Int)), D]
case class CC_B[E](a: T_B[E], b: CC_A[E], c: T_A[E, E]) extends T_A[(T_A[Byte, Int],(Char,Int)), E]
case class CC_C[F](a: T_B[T_A[F, Boolean]]) extends T_A[(T_A[Byte, Int],(Char,Int)), F]

val v_a: T_A[(T_A[Byte, Int],(Char,Int)), Char] = null
val v_b: Int = v_a match{
  case CC_A(_) => 0 
  case CC_C(_) => 1 
}
}
// This is not matched: CC_B(_, _, _)