package Program_30 

object Test {
sealed trait T_A[A]
case class CC_A(a: (Char,Int), b: T_A[Boolean]) extends T_A[T_A[(Char,Boolean)]]

val v_a: T_A[T_A[(Char,Boolean)]] = null
val v_b: Int = v_a match{
  case CC_A(('x',_), _) => 0 
}
}
// This is not matched: Pattern match is empty without constants