package Program_31 

object Test {
sealed trait T_A[A]
case class CC_A(a: Char, b: T_A[(Char,Int)]) extends T_A[T_A[Byte]]

val v_a: T_A[T_A[Byte]] = null
val v_b: Int = v_a match{
  case CC_A('x', _) => 0 
}
}
// This is not matched: (CC_A Wildcard Wildcard (T_A (T_A Byte)))