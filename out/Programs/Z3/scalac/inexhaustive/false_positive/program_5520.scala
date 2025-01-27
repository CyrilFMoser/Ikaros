package Program_15 

object Test {
sealed trait T_A[A, B]
case class CC_A[D]() extends T_A[D, Char]
case class CC_B[E](a: T_A[E, Char]) extends T_A[E, Char]

val v_a: CC_B[Char] = null
val v_b: Int = v_a match{
  case CC_B(CC_A()) => 0 
}
}
// This is not matched: Pattern match is empty without constants