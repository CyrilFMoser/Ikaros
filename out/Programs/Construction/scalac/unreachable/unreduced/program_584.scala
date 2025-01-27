package Program_18 

object Test {
sealed trait T_A[A, B]
case class CC_A[C](a: T_A[C, C], b: ((Byte,Boolean),Boolean)) extends T_A[((Char,Int),T_A[Char, Char]), C]
case class CC_B[D](a: T_A[D, D]) extends T_A[((Char,Int),T_A[Char, Char]), D]
case class CC_C[E]() extends T_A[((Char,Int),T_A[Char, Char]), E]

val v_a: T_A[((Char,Int),T_A[Char, Char]), Char] = null
val v_b: Int = v_a match{
  case CC_A(_, _) => 0 
  case CC_C() => 1 
}
}
// This is not matched: CC_B(_)