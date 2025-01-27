package Program_30 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C]
case class CC_B[E](a: (Char,Char)) extends T_A[T_B[E], E]

val v_a: CC_B[Char] = null
val v_b: Int = v_a match{
  case CC_B((_,'x')) => 0 
}
}
// This is not matched: (CC_C T_A)