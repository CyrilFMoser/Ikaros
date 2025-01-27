package Program_30 

object Test {
sealed trait T_A[A]
case class CC_A(a: Char, b: T_A[Char]) extends T_A[T_A[(Boolean,Char)]]

val v_a: T_A[T_A[(Boolean,Char)]] = null
val v_b: Int = v_a match{
  case CC_A('x', _) => 0 
}
}
// This is not matched: Pattern match is empty without constants