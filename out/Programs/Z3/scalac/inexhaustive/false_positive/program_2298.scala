package Program_31 

object Test {
sealed trait T_A[A]
case class CC_A() extends T_A[T_A[(Boolean,Char)]]
case class CC_B(a: Char, b: T_A[CC_A]) extends T_A[Boolean]

val v_a: T_A[Boolean] = null
val v_b: Int = v_a match{
  case CC_B('x', _) => 0 
}
}
// This is not matched: (CC_A Wildcard (T_A (T_A Byte)))