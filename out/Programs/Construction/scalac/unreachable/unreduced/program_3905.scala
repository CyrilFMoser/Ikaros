package Program_19 

object Test {
sealed trait T_A[A, B]
case class CC_A[C](a: Int, b: T_A[C, C]) extends T_A[(Char,T_A[Char, Char]), C]
case class CC_B[D](a: CC_A[D], b: Boolean) extends T_A[(Char,T_A[Char, Char]), D]
case class CC_C[E](a: CC_B[E], b: CC_B[CC_A[E]], c: E) extends T_A[(Char,T_A[Char, Char]), E]

val v_a: T_A[(Char,T_A[Char, Char]), Boolean] = null
val v_b: Int = v_a match{
  case CC_A(12, _) => 0 
  case CC_B(CC_A(_, _), _) => 1 
  case CC_C(_, _, _) => 2 
}
}
// This is not matched: CC_A(_, _)