package Program_5 

object Test {
sealed trait T_A[A]
case class CC_A(a: Byte, b: Byte) extends T_A[T_A[(Char,Boolean)]]
case class CC_B(a: CC_A, b: T_A[T_A[Boolean]]) extends T_A[T_A[(Char,Boolean)]]
case class CC_C() extends T_A[T_A[(Char,Boolean)]]

val v_a: T_A[T_A[(Char,Boolean)]] = null
val v_b: Int = v_a match{
  case CC_A(_, _) => 0 
  case CC_B(_, _) => 1 
}
}
// This is not matched: CC_C()