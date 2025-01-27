package Program_31 

object Test {
sealed trait T_A[A, B]
case class CC_A(a: Char, b: T_A[Boolean, Char]) extends T_A[T_A[Boolean, Int], Boolean]

val v_a: T_A[T_A[Boolean, Int], Boolean] = null
val v_b: Int = v_a match{
  case CC_A('x', _) => 0 
}
}
// This is not matched: Pattern match is empty without constants