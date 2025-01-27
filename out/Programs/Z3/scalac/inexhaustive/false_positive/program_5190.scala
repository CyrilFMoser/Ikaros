package Program_15 

object Test {
sealed trait T_A[A]
sealed trait T_B
case class CC_A[D]() extends T_A[D]
case class CC_B[E](a: T_B, b: T_A[E]) extends T_A[E]

val v_a: CC_B[Char] = null
val v_b: Int = v_a match{
  case CC_B(_, CC_B(_, _)) => 0 
}
}
// This is not matched: (CC_B Char Wildcard (CC_C Char Int Char (T_A Char)) (T_A Char))