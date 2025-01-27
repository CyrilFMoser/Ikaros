package Program_15 

object Test {
sealed trait T_A[A]
case class CC_A(a: T_A[Char], b: Char) extends T_A[T_A[(Char,Boolean)]]

val v_a: T_A[T_A[(Char,Boolean)]] = null
val v_b: Int = v_a match{
  case CC_A(_, 'x') => 0 
}
}
// This is not matched: (CC_C Wildcard Wildcard (T_A Boolean))