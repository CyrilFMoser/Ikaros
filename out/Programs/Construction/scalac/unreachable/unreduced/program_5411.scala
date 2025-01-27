package Program_28 

object Test {
sealed trait T_A[A]
case class CC_A() extends T_A[T_A[(Char,Boolean)]]
case class CC_B(a: Boolean, b: CC_A, c: T_A[T_A[CC_A]]) extends T_A[T_A[(Char,Boolean)]]

val v_a: T_A[T_A[(Char,Boolean)]] = null
val v_b: Int = v_a match{
  case CC_A() => 0 
  case CC_B(true, CC_A(), _) => 1 
  case CC_B(false, CC_A(), _) => 2 
}
}