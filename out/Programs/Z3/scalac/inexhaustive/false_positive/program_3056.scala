package Program_15 

object Test {
sealed trait T_A[A, B]
case class CC_A[D, C](a: T_A[C, C]) extends T_A[C, D]
case class CC_B[F, E]() extends T_A[E, F]

val v_a: CC_A[Char, Char] = null
val v_b: Int = v_a match{
  case CC_A(CC_A(_)) => 0 
}
}
// This is not matched: (CC_A Char Char Wildcard (CC_B Char Char (T_A Char Char)) (T_A Char Char))