package Program_2 

object Test {
sealed trait T_A[A, B]
case class CC_A[C](a: C, b: T_A[C, C]) extends T_A[(Boolean,T_A[Char, Int]), C]
case class CC_B[D](a: D, b: T_A[D, D]) extends T_A[(Boolean,T_A[Char, Int]), D]
case class CC_C[E](a: Byte) extends T_A[(Boolean,T_A[Char, Int]), E]

val v_a: T_A[(Boolean,T_A[Char, Int]), Boolean] = null
val v_b: Int = v_a match{
  case CC_A(true, _) => 0 
  case CC_A(false, _) => 1 
  case CC_B(_, _) => 2 
  case CC_C(_) => 3 
}
}