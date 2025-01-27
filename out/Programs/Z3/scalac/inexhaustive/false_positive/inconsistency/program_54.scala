package Program_31 

object Test {
sealed trait T_A[A, B]
sealed trait T_B
case class CC_A[D](a: D, b: T_A[D, D]) extends T_A[T_B, D]

val v_a: T_A[T_B, Char] = null
val v_b: Int = v_a match{
  case CC_A('x', _) => 0 
}
}
// This is not matched: Pattern match is empty without constants