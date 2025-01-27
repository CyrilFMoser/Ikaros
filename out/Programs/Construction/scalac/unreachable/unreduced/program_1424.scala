package Program_16 

object Test {
sealed trait T_A[A]
case class CC_A() extends T_A[T_A[(Boolean,Int)]]
case class CC_B(a: Int, b: CC_A, c: T_A[CC_A]) extends T_A[T_A[(Boolean,Int)]]
case class CC_C(a: CC_B, b: Boolean) extends T_A[T_A[(Boolean,Int)]]

val v_a: T_A[T_A[(Boolean,Int)]] = null
val v_b: Int = v_a match{
  case CC_B(_, _, _) => 0 
  case CC_C(_, _) => 1 
}
}
// This is not matched: CC_A()